package tests;

import model.CourseRecord;
import model.Faculty;

public class CourseRecordTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Faculty f1 = new Faculty("Jackie", "LAS2043", 70130);
		Faculty f2 = new Faculty("Jonathan", "LAS2045", 70298);
		
		CourseRecord cr1 = new CourseRecord(); // version 1
		System.out.println(cr1.getDescription());
		cr1.setTitle("EECS2030");
		cr1.setMarks(73);
		cr1.setInstructor(f1);
		System.out.println(cr1.getDescription());
		
		CourseRecord cr2 = new CourseRecord("EECS1021"); // version 2
		System.out.println(cr2.getDescription());
		
		CourseRecord cr3 = new CourseRecord("EECS3311", 68); // version 3
		System.out.println(cr3.getDescription());
		
		cr2.setInstructor(f1);
		cr3.setInstructor(f2);
		
		System.out.println("cr1 and cr2 have the samee instructor: " + (cr1.getInstructor() == cr2.getInstructor()));
		System.out.println("cr1 and cr2 have the samee instructor: " + (cr2.getInstructor() == cr3.getInstructor()));
		System.out.println("cr1 and cr2 have the samee instructor: " + (cr1.getInstructor() == cr3.getInstructor()));
	}

}
