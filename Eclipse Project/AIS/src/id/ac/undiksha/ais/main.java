package id.ac.undiksha.ais;

import id.ac.undiksha.ais.people.Student;
import id.ac.undiksha.ais.people.Lecture;

public class main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setStudentID("2310");
		student1.setName("Bob");
		student1.setBirthDate("1 January 2001");
		student1.setGender(true);
		student1.setAddress("Badung");
		student1.setSmtr(5);
		
		
		student1.printAll();
		System.out.println('\n');
		// System.out.println(null);
		
		Lecture lect1 = new Lecture();
		lect1.setLectureID("20217");
		lect1.setLectname("Mr. BIlly");
		lect1.setLectBirthDate("11 January 1986");
		lect1.setGender(true);
		lect1.setLectaddress("Bangli");
		lect1.setFaculty("FTK");
		lect1.setDepartement("Teknik Informatika");
		lect1.setStudy("Computer Network");
		
		lect1.printAll();
		
		
		
//		System.out.println(student1.getStudentID());
//		student1.name = "Gogo";
//		student1.studentID = "2216191";
//		student1.birthDate = "1 January 2000";
//		student1.gender = false;
//		student1.smtr = 6;
//		student1.address = "Singaraja";
//		
//		System.out.println(student1.name);
//		System.out.println(student1.studentID);
//		System.out.println(student1.birthDate);
//		if (student1.gender)
//			System.out.println("Male");
//		else 
//			System.out.println("Female");
//		System.out.println(student1.smtr);
//		System.out.println(student1.address);
		
		

	}

}