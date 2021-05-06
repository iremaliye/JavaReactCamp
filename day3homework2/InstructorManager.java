package day3homework2;

public class InstructorManager extends UserManager{
	public void Add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" isimli eğitmen eklendi.");
	}
	
    public void ConstituteCourse(Instructor instructor) {
    	System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" -> "+instructor.getCourse()+" kursu oluşturuldu.");
    	
    }

}
