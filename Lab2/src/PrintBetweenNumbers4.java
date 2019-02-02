import java.util.Scanner;

public class PrintBetweenNumbers4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String choice = "Y";
		
		while(choice.equals("Y")) {
			
			System.out.println("Enter a lower bound:");
			int lower = input.nextInt();
			
			System.out.println("Enter an upper bound:");
			int upper = input.nextInt();
			input.nextLine();
			
			System.out.println("Enter a middle number:");
			int middle = input.nextInt();
			input.nextLine();
			
			if(lower <= upper) {
				if(lower <= middle && middle <= upper) {
					
					System.out.println("Odd numbers between " + lower + " and " + middle + ":");
					for(int i = lower; i <= middle; i++) {
						if(i % 2 == 1) {
							System.out.println(i);
						}
					}
					System.out.println("Even numbers between " + middle + " and " + upper + ":");
					for(int i = middle; i <= upper; i++) {
						if(i % 2 == 0) {
							System.out.println(i);
						}
					}
				}
				else{
					System.out.println("middle number " + middle + " is not in-between the lower bound " + lower + " and upper bound " + upper);
				}
			}
			else {
				System.out.println("Error: lower bound " + lower + " is not less than or equal to the upper bound " + upper);
			}
			System.out.println("Would you like to continue printing? (Y/N)");
			choice = input.nextLine();
			
			while(!(choice.equals("Y") || choice.equals("N"))) {
				System.out.println("Error: " + choice + " is not valid");
				System.out.println("Would you like to continue printing? (Y/N)");
				choice = input.nextLine();
			}
		}
		System.out.println("Bye!");
				
		input.close();
	}

}
