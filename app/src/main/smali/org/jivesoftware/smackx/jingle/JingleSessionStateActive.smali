.class public Lorg/jivesoftware/smackx/jingle/JingleSessionStateActive;
.super Lorg/jivesoftware/smackx/jingle/JingleSessionState;
.source "JingleSessionStateActive.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smackx/jingle/JingleSessionStateActive$1;
    }
.end annotation


# static fields
.field private static INSTANCE:Lorg/jivesoftware/smackx/jingle/JingleSessionStateActive;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x0

    sput-object v0, Lorg/jivesoftware/smackx/jingle/JingleSessionStateActive;->INSTANCE:Lorg/jivesoftware/smackx/jingle/JingleSessionStateActive;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lorg/jivesoftware/smackx/jingle/JingleSessionState;-><init>()V

    .line 34
    return-void
.end method

.method public static declared-synchronized getInstance()Lorg/jivesoftware/smackx/jingle/JingleSessionState;
    .locals 2

    .prologue
    .line 41
    const-class v1, Lorg/jivesoftware/smackx/jingle/JingleSessionStateActive;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lorg/jivesoftware/smackx/jingle/JingleSessionStateActive;->INSTANCE:Lorg/jivesoftware/smackx/jingle/JingleSessionStateActive;

    if-nez v0, :cond_0

    .line 42
    new-instance v0, Lorg/jivesoftware/smackx/jingle/JingleSessionStateActive;

    invoke-direct {v0}, Lorg/jivesoftware/smackx/jingle/JingleSessionStateActive;-><init>()V

    sput-object v0, Lorg/jivesoftware/smackx/jingle/JingleSessionStateActive;->INSTANCE:Lorg/jivesoftware/smackx/jingle/JingleSessionStateActive;

    .line 44
    :cond_0
    sget-object v0, Lorg/jivesoftware/smackx/jingle/JingleSessionStateActive;->INSTANCE:Lorg/jivesoftware/smackx/jingle/JingleSessionStateActive;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 41
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private receiveSessionTerminateAction(Lorg/jivesoftware/smackx/jingle/JingleSession;Lorg/jivesoftware/smackx/packet/Jingle;)Lorg/jivesoftware/smack/packet/IQ;
    .locals 3
    .param p1, "session"    # Lorg/jivesoftware/smackx/jingle/JingleSession;
    .param p2, "jingle"    # Lorg/jivesoftware/smackx/packet/Jingle;

    .prologue
    .line 98
    invoke-virtual {p1, p2}, Lorg/jivesoftware/smackx/jingle/JingleSession;->createAck(Lorg/jivesoftware/smack/packet/IQ;)Lorg/jivesoftware/smack/packet/IQ;

    move-result-object v1

    .line 101
    .local v1, "response":Lorg/jivesoftware/smack/packet/IQ;
    :try_start_0
    const-string/jumbo v2, "Closed remotely"

    invoke-virtual {p1, v2}, Lorg/jivesoftware/smackx/jingle/JingleSession;->terminate(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/jivesoftware/smack/XMPPException; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    :goto_0
    return-object v1

    .line 102
    :catch_0
    move-exception v0

    .line 103
    .local v0, "e":Lorg/jivesoftware/smack/XMPPException;
    invoke-virtual {v0}, Lorg/jivesoftware/smack/XMPPException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public enter()V
    .locals 0

    .prologue
    .line 50
    return-void
.end method

.method public exit()V
    .locals 0

    .prologue
    .line 55
    return-void
.end method

.method public processJingle(Lorg/jivesoftware/smackx/jingle/JingleSession;Lorg/jivesoftware/smackx/packet/Jingle;Lorg/jivesoftware/smackx/jingle/JingleActionEnum;)Lorg/jivesoftware/smack/packet/IQ;
    .locals 3
    .param p1, "session"    # Lorg/jivesoftware/smackx/jingle/JingleSession;
    .param p2, "jingle"    # Lorg/jivesoftware/smackx/packet/Jingle;
    .param p3, "action"    # Lorg/jivesoftware/smackx/jingle/JingleActionEnum;

    .prologue
    .line 58
    const/4 v0, 0x0

    .line 60
    .local v0, "response":Lorg/jivesoftware/smack/packet/IQ;
    sget-object v1, Lorg/jivesoftware/smackx/jingle/JingleSessionStateActive$1;->$SwitchMap$org$jivesoftware$smackx$jingle$JingleActionEnum:[I

    invoke-virtual {p3}, Lorg/jivesoftware/smackx/jingle/JingleActionEnum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 86
    sget-object v1, Lorg/jivesoftware/smackx/packet/JingleError;->OUT_OF_ORDER:Lorg/jivesoftware/smackx/packet/JingleError;

    invoke-virtual {p1, p2, v1}, Lorg/jivesoftware/smackx/jingle/JingleSession;->createJingleError(Lorg/jivesoftware/smack/packet/IQ;Lorg/jivesoftware/smackx/packet/JingleError;)Lorg/jivesoftware/smack/packet/IQ;

    move-result-object v0

    .line 89
    :goto_0
    :pswitch_0
    return-object v0

    .line 78
    :pswitch_1
    invoke-direct {p0, p1, p2}, Lorg/jivesoftware/smackx/jingle/JingleSessionStateActive;->receiveSessionTerminateAction(Lorg/jivesoftware/smackx/jingle/JingleSession;Lorg/jivesoftware/smackx/packet/Jingle;)Lorg/jivesoftware/smack/packet/IQ;

    goto :goto_0

    .line 60
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
