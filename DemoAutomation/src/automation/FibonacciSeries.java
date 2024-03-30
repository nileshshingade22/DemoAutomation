package automation;

public class FibonacciSeries {

// 0,1,1,2,3,5,8,13	
	public static void main(String[] args) {
		
		
		int n1 = 0;
		int n2 = 1;
		
		System.out.println(n1);
		System.out.println(n2);
		
		
		for (int i = 1; i <10; i++) {
			
			int sum = n1 + n2;
			n1=n2;
			n2=sum;
			System.out.println(sum);
			
		}
		
				
				
		
		
		
		

	}

}
