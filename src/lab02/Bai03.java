package lab02;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chuong trinh tinh tien dien");
		System.out.print("Nhap vao so dien: ");
		int total = scanner.nextInt();
		if (0 <= total && total <= 100) {
			int money = total * 1000;
			System.out.println("Gia tien dien =" + money);
		} else {
			int money = (100 * 1000) + ((total - 100) * 1500);
			System.out.println("Gia tien dien =" + money);
		}
		scanner.close();
	}

}
