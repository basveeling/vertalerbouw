; public class Program extends Object { ...}
.class public Program
.super java/lang/Object

; public Program() { super(); }
.method public <init>()V
   aload_0
   invokenonvirtual java/lang/Object/<init>()V
   return
.end method

; main(): Expr.g will generate bytecode in this method
.method public static main([Ljava/lang/String;)V
   .limit stack 102 ; how much stack space do we need?
   .limit locals 100 ; how many locals do we need?
   ; code translated from input stream
   ; push System.out onto the stack
   getstatic java/lang/System/out Ljava/io/PrintStream; 

   ldc 1

   ; call the PrintStream.println() method.
   invokevirtual java/io/PrintStream/println(I)V
   ; push System.out onto the stack
   getstatic java/lang/System/out Ljava/io/PrintStream; 

   ldc 2

   ; call the PrintStream.println() method.
   invokevirtual java/io/PrintStream/println(I)V
   ; push System.out onto the stack
   getstatic java/lang/System/out Ljava/io/PrintStream; 

   ldc 3

   ; call the PrintStream.println() method.
   invokevirtual java/io/PrintStream/println(I)V
   ; print result on top of stack
   return
.end method