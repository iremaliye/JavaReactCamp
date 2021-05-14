package eTicaretSistemi.googleConnection;

public class GoggleConnectionManager {
		private String googleEmailAddress= "irem@gmail.com";
		private String googlePassword="irem123";
		
		
	public void login(String mailAddress,String password) {
			
			if(!googleEmailAddress.equals(mailAddress)) {
				System.out.println("Google mail adresinizi yanlýþ girdiniz!");
			}
			else if(!googlePassword.equals(password)) {
				System.out.println("Google mail þifrenizi yanlýþ giridiniz!");
			}
			else if(!googleEmailAddress.equals(mailAddress) && !googlePassword.equals(password)) {
				System.out.println("Girdiðiniz email adresi ve þifrenizi yanlýþ girdiniz!");
			}
			else {
				System.out.println("Kullanýcý baþarýlý bir þekilde kayýt edilmiþtir.");
			}
			
		}

	}



