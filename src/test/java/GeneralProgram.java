
public class GeneralProgram {

	public static void main(String[] args) {
		fibonacciSeries(10);

		if(palindrome(111)) {
			System.out.println(" The Number is Palindrome");
		}
		else {
			System.out.println(" The Number is not  Palindrome");
		}
		
		
		if(primeNumber(111)) {
			System.out.println(" The Number is prime Number");
		}
		else {
			System.out.println(" The Number is not  prime Number");
		}

	}

	private static boolean primeNumber(int Num) {
		if(Num<2) {
			return false;
		}
		for(int i = 2; i<=Num/2; i++) {
			if(Num % i == 0) {
				return false;
			}
		}
		return true;
	}


	static boolean palindrome(int Num) {
		int copyofOriginal = Num;
		int Rev = 0;
		int Remainder;
		while(Num>0) {
			Remainder = Num % 10;
			Rev = (Rev * 10) + Remainder;		
			Num = Num/10;
		}
		return Rev  == copyofOriginal ;

	}


	static void fibonacciSeries(int Num) {
		int a = 0;
		int b = 1; 
		int sum =0;
		int i =0;
		while(i<Num) {
			System.out.print(" " +a);
			System.out.print(" ");
			sum = a+b;
			a = b;
			b = sum ;
			i++;
		}

	}
}
