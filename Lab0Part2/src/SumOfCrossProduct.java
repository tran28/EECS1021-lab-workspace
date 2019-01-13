import java.util.Scanner;

public class SumOfCrossProduct {

	public static void main(String[] args) {
		// Prompt users for 4 integers in list 1 and 4 integers in list 2.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st integer in sequence 1:");
		int firstInt1 = input.nextInt();
		System.out.println("Enter the 2nd integer in sequence 1:");
		int secondInt1 = input.nextInt();
		System.out.println("Enter the 3rd integer in sequence 1:");
		int thirdInt1 = input.nextInt();
		System.out.println("Enter the 4th integer in sequence 1:");
		int fourthInt1 = input.nextInt();
		System.out.println("Enter the 1st integer in sequence 2:");
		int firstInt2 = input.nextInt();
		System.out.println("Enter the 2nd integer in sequence 2:");
		int secondInt2 = input.nextInt();
		System.out.println("Enter the 3rd integer in sequence 2:");
		int thirdInt2 = input.nextInt();
		System.out.println("Enter the 4th integer in sequence 2:");
		int fourthInt2 = input.nextInt();
		
		// Calculate sum of cross product of the values.
		int sumOfCrossProduct = (firstInt1 * firstInt2) + (secondInt1 * secondInt2) + (thirdInt1 * thirdInt2) + (fourthInt1 * fourthInt2);
		
		// Display the result.
		System.out.print("sum([" + firstInt1 + ", " + secondInt1 + ", " + thirdInt1 + ", " + fourthInt1 + "] * ");
		System.out.print("[" + firstInt2 + ", " + secondInt2 + ", " + thirdInt2 + ", " + fourthInt2 + "]) = " + sumOfCrossProduct);

		input.close();
		
	}

}
