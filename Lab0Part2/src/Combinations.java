import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		
		// prompt user input for 4 strings and 4 integers and
		// store them as variables
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the 1st string: ");
		String firstString = input.nextLine();
		
		System.out.println("Enter the 2nd string: ");
		String secondString = input.nextLine();
		
		System.out.println("Enter the 3rd string: ");
		String thirdString = input.nextLine();
		
		System.out.println("Enter the 4th string: ");
		String fourthString = input.nextLine();
		
		System.out.println("Enter the 1st integer: ");
		int firstInt = input.nextInt();
		
		System.out.println("Enter the 2nd integer: ");
		int secondInt = input.nextInt();
		
		System.out.println("Enter the 3rd integer: ");
		int thirdInt = input.nextInt();
		
		System.out.println("Enter the 4th integer: ");
		int fourthInt = input.nextInt();
		
		// print out all 16 combinations in format (string, number) line after line
		
		System.out.println("Here are all 16 possible combinations: ");
		System.out.println("(" + firstString + ", " + firstInt + ")");
		System.out.println("(" + firstString + ", " + secondInt + ")");
		System.out.println("(" + firstString + ", " + thirdInt + ")");
		System.out.println("(" + firstString + ", " + fourthInt + ")");
		System.out.println("(" + secondString + ", " + firstInt + ")");
		System.out.println("(" + secondString + ", " + secondInt + ")");
		System.out.println("(" + secondString + ", " + thirdInt + ")");
		System.out.println("(" + secondString + ", " + fourthInt + ")");
		System.out.println("(" + thirdString + ", " + firstInt + ")");
		System.out.println("(" + thirdString + ", " + secondInt + ")");
		System.out.println("(" + thirdString + ", " + thirdInt + ")");
		System.out.println("(" + thirdString + ", " + fourthInt + ")");
		System.out.println("(" + fourthString + ", " + firstInt + ")");
		System.out.println("(" + fourthString + ", " + secondInt + ")");
		System.out.println("(" + fourthString + ", " + thirdInt + ")");
		System.out.println("(" + fourthString + ", " + fourthInt + ")");
		
		// close scanner
		
		input.close();

	}

}
