import java.util.HashMap;

public class Sample2 {

	public static void main(String[] args) {
		
		int [] arr = {1, 4, 2, 4, 6, 4, 7, 8, 3 , 7, 1, 6};
		duplicateElementsArray(arr);
		
		
		String str ="java@abc?!";
		char [] charArray = str.toCharArray();
		
		System.out.println("Input String : " +str);
		
		stringReverse(charArray);
		
		String rev = new String(charArray);
		
		System.out.println("Output String : " +rev);
		//output: cbaa@vaj?!
		

	}

	 private static void stringReverse(char [] str) {
		int i = 0;
		int j = str.length -1 ;
		while(i<j) {
			if(!Character.isAlphabetic(str[i])){
				i++;
			}
			else if(!Character.isAlphabetic(str[j])){
				j--;
			}
			else {
			char temp = str[i];
			str[i] =str[j];
			str[j] = temp;
			i++;
			j--;
			}
		
		}	
	}


	static void duplicateElementsArray(int[] arr) {
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
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
					System.out.println("The duplicate element is " + i);
				}
			}
		}
		
	}
	
	//print duplicate number
	//output: 1, 4, 6, 7


