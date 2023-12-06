package id.ac.undiksha.ais.people;

public class Student extends Human {
	
	private String studentId;
	private int smtr;
	
	public Student() {
		this.studentId = "<Please insert StudentId>";
		this.smtr = 0;
	
	}
	
	public Student(String studentId, int smtr) {
		super();
		this.studentId = studentId;
		this.smtr = smtr;
	}

	

	public String getStudentId() {
		return studentId;
	}



	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}



	public int getSmtr() {
		return smtr;
	}



	public void setSmtr(int smtr) {
		this.smtr = smtr;
	}



	public void printAll() {
		super.printAll();
		System.out.println(this.studentId);
		System.out.println(this.smtr);
	}
	
}