.class public Lorg/jivesoftware/smackx/jingle/JingleManager;
.super Ljava/lang/Object;
.source "JingleManager.java"

# interfaces
.implements Lorg/jivesoftware/smackx/jingle/listeners/JingleSessionListener;


# static fields
.field private static final LOGGER:Lorg/jivesoftware/smackx/jingle/SmackLogger;


# instance fields
.field private connection:Lorg/jivesoftware/smack/Connection;

.field private creationListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lorg/jivesoftware/smackx/jingle/listeners/CreatedJingleSessionListener;",
            ">;"
        }
    .end annotation
.end field

.field private jingleMediaManagers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lorg/jivesoftware/smackx/jingle/media/JingleMediaManager;",
            ">;"
        }
    .end annotation
.end field

.field private jingleSessionRequestListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lorg/jivesoftware/smackx/jingle/listeners/JingleSessionRequestListener;",
            ">;"
        }
    .end annotation
.end field

.field final jingleSessions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lorg/jivesoftware/smackx/jingle/JingleSession;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 187
    const-class v0, Lorg/jivesoftware/smackx/jingle/JingleManager;

    invoke-static {v0}, Lorg/jivesoftware/smackx/jingle/SmackLogger;->getLogger(Ljava/lang/Class;)Lorg/jivesoftware/smackx/jingle/SmackLogger;

    move-result-object v0

    sput-object v0, Lorg/jivesoftware/smackx/jingle/JingleManager;->LOGGER:Lorg/jivesoftware/smackx/jingle/SmackLogger;

    return-void
.end method

.method public constructor <init>(Lorg/jivesoftware/smack/Connection;Ljava/util/List;)V
    .locals 2
    .param p1, "connection"    # Lorg/jivesoftware/smack/Connection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jivesoftware/smack/Connection;",
            "Ljava/util/List",
            "<",
            "Lorg/jivesoftware/smackx/jingle/media/JingleMediaManager;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 212
    .local p2, "jingleMediaManagers":Ljava/util/List;, "Ljava/util/List<Lorg/jivesoftware/smackx/jingle/media/JingleMediaManager;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 191
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleSessions:Ljava/util/List;

    .line 197
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->creationListeners:Ljava/util/List;

    .line 213
    iput-object p1, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->connection:Lorg/jivesoftware/smack/Connection;

    .line 214
    iput-object p2, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleMediaManagers:Ljava/util/List;

    .line 216
    invoke-virtual {p1}, Lorg/jivesoftware/smack/Connection;->getRoster()Lorg/jivesoftware/smack/Roster;

    move-result-object v0

    new-instance v1, Lorg/jivesoftware/smackx/jingle/JingleManager$1;

    invoke-direct {v1, p0}, Lorg/jivesoftware/smackx/jingle/JingleManager$1;-><init>(Lorg/jivesoftware/smackx/jingle/JingleManager;)V

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/Roster;->addRosterListener(Lorg/jivesoftware/smack/RosterListener;)V

    .line 246
    return-void
.end method

.method private initJingleSessionRequestListeners()V
    .locals 3

    .prologue
    .line 448
    new-instance v0, Lorg/jivesoftware/smackx/jingle/JingleManager$3;

    invoke-direct {v0, p0}, Lorg/jivesoftware/smackx/jingle/JingleManager$3;-><init>(Lorg/jivesoftware/smackx/jingle/JingleManager;)V

    .line 466
    .local v0, "initRequestFilter":Lorg/jivesoftware/smack/filter/PacketFilter;
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleSessionRequestListeners:Ljava/util/List;

    .line 469
    iget-object v1, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->connection:Lorg/jivesoftware/smack/Connection;

    new-instance v2, Lorg/jivesoftware/smackx/jingle/JingleManager$4;

    invoke-direct {v2, p0}, Lorg/jivesoftware/smackx/jingle/JingleManager$4;-><init>(Lorg/jivesoftware/smackx/jingle/JingleManager;)V

    invoke-virtual {v1, v2, v0}, Lorg/jivesoftware/smack/Connection;->addPacketListener(Lorg/jivesoftware/smack/PacketListener;Lorg/jivesoftware/smack/filter/PacketFilter;)V

    .line 474
    return-void
.end method

.method public static isServiceEnabled(Lorg/jivesoftware/smack/Connection;)Z
    .locals 2
    .param p0, "connection"    # Lorg/jivesoftware/smack/Connection;

    .prologue
    .line 302
    invoke-static {p0}, Lorg/jivesoftware/smackx/ServiceDiscoveryManager;->getInstanceFor(Lorg/jivesoftware/smack/Connection;)Lorg/jivesoftware/smackx/ServiceDiscoveryManager;

    move-result-object v0

    const-string/jumbo v1, "urn:xmpp:tmp:jingle"

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smackx/ServiceDiscoveryManager;->includesFeature(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isServiceEnabled(Lorg/jivesoftware/smack/Connection;Ljava/lang/String;)Z
    .locals 3
    .param p0, "connection"    # Lorg/jivesoftware/smack/Connection;
    .param p1, "userID"    # Ljava/lang/String;

    .prologue
    .line 316
    :try_start_0
    invoke-static {p0}, Lorg/jivesoftware/smackx/ServiceDiscoveryManager;->getInstanceFor(Lorg/jivesoftware/smack/Connection;)Lorg/jivesoftware/smackx/ServiceDiscoveryManager;

    move-result-object v2

    invoke-virtual {v2, p1}, Lorg/jivesoftware/smackx/ServiceDiscoveryManager;->discoverInfo(Ljava/lang/String;)Lorg/jivesoftware/smackx/packet/DiscoverInfo;

    move-result-object v1

    .line 317
    .local v1, "result":Lorg/jivesoftware/smackx/packet/DiscoverInfo;
    const-string/jumbo v2, "urn:xmpp:tmp:jingle"

    invoke-virtual {v1, v2}, Lorg/jivesoftware/smackx/packet/DiscoverInfo;->containsFeature(Ljava/lang/String;)Z
    :try_end_0
    .catch Lorg/jivesoftware/smack/XMPPException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    .line 320
    .end local v1    # "result":Lorg/jivesoftware/smackx/packet/DiscoverInfo;
    :goto_0
    return v2

    .line 318
    :catch_0
    move-exception v0

    .line 319
    .local v0, "e":Lorg/jivesoftware/smack/XMPPException;
    invoke-virtual {v0}, Lorg/jivesoftware/smack/XMPPException;->printStackTrace()V

    .line 320
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public static setJingleServiceEnabled()V
    .locals 4

    .prologue
    .line 257
    invoke-static {}, Lorg/jivesoftware/smack/provider/ProviderManager;->getInstance()Lorg/jivesoftware/smack/provider/ProviderManager;

    move-result-object v0

    .line 258
    .local v0, "providerManager":Lorg/jivesoftware/smack/provider/ProviderManager;
    const-string/jumbo v1, "jingle"

    const-string/jumbo v2, "urn:xmpp:tmp:jingle"

    new-instance v3, Lorg/jivesoftware/smackx/provider/JingleProvider;

    invoke-direct {v3}, Lorg/jivesoftware/smackx/provider/JingleProvider;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Lorg/jivesoftware/smack/provider/ProviderManager;->addIQProvider(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 263
    new-instance v1, Lorg/jivesoftware/smackx/jingle/JingleManager$2;

    invoke-direct {v1}, Lorg/jivesoftware/smackx/jingle/JingleManager$2;-><init>()V

    invoke-static {v1}, Lorg/jivesoftware/smack/Connection;->addConnectionCreationListener(Lorg/jivesoftware/smack/ConnectionCreationListener;)V

    .line 268
    return-void
.end method

.method public static declared-synchronized setServiceEnabled(Lorg/jivesoftware/smack/Connection;Z)V
    .locals 3
    .param p0, "connection"    # Lorg/jivesoftware/smack/Connection;
    .param p1, "enabled"    # Z

    .prologue
    .line 283
    const-class v1, Lorg/jivesoftware/smackx/jingle/JingleManager;

    monitor-enter v1

    :try_start_0
    invoke-static {p0}, Lorg/jivesoftware/smackx/jingle/JingleManager;->isServiceEnabled(Lorg/jivesoftware/smack/Connection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-ne v0, p1, :cond_0

    .line 292
    :goto_0
    monitor-exit v1

    return-void

    .line 287
    :cond_0
    if-eqz p1, :cond_1

    .line 288
    :try_start_1
    invoke-static {p0}, Lorg/jivesoftware/smackx/ServiceDiscoveryManager;->getInstanceFor(Lorg/jivesoftware/smack/Connection;)Lorg/jivesoftware/smackx/ServiceDiscoveryManager;

    move-result-object v0

    const-string/jumbo v2, "urn:xmpp:tmp:jingle"

    invoke-virtual {v0, v2}, Lorg/jivesoftware/smackx/ServiceDiscoveryManager;->addFeature(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 283
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    .line 290
    :cond_1
    :try_start_2
    invoke-static {p0}, Lorg/jivesoftware/smackx/ServiceDiscoveryManager;->getInstanceFor(Lorg/jivesoftware/smack/Connection;)Lorg/jivesoftware/smackx/ServiceDiscoveryManager;

    move-result-object v0

    const-string/jumbo v2, "urn:xmpp:tmp:jingle"

    invoke-virtual {v0, v2}, Lorg/jivesoftware/smackx/ServiceDiscoveryManager;->removeFeature(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method


# virtual methods
.method public addCreationListener(Lorg/jivesoftware/smackx/jingle/listeners/CreatedJingleSessionListener;)V
    .locals 1
    .param p1, "createdJingleSessionListener"    # Lorg/jivesoftware/smackx/jingle/listeners/CreatedJingleSessionListener;

    .prologue
    .line 384
    iget-object v0, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->creationListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 385
    return-void
.end method

.method public declared-synchronized addJingleSessionRequestListener(Lorg/jivesoftware/smackx/jingle/listeners/JingleSessionRequestListener;)V
    .locals 2
    .param p1, "jingleSessionRequestListener"    # Lorg/jivesoftware/smackx/jingle/listeners/JingleSessionRequestListener;

    .prologue
    .line 351
    monitor-enter p0

    if-eqz p1, :cond_1

    .line 352
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleSessionRequestListeners:Ljava/util/List;

    if-nez v0, :cond_0

    .line 353
    invoke-direct {p0}, Lorg/jivesoftware/smackx/jingle/JingleManager;->initJingleSessionRequestListeners()V

    .line 355
    :cond_0
    iget-object v1, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleSessionRequestListeners:Ljava/util/List;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 356
    :try_start_1
    iget-object v0, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleSessionRequestListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 357
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 359
    :cond_1
    monitor-exit p0

    return-void

    .line 357
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 351
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public createIncomingJingleSession(Lorg/jivesoftware/smackx/jingle/JingleSessionRequest;)Lorg/jivesoftware/smackx/jingle/JingleSession;
    .locals 6
    .param p1, "request"    # Lorg/jivesoftware/smackx/jingle/JingleSessionRequest;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/XMPPException;
        }
    .end annotation

    .prologue
    .line 559
    if-nez p1, :cond_0

    .line 560
    new-instance v1, Ljava/lang/NullPointerException;

    const-string/jumbo v2, "Received request cannot be null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 563
    :cond_0
    new-instance v0, Lorg/jivesoftware/smackx/jingle/JingleSession;

    iget-object v1, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->connection:Lorg/jivesoftware/smack/Connection;

    invoke-virtual {p1}, Lorg/jivesoftware/smackx/jingle/JingleSessionRequest;->getFrom()Ljava/lang/String;

    move-result-object v3

    iget-object v2, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->connection:Lorg/jivesoftware/smack/Connection;

    invoke-virtual {v2}, Lorg/jivesoftware/smack/Connection;->getUser()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleMediaManagers:Ljava/util/List;

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lorg/jivesoftware/smackx/jingle/JingleSession;-><init>(Lorg/jivesoftware/smack/Connection;Lorg/jivesoftware/smackx/jingle/JingleSessionRequest;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 565
    .local v0, "session":Lorg/jivesoftware/smackx/jingle/JingleSession;
    invoke-virtual {p0, v0}, Lorg/jivesoftware/smackx/jingle/JingleManager;->triggerSessionCreated(Lorg/jivesoftware/smackx/jingle/JingleSession;)V

    .line 567
    return-object v0
.end method

.method public createOutgoingJingleSession(Ljava/lang/String;)Lorg/jivesoftware/smackx/jingle/JingleSession;
    .locals 6
    .param p1, "responder"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/XMPPException;
        }
    .end annotation

    .prologue
    .line 527
    if-eqz p1, :cond_0

    invoke-static {p1}, Lorg/jivesoftware/smack/util/StringUtils;->parseName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    invoke-static {p1}, Lorg/jivesoftware/smack/util/StringUtils;->parseServer(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    invoke-static {p1}, Lorg/jivesoftware/smack/util/StringUtils;->parseResource(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_1

    .line 529
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v2, "The provided user id was not fully qualified"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 532
    :cond_1
    new-instance v0, Lorg/jivesoftware/smackx/jingle/JingleSession;

    iget-object v1, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->connection:Lorg/jivesoftware/smack/Connection;

    const/4 v2, 0x0

    check-cast v2, Lorg/jivesoftware/smackx/jingle/JingleSessionRequest;

    iget-object v3, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->connection:Lorg/jivesoftware/smack/Connection;

    invoke-virtual {v3}, Lorg/jivesoftware/smack/Connection;->getUser()Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleMediaManagers:Ljava/util/List;

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lorg/jivesoftware/smackx/jingle/JingleSession;-><init>(Lorg/jivesoftware/smack/Connection;Lorg/jivesoftware/smackx/jingle/JingleSessionRequest;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 534
    .local v0, "session":Lorg/jivesoftware/smackx/jingle/JingleSession;
    invoke-virtual {p0, v0}, Lorg/jivesoftware/smackx/jingle/JingleManager;->triggerSessionCreated(Lorg/jivesoftware/smackx/jingle/JingleSession;)V

    .line 536
    return-object v0
.end method

.method public disconnectAllSessions()V
    .locals 7

    .prologue
    .line 481
    iget-object v4, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleSessions:Ljava/util/List;

    const/4 v5, 0x0

    iget-object v6, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleSessions:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    invoke-interface {v4, v5, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v3

    .line 483
    .local v3, "sessions":Ljava/util/List;, "Ljava/util/List<Lorg/jivesoftware/smackx/jingle/JingleSession;>;"
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jivesoftware/smackx/jingle/JingleSession;

    .line 485
    .local v2, "jingleSession":Lorg/jivesoftware/smackx/jingle/JingleSession;
    :try_start_0
    invoke-virtual {v2}, Lorg/jivesoftware/smackx/jingle/JingleSession;->terminate()V
    :try_end_0
    .catch Lorg/jivesoftware/smack/XMPPException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 486
    :catch_0
    move-exception v0

    .line 487
    .local v0, "e":Lorg/jivesoftware/smack/XMPPException;
    invoke-virtual {v0}, Lorg/jivesoftware/smack/XMPPException;->printStackTrace()V

    goto :goto_0

    .line 490
    .end local v0    # "e":Lorg/jivesoftware/smack/XMPPException;
    .end local v2    # "jingleSession":Lorg/jivesoftware/smackx/jingle/JingleSession;
    :cond_0
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 491
    return-void
.end method

.method public getMediaManagers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lorg/jivesoftware/smackx/jingle/media/JingleMediaManager;",
            ">;"
        }
    .end annotation

    .prologue
    .line 330
    iget-object v0, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleMediaManagers:Ljava/util/List;

    return-object v0
.end method

.method public getSession(Ljava/lang/String;)Lorg/jivesoftware/smackx/jingle/JingleSession;
    .locals 3
    .param p1, "jid"    # Ljava/lang/String;

    .prologue
    .line 594
    iget-object v2, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleSessions:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jivesoftware/smackx/jingle/JingleSession;

    .line 595
    .local v1, "jingleSession":Lorg/jivesoftware/smackx/jingle/JingleSession;
    invoke-virtual {v1}, Lorg/jivesoftware/smackx/jingle/JingleSession;->getResponder()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 599
    .end local v1    # "jingleSession":Lorg/jivesoftware/smackx/jingle/JingleSession;
    :goto_0
    return-object v1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public removeCreationListener(Lorg/jivesoftware/smackx/jingle/listeners/CreatedJingleSessionListener;)V
    .locals 1
    .param p1, "createdJingleSessionListener"    # Lorg/jivesoftware/smackx/jingle/listeners/CreatedJingleSessionListener;

    .prologue
    .line 394
    iget-object v0, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->creationListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 395
    return-void
.end method

.method public removeJingleSessionRequestListener(Lorg/jivesoftware/smackx/jingle/listeners/JingleSessionRequestListener;)V
    .locals 2
    .param p1, "jingleSessionRequestListener"    # Lorg/jivesoftware/smackx/jingle/listeners/JingleSessionRequestListener;

    .prologue
    .line 369
    iget-object v0, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleSessionRequestListeners:Ljava/util/List;

    if-nez v0, :cond_0

    .line 375
    :goto_0
    return-void

    .line 372
    :cond_0
    iget-object v1, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleSessionRequestListeners:Ljava/util/List;

    monitor-enter v1

    .line 373
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleSessionRequestListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 374
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public sessionClosed(Ljava/lang/String;Lorg/jivesoftware/smackx/jingle/JingleSession;)V
    .locals 1
    .param p1, "reason"    # Ljava/lang/String;
    .param p2, "jingleSession"    # Lorg/jivesoftware/smackx/jingle/JingleSession;

    .prologue
    .line 430
    invoke-virtual {p2, p0}, Lorg/jivesoftware/smackx/jingle/JingleSession;->removeListener(Lorg/jivesoftware/smackx/jingle/listeners/JingleListener;)V

    .line 431
    iget-object v0, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleSessions:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 432
    return-void
.end method

.method public sessionClosedOnError(Lorg/jivesoftware/smack/XMPPException;Lorg/jivesoftware/smackx/jingle/JingleSession;)V
    .locals 1
    .param p1, "e"    # Lorg/jivesoftware/smack/XMPPException;
    .param p2, "jingleSession"    # Lorg/jivesoftware/smackx/jingle/JingleSession;

    .prologue
    .line 435
    invoke-virtual {p2, p0}, Lorg/jivesoftware/smackx/jingle/JingleSession;->removeListener(Lorg/jivesoftware/smackx/jingle/listeners/JingleListener;)V

    .line 436
    iget-object v0, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleSessions:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 437
    return-void
.end method

.method public sessionDeclined(Ljava/lang/String;Lorg/jivesoftware/smackx/jingle/JingleSession;)V
    .locals 3
    .param p1, "reason"    # Ljava/lang/String;
    .param p2, "jingleSession"    # Lorg/jivesoftware/smackx/jingle/JingleSession;

    .prologue
    .line 418
    invoke-virtual {p2, p0}, Lorg/jivesoftware/smackx/jingle/JingleSession;->removeListener(Lorg/jivesoftware/smackx/jingle/listeners/JingleListener;)V

    .line 419
    iget-object v0, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleSessions:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 420
    invoke-virtual {p2}, Lorg/jivesoftware/smackx/jingle/JingleSession;->close()V

    .line 421
    sget-object v0, Lorg/jivesoftware/smackx/jingle/JingleManager;->LOGGER:Lorg/jivesoftware/smackx/jingle/SmackLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Declined:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smackx/jingle/SmackLogger;->error(Ljava/lang/String;)V

    .line 422
    return-void
.end method

.method public sessionEstablished(Lorg/jivesoftware/smackx/jingle/media/PayloadType;Lorg/jivesoftware/smackx/jingle/nat/TransportCandidate;Lorg/jivesoftware/smackx/jingle/nat/TransportCandidate;Lorg/jivesoftware/smackx/jingle/JingleSession;)V
    .locals 0
    .param p1, "pt"    # Lorg/jivesoftware/smackx/jingle/media/PayloadType;
    .param p2, "rc"    # Lorg/jivesoftware/smackx/jingle/nat/TransportCandidate;
    .param p3, "lc"    # Lorg/jivesoftware/smackx/jingle/nat/TransportCandidate;
    .param p4, "jingleSession"    # Lorg/jivesoftware/smackx/jingle/JingleSession;

    .prologue
    .line 415
    return-void
.end method

.method public sessionMediaReceived(Lorg/jivesoftware/smackx/jingle/JingleSession;Ljava/lang/String;)V
    .locals 0
    .param p1, "jingleSession"    # Lorg/jivesoftware/smackx/jingle/JingleSession;
    .param p2, "participant"    # Ljava/lang/String;

    .prologue
    .line 441
    return-void
.end method

.method public sessionRedirected(Ljava/lang/String;Lorg/jivesoftware/smackx/jingle/JingleSession;)V
    .locals 1
    .param p1, "redirection"    # Ljava/lang/String;
    .param p2, "jingleSession"    # Lorg/jivesoftware/smackx/jingle/JingleSession;

    .prologue
    .line 425
    invoke-virtual {p2, p0}, Lorg/jivesoftware/smackx/jingle/JingleSession;->removeListener(Lorg/jivesoftware/smackx/jingle/listeners/JingleListener;)V

    .line 426
    iget-object v0, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleSessions:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 427
    return-void
.end method

.method public setMediaManagers(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lorg/jivesoftware/smackx/jingle/media/JingleMediaManager;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 339
    .local p1, "jingleMediaManagers":Ljava/util/List;, "Ljava/util/List<Lorg/jivesoftware/smackx/jingle/media/JingleMediaManager;>;"
    iput-object p1, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleMediaManagers:Ljava/util/List;

    .line 340
    return-void
.end method

.method public triggerSessionCreated(Lorg/jivesoftware/smackx/jingle/JingleSession;)V
    .locals 4
    .param p1, "jingleSession"    # Lorg/jivesoftware/smackx/jingle/JingleSession;

    .prologue
    .line 403
    iget-object v3, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleSessions:Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 404
    invoke-virtual {p1, p0}, Lorg/jivesoftware/smackx/jingle/JingleSession;->addListener(Lorg/jivesoftware/smackx/jingle/listeners/JingleListener;)V

    .line 405
    iget-object v3, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->creationListeners:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smackx/jingle/listeners/CreatedJingleSessionListener;

    .line 407
    .local v0, "createdJingleSessionListener":Lorg/jivesoftware/smackx/jingle/listeners/CreatedJingleSessionListener;
    :try_start_0
    invoke-interface {v0, p1}, Lorg/jivesoftware/smackx/jingle/listeners/CreatedJingleSessionListener;->sessionCreated(Lorg/jivesoftware/smackx/jingle/JingleSession;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 408
    :catch_0
    move-exception v1

    .line 409
    .local v1, "e":Ljava/lang/Exception;
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 412
    .end local v0    # "createdJingleSessionListener":Lorg/jivesoftware/smackx/jingle/listeners/CreatedJingleSessionListener;
    .end local v1    # "e":Ljava/lang/Exception;
    :cond_0
    return-void
.end method

.method triggerSessionRequested(Lorg/jivesoftware/smackx/packet/Jingle;)V
    .locals 5
    .param p1, "initJin"    # Lorg/jivesoftware/smackx/packet/Jingle;

    .prologue
    .line 500
    const/4 v1, 0x0

    .line 503
    .local v1, "jingleSessionRequestListeners":[Lorg/jivesoftware/smackx/jingle/listeners/JingleSessionRequestListener;
    iget-object v4, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleSessionRequestListeners:Ljava/util/List;

    monitor-enter v4

    .line 504
    :try_start_0
    iget-object v3, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleSessionRequestListeners:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    new-array v1, v3, [Lorg/jivesoftware/smackx/jingle/listeners/JingleSessionRequestListener;

    .line 505
    iget-object v3, p0, Lorg/jivesoftware/smackx/jingle/JingleManager;->jingleSessionRequestListeners:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 506
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 509
    new-instance v2, Lorg/jivesoftware/smackx/jingle/JingleSessionRequest;

    invoke-direct {v2, p0, p1}, Lorg/jivesoftware/smackx/jingle/JingleSessionRequest;-><init>(Lorg/jivesoftware/smackx/jingle/JingleManager;Lorg/jivesoftware/smackx/packet/Jingle;)V

    .line 510
    .local v2, "request":Lorg/jivesoftware/smackx/jingle/JingleSessionRequest;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    array-length v3, v1

    if-ge v0, v3, :cond_0

    .line 511
    aget-object v3, v1, v0

    invoke-interface {v3, v2}, Lorg/jivesoftware/smackx/jingle/listeners/JingleSessionRequestListener;->sessionRequested(Lorg/jivesoftware/smackx/jingle/JingleSessionRequest;)V

    .line 510
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 506
    .end local v0    # "i":I
    .end local v2    # "request":Lorg/jivesoftware/smackx/jingle/JingleSessionRequest;
    :catchall_0
    move-exception v3

    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v3

    .line 513
    .restart local v0    # "i":I
    .restart local v2    # "request":Lorg/jivesoftware/smackx/jingle/JingleSessionRequest;
    :cond_0
    return-void
.end method
