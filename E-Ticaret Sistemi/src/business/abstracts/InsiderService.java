package eTicaretSistemi.business.abstracts;

public interface InsiderService {
	void login(String password,String email);
	void changePassword(String password);
	void changeEmail(String email);
	

}
