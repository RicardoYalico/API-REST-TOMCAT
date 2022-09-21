package student;

public class Student {
	
	private String lastName;
	
	private String firstName;
	
	private int age;
	
	
	public Student(String lastName, String firstName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String setLastName() {
		return lastName;
	}
	
	public String setFirstName() {
		return firstName;
	}
	
	public int setAge() {
		return age;
	}
}
