package lab02;

import java.util.Scanner;

public class Bai02 {

	public static void giaiPhuongTrinhBacNhat(int a, int b) {
		System.out.printf("Giai phuong trinh bac nhat %dx + %d =0 \n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("phuong trinh co vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("phuong trinh vo nghiem");
		} else {
			float x = (float) -b / a;
			System.out.printf("phuong trinh co nghiem = %.5f", x);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so nguyen a =");
		int a = scanner.nextInt();
		System.out.print("Nhap so nguyen b =");
		int b = scanner.nextInt();
		System.out.print("Nhap so nguyen c =");
		int c = scanner.nextInt();

		if (a == 0) {
//			Cach 1 goi function
			giaiPhuongTrinhBacNhat(b, c);
//          Cach 2 chay if else

//			if (b == 0 && c == 0) {
//				System.out.println("Phuong trinh co vo so nghiem");
//			} else if (b == 0 && c != 0) {
//				System.out.println("Phuong trinh vo nghiem");
//			} else {
//				float x = (float) -c / b;
//				System.out.println("x =" + x);
//			}

		} else {
			System.out.printf("Giai phuong trinh bac hai %dx^2 +%dx + %d =0 \n", a, b, c);
			int delta = (b * b) - (4 * a * c);
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.println("nghiem kep" + x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("Phuong trinh co 2 nghiem phan biet x1 =%.3f , x2 =%.3f", x1, x2);

				System.exit(0);
			}
		}
		scanner.close();
	}
}
