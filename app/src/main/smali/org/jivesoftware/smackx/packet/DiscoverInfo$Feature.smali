.class public Lorg/jivesoftware/smackx/packet/DiscoverInfo$Feature;
.super Ljava/lang/Object;
.source "DiscoverInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smackx/packet/DiscoverInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Feature"
.end annotation


# instance fields
.field private variable:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2
    .param p1, "variable"    # Ljava/lang/String;

    .prologue
    .line 469
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 470
    if-nez p1, :cond_0

    .line 471
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "variable cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 472
    :cond_0
    iput-object p1, p0, Lorg/jivesoftware/smackx/packet/DiscoverInfo$Feature;->variable:Ljava/lang/String;

    .line 473
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x0

    .line 491
    if-nez p1, :cond_1

    .line 499
    :cond_0
    :goto_0
    return v1

    .line 493
    :cond_1
    if-ne p1, p0, :cond_2

    .line 494
    const/4 v1, 0x1

    goto :goto_0

    .line 495
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-ne v2, v3, :cond_0

    move-object v0, p1

    .line 498
    check-cast v0, Lorg/jivesoftware/smackx/packet/DiscoverInfo$Feature;

    .line 499
    .local v0, "other":Lorg/jivesoftware/smackx/packet/DiscoverInfo$Feature;
    iget-object v1, p0, Lorg/jivesoftware/smackx/packet/DiscoverInfo$Feature;->variable:Ljava/lang/String;

    iget-object v2, v0, Lorg/jivesoftware/smackx/packet/DiscoverInfo$Feature;->variable:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0
.end method

.method public getVar()Ljava/lang/String;
    .locals 1

    .prologue
    .line 481
    iget-object v0, p0, Lorg/jivesoftware/smackx/packet/DiscoverInfo$Feature;->variable:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 504
    iget-object v0, p0, Lorg/jivesoftware/smackx/packet/DiscoverInfo$Feature;->variable:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x25

    return v0
.end method

.method public toXML()Ljava/lang/String;
    .locals 3

    .prologue
    .line 485
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 486
    .local v0, "buf":Ljava/lang/StringBuilder;
    const-string/jumbo v1, "<feature var=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/jivesoftware/smackx/packet/DiscoverInfo$Feature;->variable:Ljava/lang/String;

    invoke-static {v2}, Lorg/jivesoftware/smack/util/StringUtils;->escapeForXML(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "\"/>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 487
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method
