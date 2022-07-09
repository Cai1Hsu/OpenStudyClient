.class final Lcom/jcraft/jzlib/StaticTree;
.super Ljava/lang/Object;
.source "StaticTree.java"


# static fields
.field private static final BL_CODES:I = 0x13

.field private static final D_CODES:I = 0x1e

.field private static final LENGTH_CODES:I = 0x1d

.field private static final LITERALS:I = 0x100

.field private static final L_CODES:I = 0x11e

.field private static final MAX_BITS:I = 0xf

.field static final MAX_BL_BITS:I = 0x7

.field static static_bl_desc:Lcom/jcraft/jzlib/StaticTree;

.field static static_d_desc:Lcom/jcraft/jzlib/StaticTree;

.field static final static_dtree:[S

.field static static_l_desc:Lcom/jcraft/jzlib/StaticTree;

.field static final static_ltree:[S


# instance fields
.field elems:I

.field extra_base:I

.field extra_bits:[I

.field max_length:I

.field static_tree:[S


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/16 v5, 0xf

    const/4 v6, 0x0

    .line 49
    const/16 v0, 0x240

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lcom/jcraft/jzlib/StaticTree;->static_ltree:[S

    .line 110
    const/16 v0, 0x3c

    new-array v0, v0, [S

    fill-array-data v0, :array_1

    sput-object v0, Lcom/jcraft/jzlib/StaticTree;->static_dtree:[S

    .line 119
    new-instance v0, Lcom/jcraft/jzlib/StaticTree;

    sget-object v1, Lcom/jcraft/jzlib/StaticTree;->static_ltree:[S

    sget-object v2, Lcom/jcraft/jzlib/Tree;->extra_lbits:[I

    const/16 v3, 0x101

    const/16 v4, 0x11e

    invoke-direct/range {v0 .. v5}, Lcom/jcraft/jzlib/StaticTree;-><init>([S[IIII)V

    sput-object v0, Lcom/jcraft/jzlib/StaticTree;->static_l_desc:Lcom/jcraft/jzlib/StaticTree;

    .line 123
    new-instance v0, Lcom/jcraft/jzlib/StaticTree;

    sget-object v1, Lcom/jcraft/jzlib/StaticTree;->static_dtree:[S

    sget-object v2, Lcom/jcraft/jzlib/Tree;->extra_dbits:[I

    const/16 v4, 0x1e

    move v3, v6

    invoke-direct/range {v0 .. v5}, Lcom/jcraft/jzlib/StaticTree;-><init>([S[IIII)V

    sput-object v0, Lcom/jcraft/jzlib/StaticTree;->static_d_desc:Lcom/jcraft/jzlib/StaticTree;

    .line 127
    new-instance v0, Lcom/jcraft/jzlib/StaticTree;

    const/4 v1, 0x0

    sget-object v2, Lcom/jcraft/jzlib/Tree;->extra_blbits:[I

    const/16 v4, 0x13

    const/4 v5, 0x7

    move v3, v6

    invoke-direct/range {v0 .. v5}, Lcom/jcraft/jzlib/StaticTree;-><init>([S[IIII)V

    sput-object v0, Lcom/jcraft/jzlib/StaticTree;->static_bl_desc:Lcom/jcraft/jzlib/StaticTree;

    return-void

    .line 49
    nop

    :array_0
    .array-data 2
        0xcs
        0x8s
        0x8cs
        0x8s
        0x4cs
        0x8s
        0xccs
        0x8s
        0x2cs
        0x8s
        0xacs
        0x8s
        0x6cs
        0x8s
        0xecs
        0x8s
        0x1cs
        0x8s
        0x9cs
        0x8s
        0x5cs
        0x8s
        0xdcs
        0x8s
        0x3cs
        0x8s
        0xbcs
        0x8s
        0x7cs
        0x8s
        0xfcs
        0x8s
        0x2s
        0x8s
        0x82s
        0x8s
        0x42s
        0x8s
        0xc2s
        0x8s
        0x22s
        0x8s
        0xa2s
        0x8s
        0x62s
        0x8s
        0xe2s
        0x8s
        0x12s
        0x8s
        0x92s
        0x8s
        0x52s
        0x8s
        0xd2s
        0x8s
        0x32s
        0x8s
        0xb2s
        0x8s
        0x72s
        0x8s
        0xf2s
        0x8s
        0xas
        0x8s
        0x8as
        0x8s
        0x4as
        0x8s
        0xcas
        0x8s
        0x2as
        0x8s
        0xaas
        0x8s
        0x6as
        0x8s
        0xeas
        0x8s
        0x1as
        0x8s
        0x9as
        0x8s
        0x5as
        0x8s
        0xdas
        0x8s
        0x3as
        0x8s
        0xbas
        0x8s
        0x7as
        0x8s
        0xfas
        0x8s
        0x6s
        0x8s
        0x86s
        0x8s
        0x46s
        0x8s
        0xc6s
        0x8s
        0x26s
        0x8s
        0xa6s
        0x8s
        0x66s
        0x8s
        0xe6s
        0x8s
        0x16s
        0x8s
        0x96s
        0x8s
        0x56s
        0x8s
        0xd6s
        0x8s
        0x36s
        0x8s
        0xb6s
        0x8s
        0x76s
        0x8s
        0xf6s
        0x8s
        0xes
        0x8s
        0x8es
        0x8s
        0x4es
        0x8s
        0xces
        0x8s
        0x2es
        0x8s
        0xaes
        0x8s
        0x6es
        0x8s
        0xees
        0x8s
        0x1es
        0x8s
        0x9es
        0x8s
        0x5es
        0x8s
        0xdes
        0x8s
        0x3es
        0x8s
        0xbes
        0x8s
        0x7es
        0x8s
        0xfes
        0x8s
        0x1s
        0x8s
        0x81s
        0x8s
        0x41s
        0x8s
        0xc1s
        0x8s
        0x21s
        0x8s
        0xa1s
        0x8s
        0x61s
        0x8s
        0xe1s
        0x8s
        0x11s
        0x8s
        0x91s
        0x8s
        0x51s
        0x8s
        0xd1s
        0x8s
        0x31s
        0x8s
        0xb1s
        0x8s
        0x71s
        0x8s
        0xf1s
        0x8s
        0x9s
        0x8s
        0x89s
        0x8s
        0x49s
        0x8s
        0xc9s
        0x8s
        0x29s
        0x8s
        0xa9s
        0x8s
        0x69s
        0x8s
        0xe9s
        0x8s
        0x19s
        0x8s
        0x99s
        0x8s
        0x59s
        0x8s
        0xd9s
        0x8s
        0x39s
        0x8s
        0xb9s
        0x8s
        0x79s
        0x8s
        0xf9s
        0x8s
        0x5s
        0x8s
        0x85s
        0x8s
        0x45s
        0x8s
        0xc5s
        0x8s
        0x25s
        0x8s
        0xa5s
        0x8s
        0x65s
        0x8s
        0xe5s
        0x8s
        0x15s
        0x8s
        0x95s
        0x8s
        0x55s
        0x8s
        0xd5s
        0x8s
        0x35s
        0x8s
        0xb5s
        0x8s
        0x75s
        0x8s
        0xf5s
        0x8s
        0xds
        0x8s
        0x8ds
        0x8s
        0x4ds
        0x8s
        0xcds
        0x8s
        0x2ds
        0x8s
        0xads
        0x8s
        0x6ds
        0x8s
        0xeds
        0x8s
        0x1ds
        0x8s
        0x9ds
        0x8s
        0x5ds
        0x8s
        0xdds
        0x8s
        0x3ds
        0x8s
        0xbds
        0x8s
        0x7ds
        0x8s
        0xfds
        0x8s
        0x13s
        0x9s
        0x113s
        0x9s
        0x93s
        0x9s
        0x193s
        0x9s
        0x53s
        0x9s
        0x153s
        0x9s
        0xd3s
        0x9s
        0x1d3s
        0x9s
        0x33s
        0x9s
        0x133s
        0x9s
        0xb3s
        0x9s
        0x1b3s
        0x9s
        0x73s
        0x9s
        0x173s
        0x9s
        0xf3s
        0x9s
        0x1f3s
        0x9s
        0xbs
        0x9s
        0x10bs
        0x9s
        0x8bs
        0x9s
        0x18bs
        0x9s
        0x4bs
        0x9s
        0x14bs
        0x9s
        0xcbs
        0x9s
        0x1cbs
        0x9s
        0x2bs
        0x9s
        0x12bs
        0x9s
        0xabs
        0x9s
        0x1abs
        0x9s
        0x6bs
        0x9s
        0x16bs
        0x9s
        0xebs
        0x9s
        0x1ebs
        0x9s
        0x1bs
        0x9s
        0x11bs
        0x9s
        0x9bs
        0x9s
        0x19bs
        0x9s
        0x5bs
        0x9s
        0x15bs
        0x9s
        0xdbs
        0x9s
        0x1dbs
        0x9s
        0x3bs
        0x9s
        0x13bs
        0x9s
        0xbbs
        0x9s
        0x1bbs
        0x9s
        0x7bs
        0x9s
        0x17bs
        0x9s
        0xfbs
        0x9s
        0x1fbs
        0x9s
        0x7s
        0x9s
        0x107s
        0x9s
        0x87s
        0x9s
        0x187s
        0x9s
        0x47s
        0x9s
        0x147s
        0x9s
        0xc7s
        0x9s
        0x1c7s
        0x9s
        0x27s
        0x9s
        0x127s
        0x9s
        0xa7s
        0x9s
        0x1a7s
        0x9s
        0x67s
        0x9s
        0x167s
        0x9s
        0xe7s
        0x9s
        0x1e7s
        0x9s
        0x17s
        0x9s
        0x117s
        0x9s
        0x97s
        0x9s
        0x197s
        0x9s
        0x57s
        0x9s
        0x157s
        0x9s
        0xd7s
        0x9s
        0x1d7s
        0x9s
        0x37s
        0x9s
        0x137s
        0x9s
        0xb7s
        0x9s
        0x1b7s
        0x9s
        0x77s
        0x9s
        0x177s
        0x9s
        0xf7s
        0x9s
        0x1f7s
        0x9s
        0xfs
        0x9s
        0x10fs
        0x9s
        0x8fs
        0x9s
        0x18fs
        0x9s
        0x4fs
        0x9s
        0x14fs
        0x9s
        0xcfs
        0x9s
        0x1cfs
        0x9s
        0x2fs
        0x9s
        0x12fs
        0x9s
        0xafs
        0x9s
        0x1afs
        0x9s
        0x6fs
        0x9s
        0x16fs
        0x9s
        0xefs
        0x9s
        0x1efs
        0x9s
        0x1fs
        0x9s
        0x11fs
        0x9s
        0x9fs
        0x9s
        0x19fs
        0x9s
        0x5fs
        0x9s
        0x15fs
        0x9s
        0xdfs
        0x9s
        0x1dfs
        0x9s
        0x3fs
        0x9s
        0x13fs
        0x9s
        0xbfs
        0x9s
        0x1bfs
        0x9s
        0x7fs
        0x9s
        0x17fs
        0x9s
        0xffs
        0x9s
        0x1ffs
        0x9s
        0x0s
        0x7s
        0x40s
        0x7s
        0x20s
        0x7s
        0x60s
        0x7s
        0x10s
        0x7s
        0x50s
        0x7s
        0x30s
        0x7s
        0x70s
        0x7s
        0x8s
        0x7s
        0x48s
        0x7s
        0x28s
        0x7s
        0x68s
        0x7s
        0x18s
        0x7s
        0x58s
        0x7s
        0x38s
        0x7s
        0x78s
        0x7s
        0x4s
        0x7s
        0x44s
        0x7s
        0x24s
        0x7s
        0x64s
        0x7s
        0x14s
        0x7s
        0x54s
        0x7s
        0x34s
        0x7s
        0x74s
        0x7s
        0x3s
        0x8s
        0x83s
        0x8s
        0x43s
        0x8s
        0xc3s
        0x8s
        0x23s
        0x8s
        0xa3s
        0x8s
        0x63s
        0x8s
        0xe3s
        0x8s
    .end array-data

    .line 110
    :array_1
    .array-data 2
        0x0s
        0x5s
        0x10s
        0x5s
        0x8s
        0x5s
        0x18s
        0x5s
        0x4s
        0x5s
        0x14s
        0x5s
        0xcs
        0x5s
        0x1cs
        0x5s
        0x2s
        0x5s
        0x12s
        0x5s
        0xas
        0x5s
        0x1as
        0x5s
        0x6s
        0x5s
        0x16s
        0x5s
        0xes
        0x5s
        0x1es
        0x5s
        0x1s
        0x5s
        0x11s
        0x5s
        0x9s
        0x5s
        0x19s
        0x5s
        0x5s
        0x5s
        0x15s
        0x5s
        0xds
        0x5s
        0x1ds
        0x5s
        0x3s
        0x5s
        0x13s
        0x5s
        0xbs
        0x5s
        0x1bs
        0x5s
        0x7s
        0x5s
        0x17s
        0x5s
    .end array-data
.end method

.method constructor <init>([S[IIII)V
    .locals 0
    .param p1, "static_tree"    # [S
    .param p2, "extra_bits"    # [I
    .param p3, "extra_base"    # I
    .param p4, "elems"    # I
    .param p5, "max_length"    # I

    .prologue
    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 143
    iput-object p1, p0, Lcom/jcraft/jzlib/StaticTree;->static_tree:[S

    .line 144
    iput-object p2, p0, Lcom/jcraft/jzlib/StaticTree;->extra_bits:[I

    .line 145
    iput p3, p0, Lcom/jcraft/jzlib/StaticTree;->extra_base:I

    .line 146
    iput p4, p0, Lcom/jcraft/jzlib/StaticTree;->elems:I

    .line 147
    iput p5, p0, Lcom/jcraft/jzlib/StaticTree;->max_length:I

    .line 148
    return-void
.end method
