package automation;

public class TimeConversion {

	public static void main(String[] args) {

		// 1 sec = 0 hrs 0 min 1 sec

		int number = 86399;
		int sec = number % 60;
		int min = (number / 60) % 60;
		int hrs = number / 3600;

		System.out.println(hrs + " hours " + min + " min " + sec + " sec");

	}

}
