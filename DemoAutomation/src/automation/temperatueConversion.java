package automation;

public class temperatueConversion {

//	f = 1.8c + 32
//	k = c + 273

	public static void main(String[] args) {

		float celcius = 0.0f;
		float kelvin;
		float farehanite;

		farehanite = (1.8f)*celcius + 32;
		kelvin = celcius + 273;

		System.out.println("0.0 Celcius = " +farehanite + " Farenhite");
		System.out.println("0.0 Celius = " +kelvin +" Kelvin");
		

	}

}
