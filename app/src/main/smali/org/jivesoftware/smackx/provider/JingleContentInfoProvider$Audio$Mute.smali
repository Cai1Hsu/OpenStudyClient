.class public Lorg/jivesoftware/smackx/provider/JingleContentInfoProvider$Audio$Mute;
.super Lorg/jivesoftware/smackx/provider/JingleContentInfoProvider$Audio;
.source "JingleContentInfoProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smackx/provider/JingleContentInfoProvider$Audio;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Mute"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 109
    new-instance v0, Lorg/jivesoftware/smackx/packet/JingleContentInfo$Audio$Mute;

    invoke-direct {v0}, Lorg/jivesoftware/smackx/packet/JingleContentInfo$Audio$Mute;-><init>()V

    invoke-direct {p0, v0}, Lorg/jivesoftware/smackx/provider/JingleContentInfoProvider$Audio;-><init>(Lorg/jivesoftware/smack/packet/PacketExtension;)V

    .line 110
    return-void
.end method
