package id.ac.undiksha.ais.people;

public class Human {
	private String name;
	private String birthDate;
	private boolean gender; 
	private String address;
	
	public Human() {
		this.name = "<Please Insert Name>";
		this.birthDate = "<Please insert Birth Date>";
		this.address = "<Please Insert Address>";
	}
	
	public Human(String name, String birthDate, boolean gender, String address) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public boolean isGender() {
		return gender;
	}

	public String getGender() {
		if(this.isGender()) {
			return "Male";
		}else {
			return "Female";
		}
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
public void printAll() {
		
		
		System.out.println(this.name);
		System.out.println(this.birthDate);
		if (this.gender)
			System.out.println("Male");
		else
			System.out.println("Female");
		System.out.println(this.address);

		
	}
}