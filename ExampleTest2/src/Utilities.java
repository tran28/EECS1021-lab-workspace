public class Utilities {
	
	/* Only write lines of code within the methods given to you.
	 * Do not add any new methods. 
	 * Do not remove any methods given to you.
	 * Do not declare any variables OUTSIDE the given methods.
	 * You can only declare local variables within each method.
	 */
	
    /*
        Given an array of integers, calculate the average of its elements.
        You can assume that the array is not empty and contains at least 1 one element.
     */
    double averageOf(int[] ia) {
        double result = -1;
        /* Your task is to implement this method,
		 * so that running UtilitiesTester.java will output the expected value to console.
		 * 
		 * Do not write any System.out.print(...) or System.out.println(...).
		 * Do not declare any Scanner. 
		 * Do not re-assign any of the parameter/input variables. 
		 */

		/* Your code starts after this line: */ 
        double sum = 0;
        for(int i = 0; i < ia.length; i++) {
        	sum += ia[i];
        }
        result = sum / ia.length;
		// Do not modify this return statement.
        return result;
    }

    /*
        Given an integer array ia, determine whether or not
        all elements are multiples of 5.
     */
    boolean allMultiplesOf5(int[] ia) {
    	boolean result = false;
        /* Your task is to implement this method,
		 * so that running UtilitiesTester.java will output the expected value to console.
		 * 
		 * Do not write any System.out.print(...) or System.out.println(...).
		 * Do not declare any Scanner. 
		 * Do not re-assign any of the parameter/input variables. 
		 */

		/* Your code starts after this line: */ 
    	result = true;
    	for(int i = 0; i < ia.length && result; i++) {
    		result = ia[i] % 5 == 0;
    	}
    	
		// Do not modify this return statement.
        return result;
    }

    /*
        Given an integer array ia, determine whether or not
        at lease one element is multiple of 5.
     */
    boolean atLeastOneMultipleOf5(int[] ia) {
    	boolean result = false;
        /* Your task is to implement this method,
		 * so that running UtilitiesTester.java will output the expected value to console.
		 * 
		 * Do not write any System.out.print(...) or System.out.println(...).
		 * Do not declare any Scanner. 
		 * Do not re-assign any of the parameter/input variables. 
		 */

		/* Your code starts after this line: */ 
    	for(int i = 0; i < ia.length && !result; i++) {
    		result = ia[i] % 5 == 0;
    	}
    	
		// Do not modify this return statement.
        return result;
    }

    /*
        Given an array of integers, find out the second maximum element.
        The input array may contain duplicates.
        You can assume that integer array ia contains at least two elements.
        Your are forbidden to use any library class, e.g., Arrays.sort.
     */
    int secondMaximumOf(int[] ia) {
    	int result = -1;
        /* Your task is to implement this method,
		 * so that running UtilitiesTester.java will output the expected value to console.
		 * 
		 * Do not write any System.out.print(...) or System.out.println(...).
		 * Do not declare any Scanner. 
		 * Do not re-assign any of the parameter/input variables. 
		 */

		/* Your code starts after this line: */
    	int max = ia[0];
    	int secondMax = 0;
    	for(int i = 0; i < ia.length; i++) {
    		if(ia[i] > max) {
    			secondMax = max;
    			max = ia[i];
    		}
    		else {
    			if(ia[i] > secondMax) {
    				secondMax = ia[i];
    			}
    		}
    	}
    	result = secondMax;
    			
		// Do not modify this return statement.
        return result;
    }

    /*
        Given an array of integers, return its reverse.
        Your are forbidden to use any library class, e.g., Arrays.sort.
     */
    int[] reverseOf(int[] ia) {
    	int[] result = null;
        /* Your task is to implement this method,
		 * so that running UtilitiesTester.java will output the expected value to console.
		 * 
		 * Do not write any System.out.print(...) or System.out.println(...).
		 * Do not declare any Scanner. 
		 * Do not re-assign any of the parameter/input variables. 
		 */

		/* Your code starts after this line: */
    	result = new int[ia.length];
    	for(int i = 0; i < ia.length; i++) {
    		result[i] = ia[ia.length - i - 1];
    	}
    	
		// Do not modify this return statement.
        return result;
    }

    /*
        Given two arrays of integers, determine whether or not
        one is exactly the reverse of the other.
        Your are forbidden to use any library class, e.g., Arrays.sort.
     */
    boolean isReverseOfEachOther(int[] ia1, int[] ia2) {
    	boolean result = false;
        /* Your task is to implement this method,
		 * so that running UtilitiesTester.java will output the expected value to console.
		 * 
		 * Do not write any System.out.print(...) or System.out.println(...).
		 * Do not declare any Scanner. 
		 * Do not re-assign any of the parameter/input variables. 
		 */

		/* Your code starts after this line: */ 
    	if(ia1.length == ia2.length) {
    		if(ia1.length == 0){
    			result = true;
    		}
    		else {
    			for(int i = 0; i < ia1.length; i++) {
    				result = ia1[i] == ia2[ia2.length - i - 1];
            	}
    		}
    	}

		
		// Do not modify this return statement.
        return result;
    }

    /*
        Return the first n elements in an arithmetic sequence whose
        start term is start and common difference is diff.
     */
    int[] getArithSeq(int start, int diff, int n) {
    	int[] result = null;
        /* Your task is to implement this method,
		 * so that running UtilitiesTester.java will output the expected value to console.
		 * 
		 * Do not write any System.out.print(...) or System.out.println(...).
		 * Do not declare any Scanner. 
		 * Do not re-assign any of the parameter/input variables. 
		 */

		/* Your code starts after this line: */ 
    	result = new int[n];
    	for(int i = 0; i < n; i++) {
    		result[i] = start + i * diff;
    	}
    	
		// Do not modify this return statement.
        return result;
    }

    /*
        Given an integer array, determine if it's an arithmetic sequence,
        i.e., there's a common different between every two consecutive elements.
     */
    boolean isArithSeq(int[] ia) {
    	boolean result = false;
        /* Your task is to implement this method,
		 * so that running UtilitiesTester.java will output the expected value to console.
		 * 
		 * Do not write any System.out.print(...) or System.out.println(...).
		 * Do not declare any Scanner. 
		 * Do not re-assign any of the parameter/input variables. 
		 */

		/* Your code starts after this line: */ 
    	result = true;
    	for(int i = 1; i < (ia.length - 1) && result; i++) {
    		result = (ia[i] - ia[i-1]) == (ia[i+1] - ia[i]);
    	}
    	
		// Do not modify this return statement.
        return result;
    }


    /*
        Return the first i items in a Fibonacci sequence.
        A Fibonacci sequence is:
        1, 1, 2, 3, 5, 8, 13, 21, ...
        where the 1st and 2nd elements are always 1, and
        starting from the third element, the value of an element
        is the sum of its previous two neighbouring elements.
        For example, 2 == 1 + 1, 3 == 2 + 1, 5 == 3 + 2, 8 == 5 + 3, and etc.
        You can assume that the input i >= 0.
     */
    int[] getFibSeq(int i) {
    	int[] result = null;
        /* Your task is to implement this method,
		 * so that running UtilitiesTester.java will output the expected value to console.
		 * 
		 * Do not write any System.out.print(...) or System.out.println(...).
		 * Do not declare any Scanner. 
		 * Do not re-assign any of the parameter/input variables. 
		 */

		/* Your code starts after this line: */ 

		// Do not modify this return statement.
        return result;
    }

    /*
        Determine whether or not an integer array ia contains
        the first ia.length elements in a Fibonacci sequence.
        Remember that ia.length >= 0
     */
    boolean isFibSeq(int[] ia) {
    	boolean result = false;
        /* Your task is to implement this method,
		 * so that running UtilitiesTester.java will output the expected value to console.
		 * 
		 * Do not write any System.out.print(...) or System.out.println(...).
		 * Do not declare any Scanner. 
		 * Do not re-assign any of the parameter/input variables. 
		 */

		/* Your code starts after this line: */ 
    	result = true;
    		for(int i = 2; i < ia.length && result; i++) {
    			if(ia.length > 0 && ia[0] == 1) {
    				result = ia[i] == ia[i-1] + ia[i-2];
    			}
    			else {
    				result = false;
    			}
        	}
 
		
		// Do not modify this return statement.
        return result;
    }

    /*
        Count the number of occurrences of string s in string array sa.
     */
    int numberOfOccurrences(String[] sa, String s) {
    	int result = -1;
        /* Your task is to implement this method,
		 * so that running UtilitiesTester.java will output the expected value to console.
		 * 
		 * Do not write any System.out.print(...) or System.out.println(...).
		 * Do not declare any Scanner. 
		 * Do not re-assign any of the parameter/input variables. 
		 */

		/* Your code starts after this line: */

		// Do not modify this return statement.
        return result;
    }

    /*
        Return an array storing the indices of string s in string array sa.
        If s does not occur in sa, then the returned array should be EMPTY.
        Length of the returned array should correspond to the number of times
        string s occurs in string array sa.
     */
    int[] getIndices(String[] sa, String s) {
    	int[] result = null;
        /* Your task is to implement this method,
		 * so that running UtilitiesTester.java will output the expected value to console.
		 * 
		 * Do not write any System.out.print(...) or System.out.println(...).
		 * Do not declare any Scanner. 
		 * Do not re-assign any of the parameter/input variables. 
		 */

		/* Your code starts after this line: */ 
    	
		// Do not modify this return statement.
        return result;
    }
}
