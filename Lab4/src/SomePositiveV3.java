
public class SomePositiveV3 {

	public static void main(String[] args) {
		
		int[] ns = {-2, -7, 4, 5, -1};
		boolean somePos = false;
		// early exit when possible
		for(int i = 0; i < ns.length && !somePos; i++) {
			
			// accumulation of result between iterations
			somePos = somePos || ns[i] > 0;
		}
		
		System.out.println("Some (at least one) element in array is positive: " + somePos);
	}

}
