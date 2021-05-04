package odevIký;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý(C#+ANGULAR)","2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.","Engin Demiroð","ÜCRETSÝZ");
		
	    Course course2 = new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý(JAVA+REACT)","2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.","Engin Demiroð","ÜCRETSÝZ");
		
		Course course3 = new Course(3,"Programlamaya Giriþ için Temel Kurs","PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.","Engin Demiroð","ÜCRETSÝZ");
		
		Course[] course = {course1,course2,course3};
		
		for(Course coursee : course) {
			System.out.println(coursee.id);
			System.out.println(coursee.name);
			System.out.println(coursee.detail);
			System.out.println(coursee.instructor);
			System.out.println(coursee.price);
			System.out.println("-----------");
		
		}
		
		
		System.out.println(course.length);
		
		Category category1=new Category ();
		category1.id=4;
		category1.name = "Kategori";
		

		Category category2=new Category ();
		category2.id=5;
		category2.name = "Eðitmen";
		
			
		
	}

}
