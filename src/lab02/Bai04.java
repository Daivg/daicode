package lab02;

import java.util.Scanner;

public class Bai04 {

	public static void bai01() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 1 <<");
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
	}

	public static void bai02() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 2 <<");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so nguyen a =");
		int a = scanner.nextInt();
		System.out.println("Nhap so nguyen b =");
		int b = scanner.nextInt();
		System.out.println("Nhap so nguyen c =");
		int c = scanner.nextInt();

		if (a == 0) {
			if (b == 0 && c == 0) {
				System.out.println("Phuong trinh co vo so nghiem");
			} else if (b == 0 && c != 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else {
				float x = -c / b;
				System.out.println("x =" + x);
			}

		} else {
			int delta = (b * b) - (4 * a * c);
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				double x = -b / (2 * a);
				System.out.println("nghiem kep" + x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phuong trinh co 2 nghiem phan biet " + x1);
				System.out.println(x2);
				System.exit(0);
			}
		}
		scanner.close();

	}

	public static void bai03() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 3 <<");
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

	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap tinh nang : ");
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			bai01();
			break;
		case 2:
			bai02();
			break;
		case 3:
			bai03();
			break;
		default:
			System.out.println(" Ket thuc chuong trinh");
			System.exit(0);
		}
		scanner.close();
	}
}
