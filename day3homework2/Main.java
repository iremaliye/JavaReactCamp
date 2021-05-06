package day3homework2;

public class Main {

	public static void main(String[] args) {
		
		Student student1 =new Student(1, "İrem Aliye", "AKMAN", "i123", "irem@gmail.com", "java+react");
		Student student2=new Student(2, "Ufuk", "AKMAN","u123", "ufuk@gmail.com", "C#+ARGULAR");
		
		Instructor instructor1=new Instructor("Engin", "DEMİROĞ","Java+REACT");
		
		Student[] students= {student1,student2};
		
		StudentManager studentManager=new StudentManager();
		studentManager.addStudent(student1);
		studentManager.StudentList(students);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.Add(instructor1);
		
		InstructorManager instructorManager2=new InstructorManager();
		instructorManager2.ConstituteCourse(instructor1);
		
	

	}

}
