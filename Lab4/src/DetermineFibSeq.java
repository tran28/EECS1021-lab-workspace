import java.util.Scanner;

public class DetermineFibSeq {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String choice = "Y";
		 
		while(choice.equals("Y")) {
			int i = 0;
			int[] userSeq = new int[20];
			System.out.println("Enter a positive integer value, or -1 to stop:");
			int userInt = input.nextInt();
			input.nextLine();
			while(userInt != -1 && i < 20) {
				userSeq[i] = userInt;
				i++;
				System.out.println("Enter a postive integer value, or -1 to stop:");
				userInt = input.nextInt();
				input.nextLine();
			}
			
			// Case 1: sequence size of 1 -- check specifically
			if(i == 1 && userSeq[0] == 1) {
				System.out.print("The sequence you entered ");
				System.out.print("<" + userSeq[0] + ">");
				System.out.println(" is the first " + i + " number in the Fibonacci sequence");
			}
			// Case 2: sequence size of 2 -- check specifically
			else if(i == 2 && userSeq[0] == 1 && userSeq[1] == 1) {
				System.out.print("The sequence you entered ");
				int k = 0;
				System.out.print("<");
				while(k < i - 1) {
					System.out.print(userSeq[k] + ", ");
					k++;
				}
				System.out.print(userSeq[i - 1] + ">");
				System.out.println(" is the first " + i + " numbers in the Fibonacci sequence");
			}
			// Case 3: sequence size of 3 or more -- check using formula 
			else if(i > 2) {
				// Checking Fibonacci conditions:
				boolean isFibSeq = true;
				for(int j = 2; j < i && isFibSeq; j++) {
						isFibSeq = userSeq[j] == userSeq[j - 1] + userSeq[j - 2];
				}
				//================================//
				if(isFibSeq) {
					System.out.print("The sequence you entered ");
					int k = 0;
					System.out.print("<");
					while(k < i - 1) {
						System.out.print(userSeq[k] + ", ");
						k++;
					}
					System.out.print(userSeq[i - 1] + ">");
					System.out.println(" is the first " + i + " numbers in the Fibonacci sequence");
				}
				else {
					System.out.print("The sequence you entered ");
					int k = 0;
					System.out.print("<");
					while(k < i - 1) {
						System.out.print(userSeq[k] + ", ");
						k++;
					}
					System.out.print(userSeq[i - 1] + ">");
					System.out.println(" is not the first " + i + " numbers in the Fibonacci sequence");
				}
			}
			else {
				System.out.print("The sequence you entered ");
				int k = 0;
				System.out.print("<");
				while(k < i - 1) {
					System.out.print(userSeq[k] + ", ");
					k++;
				}
				System.out.print(userSeq[i - 1] + ">");
				System.out.println(" is not the first " + i + " numbers in the Fibonacci sequence");
			}
			System.out.println("Would you like to another sequence? (Y/N)");
			choice = input.nextLine();
		}
		
		System.out.println("Bye!");
		input.close();

	}
}
