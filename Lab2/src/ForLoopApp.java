import java.util.Scanner;

public class ForLoopApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		 * Problem: Prompt the user to enter 5 integers,
		 * then calculate their average.
		 */
		//Version without using for-loop.
//		System.out.println("Enter integer 1:");
//		int i1 = input.nextInt();
//		
//		System.out.println("Enter integer 2:");
//		int i2 = input.nextInt();
//		
//		System.out.println("Enter integer 3:");
//		int i3 = input.nextInt();
//		
//		System.out.println("Enter integer 4:");
//		int i4 = input.nextInt();
//		
//		System.out.println("Enter integer 5:");
//		int i5 = input.nextInt();
		
//		for(int i = 0; i <= 4; i++) { }
		
		int total = 0;
		int x = 0;
		for(int i = 1; i <= 5; i++) {
			System.out.println("Enter integer " + i + ":");
			x = input.nextInt();
			total += x;
		}
		
		double average = ((double) total) / 5;
		System.out.println("Average is " + average);
		
		input.close();
	}

}
