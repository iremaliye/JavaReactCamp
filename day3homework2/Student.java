package day3homework2;

public class Student extends User{
	public Student(int id,String firstName,String lastName,String password,String email, String course) {
		super();
	}
	
	private String studentNumber;
	private int completionRate;
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public int getCompletionRate() {
		return completionRate;
	}
	
	
	

}
