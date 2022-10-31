package FrequentlyAskedPrograms;

import java.util.Arrays;

public class java_13_anargram_String {

	public static void main(String[] args) {
		String str1 ="Grabo";
		String str2 = "Brago";
		str1 =str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length()!= str2.length() ) {
			System.out.println("The string is not Anagram.");
		}
		else
		{
				char[] charArray1 = str1.toCharArray();
				char[] charArray2 = str2.toCharArray();
				
				Arrays.sort(charArray1);
				Arrays.sort(charArray2);
				
				if(Arrays.equals(charArray1, charArray2)==true){
					System.out.println("The Strings are anagram");
				}
				else {
					System.out.println("The Strings are not anagram");
				}
		}

	}

}
