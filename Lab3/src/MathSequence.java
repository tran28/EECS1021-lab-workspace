import java.util.Scanner;

public class MathSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String choice = "Y";
		while (choice.equals("Y")) {
			System.out.println("What kind of processing task would you like to perform?");
			System.out.println("1: Generate an arithmetic sequence.");
			System.out.println("2: Generate a geometric sequence.");
			System.out.println("3: Determine an arithmetic sequence.");
			
			String task = input.nextLine();
			if(task.equals("1")) {
				
				System.out.println("Enter the first term in the arithmetic sequence:");
				int firstTerm = input.nextInt();
				
				System.out.println("Enter the common difference in the arithmetic sequence:");
				int commonDifference = input.nextInt();
				
				System.out.println("Enter the number of terms in the arithmetic sequence:");
				int numberOfTerms = input.nextInt();
				input.nextLine();

				int[] arithmetic = new int[numberOfTerms];
				int sumOfArithmetic = 0;
				for(int i = 1; i <= numberOfTerms; i++) {
					arithmetic[i - 1] = firstTerm + (i - 1) * commonDifference;
					sumOfArithmetic += arithmetic[i - 1];
				}
				
				int i = 0;
				System.out.print("<");
				while(i < arithmetic.length - 1) {
					System.out.print(arithmetic[i] + ", ");
					i++;
				}
				System.out.println(arithmetic[arithmetic.length - 1] + ">");
				System.out.println("Sum of the arithmetic sequence: " + sumOfArithmetic);
				
				System.out.println("Would you like to process another sequence? (Y/N)");
				choice = input.nextLine();
			}
			else if(task.equals("2")) {
				
				System.out.println("Enter the first term in the geometric sequence:");
				int firstTerm = input.nextInt();
				
				System.out.println("Enter the common ratio in the geometric sequence:");
				int commonRatio = input.nextInt();
				
				System.out.println("Enter the number of terms in the geometric sequence:");
				int numberOfTerms = input.nextInt();
				input.nextLine();

				int[] geometric = new int[numberOfTerms];
				int sumOfGeometric = 0;
				for(int i = 1; i <= numberOfTerms; i++) {
					geometric[i - 1] = firstTerm * (int) Math.pow(commonRatio, (i - 1));
					sumOfGeometric += geometric[i - 1];
				}
				
				int i = 0;
				System.out.print("<");
				while(i < geometric.length - 1) {
					System.out.print(geometric[i] + ", ");
					i++;
				}
				System.out.println(geometric[geometric.length - 1] + ">");
				System.out.println("Sum of the arithmetic sequence: " + sumOfGeometric);
				
				System.out.println("Would you like to process another sequence? (Y/N)");
				choice = input.nextLine();
			}
			else if(task.equals("3")){
				
				String moreNumbers = "Y";
				int[] numberList = new int[10];
				int j = 0;
				int sum = 0;
				while(moreNumbers.equals("Y")) {
					System.out.println("Enter a new number:");
					numberList[j] = input.nextInt();
					input.nextLine();
					sum += numberList[j];
					if(j < 9) {
						System.out.println("You have entered " + (j + 1) + " numbers.");
						System.out.println("You may still enter another " + (9 - j) + " numbers.");
						System.out.println("Would you like to enter another new number? (Y/N)");
						moreNumbers = input.nextLine();
						if(moreNumbers.equals("Y")) {
							j++;
						}
					}
					else {
						System.out.println("You have entered the maximum number of numbers!"); 
						System.out.println("We will start processing your sequence right away.");
						moreNumbers = "N";
					}
				}
				
				if(j >= 1) {
					if(j == 1) {
						int difference = numberList[1] - numberList[0];
						int i = 0;
						System.out.print("<");
						while(i < j) {
							System.out.print(numberList[i] + ", ");
							i++;
						}
						System.out.println(numberList[j] + "> is an arithmetic sequence with first term " + numberList[0] + ", common difference " + difference + ", length " + (j + 1) + ", and sum " + sum);
					}
					else {
						boolean isArithmetic = false;
						for(int i = 0; i <= (j - 2); i++) {
							if((numberList[i + 1] - numberList[i]) == (numberList[i + 2] - numberList[i + 1])){
								isArithmetic = true;	
							}
							else {
								isArithmetic = false;
							}
						}
						if(isArithmetic == true) {
							int i = 0;
							int difference = numberList[1] - numberList[0];
							System.out.print("<");
							while(i < j) {
								System.out.print(numberList[i] + ", ");
								i++;
							}
							System.out.println(numberList[j] + "> is an arithmetic sequence with first term " + numberList[0] + ", common difference " + difference + ", length " + (j + 1) + ", and sum " + sum);	
						}
						else{
							int i = 0;
							System.out.print("<");
							while(i < j) {
								System.out.print(numberList[i] + ", ");
								i++;
							}
							System.out.println(numberList[j] + "> is not an arithmetic sequence");
						}
						
					}
					
				}
				else {
					System.out.println("Error: we cannot infer the common difference from a sequence of size one.");
				}
				
				System.out.println("Would you like to process another sequence? (Y/N)");
				choice = input.nextLine();
			}
			else {
				System.out.println("Error: task number must be 1, 2, or 3.");
			}
			
		}
		System.out.println("Bye!");

		input.close();
	}

}
