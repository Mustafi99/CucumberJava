import java.util.HashMap;

public class practice2 {

	public static void main(String[] args) {
		String str = "Hello12334World54611";
		System.out.println(CharacterRemoved(str));	
		
		String str2 =CharacterRemoved(str);
		
		char [] arr =str2.toCharArray();		
		arrayRepeatElements(arr);
	}
	
	static String CharacterRemoved(String str) {
		String str1 = "";
		for(int i = 0; i<= str.length()-1; i++) {
			if(!Character.isAlphabetic(str.charAt(i))){
				str1 = str1 + str.charAt(i);
			}
		}
		return str1;	
	}
	
	static void arrayRepeatElements(char[] arr) {
		HashMap<Character,Integer>hm = new HashMap<Character,Integer>();
		for(Character c : arr) {
			if(!hm.containsKey(c)) {
				hm.put(c, 1);
			}
			else {
				hm.put(c, hm.get(c)+1);
			}
		}
		for(Character c : hm.keySet()) {
			
				System.out.println("The element is " + c + " : " + hm.get(c)  );
				
	}


	}
}
