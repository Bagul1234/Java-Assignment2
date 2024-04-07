package Assignment2;

public class Student {


	private int rollNo, mark;
	private String name, course, result;
	private char grade;

	public Student(int rollNo, String name, int marks, String course) {
		this.rollNo = rollNo;
		this.name = name;
		this.mark = marks;
		this.course = course;
	}

	public void grade() {
		if (mark >= 90)
			grade = 'A';
		else if (80 <= mark && mark < 90)
			grade = 'B';
		else if (70 <= mark && mark < 80)
			grade = 'C';
		else if (60 <= mark && mark < 70)
			grade = 'D';
		else
			grade = 'F';

	}

	public void result() {
		if (mark > 60)
			result = "Pass";
		else
			result = "Fail";

	}

	public String toString() {
		return "Student=[Name: " + name + " RollNo:" + rollNo + " Course: " + course + " marks: " + mark + " result:"
				+ result + " Grade:" + grade + "]";

	}

}

