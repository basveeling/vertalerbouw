  .class public Program
  .super java/lang/Object
  .method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
  .end method

  .method public static main([Ljava/lang/String;)V
    .limit stack 100
    .limit locals 100
    new java/util/Scanner
    dup
    getstatic java/lang/System/in Ljava/io/InputStream;
    invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
    astore 0 ; scanner
    bipush 5
    dup
    istore 2 ; INT bar
    pop
    bipush 3
    dup
    istore 1 ; INT foo
    pop
    iload 1 ; INT foo
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(I)V
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(I)V
    pop
    iload 2 ; INT bar
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(I)V
    pop
    aload 0 ; scanner
    invokevirtual java/util/Scanner/close()V
    return
  .end method