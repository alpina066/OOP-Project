package id.ac.undiksha.ais.people;

public class Lecture extends Human {
	
	private String lectureID;
	private String lectname;
	private boolean gender;
	private String lectaddress;
	private String lectBirthDate;
	private String Faculty;
	private String Departement;
	private String study;
	
	
	
	
	public Lecture(String name, String birthDate, boolean gender, String address, String lectureID, String lectname,
			boolean gender2, String lectaddress, String lectBirthDate, String faculty, String departement,
			String study) {
		super(name, birthDate, gender, address);
		this.lectureID = lectureID;
		this.lectname = lectname;
		gender = gender2;
		this.lectaddress = lectaddress;
		this.lectBirthDate = lectBirthDate;
		Faculty = faculty;
		Departement = departement;
		this.study = study;
	}



	public Lecture() {
		this.lectureID = "<please insert studentID>";
		this.Faculty = "<please insert the Faculty>"; 
		this.Departement = "<please insert the Departement>";
		this.study = "<please insert the study>";
	}
	

	
	public String getLectureID() {
		return lectureID;
	}




	public void setLectureID(String lectureID) {
		this.lectureID = lectureID;
	}




	public String getLectname() {
		return lectname;
	}




	public void setLectname(String lectname) {
		this.lectname = lectname;
	}




	public boolean isGender() {
		return gender;
	}




	public void setGender(boolean gender) {
		this.gender = gender;
	}




	public String getLectaddress() {
		return lectaddress;
	}




	public void setLectaddress(String lectaddress) {
		this.lectaddress = lectaddress;
	}




	public String getLectBirthDate() {
		return lectBirthDate;
	}




	public void setLectBirthDate(String lectBirthDate) {
		this.lectBirthDate = lectBirthDate;
	}




	public String getFaculty() {
		return Faculty;
	}




	public void setFaculty(String faculty) {
		Faculty = faculty;
	}




	public String getDepartement() {
		return Departement;
	}




	public void setDepartement(String departement) {
		Departement = departement;
	}




	public String getStudy() {
		return study;
	}




	public void setStudy(String study) {
		this.study = study;
	}




	public void printAll() {
		super.printAll();;
		System.out.println(this.study);
		System.out.println(this.Faculty);
		System.out.println(this.Departement);


	}
	
	
}