import java.util.Scanner;

public class ComputePerimeterAndAreaOfCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer for radius: ");
		int radius = input.nextInt();
		input.nextLine();
		
		System.out.println("What's your name? ");
		String name = input.nextLine();
		
		double perimeter = 2 * 3.14 * radius;
		double area = 3.14 * radius * radius;
		
		System.out.println(name + ", your input circle with radius " + radius + " has perimeter " +  perimeter + " and area " + area);
		
		input.close();

	}

}
