package automation;

public class ConvertMinInDaysAndYears {

	public static void main(String[] args) {

//		long min = 525600;

		double min = 125.4875 ;

		long years;
		long days;

		if (min % 1 != 0) {
			System.out.println("Invalid Input");
			
		}

		else {
			days = (long) (min / (60 * 24));
			years = (long) (min / (60 * 24 * 365));
			System.out.println("Days :" + days);
			System.out.println("Years :" + years);
			
		}
	}

}
