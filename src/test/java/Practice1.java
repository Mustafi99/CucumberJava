import java.util.Iterator;

/**
 * 
 * @author MustafizurRahaman
 *
 */
public class Practice1 {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		/*Find occurrence of digits in a string.
		Hello12334World54611
		Output - 1- 3
		2 - 1
		3- 2
		4- 2
		5- 1
		6 - 1
		*/
		String str = "Hello12334World54611";
		String str1 = numberString(str);
		char[] arr = str1.toCharArray();
		int n =arr.length;
		
		countFreq(arr, n); //count of frequency of number
		System.out.println(" ");
		
	}
		public static String numberString(String str) {
		
		String  numberString = "";
		for(int i  = 0 ; i<str.length(); i++) {
			
			if( str.charAt(i) == '1' || str.charAt(i) == '2' || str.charAt(i) == '3' || str.charAt(i) == '4' || str.charAt(i) == '5' || str.charAt(i) == '6' )
			{
				numberString = numberString + str.charAt(i);
			}
		}
		
		return numberString;
	}
		
		static void countFreq(char[] arr, int n) {
			boolean visited[] = new boolean [n];
			for(int i = 0; i< n ; i++) {
				if(visited[i] == true) {
					continue;
				}

				int count = 1;
				for (int j = i + 1; j < n; j++) {
					if (arr[i] == arr[j]) {
						visited[j] = true;
						count++;
					}
				}
				System.out.println(arr[i] + " " + count);
			}
		}
}
	