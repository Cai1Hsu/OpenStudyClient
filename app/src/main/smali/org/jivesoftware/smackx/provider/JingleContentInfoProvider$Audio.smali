.class public Lorg/jivesoftware/smackx/provider/JingleContentInfoProvider$Audio;
.super Lorg/jivesoftware/smackx/provider/JingleContentInfoProvider;
.source "JingleContentInfoProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smackx/provider/JingleContentInfoProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Audio"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smackx/provider/JingleContentInfoProvider$Audio$Ringing;,
        Lorg/jivesoftware/smackx/provider/JingleContentInfoProvider$Audio$Queued;,
        Lorg/jivesoftware/smackx/provider/JingleContentInfoProvider$Audio$Mute;,
        Lorg/jivesoftware/smackx/provider/JingleContentInfoProvider$Audio$Hold;,
        Lorg/jivesoftware/smackx/provider/JingleContentInfoProvider$Audio$Busy;
    }
.end annotation


# instance fields
.field private audioInfo:Lorg/jivesoftware/smack/packet/PacketExtension;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 59
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/jivesoftware/smackx/provider/JingleContentInfoProvider$Audio;-><init>(Lorg/jivesoftware/smack/packet/PacketExtension;)V

    .line 60
    return-void
.end method

.method public constructor <init>(Lorg/jivesoftware/smack/packet/PacketExtension;)V
    .locals 0
    .param p1, "audioInfo"    # Lorg/jivesoftware/smack/packet/PacketExtension;

    .prologue
    .line 68
    invoke-direct {p0}, Lorg/jivesoftware/smackx/provider/JingleContentInfoProvider;-><init>()V

    .line 69
    iput-object p1, p0, Lorg/jivesoftware/smackx/provider/JingleContentInfoProvider$Audio;->audioInfo:Lorg/jivesoftware/smack/packet/PacketExtension;

    .line 70
    return-void
.end method


# virtual methods
.method public parseExtension(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/PacketExtension;
    .locals 4
    .param p1, "parser"    # Lorg/xmlpull/v1/XmlPullParser;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 77
    const/4 v2, 0x0

    .line 79
    .local v2, "result":Lorg/jivesoftware/smack/packet/PacketExtension;
    iget-object v3, p0, Lorg/jivesoftware/smackx/provider/JingleContentInfoProvider$Audio;->audioInfo:Lorg/jivesoftware/smack/packet/PacketExtension;

    if-eqz v3, :cond_1

    .line 80
    iget-object v2, p0, Lorg/jivesoftware/smackx/provider/JingleContentInfoProvider$Audio;->audioInfo:Lorg/jivesoftware/smack/packet/PacketExtension;

    .line 90
    :cond_0
    :goto_0
    return-object v2

    .line 82
    :cond_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    .line 85
    .local v0, "elementName":Ljava/lang/String;
    invoke-static {v0}, Lorg/jivesoftware/smackx/jingle/media/ContentInfo$Audio;->fromString(Ljava/lang/String;)Lorg/jivesoftware/smackx/jingle/media/ContentInfo;

    move-result-object v1

    .line 86
    .local v1, "mi":Lorg/jivesoftware/smackx/jingle/media/ContentInfo;
    if-eqz v1, :cond_0

    .line 87
    new-instance v2, Lorg/jivesoftware/smackx/packet/JingleContentInfo$Audio;

    .end local v2    # "result":Lorg/jivesoftware/smack/packet/PacketExtension;
    invoke-direct {v2, v1}, Lorg/jivesoftware/smackx/packet/JingleContentInfo$Audio;-><init>(Lorg/jivesoftware/smackx/jingle/media/ContentInfo;)V

    .restart local v2    # "result":Lorg/jivesoftware/smack/packet/PacketExtension;
    goto :goto_0
.end method
