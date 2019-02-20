
public class AllPositiveV4 {
	
	/*
	 * V1: scan the entire array (i.e., stay condition is i < ns.length), 
	 * 		and with accumulation(i.e., allPos = allPos && ns[i] > 0). Works.
	 * V2: scan the entire array (i.e., stay condition is i < ns.length), 
	 * 		and without accumulation(i.e., allPos = ns[i] > 0). Does not work (depends on last element).
	 * V3: may exit early (i.e. stay condition is i < ns.length && allPos), 
	 * 		and with accumulation(i.e., allPos = allPos && ns[i] > 0). Works.
	 * V4: may exit early (i.e. stay condition is i < ns.length && allPos), 
	 * 		and without accumulation(i.e., allPos = ns[i] > 0). Works.
	 */

	public static void main(String[] args) {
		
		int[] ns = {2, 3, -1, 4, 5};
		boolean allPos = true;
		// early exit when possible
		for(int i = 0; i < ns.length && allPos; i++) {
			
			// no accumulation of result between iterations
			// as soon as allPos becomes false, the stay condition becomes false and exit from loop.
			allPos = ns[i] > 0;
		}
		
		System.out.println("All elements in array are positive: " + allPos);
	}

}
