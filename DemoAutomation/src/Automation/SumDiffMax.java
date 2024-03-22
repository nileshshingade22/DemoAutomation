package Automation;

public class SumDiffMax {
//Sum,DIff,Prod,Average,Distance, Min, Max
	public static void main(String[] args) {
		
		int i = 4;
		int j = 3;
		
		System.out.println("Sum is =" +(i+j));
		System.out.println("Difference is=" +(i-j));
		System.out.println("Product is=" +(i*j));
		float avg = ((i+j)/2f);
		System.out.println("Average is=" +avg);
		System.out.println("Distance  is=" +(i-j));
		
		if(i>j)
		{
			System.out.println("Max is"+ i);
			System.out.println("Min is"+ j);
		}
		else {
			System.out.println("Min is"+i);
			System.out.println("Max is"+ j);
		}

	}

}
