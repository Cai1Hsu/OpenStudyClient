.class public Lorg/apache/tools/ant/types/selectors/modifiedselector/ModifiedSelector$AlgorithmName;
.super Lorg/apache/tools/ant/types/EnumeratedAttribute;
.source "ModifiedSelector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tools/ant/types/selectors/modifiedselector/ModifiedSelector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AlgorithmName"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 933
    invoke-direct {p0}, Lorg/apache/tools/ant/types/EnumeratedAttribute;-><init>()V

    return-void
.end method


# virtual methods
.method public getValues()[Ljava/lang/String;
    .locals 3

    .prologue
    .line 939
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string/jumbo v2, "hashvalue"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string/jumbo v2, "digest"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string/jumbo v2, "checksum"

    aput-object v2, v0, v1

    return-object v0
.end method
