package odevIk�;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C#+ANGULAR)","2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.","Engin Demiro�","�CRETS�Z");
		
	    Course course2 = new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(JAVA+REACT)","2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.","Engin Demiro�","�CRETS�Z");
		
		Course course3 = new Course(3,"Programlamaya Giri� i�in Temel Kurs","PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.","Engin Demiro�","�CRETS�Z");
		
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
		category2.name = "E�itmen";
		
			
		
	}

}
