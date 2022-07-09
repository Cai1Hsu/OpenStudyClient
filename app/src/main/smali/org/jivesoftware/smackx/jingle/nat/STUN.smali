.class public Lorg/jivesoftware/smackx/jingle/nat/STUN;
.super Lorg/jivesoftware/smack/packet/IQ;
.source "STUN.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smackx/jingle/nat/STUN$StunServerAddress;,
        Lorg/jivesoftware/smackx/jingle/nat/STUN$Provider;
    }
.end annotation


# static fields
.field public static final DOMAIN:Ljava/lang/String; = "stun"

.field public static final ELEMENT_NAME:Ljava/lang/String; = "query"

.field private static final LOGGER:Lorg/jivesoftware/smackx/jingle/SmackLogger;

.field public static final NAMESPACE:Ljava/lang/String; = "google:jingleinfo"


# instance fields
.field private publicIp:Ljava/lang/String;

.field private servers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lorg/jivesoftware/smackx/jingle/nat/STUN$StunServerAddress;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 51
    const-class v0, Lorg/jivesoftware/smackx/jingle/nat/STUN;

    invoke-static {v0}, Lorg/jivesoftware/smackx/jingle/SmackLogger;->getLogger(Ljava/lang/Class;)Lorg/jivesoftware/smackx/jingle/SmackLogger;

    move-result-object v0

    sput-object v0, Lorg/jivesoftware/smackx/jingle/nat/STUN;->LOGGER:Lorg/jivesoftware/smackx/jingle/SmackLogger;

    .line 73
    invoke-static {}, Lorg/jivesoftware/smack/provider/ProviderManager;->getInstance()Lorg/jivesoftware/smack/provider/ProviderManager;

    move-result-object v0

    const-string/jumbo v1, "query"

    const-string/jumbo v2, "google:jingleinfo"

    new-instance v3, Lorg/jivesoftware/smackx/jingle/nat/STUN$Provider;

    invoke-direct {v3}, Lorg/jivesoftware/smackx/jingle/nat/STUN$Provider;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Lorg/jivesoftware/smack/provider/ProviderManager;->addIQProvider(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 74
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 79
    invoke-direct {p0}, Lorg/jivesoftware/smack/packet/IQ;-><init>()V

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smackx/jingle/nat/STUN;->servers:Ljava/util/List;

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smackx/jingle/nat/STUN;->publicIp:Ljava/lang/String;

    .line 80
    return-void
.end method

.method static synthetic access$000(Lorg/jivesoftware/smackx/jingle/nat/STUN;)Ljava/util/List;
    .locals 1
    .param p0, "x0"    # Lorg/jivesoftware/smackx/jingle/nat/STUN;

    .prologue
    .line 49
    iget-object v0, p0, Lorg/jivesoftware/smackx/jingle/nat/STUN;->servers:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$100(Lorg/jivesoftware/smackx/jingle/nat/STUN;Ljava/lang/String;)V
    .locals 0
    .param p0, "x0"    # Lorg/jivesoftware/smackx/jingle/nat/STUN;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 49
    invoke-direct {p0, p1}, Lorg/jivesoftware/smackx/jingle/nat/STUN;->setPublicIp(Ljava/lang/String;)V

    return-void
.end method

.method public static getSTUNServer(Lorg/jivesoftware/smack/Connection;)Lorg/jivesoftware/smackx/jingle/nat/STUN;
    .locals 6
    .param p0, "connection"    # Lorg/jivesoftware/smack/Connection;

    .prologue
    .line 193
    invoke-virtual {p0}, Lorg/jivesoftware/smack/Connection;->isConnected()Z

    move-result v3

    if-nez v3, :cond_0

    .line 194
    const/4 v1, 0x0

    .line 211
    :goto_0
    return-object v1

    .line 197
    :cond_0
    new-instance v2, Lorg/jivesoftware/smackx/jingle/nat/STUN;

    invoke-direct {v2}, Lorg/jivesoftware/smackx/jingle/nat/STUN;-><init>()V

    .line 198
    .local v2, "stunPacket":Lorg/jivesoftware/smackx/jingle/nat/STUN;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "stun."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p0}, Lorg/jivesoftware/smack/Connection;->getServiceName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/jivesoftware/smackx/jingle/nat/STUN;->setTo(Ljava/lang/String;)V

    .line 200
    new-instance v3, Lorg/jivesoftware/smack/filter/PacketIDFilter;

    invoke-virtual {v2}, Lorg/jivesoftware/smackx/jingle/nat/STUN;->getPacketID()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lorg/jivesoftware/smack/filter/PacketIDFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lorg/jivesoftware/smack/Connection;->createPacketCollector(Lorg/jivesoftware/smack/filter/PacketFilter;)Lorg/jivesoftware/smack/PacketCollector;

    move-result-object v0

    .line 203
    .local v0, "collector":Lorg/jivesoftware/smack/PacketCollector;
    invoke-virtual {p0, v2}, Lorg/jivesoftware/smack/Connection;->sendPacket(Lorg/jivesoftware/smack/packet/Packet;)V

    .line 205
    invoke-static {}, Lorg/jivesoftware/smack/SmackConfiguration;->getPacketReplyTimeout()I

    move-result v3

    int-to-long v4, v3

    invoke-virtual {v0, v4, v5}, Lorg/jivesoftware/smack/PacketCollector;->nextResult(J)Lorg/jivesoftware/smack/packet/Packet;

    move-result-object v1

    check-cast v1, Lorg/jivesoftware/smackx/jingle/nat/STUN;

    .line 209
    .local v1, "response":Lorg/jivesoftware/smackx/jingle/nat/STUN;
    invoke-virtual {v0}, Lorg/jivesoftware/smack/PacketCollector;->cancel()V

    goto :goto_0
.end method

.method public static serviceAvailable(Lorg/jivesoftware/smack/Connection;)Z
    .locals 12
    .param p0, "connection"    # Lorg/jivesoftware/smack/Connection;

    .prologue
    const/4 v8, 0x0

    .line 222
    invoke-virtual {p0}, Lorg/jivesoftware/smack/Connection;->isConnected()Z

    move-result v9

    if-nez v9, :cond_1

    .line 253
    :cond_0
    :goto_0
    return v8

    .line 226
    :cond_1
    sget-object v9, Lorg/jivesoftware/smackx/jingle/nat/STUN;->LOGGER:Lorg/jivesoftware/smackx/jingle/SmackLogger;

    const-string/jumbo v10, "Service listing"

    invoke-virtual {v9, v10}, Lorg/jivesoftware/smackx/jingle/SmackLogger;->debug(Ljava/lang/String;)V

    .line 228
    invoke-static {p0}, Lorg/jivesoftware/smackx/ServiceDiscoveryManager;->getInstanceFor(Lorg/jivesoftware/smack/Connection;)Lorg/jivesoftware/smackx/ServiceDiscoveryManager;

    move-result-object v0

    .line 231
    .local v0, "disco":Lorg/jivesoftware/smackx/ServiceDiscoveryManager;
    :try_start_0
    invoke-virtual {p0}, Lorg/jivesoftware/smack/Connection;->getServiceName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Lorg/jivesoftware/smackx/ServiceDiscoveryManager;->discoverItems(Ljava/lang/String;)Lorg/jivesoftware/smackx/packet/DiscoverItems;

    move-result-object v5

    .line 233
    .local v5, "items":Lorg/jivesoftware/smackx/packet/DiscoverItems;
    invoke-virtual {v5}, Lorg/jivesoftware/smackx/packet/DiscoverItems;->getItems()Ljava/util/Iterator;

    move-result-object v6

    .line 234
    .local v6, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Lorg/jivesoftware/smackx/packet/DiscoverItems$Item;>;"
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    .line 235
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/jivesoftware/smackx/packet/DiscoverItems$Item;

    .line 236
    .local v4, "item":Lorg/jivesoftware/smackx/packet/DiscoverItems$Item;
    invoke-virtual {v4}, Lorg/jivesoftware/smackx/packet/DiscoverItems$Item;->getEntityID()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Lorg/jivesoftware/smackx/ServiceDiscoveryManager;->discoverInfo(Ljava/lang/String;)Lorg/jivesoftware/smackx/packet/DiscoverInfo;

    move-result-object v3

    .line 238
    .local v3, "info":Lorg/jivesoftware/smackx/packet/DiscoverInfo;
    invoke-virtual {v3}, Lorg/jivesoftware/smackx/packet/DiscoverInfo;->getIdentities()Ljava/util/Iterator;

    move-result-object v7

    .line 239
    .local v7, "iter2":Ljava/util/Iterator;, "Ljava/util/Iterator<Lorg/jivesoftware/smackx/packet/DiscoverInfo$Identity;>;"
    :cond_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    .line 240
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jivesoftware/smackx/packet/DiscoverInfo$Identity;

    .line 241
    .local v2, "identity":Lorg/jivesoftware/smackx/packet/DiscoverInfo$Identity;
    invoke-virtual {v2}, Lorg/jivesoftware/smackx/packet/DiscoverInfo$Identity;->getCategory()Ljava/lang/String;

    move-result-object v9

    const-string/jumbo v10, "proxy"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-virtual {v2}, Lorg/jivesoftware/smackx/packet/DiscoverInfo$Identity;->getType()Ljava/lang/String;

    move-result-object v9

    const-string/jumbo v10, "stun"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 242
    const-string/jumbo v9, "google:jingleinfo"

    invoke-virtual {v3, v9}, Lorg/jivesoftware/smackx/packet/DiscoverInfo;->containsFeature(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 243
    const/4 v8, 0x1

    goto :goto_0

    .line 246
    .end local v2    # "identity":Lorg/jivesoftware/smackx/packet/DiscoverInfo$Identity;
    :cond_3
    sget-object v9, Lorg/jivesoftware/smackx/jingle/nat/STUN;->LOGGER:Lorg/jivesoftware/smackx/jingle/SmackLogger;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lorg/jivesoftware/smackx/packet/DiscoverItems$Item;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string/jumbo v11, "-"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v3}, Lorg/jivesoftware/smackx/packet/DiscoverInfo;->getType()Lorg/jivesoftware/smack/packet/IQ$Type;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lorg/jivesoftware/smackx/jingle/SmackLogger;->debug(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/jivesoftware/smack/XMPPException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 250
    .end local v3    # "info":Lorg/jivesoftware/smackx/packet/DiscoverInfo;
    .end local v4    # "item":Lorg/jivesoftware/smackx/packet/DiscoverItems$Item;
    .end local v5    # "items":Lorg/jivesoftware/smackx/packet/DiscoverItems;
    .end local v6    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Lorg/jivesoftware/smackx/packet/DiscoverItems$Item;>;"
    .end local v7    # "iter2":Ljava/util/Iterator;, "Ljava/util/Iterator<Lorg/jivesoftware/smackx/packet/DiscoverInfo$Identity;>;"
    :catch_0
    move-exception v1

    .line 251
    .local v1, "e":Lorg/jivesoftware/smack/XMPPException;
    invoke-virtual {v1}, Lorg/jivesoftware/smack/XMPPException;->printStackTrace()V

    goto/16 :goto_0
.end method

.method private setPublicIp(Ljava/lang/String;)V
    .locals 0
    .param p1, "publicIp"    # Ljava/lang/String;

    .prologue
    .line 106
    iput-object p1, p0, Lorg/jivesoftware/smackx/jingle/nat/STUN;->publicIp:Ljava/lang/String;

    .line 107
    return-void
.end method


# virtual methods
.method public getChildElementXML()Ljava/lang/String;
    .locals 2

    .prologue
    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .local v0, "str":Ljava/lang/StringBuilder;
    const-string/jumbo v1, "<query xmlns=\'google:jingleinfo\'/>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public getPublicIp()Ljava/lang/String;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lorg/jivesoftware/smackx/jingle/nat/STUN;->publicIp:Ljava/lang/String;

    return-object v0
.end method

.method public getServers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lorg/jivesoftware/smackx/jingle/nat/STUN$StunServerAddress;",
            ">;"
        }
    .end annotation

    .prologue
    .line 88
    iget-object v0, p0, Lorg/jivesoftware/smackx/jingle/nat/STUN;->servers:Ljava/util/List;

    return-object v0
.end method
