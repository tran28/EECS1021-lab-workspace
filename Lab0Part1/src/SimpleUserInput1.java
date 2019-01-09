import java.util.Scanner;

public class SimpleUserInput1 {

	public static void main(String[] args) {
		
		// Create an input object of type Scanner
		// so that we can use input to read integer, double, or string from user (keyboard).
		Scanner input = new Scanner(System.in);
		
		/*
		 *  Step 1: Prompt user for input.
		 */
		System.out.println("Enter an integer: ");
		
		/*
		 * Step 2: Read input (which can be e.g., an integer, a double, or a string) from the user.
		 */
		int i = input.nextInt(); // read an integer from the keyboard and store the read value in variable i.
		
		/*
		 * Step 3: Perform some computation on the input values stored.
		 */
		int square = i*i;
		
		/*
		 * Step 4: Output some result back to the console.
		 */
		System.out.println("The square of " + i + " is " + square + ".");
		
		input.close();

	}

}
