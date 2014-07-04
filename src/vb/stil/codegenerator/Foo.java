package vb.stil.codegenerator;

import java.util.Scanner;

public class Foo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int result = 0;

		if (scanner.hasNextInt()) {
			result = scanner.nextInt();
		}

		scanner.close();

		System.out.println(result);
	}
}
