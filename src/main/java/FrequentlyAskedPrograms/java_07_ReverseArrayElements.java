package FrequentlyAskedPrograms;

public class java_07_ReverseArrayElements {

	public static void main(String[] args) {
		int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Length of the array : " + arr.length);
		
		System.out.println("Array in reverse order: ");
		
		
		for(int i=arr.length-1; i>=0; i-- ) {
			
			System.out.print( arr[i] + " " );
		}	

	}

}
