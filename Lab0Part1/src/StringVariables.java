
public class StringVariables {

	public static void main(String[] args) {
		
		String firstName = "";
		String lastName = "";
		int i = 0;
		
		System.out.println("Person " + i + ": " + lastName + ", " + firstName);

		firstName = "Heeyeon";
		lastName = "Kang";
		i = i + 1;
		System.out.println("Person " + i + ": " + lastName + ", " + firstName);
		
		firstName = "Jihye";
		lastName = "Park";
		i = i + 1;
		System.out.println("Person " + i + ": " + lastName + ", " + firstName);
		
		/*
		 *  Remark: 
		 *  Lines 10, 15, 20 are identical.
		 *  However, at runtime, they produce different outputs to the console.
		 *  This is because they depend on values of variables, which are changed
		 *  at Lines 6 - 8, 12 - 14, 17 - 19
		 */
		
	}

}
