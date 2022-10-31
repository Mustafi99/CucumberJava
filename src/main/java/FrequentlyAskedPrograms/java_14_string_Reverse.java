package FrequentlyAskedPrograms;

public class java_14_string_Reverse {

	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("Automation");
		System.out.println(str1.reverse());

		
		StringBuffer str2 = new StringBuffer("Testing");
		System.out.println(str2.reverse());
		
		
		String Str = "Rahaman";
		String rev ="";
		for (int i = Str.length()-1;i>=0; i--) {
			rev = rev + Str.charAt(i);
		}
		System.out.println(rev);
	}

}
