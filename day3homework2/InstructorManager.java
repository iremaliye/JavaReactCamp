package day3homework2;

public class InstructorManager extends UserManager{
	public void Add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" isimli e�itmen eklendi.");
	}
	
    public void ConstituteCourse(Instructor instructor) {
    	System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" -> "+instructor.getCourse()+" kursu olu�turuldu.");
    	
    }

}
