import java.util.Scanner;

public class DebuggerIfStatement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		int x = input.nextInt();
		
		if(x < 0) {
			System.out.println("x is negative");
		}
		else { // x >= 0
			if(5 <= x && x <= 10) {
				System.out.println("x is between 5 and 10");
			}
			else if(15 <= x && x <= 20) {
				System.out.println("x is between 15 and 20");
			}
			else {
				System.out.println("x is smaller than 5 or x is larger than 10");
			}
		}
		
		input.close();

	}

}
