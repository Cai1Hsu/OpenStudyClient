.class public final enum Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;
.super Ljava/lang/Enum;
.source "JingleNegotiatorState.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;

.field public static final enum FAILED:Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;

.field public static final enum PENDING:Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;

.field public static final enum SUCCEEDED:Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 24
    new-instance v0, Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;

    const-string/jumbo v1, "PENDING"

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;->PENDING:Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;

    .line 25
    new-instance v0, Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;

    const-string/jumbo v1, "FAILED"

    invoke-direct {v0, v1, v3}, Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;->FAILED:Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;

    .line 26
    new-instance v0, Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;

    const-string/jumbo v1, "SUCCEEDED"

    invoke-direct {v0, v1, v4}, Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;->SUCCEEDED:Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;

    .line 23
    const/4 v0, 0x3

    new-array v0, v0, [Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;

    sget-object v1, Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;->PENDING:Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;->FAILED:Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;

    aput-object v1, v0, v3

    sget-object v1, Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;->SUCCEEDED:Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;

    aput-object v1, v0, v4

    sput-object v0, Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;->$VALUES:[Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 23
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 23
    const-class v0, Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;

    return-object v0
.end method

.method public static values()[Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;
    .locals 1

    .prologue
    .line 23
    sget-object v0, Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;->$VALUES:[Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;

    invoke-virtual {v0}, [Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jivesoftware/smackx/jingle/JingleNegotiatorState;

    return-object v0
.end method
