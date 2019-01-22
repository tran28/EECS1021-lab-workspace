import java.util.Scanner;

public class BankApp2 {

	public static void main(String[] args) {
		
		/*
		 * Problem:
		 * 1. Prompt user for an initial balance for their bank account.
		 * 		(balance > 0)
		 * 2. Prompt the user for a transaction 
		 * 		(transaction should be either "d" or "w": otherwise it's invalid)
		 * 3. Prompt the user for an amount 
		 * 		+ in both cases, amount should be positive
		 * 		+ in the case of withdraw: amount < balance
		 * 		+ in the case of deposit: balance + amount <= 1000
		 * Perform the transaction accordingly and the output the resulting balance to console
		 * Note. As soon as an error occurs, your app should print out an error right away, 
		 * 		and terminate the app
		 */

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a balance (e.g., 200.45):");
		double balance = input.nextDouble();
		input.nextLine();
		
		if(0 < balance  && balance <= 1000) {
			System.out.println("Enter a transaction type: \"d\" or \"w\":");
			String type = input.nextLine();
			
			// scope of variable amount is limited to 
			// the if-branch of (0 < balance  && balance <= 1000)
			double amount = 0.0;
			
			if(type.equals("d")) {
				System.out.println("Enter an amount for " + type + ": ");
				// scope of variable is only limited to the if-branch
				amount = input.nextDouble();
				input.nextLine();
				// valid transaction type
				if(amount <= 0) {
					System.out.println("Error: deposit amount is not positive.");
				}
				else if(balance + amount > 1000) {
					System.out.println("Error: deposit amount is too large");
				}
				else {
					balance += amount;
				}
			}
			else if(type.equals("w")) {
				System.out.println("Enter an amount for " + type + ": ");
				// scope of variable is only limited to the if-branch
				amount = input.nextDouble();
				input.nextLine();
				// valid transaction type
				if(amount < 0) {
					System.out.println("Error: withdraw amount is not positive.");
				}
				else if(amount >= balance) {
					System.out.println("Error: withdraw amount is too large");
				}
				else {
					balance -= amount;
				}	
			}
			else {
				System.out.println("Error: transaction type " + type + " is neither d nor w.");
			}
			
			
			
			System.out.println("Resulting balance after performing transaction of type " + type + " with $" + amount + ": " + balance);
		}
		else {
			System.out.println("Error: initial balance " + balance + " is not in (0, 1000].");
		}
		input.close();
	}

}
