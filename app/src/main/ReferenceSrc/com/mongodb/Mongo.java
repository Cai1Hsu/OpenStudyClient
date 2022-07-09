package com.mongodb;

import com.mongodb.Bytes;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import org.apache.tools.ant.taskdefs.optional.clearcase.ClearCase;
import org.bson.io.PoolOutputBuffer;
import org.bson.util.SimplePool;

/* loaded from: classes.dex */
public class Mongo {
    private static final String ADMIN_DATABASE_NAME = "admin";
    private static final String FULL_VERSION = "2.12.4";
    @Deprecated
    public static final int MAJOR_VERSION = 2;
    @Deprecated
    public static final int MINOR_VERSION = 12;
    final MongoAuthority _authority;
    SimplePool<PoolOutputBuffer> _bufferPool;
    final CursorCleanerThread _cleaner;
    private WriteConcern _concern;
    final DBTCPConnector _connector;
    final ConcurrentMap<String, DB> _dbs;
    final Bytes.OptionHolder _netOptions;
    final MongoOptions _options;
    private ReadPreference _readPref;
    static Logger logger = Logger.getLogger(Bytes.LOGGER.getName() + ".Mongo");
    static int cleanerIntervalMS = Integer.parseInt(System.getProperty("com.mongodb.cleanerIntervalMS", "1000"));

    @Deprecated
    public static int getMajorVersion() {
        return 2;
    }

    @Deprecated
    public static int getMinorVersion() {
        return 12;
    }

    @Deprecated
    public static DB connect(DBAddress addr) {
        return new Mongo(addr).getDB(addr.getDBName());
    }

    @Deprecated
    public Mongo() throws UnknownHostException {
        this(new ServerAddress());
    }

    @Deprecated
    public Mongo(String host) throws UnknownHostException {
        this(new ServerAddress(host));
    }

    @Deprecated
    public Mongo(String host, MongoOptions options) throws UnknownHostException {
        this(new ServerAddress(host), options);
    }

    @Deprecated
    public Mongo(String host, int port) throws UnknownHostException {
        this(new ServerAddress(host, port));
    }

    @Deprecated
    public Mongo(ServerAddress addr) {
        this(addr, new MongoOptions());
    }

    @Deprecated
    public Mongo(ServerAddress addr, MongoOptions options) {
        this(MongoAuthority.direct(addr), options);
    }

    @Deprecated
    public Mongo(ServerAddress left, ServerAddress right) {
        this(left, right, new MongoOptions());
    }

    @Deprecated
    public Mongo(ServerAddress left, ServerAddress right, MongoOptions options) {
        this(MongoAuthority.dynamicSet(Arrays.asList(left, right)), options);
    }

    @Deprecated
    public Mongo(List<ServerAddress> seeds) {
        this(seeds, new MongoOptions());
    }

    @Deprecated
    public Mongo(List<ServerAddress> seeds, MongoOptions options) {
        this(MongoAuthority.dynamicSet(seeds), options);
    }

    @Deprecated
    public Mongo(MongoURI uri) throws UnknownHostException {
        this(getMongoAuthorityFromURI(uri), uri.getOptions());
    }

    Mongo(MongoAuthority authority, MongoOptions options) {
        this._dbs = new ConcurrentHashMap();
        this._concern = WriteConcern.NORMAL;
        this._readPref = ReadPreference.primary();
        this._netOptions = new Bytes.OptionHolder(null);
        this._bufferPool = new SimplePool<PoolOutputBuffer>(1000) { // from class: com.mongodb.Mongo.1
            @Override // org.bson.util.SimplePool
            public PoolOutputBuffer createNew() {
                return new PoolOutputBuffer();
            }
        };
        logger.info("Creating Mongo instance (driver version " + getVersion() + ") with authority " + authority + " and options " + options);
        this._authority = authority;
        this._options = options;
        _applyMongoOptions();
        this._connector = new DBTCPConnector(this);
        this._connector.start();
        if (this._options.cursorFinalizerEnabled) {
            this._cleaner = new CursorCleanerThread();
            this._cleaner.start();
            return;
        }
        this._cleaner = null;
    }

    public DB getDB(String dbname) {
        DB db = this._dbs.get(dbname);
        if (db != null) {
            return db;
        }
        DB db2 = new DBApiLayer(this, dbname, this._connector);
        DB temp = this._dbs.putIfAbsent(dbname, db2);
        return temp == null ? db2 : temp;
    }

    public Collection<DB> getUsedDatabases() {
        return this._dbs.values();
    }

    public List<String> getDatabaseNames() {
        BasicDBObject cmd = new BasicDBObject();
        cmd.put("listDatabases", (Object) 1);
        CommandResult res = getDB(ADMIN_DATABASE_NAME).command(cmd, getOptions());
        res.throwOnError();
        List l = (List) res.get("databases");
        List<String> list = new ArrayList<>();
        for (Object o : l) {
            list.add(((BasicDBObject) o).getString("name"));
        }
        return list;
    }

    public void dropDatabase(String dbName) {
        getDB(dbName).dropDatabase();
    }

    public String getVersion() {
        return FULL_VERSION;
    }

    @Deprecated
    public String debugString() {
        return this._connector.debugString();
    }

    public String getConnectPoint() {
        return this._connector.getConnectPoint();
    }

    @Deprecated
    public DBTCPConnector getConnector() {
        return this._connector;
    }

    public ReplicaSetStatus getReplicaSetStatus() {
        return this._connector.getReplicaSetStatus();
    }

    public ServerAddress getAddress() {
        return this._connector.getAddress();
    }

    public List<ServerAddress> getAllAddress() {
        List<ServerAddress> result = this._connector.getAllAddress();
        return result == null ? Arrays.asList(getAddress()) : result;
    }

    public List<ServerAddress> getServerAddressList() {
        return this._connector.getServerAddressList();
    }

    public void close() {
        try {
            this._connector.close();
        } catch (Throwable th) {
        }
        if (this._cleaner != null) {
            this._cleaner.interrupt();
            try {
                this._cleaner.join();
            } catch (InterruptedException e) {
            }
        }
    }

    public void setWriteConcern(WriteConcern concern) {
        this._concern = concern;
    }

    public WriteConcern getWriteConcern() {
        return this._concern;
    }

    public void setReadPreference(ReadPreference preference) {
        this._readPref = preference;
    }

    public ReadPreference getReadPreference() {
        return this._readPref;
    }

    @Deprecated
    public void slaveOk() {
        addOption(4);
    }

    public void addOption(int option) {
        this._netOptions.add(option);
    }

    public void setOptions(int options) {
        this._netOptions.set(options);
    }

    public void resetOptions() {
        this._netOptions.reset();
    }

    public int getOptions() {
        return this._netOptions.get();
    }

    void _applyMongoOptions() {
        if (this._options.slaveOk) {
            slaveOk();
        }
        if (this._options.getReadPreference() != null) {
            setReadPreference(this._options.getReadPreference());
        }
        setWriteConcern(this._options.getWriteConcern());
    }

    @Deprecated
    public MongoOptions getMongoOptions() {
        return this._options;
    }

    public int getMaxBsonObjectSize() {
        return this._connector.getMaxBsonObjectSize();
    }

    boolean isMongosConnection() {
        return this._connector.isMongosConnection();
    }

    private static MongoAuthority getMongoAuthorityFromURI(MongoURI uri) throws UnknownHostException {
        if (uri.getHosts().size() == 1) {
            return MongoAuthority.direct(new ServerAddress(uri.getHosts().get(0)), uri.getCredentials());
        }
        List<ServerAddress> replicaSetSeeds = new ArrayList<>(uri.getHosts().size());
        for (String host : uri.getHosts()) {
            replicaSetSeeds.add(new ServerAddress(host));
        }
        return MongoAuthority.dynamicSet(replicaSetSeeds, uri.getCredentials());
    }

    public CommandResult fsync(boolean async) {
        DBObject cmd = new BasicDBObject("fsync", 1);
        if (async) {
            cmd.put("async", 1);
        }
        CommandResult result = getDB(ADMIN_DATABASE_NAME).command(cmd);
        result.throwOnError();
        return result;
    }

    public CommandResult fsyncAndLock() {
        DBObject cmd = new BasicDBObject("fsync", 1);
        cmd.put(ClearCase.COMMAND_LOCK, 1);
        CommandResult result = getDB(ADMIN_DATABASE_NAME).command(cmd);
        result.throwOnError();
        return result;
    }

    public DBObject unlock() {
        DB db = getDB(ADMIN_DATABASE_NAME);
        DBCollection col = db.getCollection("$cmd.sys.unlock");
        return col.findOne();
    }

    public boolean isLocked() {
        DB db = getDB(ADMIN_DATABASE_NAME);
        DBCollection col = db.getCollection("$cmd.sys.inprog");
        BasicDBObject res = (BasicDBObject) col.findOne();
        return res.containsField("fsyncLock") && res.getInt("fsyncLock") == 1;
    }

    /* loaded from: classes.dex */
    public static class Holder {
        private static Holder _default = new Holder();
        private final ConcurrentMap<String, Mongo> _mongos = new ConcurrentHashMap();

        @Deprecated
        public Mongo connect(MongoURI uri) throws UnknownHostException {
            return connect(uri.toClientURI());
        }

        public Mongo connect(MongoClientURI uri) throws UnknownHostException {
            String key = toKey(uri);
            Mongo client = this._mongos.get(key);
            if (client == null) {
                Mongo newbie = new MongoClient(uri);
                Mongo client2 = this._mongos.putIfAbsent(key, newbie);
                if (client2 == null) {
                    return newbie;
                }
                newbie.close();
                return client2;
            }
            return client;
        }

        private String toKey(MongoClientURI uri) {
            return uri.toString();
        }

        public static Holder singleton() {
            return _default;
        }
    }

    /* loaded from: classes.dex */
    class CursorCleanerThread extends Thread {
        CursorCleanerThread() {
            Mongo.this = r3;
            setDaemon(true);
            setName("MongoCleaner" + hashCode());
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (Mongo.this._connector.isOpen()) {
                try {
                    try {
                        Thread.sleep(Mongo.cleanerIntervalMS);
                    } catch (Throwable th) {
                    }
                } catch (InterruptedException e) {
                }
                for (DB db : Mongo.this._dbs.values()) {
                    db.cleanCursors(true);
                }
            }
        }
    }

    public String toString() {
        return "Mongo{authority=" + this._authority + ", options=" + this._options + '}';
    }

    MongoAuthority getAuthority() {
        return this._authority;
    }
}
