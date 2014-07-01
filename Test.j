; public class Calc extends Object { ...}
.class public Calc
.super java/lang/Object

; public Calc() { super(); }
.method public <init>()V
   aload_0
   invokenonvirtual java/lang/Object/<init>()V
   return
.end method

; main(): Expr.g will generate bytecode in this method
.method public static main([Ljava/lang/String;)V
   .limit stack 102 ; how much stack space do we need?
   .limit locals 100 ; how many locals do we need?
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ; code translated from input stream
   ; push System.out onto the stack
   getstaic java/lang/System/out Ljava/io/PrintStream; 

   ldc 1337

   ; call the PrintStream.println() method.
   invokevirtual java/io/PrintStream/println(I;)V
   ; print result on top of stack
   invokevirtual java/io/PrintStream/println(I)V
   return
.end method