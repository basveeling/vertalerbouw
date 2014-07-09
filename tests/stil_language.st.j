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
    istore 2 ; ivar1
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
    istore 2 ; ivar1
    L0:
    iconst_0
    istore 3 ; ivar2
    aload 0 ; scanner
    invokevirtual java/util/Scanner/hasNextLine()Z
    ifeq L3
    aload 0 
    invokevirtual java/util/Scanner/hasNextInt()Z
    ifeq L4
    aload 0 ; scanner
    invokevirtual java/util/Scanner/nextInt()I
    goto L5
    L4:
    iconst_0
    L5:
    aload 0 ; scanner
    invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;
    pop
    istore 3 ; ivar2
    L3:
    iload 2 ; ivar1
    pop
    iload 2 ; INT ivar1
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(I)V
    pop
    iload 3 ; INT ivar2
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(I)V
    pop
    bipush 1
    dup
    istore 4 ; INT iconst1
    pop
    bipush 2
    dup
    istore 5 ; INT iconst2
    pop
    bipush 16
    bipush 2
    bipush 8
    ineg
    imul
    iadd
    dup
    istore 2 ; INT ivar1
    dup
    istore 3 ; INT ivar2
    pop
    iload 2 ; INT ivar1
    iload 3 ; INT ivar2
    if_icmplt L6
    bipush 0
    goto L7
    L6:
    bipush 1 
    L7:
    iload 4 ; INT iconst1
    iload 5 ; INT iconst2
    if_icmple L8
    bipush 0
    goto L9
    L8:
    bipush 1 
    L9:
    iand
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(Z)V
    pop
    iload 4 ; INT iconst1
    iload 5 ; INT iconst2
    imul
    iload 3 ; INT ivar2
    iload 2 ; INT ivar1
    isub
    if_icmpgt L10
    bipush 0
    goto L11
    L10:
    bipush 1 
    L11:
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(Z)V
    pop
    iload 2 ; INT ivar1
    iconst_0
    istore 3 ; ivar2
    aload 0 ; scanner
    invokevirtual java/util/Scanner/hasNextLine()Z
    ifeq L12
    aload 0 
    invokevirtual java/util/Scanner/hasNextInt()Z
    ifeq L13
    aload 0 ; scanner
    invokevirtual java/util/Scanner/nextInt()I
    goto L14
    L13:
    iconst_0
    L14:
    aload 0 ; scanner
    invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;
    pop
    istore 3 ; ivar2
    L12:
    iload 3 ; ivar2
    if_icmplt L15
    bipush 0
    goto L16
    L15:
    bipush 1 
    L16:
    iload 4 ; INT iconst1
    iload 5 ; INT iconst2
    if_icmple L17
    bipush 0
    goto L18
    L17:
    bipush 1 
    L18:
    iand
    pop
    iload 3 ; INT ivar2
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(I)V
    bipush 1
    iadd
    dup
    istore 3 ; INT ivar2
    bipush 1
    iadd
    dup
    istore 1 ; INT ivar
    pop
    iconst_0
    istore 3 ; bvar
    aload 0 ; scanner
    invokevirtual java/util/Scanner/hasNextLine()Z
    ifeq L19
    aload 0 
    invokevirtual java/util/Scanner/hasNextBoolean()Z
    ifeq L20
    aload 0 ; scanner
    invokevirtual java/util/Scanner/nextBoolean()Z
    goto L21
    L20:
    iconst_0
    L21:
    aload 0 ; scanner
    invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;
    pop
    istore 3 ; bvar
    L19:
    iload 3 ; bvar
    pop
    iload 3 ; BOOL bvar
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(Z)V
    pop
    bipush 12
    bipush 5
    idiv
    bipush 5
    imul
    bipush 12
    bipush 5
    irem
    iadd
    bipush 12
    if_icmpeq L22
    bipush 0
    goto L23
    L22:
    bipush 1 
    L23:
    bipush 6
    bipush 6
    if_icmpge L24
    bipush 0
    goto L25
    L24:
    bipush 1 
    L25:
    iand
    dup
    istore 3 ; BOOL bvar
    pop
    bipush 1
    dup
    istore 4 ; BOOL bconst
    pop
    bipush 0
    ifeq L26
    bipush 0
    goto L27
    L26:
    bipush 1 
    L27:
    iload 3 ; BOOL bvar
    iload 4 ; BOOL bconst
    if_icmpeq L28
    bipush 0
    goto L29
    L28:
    bipush 1 
    L29:
    iand
    bipush 1
    bipush 0
    if_icmpne L30
    bipush 0
    goto L31
    L30:
    bipush 1 
    L31:
    ior
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(Z)V
    bipush 1
    iand
    dup
    istore 2 ; BOOL bvar
    pop
    iconst_0
    istore 4 ; cvar1
    aload 0 ; scanner
    invokevirtual java/util/Scanner/hasNextLine()Z
    ifeq L32
    aload 0 
    invokevirtual java/util/Scanner/hasNext()Z
    ifeq L33
    aload 0 ; scanner
    invokevirtual java/util/Scanner/next()Ljava/lang/String;
    iconst_0              
    invokevirtual java/lang/String/charAt(I)C
    goto L34
    L33:
    iconst_0
    L34:
    aload 0 ; scanner
    invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;
    pop
    istore 4 ; cvar1
    L32:
    iload 4 ; cvar1
    pop
    bipush 99
    dup
    istore 6 ; CHAR cconst
    pop
    bipush 122
    dup
    istore 5 ; CHAR cvar2
    pop
    bipush 97
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(C)V
    pop
    iload 4 ; CHAR cvar1
    iload 6 ; CHAR cconst
    if_icmpeq L35
    bipush 0
    goto L36
    L35:
    bipush 1 
    L36:
    iload 5 ; CHAR cvar2
    bipush 98
    if_icmpne L37
    bipush 0
    goto L38
    L37:
    bipush 1 
    L38:
    bipush 1
    ifeq L39
    bipush 0
    goto L40
    L39:
    bipush 1 
    L40:
    ior
    iand
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(Z)V
    pop
    bipush 98
    dup
    istore 3 ; CHAR cvar
    pop
    iload 1 ; INT ivar
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(I)V
    pop
    iload 2 ; BOOL bvar
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(Z)V
    pop
    iload 3 ; CHAR cvar
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(C)V
    pop
    iload 2 ; BOOL bvar
    ifeq L41
    bipush 1
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(Z)V
    pop
    goto L42
    L41:
    L42:
    iconst_0
    pop
    iload 2 ; BOOL bvar
    ifeq L43
    bipush 0
    goto L44
    L43:
    bipush 1 
    L44:
    ifeq L45
    bipush 0
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(Z)V
    pop
    goto L46
    L45:
    L46:
    iconst_0
    pop
    bipush 0
    dup
    istore 4 ; INT i
    pop
    bipush 1
    dup
    istore 5 ; INT j
    pop
    L53:
    iload 4 ; INT i
    iload 5 ; INT j
    if_icmple L47
    bipush 0
    goto L48
    L47:
    bipush 1 
    L48:
    ifeq L54
    iload 4 ; INT i
    iload 5 ; INT j
    if_icmpeq L49
    bipush 0
    goto L50
    L49:
    bipush 1 
    L50:
    ifeq L51
    bipush 1
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(Z)V
    pop
    goto L52
    L51:
    bipush 0
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(Z)V
    pop
    L52:
    iconst_0
    pop
    iload 4 ; INT i
    bipush 1
    iadd
    dup
    istore 4 ; INT i
    pop
    goto L53
    L54:
    iconst_0
    pop
    L57:
    iload 4 ; INT i
    bipush 1
    isub
    iload 5 ; INT j
    if_icmpgt L55
    bipush 0
    goto L56
    L55:
    bipush 1 
    L56:
    ifeq L58
    bipush 1
    dup
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap
    invokevirtual java/io/PrintStream/println(Z)V
    pop
    goto L57
    L58:
    iconst_0
    pop
    aload 0 ; scanner
    invokevirtual java/util/Scanner/close()V
    return
  .end method