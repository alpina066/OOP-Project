package id.ac.undiksha.ais;

import id.ac.undiksha.ais.people.Lecture;
import id.ac.undiksha.ais.people.Student;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student();
		
		student1.setStudentId("12345");
		student1.setName("Ani");
		student1.setBirthDate("1 January 2000");
		student1.setGender(false);
		student1.setSmtr(6);
		student1.setAddress("Singaraja");
		
		
		Lecture lecturer1 = new Lecture();
		lecturer1.setLectureID("98765");
		lecturer1.setName("Komang Ajus");
		lecturer1.setBirthDate("9 June 1967");
		lecturer1.setGender(true);
		lecturer1.setAddress("Gianyar");
		lecturer1.setFaculty("Engineering and Vocational Faculty");
		lecturer1.setDepartement("Informatics Engineering");
		lecturer1.setStudy("Computer Science");
		
//		Student student3 = new Student(
//				"12345", 
//				"Agus",
//				"28 April",
//				true,
//				"Singaraja",
//				3
//			);
		
		Lecture lecturer2 = new Lecture();
		
		
		System.out.println("Student Attributes");
		student1.printAll();
		System.out.println();
		System.out.println("Lecturer Attributes");
		lecturer1.printAll();
		System.out.println();
//		student3.printAll();
		System.out.println();
		lecturer2.printAll();
		
		
		
		
		/*student1.name = "Ani";
		student1.studentId = "0123";   
		student1.birthDate = "1 June 2000";
		student1.gender = false;
		student1.smtr = 6;
		student1.address = "Singaraja";
		
		System.out.println(student1.name);
		System.out.println(student1.studentId);
		System.out.println(student1.birthDate);
		if (student1.gender)
			System.out.println("Male");
		else
			System.out.println("Female");
		System.out.println(student1.gender);
		System.out.println(student1.smtr);
		System.out.println(student1.address);*/
	}

}