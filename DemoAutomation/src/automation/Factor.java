package automation;

public class Factor {
	// 24 = 1 ,2,3,4,6,8,12,24
	public static void main(String[] args) {

		int num = 24;

		for (int i = 1; i <= 24; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}

	}

}
