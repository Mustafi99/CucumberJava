package FrequentlyAskedPrograms;

public class java_01_Swap_values {

	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		System.out.println("Before Swapping value of a and b: " +a + " " +b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swapping value of a and b: " +a + " " +b);
		
		
		a = a*b;
		b = a/b ;
		a = a/b ;
		
		System.out.println("After 2nd  Swapping value of a and b: " +a + " " +b);
		
		int temp = a;
		a=b;
		b=temp;
		
		System.out.println("After 3nd  Swapping value of a and b: " +a + " " +b);

	}

}
