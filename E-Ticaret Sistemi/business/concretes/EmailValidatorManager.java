package eTicaretSistemi.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


import eTicaretSistemi.business.abstracts.EmailValidatorService;

public class EmailValidatorManager implements EmailValidatorService{
	
	boolean value =true;

	@Override
	public boolean validateName(String name) {
		
		if(name.length()<2) {
			return false;
		}
		else {
			return value;
			
		}
		
	}

	@Override
	public boolean validateSurname(String surname) {
		
		if(surname.length()<2) {
			return false;
		}
		else {
			return value;
			
		}
	}

	@Override
	public boolean validateEmail(String email) {
		String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPath = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPath.matcher(email);
		return matcher.find();
	
		
	}

	@Override
	public boolean validatePassword(String password) {
		
		if(password.length()<6) {
			return false;
		}
		else {
			return value;
		}
	
		
	}

	@Override
	public boolean validateClicked(boolean clicked) {
		// TODO Auto-generated method stub
		return clicked;
	}
	
	

}
