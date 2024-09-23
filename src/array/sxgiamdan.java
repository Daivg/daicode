package array;

import java.util.Arrays;

public class sxgiamdan {
	public static void main(String[] args) {
		int A[] = { 3, 68, 90, 5 };
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] < A[j]) {
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
					System.out.printf("Bước %d : ", j);
					System.out.print(Arrays.toString(A));
				}
			}
		}
	}

}
