package Daicode;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("chieu dai :");
		int chieudai = scanner.nextInt();
		System.out.println("chieu rong:");
		int chieurong = scanner.nextInt();
		System.out.println("chu vi =" + (chieudai + chieurong) * 2);
		System.out.println("dien tich =" + chieudai * chieurong);
		System.out.println("canh nho nhat =" + Math.min(chieudai, chieurong));
		scanner.close();
	}

}
