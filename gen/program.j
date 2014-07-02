    .class public Program
    .super java/lang/Object
    .method public <init>()V
        aload_0
        invokenonvirtual java/lang/Object/<init>()V
        return
    .end method

    .method public static main([Ljava/lang/String;)V
        .limit stack 102
        .limit locals 100
                    getstatic java/lang/System/out Ljava/io/PrintStream; 
                        ldc 1
                    invokevirtual java/io/PrintStream/println(I)V
                    getstatic java/lang/System/out Ljava/io/PrintStream; 
                        ldc 5
                    invokevirtual java/io/PrintStream/println(I)V
                    getstatic java/lang/System/out Ljava/io/PrintStream; 
                        ldc 3
                    invokevirtual java/io/PrintStream/println(I)V
                    getstatic java/lang/System/out Ljava/io/PrintStream; 
                        ldc "a"
                    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
                    getstatic java/lang/System/out Ljava/io/PrintStream; 
                        ldc 6
                    invokevirtual java/io/PrintStream/println(I)V
        return
    .end method