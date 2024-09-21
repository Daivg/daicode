package Daicode;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("First number: ");
		int firstNumber = scanner.nextInt();
		System.out.println("Second number: ");
		int seconnumber = scanner.nextInt();
		System.out.println("Min " + Math.min(firstNumber, seconnumber));
		scanner.close();
	}

}
