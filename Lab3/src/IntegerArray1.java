
public class IntegerArray1 {

	public static void main(String[] args) {
		/*
		 * For any given array:
		 * 1. Indices always start with 0.
		 * 2. The size of array is the last index value + 1.
		 * 3. All elements are of the same type.
		 */
		
		// Approach 1: Array initializer notation (comma-separated values)
		int[] ia = {940, 880, 830, 790, 750, 660, 650, 590, 510, 440};
		System.out.println("Size of array \"ia\": " + ia.length);
		System.out.println("First index of array ia: " + "0");
		System.out.println("Last index of array ia: " + (ia.length - 1));
		
//		System.out.println("Element of array ia at index 0: " + ia[0]);
//		System.out.println("Element of array ia at index 1: " + ia[1]);
//		System.out.println("Element of array ia at index 2: " + ia[2]);
//		System.out.println("Element of array ia at index 3: " + ia[3]);
//		System.out.println("Element of array ia at index 4: " + ia[4]);
//		System.out.println("Element of array ia at index 5: " + ia[5]);
//		System.out.println("Element of array ia at index 6: " + ia[6]);
//		System.out.println("Element of array ia at index 7: " + ia[7]);
//		System.out.println("Element of array ia at index 8: " + ia[8]);
//		System.out.println("Element of array ia at index 9: " + ia[9]); // ia[ia.length -1]
		
		/*
		 * Constraint on the array initializer notation:
		 * you cannot re-assign an array using the initializer.
		 */
		// ia = {940, 880, 830, 790, 750, 660, 650, 590, 510};
		
		/*
		 * Version 1 of using an array to print out all elements in ia.
		 */
//		for(int i = 0; i <= 9; i++) {
//			System.out.println("Element of array ia at index " + i + " : " + ia[i]);
//		}
		
		/*
		 * Version 2.1 of using an array to print out all elements in ia.
		 * (This is the version you want to use)
		 */
//		for(int i = 0; i <= ia.length -1; i++) {
//			System.out.println("Element of array ia at index " + i + " : " + ia[i]);
//		}
		
		/*
		 * Version 2.2 of using an array to print out all elements in ia.
		 * (This is the version that illustrates a common issue mistake that causes ArrayIndexOutOfBoundException)
		 */
//		for(int i = 0; i <= ia.length; i++) {
//			/*
//			 * When i's value is incremented to ia.length (10), 10 <= 10 still gives true, meaning
//			 * that we still executed the body of the loop using ia[10].
//			 */
//			System.out.println("Element of array ia at index " + i + " : " + ia[i]);
//		}
		/*
		 * Version 1 of using an array to print out all elements in ia.
		 */
		for(int i = 0; i < ia.length; i++) {
			System.out.println("Element of array ia at index " + i + " : " + ia[i]);
		}
	}

}
