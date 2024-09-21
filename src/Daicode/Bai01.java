package Daicode;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ten sinh vien:");
		String tensinhvien = scanner.nextLine();
		System.out.println("diem:");
		int diem = scanner.nextInt();
		System.out.println(tensinhvien + " co diem =" + diem);
		scanner.close();
	}

}
