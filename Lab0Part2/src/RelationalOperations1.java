
public class RelationalOperations1 {

	public static void main(String[] args) {
		boolean p = 3 < 5; // true because it is the case
		boolean q = 5 < 3; // false because it is NOT the case
		
		System.out.println("3 < 5 is " + p);
		System.out.println("5 < 3 is " + q);
		
		System.out.println("3 == 5 is " + (3 == 5));
		
		/*
		 * Exercise for you: Try other operational operators
		 * <, <=, >, >=, ==
		 * Common confusion:
		 * = means assignment, e.g. x = y means assign y to x
		 * == means equality, e.g.  p == q means p's value is equal to q's value 
		 */
		System.out.println("3 <= 5 is " + (3 <= 5));
		System.out.println("5 <= 3 is " + (5 <= 3));
		System.out.println("3 >= 5 is " + (3 >= 5));
		System.out.println("5 >= 3 is " + (5 >= 3));
	}

}
