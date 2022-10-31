package FrequentlyAskedPrograms;

public class java_12_countVowelsandConsonant {

	public static void main(String[] args) {
		String str = "AutomationTesting";
		String str1 =str.toLowerCase();
		int vowelCount = 0;
		int consonantCount = 0;
		
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) =='a'||str1.charAt(i) == 'e'|| str1.charAt(i) =='i'|| str1.charAt(i) =='0'|| str1.charAt(i) =='u')
			{
				vowelCount++;
			}
			else {
				consonantCount ++;
			}
		}
		
		System.out.println(" The count of vowel is  " + vowelCount +" and the count of consonant is " +consonantCount);

	}

}
