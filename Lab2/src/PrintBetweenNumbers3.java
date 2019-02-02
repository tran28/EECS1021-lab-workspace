import java.util.Scanner;

public class PrintBetweenNumbers3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String choice = "Y";
		
		while(choice.equals("Y")) {
			
			System.out.println("Enter a lower bound:");
			int lower = input.nextInt();
			
			System.out.println("Enter an upper bound:");
			int upper = input.nextInt();
			input.nextLine();
			
			if(lower <= upper) {
				for(int i = lower; i <= upper; i++) {
					System.out.println(i);
				}
			}
			else {
				System.out.println("Error: lower bound is not less than or equal to the upper bound.");
			}
			System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
			choice = input.nextLine();
			
			while(!(choice.equals("Y") || choice.equals("N"))) {
				System.out.println("Invalid indication on continuation: " + choice);
				System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
				choice = input.nextLine();
			}
		}
		System.out.println("Bye!");
				
		input.close();
	}

}
