package FrequentlyAskedPrograms;

public class java_11_countCharacter_String {

	public static void main(String[] args) {
		String str = "Automation Testing";
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			count ++;
		}

		System.out.println("The count of character is :" +count);
		System.out.println("The count of character is :" + str.length());
	}

}
