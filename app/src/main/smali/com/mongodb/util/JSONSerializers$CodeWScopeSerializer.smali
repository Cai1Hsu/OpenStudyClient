.class Lcom/mongodb/util/JSONSerializers$CodeWScopeSerializer;
.super Lcom/mongodb/util/JSONSerializers$CompoundObjectSerializer;
.source "JSONSerializers.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mongodb/util/JSONSerializers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "CodeWScopeSerializer"
.end annotation


# direct methods
.method constructor <init>(Lcom/mongodb/util/ObjectSerializer;)V
    .locals 0
    .param p1, "serializer"    # Lcom/mongodb/util/ObjectSerializer;

    .prologue
    .line 191
    invoke-direct {p0, p1}, Lcom/mongodb/util/JSONSerializers$CompoundObjectSerializer;-><init>(Lcom/mongodb/util/ObjectSerializer;)V

    .line 192
    return-void
.end method


# virtual methods
.method public serialize(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
    .locals 4
    .param p1, "obj"    # Ljava/lang/Object;
    .param p2, "buf"    # Ljava/lang/StringBuilder;

    .prologue
    .line 196
    move-object v0, p1

    check-cast v0, Lorg/bson/types/CodeWScope;

    .line 197
    .local v0, "c":Lorg/bson/types/CodeWScope;
    new-instance v1, Lcom/mongodb/BasicDBObject;

    invoke-direct {v1}, Lcom/mongodb/BasicDBObject;-><init>()V

    .line 198
    .local v1, "temp":Lcom/mongodb/BasicDBObject;
    const-string/jumbo v2, "$code"

    invoke-virtual {v0}, Lorg/bson/types/CodeWScope;->getCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/mongodb/BasicDBObject;->put(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    const-string/jumbo v2, "$scope"

    invoke-virtual {v0}, Lorg/bson/types/CodeWScope;->getScope()Lorg/bson/BSONObject;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/mongodb/BasicDBObject;->put(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    iget-object v2, p0, Lcom/mongodb/util/JSONSerializers$CodeWScopeSerializer;->serializer:Lcom/mongodb/util/ObjectSerializer;

    invoke-interface {v2, v1, p2}, Lcom/mongodb/util/ObjectSerializer;->serialize(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 201
    return-void
.end method
