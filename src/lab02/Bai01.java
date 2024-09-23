package lab02;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số nguyên a =");
		int a = scanner.nextInt();
		System.out.print("Nhập số nguyên b =");
		int b = scanner.nextInt();
		System.out.printf("Giai phuong trinh bac nhat %dx + %d =0 \n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("phuong trinh co vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("phuong trinh vo nghiem");
		} else {
			float x = (float) -b / a;
			System.out.printf("phuong trinh co nghiem = %.5f", x);
		}

		scanner.close();
		System.exit(0);
	}

}
