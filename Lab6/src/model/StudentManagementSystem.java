package model;

public class StudentManagementSystem {

	public int nos = 0;
	public static int MAX_NUM_STUDENTS = 100;
	public Student[] studentsTemp = new Student[MAX_NUM_STUDENTS];
	public Student[] students = new Student [nos];

	public StudentManagementSystem() {
		
	}

	public String getDescription() {
		String result = "";
		if (this.nos == 0) {
			result += "Student management system currenlty stores no students." + "\n";
		}
		else {
			result += "Student management system currently stores " + nos + " students." + "\n";
		}
		return result;
	}
	
	public Student[] getStudents() {
		return this.students;
	}
	
	public void addStudent(Student student) {
		this.studentsTemp[nos] = student;
		this.nos ++;
		this.students = new Student[nos];
		for(int i = 0;i<students.length;i++) {
			this.students[i] = this.studentsTemp[i];
		}
	}
	
	public void addStudent(String name) {
		Student s = new Student (name);
		this.studentsTemp[nos] = s;
		this.nos ++;
		this.students = new Student[nos];
		for(int i = 0;i<students.length;i++) {
			this.students[i] = this.studentsTemp[i];
		}
		
	}

	public int getMarks(String name, String course) {
		int marks = -1;
		boolean check = false;
		for(int i = 0; i < this.nos && !check; i++) {
			if (this.students[i].getName().equals(name)) {
				check = true;
				marks = this.students[i].getMarks(course);
			}
		}
		return marks;
	}

	public void setMarks(String name, String course, int mark) {
		boolean check = false;
		for(int i = 0; i < this.nos && !check; i++) {
			if (this.students[i].getName().equals(name)) {
				check = true;
				this.students[i].setMarks(course, mark);
			}
		}
		
	}

	public double getGPA(String name) {
		double gpa = 0;
		boolean check = false;
		for(int i = 0; i < this.nos && !check; i++) {
			if (this.students[i].getName().equals(name)) {
				check = true;
				gpa = this.students[i].getGPA();
	}
		}
		return gpa;
	}

	public void addCourse(String name, CourseRecord course) {
		boolean check = false;
		for(int i = 0; i < this.nos && !check; i++) {
			if (this.students[i].getName().equals(name)) {
				check = true;
				this.students[i].addCourse(course);
			}
		}
		
	}


}
