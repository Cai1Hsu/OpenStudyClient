.class Lorg/jivesoftware/smackx/jingle/JingleManager$3;
.super Ljava/lang/Object;
.source "JingleManager.java"

# interfaces
.implements Lorg/jivesoftware/smack/filter/PacketFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/jivesoftware/smackx/jingle/JingleManager;->initJingleSessionRequestListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/jivesoftware/smackx/jingle/JingleManager;


# direct methods
.method constructor <init>(Lorg/jivesoftware/smackx/jingle/JingleManager;)V
    .locals 0

    .prologue
    .line 448
    iput-object p1, p0, Lorg/jivesoftware/smackx/jingle/JingleManager$3;->this$0:Lorg/jivesoftware/smackx/jingle/JingleManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Lorg/jivesoftware/smack/packet/Packet;)Z
    .locals 4
    .param p1, "pin"    # Lorg/jivesoftware/smack/packet/Packet;

    .prologue
    .line 451
    instance-of v2, p1, Lorg/jivesoftware/smack/packet/IQ;

    if-eqz v2, :cond_0

    move-object v0, p1

    .line 452
    check-cast v0, Lorg/jivesoftware/smack/packet/IQ;

    .line 453
    .local v0, "iq":Lorg/jivesoftware/smack/packet/IQ;
    invoke-virtual {v0}, Lorg/jivesoftware/smack/packet/IQ;->getType()Lorg/jivesoftware/smack/packet/IQ$Type;

    move-result-object v2

    sget-object v3, Lorg/jivesoftware/smack/packet/IQ$Type;->SET:Lorg/jivesoftware/smack/packet/IQ$Type;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 454
    instance-of v2, v0, Lorg/jivesoftware/smackx/packet/Jingle;

    if-eqz v2, :cond_0

    move-object v1, p1

    .line 455
    check-cast v1, Lorg/jivesoftware/smackx/packet/Jingle;

    .line 456
    .local v1, "jin":Lorg/jivesoftware/smackx/packet/Jingle;
    invoke-virtual {v1}, Lorg/jivesoftware/smackx/packet/Jingle;->getAction()Lorg/jivesoftware/smackx/jingle/JingleActionEnum;

    move-result-object v2

    sget-object v3, Lorg/jivesoftware/smackx/jingle/JingleActionEnum;->SESSION_INITIATE:Lorg/jivesoftware/smackx/jingle/JingleActionEnum;

    invoke-virtual {v2, v3}, Lorg/jivesoftware/smackx/jingle/JingleActionEnum;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 457
    const/4 v2, 0x1

    .line 462
    .end local v0    # "iq":Lorg/jivesoftware/smack/packet/IQ;
    .end local v1    # "jin":Lorg/jivesoftware/smackx/packet/Jingle;
    :goto_0
    return v2

    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method
