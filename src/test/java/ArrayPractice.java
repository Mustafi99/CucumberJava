import java.util.HashMap;

public class ArrayPractice {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8, 1, 1, 1, 1};
		arrayRepeatElements(arr);
		stringRepeatcharacters("AutomationTesting");
		stringRepeatwords("I Love my Country I Love India");

	}
	
	static void arrayRepeatElements(int [] arr) {
		HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
		for(Integer i : arr) {
			if(!hm.containsKey(i)) {
				hm.put(i, 1);
			}
			else {
				hm.put(i, hm.get(i)+1);
			}
		}
		for(Integer i : hm.keySet()) {
			if(hm.get(i)>1) {
				System.out.println(i +  " : is the duplicate element in Array and Repeated " + hm.get(i) + " times");
			}
		}
	}
		
		static void stringRepeatcharacters(String str) {
			
		char [] strArray = str.toCharArray();
		
			HashMap<Character,Integer>hm = new HashMap<Character,Integer>();
			for(Character c : strArray) {
				if(!hm.containsKey(c)) {
					hm.put(c, 1);
				}
				else {
					hm.put(c, hm.get(c)+1);
				}
			}
			for(Character c : hm.keySet()) {
				if(hm.get(c)>1) {
					System.out.println(c +  " : is the duplicate character in String and Repeated " + hm.get(c) + " times");
				}
			}
		
		
	}

		static void stringRepeatwords(String str) {
			
			String [] strArray = str.split(" ");
			
				HashMap<String,Integer>hm = new HashMap<String,Integer>();
				for(String c : strArray) {
					if(!hm.containsKey(c)) {
						hm.put(c, 1);
					}
					else {
						hm.put(c, hm.get(c)+1);
					}
				}
				for(String c : hm.keySet()) {
					if(hm.get(c)>1) {
						System.out.println(c +  " : is the duplicate words in String and Repeated " + hm.get(c) + " times");
					}
				}
			
			
		}

}
