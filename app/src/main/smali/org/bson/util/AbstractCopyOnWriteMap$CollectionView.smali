.class public abstract Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;
.super Ljava/lang/Object;
.source "AbstractCopyOnWriteMap.java"

# interfaces
.implements Ljava/util/Collection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bson/util/AbstractCopyOnWriteMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40c
    name = "CollectionView"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Collection",
        "<TE;>;"
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    .prologue
    .line 484
    .local p0, "this":Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;, "Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView<TE;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .prologue
    .line 540
    .local p0, "this":Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;, "Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView<TE;>;"
    .local p1, "o":Ljava/lang/Object;, "TE;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<+TE;>;)Z"
        }
    .end annotation

    .prologue
    .line 544
    .local p0, "this":Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;, "Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView<TE;>;"
    .local p1, "c":Ljava/util/Collection;, "Ljava/util/Collection<+TE;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 493
    .local p0, "this":Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;, "Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView<TE;>;"
    invoke-virtual {p0}, Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;->getDelegate()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 497
    .local p0, "this":Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;, "Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView<TE;>;"
    .local p1, "c":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
    invoke-virtual {p0}, Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;->getDelegate()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Collection;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    .line 527
    .local p0, "this":Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;, "Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView<TE;>;"
    invoke-virtual {p0}, Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;->getDelegate()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Collection;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method abstract getDelegate()Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<TE;>;"
        }
    .end annotation
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 522
    .local p0, "this":Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;, "Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView<TE;>;"
    invoke-virtual {p0}, Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;->getDelegate()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->hashCode()I

    move-result v0

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    .prologue
    .line 505
    .local p0, "this":Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;, "Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView<TE;>;"
    invoke-virtual {p0}, Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;->getDelegate()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 501
    .local p0, "this":Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;, "Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView<TE;>;"
    new-instance v0, Lorg/bson/util/AbstractCopyOnWriteMap$UnmodifiableIterator;

    invoke-virtual {p0}, Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;->getDelegate()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bson/util/AbstractCopyOnWriteMap$UnmodifiableIterator;-><init>(Ljava/util/Iterator;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 509
    .local p0, "this":Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;, "Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView<TE;>;"
    invoke-virtual {p0}, Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;->getDelegate()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    return v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 513
    .local p0, "this":Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;, "Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView<TE;>;"
    invoke-virtual {p0}, Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;->getDelegate()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .prologue
    .line 517
    .local p0, "this":Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;, "Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView<TE;>;"
    .local p1, "a":[Ljava/lang/Object;, "[TT;"
    invoke-virtual {p0}, Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;->getDelegate()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 532
    .local p0, "this":Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;, "Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView<TE;>;"
    invoke-virtual {p0}, Lorg/bson/util/AbstractCopyOnWriteMap$CollectionView;->getDelegate()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
