
public class SwapTwoStringsWrong {

	public static void main(String[] args) {
		String person1 = "Alan";
		String person2 = "Tom";
		
		System.out.print("Before the swap: ");
		System.out.print("person1 is " + person1 + " and ");
		System.out.println("person2 is " + person2 + ".");
		
		// Swap
		// Wrong Implementation
		person1 = person2;
		person2 = person1;
		
		System.out.print("After the swap: ");
		System.out.print("person1 is " + person1 + " and ");
		System.out.print("person2 is " + person2 + ".");

	}

}
