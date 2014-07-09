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
    iconst_0
    istore 1 ; x
    aload 0 ; scanner
    invokevirtual java/util/Scanner/hasNextLine()Z
    ifeq L0
    aload 0 
    invokevirtual java/util/Scanner/hasNextInt()Z
    ifeq L1
    aload 0 ; scanner
    invokevirtual java/util/Scanner/nextInt()I
    goto L2
    L1:
    iconst_0
    L2:
    aload 0 ; scanner
    invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;
    pop
    istore 1 ; x
    L0:
    iconst_0
    istore 2 ; y
    aload 0 ; scanner
    invokevirtual java/util/Scanner/hasNextLine()Z
    ifeq L3
    aload 0 
    invokevirtual java/util/Scanner/hasNextBoolean()Z
    ifeq L4
    aload 0 ; scanner
    invokevirtual java/util/Scanner/nextBoolean()Z
    goto L5
    L4:
    iconst_0
    L5:
    aload 0 ; scanner
    invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;
    pop
    istore 2 ; y
    L3:
    iconst_0
    istore 3 ; z
    aload 0 ; scanner
    invokevirtual java/util/Scanner/hasNextLine()Z
    ifeq L6
    aload 0 
    invokevirtual java/util/Scanner/hasNext()Z
    ifeq L7
    aload 0 ; scanner
    invokevirtual java/util/Scanner/next()Ljava/lang/String;
    iconst_0              
    invokevirtual java/lang/String/charAt(I)C
    goto L8
    L7:
    iconst_0
    L8:
    aload 0 ; scanner
    invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;
    pop
    istore 3 ; z
    L6:
    iload 1 ; x
    pop
    iload 1 ; INT x
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(I)V
    pop
    iload 2 ; BOOL y
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(Z)V
    pop
    iload 3 ; CHAR z
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(C)V
    pop
    aload 0 ; scanner
    invokevirtual java/util/Scanner/close()V
    return
  .end method