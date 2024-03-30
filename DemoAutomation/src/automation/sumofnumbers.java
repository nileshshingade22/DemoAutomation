package automation;

public class sumofnumbers {
//	number 234  sum is 11
	public static void main(String[] args) {
		
//		System.out.println("hello");
		
		int number = 234 ;
		int sum = 0 ;
		while(number!=0)
		{
			sum =  sum + number%10;  // sum +=number%10
			number = number/10;      //number /=10 
		//	sum = sum + last_digit;
			
		}
		System.out.println("sum of digits = " + sum);
	}

}
