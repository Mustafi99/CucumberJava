package FrequentlyAskedPrograms;

public class java_15_remove_Special_character_String {

	public static void main(String[] args) {
		String str = "Auto@#$ma%$tion";
		String  resultStr ="";
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i)>64 && str.charAt(i)<=122) {
				resultStr = resultStr+str.charAt(i); 
			}
		}
		
		System.out.println("The String after removing special characters: " +resultStr);

	}

}
