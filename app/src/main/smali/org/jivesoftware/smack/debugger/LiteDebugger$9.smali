.class Lorg/jivesoftware/smack/debugger/LiteDebugger$9;
.super Ljava/lang/Object;
.source "LiteDebugger.java"

# interfaces
.implements Lorg/jivesoftware/smack/util/WriterListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/jivesoftware/smack/debugger/LiteDebugger;->createDebug()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/jivesoftware/smack/debugger/LiteDebugger;

.field final synthetic val$sentText1:Ljavax/swing/JTextArea;

.field final synthetic val$sentText2:Ljavax/swing/JTextArea;


# direct methods
.method constructor <init>(Lorg/jivesoftware/smack/debugger/LiteDebugger;Ljavax/swing/JTextArea;Ljavax/swing/JTextArea;)V
    .locals 0

    .prologue
    .line 225
    iput-object p1, p0, Lorg/jivesoftware/smack/debugger/LiteDebugger$9;->this$0:Lorg/jivesoftware/smack/debugger/LiteDebugger;

    iput-object p2, p0, Lorg/jivesoftware/smack/debugger/LiteDebugger$9;->val$sentText1:Ljavax/swing/JTextArea;

    iput-object p3, p0, Lorg/jivesoftware/smack/debugger/LiteDebugger$9;->val$sentText2:Ljavax/swing/JTextArea;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public write(Ljava/lang/String;)V
    .locals 2
    .param p1, "str"    # Ljava/lang/String;

    .prologue
    .line 227
    iget-object v0, p0, Lorg/jivesoftware/smack/debugger/LiteDebugger$9;->val$sentText1:Ljavax/swing/JTextArea;

    invoke-virtual {v0, p1}, Ljavax/swing/JTextArea;->append(Ljava/lang/String;)V

    .line 228
    iget-object v0, p0, Lorg/jivesoftware/smack/debugger/LiteDebugger$9;->val$sentText2:Ljavax/swing/JTextArea;

    invoke-virtual {v0, p1}, Ljavax/swing/JTextArea;->append(Ljava/lang/String;)V

    .line 229
    const-string/jumbo v0, ">"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 230
    iget-object v0, p0, Lorg/jivesoftware/smack/debugger/LiteDebugger$9;->val$sentText1:Ljavax/swing/JTextArea;

    const-string/jumbo v1, "\n"

    invoke-virtual {v0, v1}, Ljavax/swing/JTextArea;->append(Ljava/lang/String;)V

    .line 231
    iget-object v0, p0, Lorg/jivesoftware/smack/debugger/LiteDebugger$9;->val$sentText2:Ljavax/swing/JTextArea;

    const-string/jumbo v1, "\n"

    invoke-virtual {v0, v1}, Ljavax/swing/JTextArea;->append(Ljava/lang/String;)V

    .line 233
    :cond_0
    return-void
.end method
