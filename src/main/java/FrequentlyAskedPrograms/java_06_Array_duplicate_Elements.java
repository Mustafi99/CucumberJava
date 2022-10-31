package FrequentlyAskedPrograms;

public class java_06_Array_duplicate_Elements {

	public static void main(String[] args) {
		int arr[] = new int [] {1,1,2,2,3,3,4,5,5,6,6};
		System.out.println("Duplicate element in given Array: ");

		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}

		}


	}

}
