.class public final Lorg/apache/commons/net/nntp/NNTPConnectionClosedException;
.super Ljava/io/IOException;
.source "NNTPConnectionClosedException.java"


# static fields
.field private static final serialVersionUID:J = 0xe4a88946e15d202L


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 45
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 54
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 55
    return-void
.end method
