package eTicaretSistemi.googleConnection;

public class GoggleConnectionManager {
		private String googleEmailAddress= "irem@gmail.com";
		private String googlePassword="irem123";
		
		
	public void login(String mailAddress,String password) {
			
			if(!googleEmailAddress.equals(mailAddress)) {
				System.out.println("Google mail adresinizi yanl�� girdiniz!");
			}
			else if(!googlePassword.equals(password)) {
				System.out.println("Google mail �ifrenizi yanl�� giridiniz!");
			}
			else if(!googleEmailAddress.equals(mailAddress) && !googlePassword.equals(password)) {
				System.out.println("Girdi�iniz email adresi ve �ifrenizi yanl�� girdiniz!");
			}
			else {
				System.out.println("Kullan�c� ba�ar�l� bir �ekilde kay�t edilmi�tir.");
			}
			
		}

	}



