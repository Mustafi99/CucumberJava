package FrequentlyAskedPrograms;

public class java_04_factorial {

	public static void main(String[] args) {
		int Num =9;
		int fact =1;
		
		for(int i = 1 ; i<=Num; i++) {
			fact = fact *i;
		}
		System.out.println("The Factorial of  " + Num + " is :" +fact);
	}

}
