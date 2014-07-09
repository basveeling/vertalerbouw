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
    bipush 97
    dup
    istore 1 ; CHAR a
    pop
    bipush 1
    dup
    istore 2 ; BOOL b
    pop
    bipush 5
    dup
    istore 3 ; INT c
    pop
    iload 1 ; CHAR a
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(C)V
    pop
    iload 2 ; BOOL b
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(Z)V
    pop
    iload 3 ; INT c
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(I)V
    pop
    aload 0 ; scanner
    invokevirtual java/util/Scanner/close()V
    return
  .end method