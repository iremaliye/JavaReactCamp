package eTicaretSistemi.business.concretes;

import eTicaretSistemi.business.abstracts.InsiderService;
import eTicaretSistemi.dataAccess.abstracts.InsiderDao;
import eTicaretSistemi.entities.abstracts.Entity;

public class InsiderManager implements InsiderService {
	
	protected Entity insider;
	protected InsiderDao hibernateInsiderDao;
	
	
	public InsiderManager(Entity insider, InsiderDao hibernateInsiderDao) {
		super();
		this.insider = insider;
		this.hibernateInsiderDao = hibernateInsiderDao;
	}
	
	@Override
	public void login(String password, String email) {
		if(hibernateInsiderDao.add(insider)) {
			if(password.equals(insider.getPassword())&& email.equals(insider.getEmail())) {
				System.out.println("Kullan�c� ba�ar�l� bir �ekilde kay�t edildi");
			}
			else if(!password.equals(insider.getPassword())&& !email.equals(insider.getEmail())) {
				System.err.println("Kay�t i�lemi s�ras�nda �ifre ve email yanl�� girildi!");
			}
			else if (!password.equals(insider.getPassword())) {
				System.err.println("Kay�t i�lemi s�ras�nda �ifre yanl�� girildi! ");
			}
			else if (!email.equals(insider.getEmail())) {
				System.err.println("Kay�t i�lemi s�ras�nda email yanl�� girildi! ");
			}
		}
		else {
			System.out.println("Sistemde bu bilgilere sahip bir kullan�c� kay�tl� de�il!");
			
		}
	}

	@Override
	public void changePassword(String password) {
		if(password.equals(insider.getPassword())) {
			hibernateInsiderDao.update(insider);
		}
		
	}

	@Override
	public void changeEmail(String email) {
		if(email.equals(insider.getEmail())) {
			hibernateInsiderDao.update(insider);
		
	}
	

	}
}
