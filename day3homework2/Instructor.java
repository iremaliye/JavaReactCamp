package day3homework2;

public class Instructor extends User{
	public Instructor( String firstName, String lastName, String course) {
		super();
	}

	private String instructorNumber;

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}
	
}
