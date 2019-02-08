
public class IntegerArray2 {

	public static void main(String[] args) {
		/*
		 * Approach 2:
		 * 1. Create an array of integer of size 10.
		 * 2. Use separate assignment, each of which initializing an element in the array
		 * (at a particular index).
		 */
		
		/*
		 * Create an array of size 10,
		 * where each slot stores the default value for the int type (i.e. 0).
		 */
		int[] ia = new int[10];
		
		/*
		 * Assign each slot of the array to a value.
		 */
		ia[0] = 940;
		ia[1] = 880;
		ia[2] = 830;
		ia[3] = 790;
		ia[4] = 750;
		ia[5] = 660;
		ia[6] = 650;
		ia[7] = 590;
		ia[8] = 510;
		ia[9] = 440;
		
		/*
		 * Print out each element in the array, from left to right.
		 */
		for(int i = 0; i < ia.length; i++) {
			System.out.println("Element of array ia at index " + i + " : " + ia[i]);
		}
		
		System.out.println();
		System.out.println("After re-assign ia to a different, new array:");
		
		/*
		 * Show how to re-assign the array.
		 */
		ia = new int[4];
		
		ia[0] = 14;
		ia[1] = 23;
		ia[2] = -3;
		ia[3] = 4;
		
		for(int i = 0; i < ia.length; i++) {
			System.out.println("Element of array ia at index " + i + " : " + ia[i]);
		}
	}

}
