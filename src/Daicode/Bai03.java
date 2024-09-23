package Daicode;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("canh :");
		int canh = scanner.nextInt();
		System.out.println("the tich = " + Math.pow(canh, 3));
		scanner.close();
	}

}
