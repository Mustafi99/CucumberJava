package FrequentlyAskedPrograms;

import java.util.Arrays;

public class java_08_smallestElementArray {

	public static void main(String[] args) {
		
		int arr[] = {6,2,8,1,9,2,45,99};
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			
		}
		
		System.out.println("The largest element is: " + max);
		
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			
		}
		
		System.out.println("The smallest element is: " + min);
		
		
		

	}

}
