import java.util.Scanner;

/*
 * If your program has to contain both nextInt() (or nextDouble()) with nextLine(), you must always 
 * put input.nextLine() after every input.nextInt().
 */

public class SimpleUserInput2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number (which can contain a decimal: ");
		double n1 = input.nextDouble();
		input.nextLine(); // necessary
		
		System.out.println("Enter the second number (which can contain a decimal: ");
		double n2 = input.nextDouble();
		input.nextLine(); // necessary
		
		System.out.println("What's your name? ");
		String name = input.nextLine();
		
		double average = (n1 + n2) / 2;
		System.out.print(name + ", ");
		System.out.print("the numbers you entered were " + n1 + " and " + n2 + ", and ");
		System.out.println("their average is " + average + ".");
		
		input.close();

	}

}
