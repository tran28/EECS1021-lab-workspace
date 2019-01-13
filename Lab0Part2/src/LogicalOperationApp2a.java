import java.util.Scanner;

public class LogicalOperationApp2a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer between 1 and 10:");
		int i = input.nextInt();
		
		// This version chooses the wrong logical operator.
		// It is wrong because when you want to specify an interval,
		// you must use conjunction.
		boolean isBetween1And10 = 1 <= i || i <= 10; 
		System.out.println("The number you entered " + i + " is between 1 and 10: " + isBetween1And10);
		
		
		input.close();
	}

}
