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
    ineg
    dup
    istore 2 ; INT b
    pop
    bipush 4
    dup
    istore 2 ; INT b
    pop
    bipush 1
    ifeq L0
    bipush 0
    goto L1
    L0:
    bipush 1 
    L1:
    dup
    istore 1 ; BOOL a
    pop
    bipush 4
    bipush 2
    idiv
    dup
    istore 2 ; INT b
    pop
    bipush 2
    bipush 3
    imul
    dup
    istore 2 ; INT b
    pop
    bipush 8
    bipush 6
    irem
    dup
    istore 2 ; INT b
    pop
    bipush 88
    bipush 23
    iadd
    dup
    istore 2 ; INT b
    pop
    bipush 2
    bipush 9
    isub
    dup
    istore 2 ; INT b
    pop
    bipush 2
    bipush 4
    if_icmplt L2
    bipush 0
    goto L3
    L2:
    bipush 1 
    L3:
    dup
    istore 1 ; BOOL a
    pop
    bipush 3
    bipush 3
    if_icmple L4
    bipush 0
    goto L5
    L4:
    bipush 1 
    L5:
    dup
    istore 1 ; BOOL a
    pop
    bipush 2
    bipush 4
    if_icmpgt L6
    bipush 0
    goto L7
    L6:
    bipush 1 
    L7:
    dup
    istore 1 ; BOOL a
    pop
    bipush 4
    bipush 2
    if_icmpge L8
    bipush 0
    goto L9
    L8:
    bipush 1 
    L9:
    dup
    istore 1 ; BOOL a
    pop
    bipush 98
    bipush 98
    if_icmpeq L10
    bipush 0
    goto L11
    L10:
    bipush 1 
    L11:
    dup
    istore 1 ; BOOL a
    pop
    bipush 2
    bipush 4
    if_icmpeq L12
    bipush 0
    goto L13
    L12:
    bipush 1 
    L13:
    dup
    istore 1 ; BOOL a
    pop
    bipush 1
    bipush 0
    if_icmpeq L14
    bipush 0
    goto L15
    L14:
    bipush 1 
    L15:
    dup
    istore 1 ; BOOL a
    pop
    bipush 98
    bipush 98
    if_icmpne L16
    bipush 0
    goto L17
    L16:
    bipush 1 
    L17:
    dup
    istore 1 ; BOOL a
    pop
    bipush 2
    bipush 4
    if_icmpne L18
    bipush 0
    goto L19
    L18:
    bipush 1 
    L19:
    dup
    istore 1 ; BOOL a
    pop
    bipush 1
    bipush 0
    if_icmpne L20
    bipush 0
    goto L21
    L20:
    bipush 1 
    L21:
    dup
    istore 1 ; BOOL a
    pop
    bipush 1
    bipush 0
    iand
    dup
    istore 1 ; BOOL a
    pop
    bipush 1
    bipush 0
    ior
    dup
    istore 1 ; BOOL a
    pop
    bipush 1
    dup
    istore 2 ; INT b
    pop
    bipush 4
    iload 2 ; INT b
    bipush 6
    bipush 6
    idiv
    imul
    iadd
    bipush 4
    bipush 3
    irem
    isub
    dup
    istore 2 ; INT b
    pop
    bipush 4
    bipush 2
    if_icmpge L22
    bipush 0
    goto L23
    L22:
    bipush 1 
    L23:
    bipush 2
    bipush 2
    if_icmpge L24
    bipush 0
    goto L25
    L24:
    bipush 1 
    L25:
    iand
    bipush 2
    bipush 2
    if_icmpgt L26
    bipush 0
    goto L27
    L26:
    bipush 1 
    L27:
    ifeq L28
    bipush 0
    goto L29
    L28:
    bipush 1 
    L29:
    iand
    dup
    istore 1 ; BOOL a
    pop
    aload 0 ; scanner
    invokevirtual java/util/Scanner/close()V
    return
  .end method