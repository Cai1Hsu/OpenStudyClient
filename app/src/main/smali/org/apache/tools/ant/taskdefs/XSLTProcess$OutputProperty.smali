.class public Lorg/apache/tools/ant/taskdefs/XSLTProcess$OutputProperty;
.super Ljava/lang/Object;
.source "XSLTProcess.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tools/ant/taskdefs/XSLTProcess;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OutputProperty"
.end annotation


# instance fields
.field private name:Ljava/lang/String;

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 1085
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1096
    iget-object v0, p0, Lorg/apache/tools/ant/taskdefs/XSLTProcess$OutputProperty;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1112
    iget-object v0, p0, Lorg/apache/tools/ant/taskdefs/XSLTProcess$OutputProperty;->value:Ljava/lang/String;

    return-object v0
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 1105
    iput-object p1, p0, Lorg/apache/tools/ant/taskdefs/XSLTProcess$OutputProperty;->name:Ljava/lang/String;

    .line 1106
    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 1120
    iput-object p1, p0, Lorg/apache/tools/ant/taskdefs/XSLTProcess$OutputProperty;->value:Ljava/lang/String;

    .line 1121
    return-void
.end method
