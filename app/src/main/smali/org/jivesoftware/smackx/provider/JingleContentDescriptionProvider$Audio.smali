.class public Lorg/jivesoftware/smackx/provider/JingleContentDescriptionProvider$Audio;
.super Lorg/jivesoftware/smackx/provider/JingleContentDescriptionProvider;
.source "JingleContentDescriptionProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smackx/provider/JingleContentDescriptionProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Audio"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 116
    invoke-direct {p0}, Lorg/jivesoftware/smackx/provider/JingleContentDescriptionProvider;-><init>()V

    .line 117
    return-void
.end method


# virtual methods
.method protected getInstance()Lorg/jivesoftware/smackx/packet/JingleContentDescription;
    .locals 1

    .prologue
    .line 141
    new-instance v0, Lorg/jivesoftware/smackx/packet/JingleContentDescription$Audio;

    invoke-direct {v0}, Lorg/jivesoftware/smackx/packet/JingleContentDescription$Audio;-><init>()V

    return-object v0
.end method

.method public parsePayload(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smackx/packet/JingleContentDescription$JinglePayloadType;
    .locals 5
    .param p1, "parser"    # Lorg/xmlpull/v1/XmlPullParser;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 124
    invoke-super {p0, p1}, Lorg/jivesoftware/smackx/provider/JingleContentDescriptionProvider;->parsePayload(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smackx/packet/JingleContentDescription$JinglePayloadType;

    move-result-object v2

    .line 125
    .local v2, "pte":Lorg/jivesoftware/smackx/packet/JingleContentDescription$JinglePayloadType;
    new-instance v0, Lorg/jivesoftware/smackx/jingle/media/PayloadType$Audio;

    invoke-virtual {v2}, Lorg/jivesoftware/smackx/packet/JingleContentDescription$JinglePayloadType;->getPayloadType()Lorg/jivesoftware/smackx/jingle/media/PayloadType;

    move-result-object v3

    invoke-direct {v0, v3}, Lorg/jivesoftware/smackx/jingle/media/PayloadType$Audio;-><init>(Lorg/jivesoftware/smackx/jingle/media/PayloadType;)V

    .line 126
    .local v0, "pt":Lorg/jivesoftware/smackx/jingle/media/PayloadType$Audio;
    const/4 v1, 0x0

    .line 129
    .local v1, "ptClockRate":I
    :try_start_0
    const-string/jumbo v3, ""

    const-string/jumbo v4, "clockrate"

    invoke-interface {p1, v3, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    .line 132
    :goto_0
    invoke-virtual {v0, v1}, Lorg/jivesoftware/smackx/jingle/media/PayloadType$Audio;->setClockRate(I)V

    .line 134
    new-instance v3, Lorg/jivesoftware/smackx/packet/JingleContentDescription$JinglePayloadType$Audio;

    invoke-direct {v3, v0}, Lorg/jivesoftware/smackx/packet/JingleContentDescription$JinglePayloadType$Audio;-><init>(Lorg/jivesoftware/smackx/jingle/media/PayloadType$Audio;)V

    return-object v3

    .line 130
    :catch_0
    move-exception v3

    goto :goto_0
.end method
