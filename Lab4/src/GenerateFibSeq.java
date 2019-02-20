import java.util.Scanner;

public class GenerateFibSeq {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String choice = "Y";
		
		while(choice.equals("Y")) {
			
			System.out.println("Enter the size of Fibonacci Sequence:");
			int size = input.nextInt();
			input.nextLine();
			int[] fibSeq = new int[size];
			
			if(size >= 1) {
				if(size >= 3) {
					for(int i = 0; i < 2; i++) {
						fibSeq[i] = 1;
					}
					for(int i = 2; i < fibSeq.length; i++) {
						fibSeq[i] = fibSeq[i - 1] + fibSeq[i - 2];
					}
				}
				else{
					for(int i = 0; i < fibSeq.length; i++) {
						fibSeq[i] = 1;
					}	
				}
				System.out.println("Fibonacci Sequence of size " + size + ":");
				int i = 0;
				System.out.print("<");
				while(i < fibSeq.length - 1) {
					System.out.print(fibSeq[i] + ", ");
					i++;
				}
				System.out.println(fibSeq[fibSeq.length - 1] + ">");
			}
			else {
				System.out.println("Error: Fibonacci Sequence must have size >= 1.");
			}
			System.out.println("Would you like to continue? (Y/N)");
			choice = input.nextLine();
		}
		
		System.out.println("Bye!");
		
		input.close();

	}

}
