package FrequentlyAskedPrograms;

public class java_03_primenumber {

	public static void main(String[] args) {
		
		if(isPrimeNumber(1)) {
			System.out.println("The Number is Prime Number");
		}
		else {
			System.out.println("The Number is not a Prime Number");
		}

	}

	static boolean isPrimeNumber(int Num) {
		
		if(Num<2) {
			return false;
		}
		for(int i = 2; i<=Num/2 ; i++) {
			if(Num % 2 == 0) {
				return false;
			}
		}
		return true;
		}
	}

