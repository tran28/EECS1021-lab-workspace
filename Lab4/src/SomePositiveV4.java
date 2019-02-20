
public class SomePositiveV4 {
	
	/*
	 * V1: scan the entire array (i.e., stay condition is i < ns.length), 
	 * 		and with accumulation(i.e., somePos = somePos || ns[i] > 0). Works.
	 * V2: scan the entire array (i.e., stay condition is i < ns.length), 
	 * 		and without accumulation(i.e., somePos = ns[i] > 0). Does not work (depends on last element).
	 * V3: may exit early (i.e. stay condition is i < ns.length && !somePos), 
	 * 		and with accumulation(i.e., somePos = somePos || ns[i] > 0). Works.
	 * V4: may exit early (i.e. stay condition is i < ns.length && !somePositive), 
	 * 		and without accumulation(i.e., somePos = ns[i] > 0). Works.
	 */

	public static void main(String[] args) {
		
		int[] ns = {-2, -7, 4, 5, -1};
		boolean somePos = false;
		// early exit when possible
		for(int i = 0; i < ns.length && !somePos; i++) {
			
			// no accumulation of result between iterations
			// as soon as somePos becomes true, the stay condition becomes false and exit from loop.
			somePos = ns[i] > 0;
		}
		
		System.out.println("Some (at least one) element in array is positive: " + somePos);
	}

}
