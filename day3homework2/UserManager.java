package day3homework2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getCourse()+" "+"Kullan�c� Java+React kursuna kaydedildi.");
		System.out.println(user.getEmail()+" "+"Kullan�c� e-mail kaydedildi.");
		System.out.println(user.getFirstName()+" "+"Kullan�c� ismi kaydedildi");
		System.out.println(user.getId()+" "+"Kullan�c� id kaydedildi.");
		System.out.println(user.getPassword()+" "+"Kullan�c� �ifresi kaydedildi.");
		
	}

}
