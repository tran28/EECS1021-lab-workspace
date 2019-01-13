import java.util.Scanner;

public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// Prompt user for name.
		System.out.println("Enter your name:");
		String userName = input.nextLine();
		
		// Prompt user for height (in inches) and weight (in pounds).
		System.out.println(userName + ", enter your height in inches:");
		int userHeight = input.nextInt();
		System.out.println(userName + ", enter your weight in pounds:");
		int userWeight = input.nextInt();
		
		// Convert height from inches to meters and weight from pounds to kilograms.
		double convertedHeight = userHeight * 0.0254;
		double convertedWeight = userWeight * 0.45359237;
		
		// Calculate user's BMI.
		double userBMI = convertedWeight/(convertedHeight * convertedHeight);
		
//		Testing if statements:
//		System.out.println("What is the BMI?");
//		double userBMI = input.nextDouble();
		
		
		// Display user's BMI as well as interpreted result.
		System.out.println(userName + ", your BMI is " + userBMI);
		
		if(userBMI < 18.5) {
			System.out.println("You are underweight!");
		}
		else if(18.5 <= userBMI && userBMI < 25.0) {
			System.out.println("You are normal!");
		}
		else if(25.0 <= userBMI && userBMI < 30.0) {
			System.out.println("You are overweight!");
		}
		else {
			System.out.println("You are obese!");
		}
		
		input.close();
	}

}
