import java.util.Scanner;

public class ComputeTax {

	public static void main(String[] args) {
		
		/*
		 * prompt for name
		 * ask whether (1) single filer or (2) married filer
		 * 		- return illegal status for invalid entry
		 * split income into parts then calculate tax
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = input.nextLine();
		
		System.out.println(name + ", enter your filing status (1 - Single Filing; 2 - Married Filing):");
		int status = input.nextInt();
		
		if(status == 1) {
			System.out.println(name + ", enter your taxable income:");
			
			double income = input.nextDouble();
			double tax = 0;
			if(0 <= income && income <= 8350) {
				double part1 = 0.1 * income;
				tax = part1;
				System.out.println(name + ", you should pay $" + tax);
				System.out.println("Calculation is based on the scheme of Single Filing:");
				System.out.println(name + ", you should pay $" + tax);
				System.out.println("Part I: $" + part1);
			}
			else if(8350 < income && income <= 33950) {
				double part1 = 0.1 * 8350;
				double part2 = 0.15 * (income - 8350);
				tax = part1 + part2;
				System.out.println(name + ", you should pay $" + tax);
				System.out.println("Calculation is based on the scheme of Single Filing:");
				System.out.println("Part I: $" + part1);
				System.out.println("Part II: $" + part2);
			}
			else if(income > 33950){
				double part1 = 0.1 * 8350;
				double part2 = 0.15 * (33950 - 8350);
				double part3 = 0.25 * (income - 33950);
				tax = part1 + part2 + part3;
				System.out.println(name + ", you should pay $" + tax);
				System.out.println("Calculation is based on the scheme of Single Filing:");
				System.out.println("Part I: $" + part1);
				System.out.println("Part II: $" + part2);
				System.out.println("Part III: $" + part3);
			}
			
		}
		else if(status == 2) {
			System.out.println(name + ", enter your taxable income:");
			
			double income = input.nextDouble();
			double tax = 0;
			if(0 <= income && income <= 16700) {
				double part1 = 0.1 * income;
				tax = part1;
				System.out.println(name + ", you should pay $" + tax);
				System.out.println("Calculation is based on the scheme of Married Filing:");
				System.out.println("Part I: $" + part1);
			}
			else if(16700 < income && income <= 67900) {
				double part1 = 0.1 * 16700;
				double part2 = 0.15 * (income - 16700);
				tax = part1 + part2;
				System.out.println(name + ", you should pay $" + tax);
				System.out.println("Calculation is based on the scheme of Married Filing:");
				System.out.println("Part I: $" + part1);
				System.out.println("Part II: $" + part2);
			}
			else if(income > 67900){
				double part1 = 0.1 * 16700;
				double part2 = 0.15 * (67900 - 16700);
				double part3 = 0.25 * (income - 67900);
				tax = part1 + part2 + part3;
				System.out.println(name + ", you should pay $" + tax);
				System.out.println("Calculation is based on the scheme of Married Filing:");
				System.out.println("Part I: $" + part1);
				System.out.println("Part II: $" + part2);
				System.out.println("Part III: $" + part3);
			}
		}
		else {
			System.out.println("Illegal status: " + status);
		}
		
		
		input.close();
	}

}
