.class public Lorg/jivesoftware/smackx/packet/JingleTransport$Ice$Candidate;
.super Lorg/jivesoftware/smackx/packet/JingleTransport$JingleTransportCandidate;
.source "JingleTransport.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smackx/packet/JingleTransport$Ice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Candidate"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 309
    invoke-direct {p0}, Lorg/jivesoftware/smackx/packet/JingleTransport$JingleTransportCandidate;-><init>()V

    .line 310
    return-void
.end method

.method public constructor <init>(Lorg/jivesoftware/smackx/jingle/nat/TransportCandidate;)V
    .locals 0
    .param p1, "tc"    # Lorg/jivesoftware/smackx/jingle/nat/TransportCandidate;

    .prologue
    .line 316
    invoke-direct {p0, p1}, Lorg/jivesoftware/smackx/packet/JingleTransport$JingleTransportCandidate;-><init>(Lorg/jivesoftware/smackx/jingle/nat/TransportCandidate;)V

    .line 317
    return-void
.end method


# virtual methods
.method protected getChildElements()Ljava/lang/String;
    .locals 4

    .prologue
    .line 323
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 325
    .local v0, "buf":Ljava/lang/StringBuilder;
    iget-object v2, p0, Lorg/jivesoftware/smackx/packet/JingleTransport$Ice$Candidate;->transportCandidate:Lorg/jivesoftware/smackx/jingle/nat/TransportCandidate;

    if-eqz v2, :cond_0

    .line 326
    iget-object v1, p0, Lorg/jivesoftware/smackx/packet/JingleTransport$Ice$Candidate;->transportCandidate:Lorg/jivesoftware/smackx/jingle/nat/TransportCandidate;

    check-cast v1, Lorg/jivesoftware/smackx/jingle/nat/ICECandidate;

    .line 329
    .local v1, "tci":Lorg/jivesoftware/smackx/jingle/nat/ICECandidate;
    const-string/jumbo v2, " generation=\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lorg/jivesoftware/smackx/jingle/nat/ICECandidate;->getGeneration()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    const-string/jumbo v2, " ip=\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lorg/jivesoftware/smackx/jingle/nat/ICECandidate;->getIp()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    const-string/jumbo v2, " port=\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lorg/jivesoftware/smackx/jingle/nat/ICECandidate;->getPort()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    const-string/jumbo v2, " network=\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lorg/jivesoftware/smackx/jingle/nat/ICECandidate;->getNetwork()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    const-string/jumbo v2, " username=\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lorg/jivesoftware/smackx/jingle/nat/ICECandidate;->getUsername()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    const-string/jumbo v2, " password=\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lorg/jivesoftware/smackx/jingle/nat/ICECandidate;->getPassword()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    const-string/jumbo v2, " preference=\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lorg/jivesoftware/smackx/jingle/nat/ICECandidate;->getPreference()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    const-string/jumbo v2, " type=\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lorg/jivesoftware/smackx/jingle/nat/ICECandidate;->getType()Lorg/jivesoftware/smackx/jingle/nat/ICECandidate$Type;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    iget-object v2, p0, Lorg/jivesoftware/smackx/packet/JingleTransport$Ice$Candidate;->transportCandidate:Lorg/jivesoftware/smackx/jingle/nat/TransportCandidate;

    invoke-virtual {v2}, Lorg/jivesoftware/smackx/jingle/nat/TransportCandidate;->getName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 340
    const-string/jumbo v2, " name=\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lorg/jivesoftware/smackx/jingle/nat/ICECandidate;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .end local v1    # "tci":Lorg/jivesoftware/smackx/jingle/nat/ICECandidate;
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method
