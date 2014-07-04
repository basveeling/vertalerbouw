package vb.stil.codegenerator;

public class Foo {
	public void hallo() {
		System.out.println('c');

		char a = 'a';
		char b = 'b';

		System.out.println(a == b);
	}
	
	public static void main(String[] args) {
		(new Foo()).hallo();
	}
}
