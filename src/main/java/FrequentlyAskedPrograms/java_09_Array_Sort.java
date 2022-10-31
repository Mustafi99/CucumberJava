package FrequentlyAskedPrograms;

public class java_09_Array_Sort {

	public static void main(String[] args) {
		int arr[] = {6,2,8,1,9,2,45,99};
		int temp = 0;
		System.out.println("elements of original Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp =arr[i] ;
					arr[i] = arr[j];
					arr[j] =temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("elements of sorted Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
