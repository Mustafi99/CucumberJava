import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		Random dice = new Random();
		for(int i = 0; i<2; i++) {
			int number = dice.nextInt(5);
			System.out.println("The Random is: " +number);
		}
		int [] arr = new int [] {1, 2, 3, 4, 5}; 
		ArrayReverse(arr);

	}

	private static void ArrayReverse(int [] arr) {
		 	 
	        System.out.println("Original array: ");  
	        for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        }  
	        System.out.println();  
	        System.out.println("Array in reverse order: ");  
	        //Loop through the array in reverse order  
	        for (int i = arr.length-1; i >= 0; i--) {  
	            System.out.print(arr[i] + " ");  
	        }  
	    } 
	}



