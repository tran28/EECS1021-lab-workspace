
public class IntegerArray3a {

	public static void main(String[] args) {
		int[] ia = new int[5];
		
		/*
		 * In this version, the value of the loop counter i
		 * denotes the value to be stored at the array.
		 */
		
		int j = 0; // index of the array
		for (int i = 7; i <= 19; i+=3) {
			ia[j] = i;
			j++;
		}
		
		/*
		 * Print out the elements of the array one by one.
		 */
		for(int i = 0; i < ia.length; i++) {
			System.out.println("Element of array ia at index " + i + " is: " + ia[i]);
		}
	}

}
