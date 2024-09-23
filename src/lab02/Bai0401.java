package lab02;

public class Bai0401 {

	public static void main(String[] args) {
		System.out.println("==============");
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}

		System.out.println("==============");
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i);
		}

	}
}
