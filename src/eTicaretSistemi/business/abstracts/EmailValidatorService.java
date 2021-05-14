package eTicaretSistemi.business.abstracts;
import java.util.regex.Pattern;

public interface EmailValidatorService {
	boolean validateName (String name);
	boolean validateSurname (String surname);
	boolean validateEmail (String email);
	boolean validatePassword(String password);
	boolean validateClicked (boolean clicked);
	
	

}




