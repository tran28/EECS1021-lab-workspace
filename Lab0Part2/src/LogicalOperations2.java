
public class LogicalOperations2 {

	public static void main(String[] args) {
		boolean p = false;
		boolean q = false;
		boolean conjunction = p && q;
		System.out.println("Conjunction of " + p + " and " + q + " is: " + conjunction);
		boolean disjunction = p || q;
		System.out.println("Disjunction of " + p + " and " + q + " is: " + disjunction);
		
		p = false;
		q = true;
		conjunction = p && q;
		System.out.println("Conjunction of " + p + " and " + q + " is: " + conjunction);
		disjunction = p || q;
		System.out.println("Disjunction of " + p + " and " + q + " is: " + disjunction);
		
		p = true;
		q = false;
		conjunction = p && q;
		System.out.println("Conjunction of " + p + " and " + q + " is: " + conjunction);
		disjunction = p || q;
		System.out.println("Disjunction of " + p + " and " + q + " is: " + disjunction);
		
		p = true;
		q = true;
		// This line is critical to make sure 
		// when you print out the value of 'conjunction', it reflects the most up-to-date values 
		// stored in p and q.
		conjunction = p && q;
		System.out.println("Conjunction of " + p + " and " + q + " is: " + conjunction);
		disjunction = p || q;
		System.out.println("Disjunction of " + p + " and " + q + " is: " + disjunction);
	}

}
