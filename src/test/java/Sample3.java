import java.util.Arrays;


public class Sample3 {

	public static void main(String[] args) {
		int [] arr = {6,2,4,7,5,9,2,0};
		int n =arr.length;
		
		
		ReverseElement(arr,n);//Reverse of Array Elements
		System.out.println(" ");
		
		countFreq(arr, n); //count of frequency of number
		System.out.println(" ");
		
		AscendingDescending(arr, n);
		System.out.println(" ");
		
		SumofArrayElements(arr,n);
		System.out.println(" ");

		System.out.println("The Smallest Element in Array: " + SmallestElement(arr));//Smallest element in Array

		System.out.println("The Smallest Element in Array: " + LargestElement(arr));//Largest element in Array


	}

   static void SumofArrayElements(int[] arr, int n) {
	   int sum = 0;
	    for (int i = 0; i < n; i++) {
	      sum += arr[i];
	    }
	    System.out.println("The sum of the elements of the array is "+sum);
	  }
		

	static void countFreq(int[] arr, int n) {
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


	static void ReverseElement(int[] arr, int n) {
		int[] ans = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			ans[n - i - 1] = arr[i];
		}
		printArray(ans, n);
	}

	static void printArray(int arr[], int n) {
		System.out.print("Reversed array is:- \n");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static int LargestElement(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];	
	}

	static int SmallestElement(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}
	
	static void AscendingDescending(int arr[], int n) {
		Arrays.sort(arr);
	    for (int i = 0; i < n / 2; i++) {
	      System.out.print(arr[i] + " ");
	    }
	    for (int i = n - 1; i >= n / 2; i--) {
	      System.out.print(arr[i] + " ");
	    }
	}
}
