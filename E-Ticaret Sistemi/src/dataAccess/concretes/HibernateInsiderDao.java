package eTicaretSistemi.dataAccess.concretes;

import eTicaretSistemi.business.abstracts.EmailValidatorService;
import eTicaretSistemi.dataAccess.abstracts.InsiderDao;
import eTicaretSistemi.entities.abstracts.Entity;

public class HibernateInsiderDao implements InsiderDao{
	EmailValidatorService emailValidatorrManager;
	

	public HibernateInsiderDao(EmailValidatorService emailValidatorManager) {
		super();
		this.emailValidatorrManager = emailValidatorManager;
	}

	@Override
	public boolean add(Entity insider) {
		Object emailvalidationManager;
		if(!emailValidatorrManager.validateName(insider.getName())) {
			System.out.println("Kullanýcý adý 2 karakterden fazla olmalý!");
		return false;
		}
		else if(!emailValidatorrManager.validateSurname(insider.getSurname())) {
			System.out.println("Kullanýcý soyadý 2 karakterden fazla olmalý!");
			return false;
		}
		else if(!emailValidatorrManager.validateEmail(insider.getEmail())) {
			System.out.println("Geçersiz mail adresi!");
			return false;
		}
		else if (emailValidatorrManager.validateClicked(!insider.clicked())) {
			System.out.println("Kullanýcý e-posta doðrulama linkine týklamadý!");
			return false;
		}
		else {
			System.out.println("Veri tabanýona eklendi: "+insider.getName());
			return true;
		}
	}

	@Override
	public void update(Entity insider) {
		System.out.println("Veri tabanýnda güncellendi: "+insider.getName());
	}

	@Override
	public void delete(Entity insider) {
		System.out.println("Veri tabanýndan silindi : "+insider.getName());

		
	}
	

}
