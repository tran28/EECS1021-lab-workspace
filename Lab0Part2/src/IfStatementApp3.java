import java.util.Scanner;

public class IfStatementApp3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		 * Prompt the user to enter an integer balance, and then
		 * Prompt the user to enter an integer amount to withdraw.
		 * Display the remaining balance after the withdrawal.
		 * 
		 * Three possible errors from user:
		 * 1. balance < 0 
		 * 2. amount < 0 
		 * 3. amount >= balance (e.g. balance is 100, amount can be 100, 99, 98, ...)
		 */
		
		System.out.println("Enter an integer balance:");
		int initialBalance = input.nextInt();
		
		System.out.println("Enter an amount to withdraw:");
		int amount = input.nextInt();
		
		if(initialBalance < 0) {
			// body of if-statement
			// this block of code is executed only if the if condition is true.
			System.out.println("Error: Initial amount should not be negative.");
		}
		else if(amount < 0) {
			System.out.println("Error: Amount to withdraw should not be negative.");
		}
		else if(amount >= initialBalance) {
			System.out.println("Error: Amount to withdraw should be smaller than balance.");
		}
		else {
			// body of else-statement
			// this block of code is executed if the if branch is false.
			int resultingBalance = initialBalance - amount;
			System.out.print("Initial balance " + initialBalance + " after withdrawing " + amount);
			System.out.println(" has the resulting balance " + resultingBalance);
		}
		
		
		input.close();

	}

}
