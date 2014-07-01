    .class public Program
    .super java/lang/Object
    .method public <init\>()V
        aload_0
        invokenonvirtual java/lang/Object/<init\>()V
        return
    .end method

    .method public static main([Ljava/lang/String;)V
        .limit stack 
        .limit locals 
                    getstatic java/lang/System/out Ljava/io/PrintStream; 
                        ldc 1
                    invokevirtual java/io/PrintStream/println(I)V
                    getstatic java/lang/System/out Ljava/io/PrintStream; 
                        ldc 2
                    invokevirtual java/io/PrintStream/println(I)V
                    getstatic java/lang/System/out Ljava/io/PrintStream; 
                        ldc 3
                    invokevirtual java/io/PrintStream/println(I)V
                    getstatic java/lang/System/out Ljava/io/PrintStream; 
                        ldc 4
                    invokevirtual java/io/PrintStream/println(I)V
        return
    .end method