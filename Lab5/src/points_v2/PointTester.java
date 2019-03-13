package points_v2;

public class PointTester {

	public static void main(String[] args) {
		/*
		 * Create point objects.
		 */
		
		// This is where we CALL/USE the constructor.
		Point p1 = new Point(3, -4); // calling the 1st version of constructor
		Point p2 = new Point(-2, -7); // calling the 1st version of constructor
		Point p3 = new Point('y', 8); // calling the 2nd version of constructor
		Point p4 = new Point('x', -5); // calling the 2nd version of constructor
		
		System.out.println(p1);	//prints out pseudo-address
		System.out.println(p2);
		System.out.println("p1 and p2 store different addresses: " + (p1 != p2));
		System.out.println("p1 and p2 store same address: " + (p1 == p2));
		System.out.println(p3);
		System.out.println(p4);
		
		//Version 1 with variables storing return values of accessor method calls
//		String desc1 = p1.getDescription();
//		String desc2 = p3.getDescription();
//		double dist1 = p1.getDistanceFromOrigin();
//		double dist2 = p3.getDistanceFromOrigin();
//		double dist3 = p1.getDistanceFrom(p3);
//		System.out.println("Description of p1: " + desc1);
//		System.out.println("Description of p3: " + desc2);
//		System.out.println("Distance of p1 from origin (0, 0): " + dist1);
//		System.out.println("Distance of p3 from origin (0, 0): " + dist2);
//		System.out.println("Distance from p1 to p3): " + dist3);
//		
//		p1.move('R', 3.2);
//		p3.move('D', 4.7);
//		System.out.println("After moving p1 and p3");
//		
//		desc1 = p1.getDescription();
//		desc2 = p3.getDescription();
//		dist1 = p1.getDistanceFromOrigin();
//		dist2 = p3.getDistanceFromOrigin();
//		dist3 = p1.getDistanceFrom(p3);
//		System.out.println("Description of p1: " + desc1);
//		System.out.println("Description of p3: " + desc2);
//		System.out.println("Distance of p1 from origin (0, 0): " + dist1);
//		System.out.println("Distance of p3 from origin (0, 0): " + dist2);
//		System.out.println("Distance from p1 to p3): " + dist3);
		
		// Version 2: print out accessor method call return values directly
		
		System.out.println("Description of p1: " + p1.getDescription());
		System.out.println("Description of p3: " + p3.getDescription());
		System.out.println("Distance of p1 from origin (0, 0): " + p1.getDistanceFromOrigin());
		System.out.println("Distance of p3 from origin (0, 0): " + p3.getDistanceFromOrigin());
		System.out.println("Distance from p1 to p3): " + p1.getDistanceFrom(p3));
		
		p1.move('R', 3.2);
		p3.move('D', 4.7);
		System.out.println("After moving p1 and p3");
		
		System.out.println("Description of p1: " + p1.getDescription());
		System.out.println("Description of p3: " + p3.getDescription());
		System.out.println("Distance of p1 from origin (0, 0): " + p1.getDistanceFromOrigin());
		System.out.println("Distance of p3 from origin (0, 0): " + p3.getDistanceFromOrigin());
		System.out.println("Distance from p1 to p3): " + p1.getDistanceFrom(p3));
	}

}
