
public class IntegerArray3c {

	public static void main(String[] args) {
		int[] ia = new int[5];
		
		/*
		 * In this second version, the value of the loop counter i
		 * denotes the term sequence number in the arithmetic sequence.
		 * Here the term number starts with 1, and we use the following formulas:
		 * value = 7 + (term - 1) * 3
		 */
		
		for(int i = 1; i <= 5; i++) {
			ia[i - 1] = 7 + (i - 1) * 3;
		}
		
		/*
		 * Print out the elements of the array one by one.
		 */
		for(int i = 0; i < ia.length; i++) {
			System.out.println("Element of array ia at index " + i + " is: " + ia[i]);
		}
	}

}
