package day3homework2;

public class StudentManager extends UserManager{
	
	
	
	
	public void addStudent(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+ " isimli öğrenci eklendi.");
	}
	public void StudentList(Student[] students) {
		for(Student student : students) {
			System.out.println(student.getFirstName()+" "+student.getLastName());
		}
	}
	public void courseRegister(Student student) {
		System.out.println(student.getCourse()+" isimli kursa kaydedildi");
	}

}
