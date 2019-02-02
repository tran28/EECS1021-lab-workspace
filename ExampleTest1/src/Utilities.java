public class Utilities
{
	/* Only write lines of code within the methods given to you.
	 * Do not add any new methods. 
	 * Do not declare any variables OUTSIDE the given methods.
	 * You can only declare local variables within each method.
	 */

	/*	Task 1:
	 *  Given an input double number that denotes the radius of a circle,
	 *  return its area.
	 */
	double areaOfCircle(double radius) {
		double result = 0;
		/* Your task is to implement this method,
		 * so that running UtilitiesTester.java will output the expected value to console.
		 * 
		 * Do not write any System.out.print(...) or System.out.println(...).
		 * Do not declare any Scanner. 
		 * Do not re-assign any of the parameter/input variables. 
		 */
		
		// Your code starts after this line:
		result = 3.14 * radius * radius;
		
		
		// Do not modify this return statement. 
		return result;
	}

	/*  Task 2:
	 *  Given four input integers a, b, c, and d,
	 *  return their average with precision.
	 */
	double averageOf(int a, int b, int c, int d) {
		double result = 0;
		/* Your task is to implement this method,
		 * so that running UtilitiesTester.java will output the expected value to console.
		 * 
		 * Do not write any System.out.print(...) or System.out.println(...).
		 * Do not declare any Scanner. 
		 * Do not re-assign any of the parameter/input variables. 
		 */
		
		// Your code starts after this line:
		result = (a + b + c + d)/4.0;
		
		
		// Do not modify this return statement. 
		return result;
	}

	/*  Task 3:
	 *  Given three input integers (which may or may not be equal),
	 *  return the maximum.
	 */
	int maximumOf(int x, int y, int z) {
		int result = 0;
		/* Your task is to implement this method,
		 * so that running UtilitiesTester.java will output the expected value to console.
		 * 
		 * Do not write any System.out.print(...) or System.out.println(...).
		 * Do not declare any Scanner. 
		 * Do not re-assign any of the parameter/input variables. 
		 */
		
		// Your code starts after this line:
		if(x >= y && x >= z) {
			result = x;
		}
		else if(y >= z && y >= z) {
			result = y;
		}
		else if(z >= x && z >= y) {
			result = z;
		}
		
		
		// Do not modify this return statement. 
		return result;
	}

	/*  Task 4:
	 *  Given four input integers,
	 *  return whether or not they represent an arithmetic sequence.
	 *  An arithmetic sequence is has a common difference between every consecutive numbers.
	 *  e.g., 1, 3, 5, 7 is an arithmetic sequence with 2 being the common difference.
	 *  e.g., 10, 8, 6, 4 is an arithmetic sequence with -2 being the common difference.
	 */
	boolean isArithmeticSeq(int n1, int n2, int n3, int n4) {
		boolean result = false;
		/* Your task is to implement this method,
		 * so that running UtilitiesTester.java will output the expected value to console.
		 * 
		 * Do not write any System.out.print(...) or System.out.println(...).
		 * Do not declare any Scanner. 
		 * Do not re-assign any of the parameter/input variables. 
		 */
		
		// Your code starts after this line:
		if((n2 - n1) == (n3 - n2) && (n4 - n3) == (n3 - n2)) {
			result = true;
		}
		else {
			result = false;
		}
		
		// Do not modify this return statement. 
		return result;
	}
	// Extra Task 1:
	String getWinnerOfRPSGame(String player1Name, char player1Option, String player2Name, char player2Option) {
		String result = "";

		if(player1Option == player2Option) {
			result = "It is a tie.";
		}
		else if(player1Option == 'R' && player2Option == 'S'){
			result = player1Name + " wins.";
		}
		else if(player1Option == 'R' && player2Option == 'P'){
			result = player2Name + " wins.";
		}
		else if(player1Option == 'P' && player2Option == 'R'){
			result = player1Name + " wins.";
		}
		else if(player1Option == 'P' && player2Option == 'S'){
			result = player2Name + " wins.";
		}
		else if(player1Option == 'S' && player2Option == 'R'){
			result = player2Name + " wins.";
		}	
		else if(player1Option == 'S' && player2Option == 'P'){
			result = player1Name + " wins.";
		}
		else {
			result = player1Name + " wins.";
		}

		return result;
	}
	// Extra Task 2:
	double getBMI(double inches, double pounds) {

		  double result = -1;
		  //double kilograms = pounds / 2.205;
		  //double meters = inches / 39.37;
		  
		  result = (pounds / (inches * inches)) * 703;


		  return result;
	}

}
