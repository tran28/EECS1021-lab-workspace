
public class NumberVariables {

	public static void main(String[] args) {
		
		System.out.println("After initializing i's value to 5");
		int i = 5; // declare i to be a variable storing integers only, with an initial value 5
		System.out.println("i's value is: " + i); // i's value is: 5
		
		System.out.println("After changing i's value to 7");
		i = 7;
		System.out.println("i's value is: " + i); // i's value is: 7
		
		double x = 3.5; // 23.5;
		double y = 4.7; // 24.7;
		System.out.println("Average between x and y is: " + ((x + y) / 2)); // 5.1
		// Inflexible solution: every time values of x and y above are changed,
		// we have to modify contents of the string literal below.
		// System.out.println("Average between 7.2 and 3.0 is: " + ((x + y) / 2)); // 5.1
		
		// Flexible solution: every time values of x and y above are changed,
		// we need NOT modify the x and y below, because they simply denote the currently stored
		// values in x and y.
		System.out.println("Average between " + x + " and " + y + " is: " + ((x + y) / 2)); // 4.1 // 24.1
		
	}

}
