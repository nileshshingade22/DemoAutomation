package automation;

public class PrimeNumber {

	public static void main(String[] args) {
		int count =0;

		for (int number = 1; number <100; number++) {

			if (number % 2 == 1 && number / number == 1) {

				System.out.println(number + "is a prime number ");
				count++;
				if(count ==20) {
					break;
				}
			}

			/*
			 * else { // System.out.println(number + "is not a prime number "); }
			 */
		}

	}

}
