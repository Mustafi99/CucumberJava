
public class SaMPLE1 {

	public static void main(String[] args) {
		StringReverse("012345");
		StringReverse1("Rahaman");
		StringReverse2("Automation");
		StringWordsReverse1("I am a Student");
		
		if(NumberPalindrome(121)) {
			System.out.println("The Number is palindrome");
		}
		else {
			System.out.println("The number is not palindrome");
		}

	}

	static void StringReverse(String str) {
		StringBuilder strReverse = new StringBuilder( str);
		strReverse.reverse();
		System.out.println(strReverse);
	}

	static void StringReverse1(String str) {
		StringBuffer strReverse = new StringBuffer( str);
		strReverse.reverse();
		System.out.println(strReverse);
	}

	static void StringReverse2(String str) {
		String rev ="";
		for(int i =str.length()-1;i>=0;i--) {

			rev = rev +str.charAt(i);
				
		}
		System.out.println(rev);
	}
	static void StringWordsReverse1(String str) {
		String rev ="";
		String [] strArray =str.split(" ");
		for(int i =strArray.length-1;i>=0;i--) {
			System.out.print(strArray[i]);
			System.out.print(" ");
		}
	}
		
		static boolean NumberPalindrome(int num) {
			int copyOfOriginal = num;
		    int reversedNumber = 0;
		    int remainder;

		    while(num > 0) {
		      remainder = num % 10;
		      reversedNumber = (reversedNumber * 10) + remainder;
		      num = num / 10;
		    }
		    return reversedNumber == copyOfOriginal ;
		}
	}

