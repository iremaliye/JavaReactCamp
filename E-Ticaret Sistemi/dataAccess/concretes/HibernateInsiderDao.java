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
			System.out.println("Kullan�c� ad� 2 karakterden fazla olmal�!");
		return false;
		}
		else if(!emailValidatorrManager.validateSurname(insider.getSurname())) {
			System.out.println("Kullan�c� soyad� 2 karakterden fazla olmal�!");
			return false;
		}
		else if(!emailValidatorrManager.validateEmail(insider.getEmail())) {
			System.out.println("Ge�ersiz mail adresi!");
			return false;
		}
		else if (emailValidatorrManager.validateClicked(!insider.clicked())) {
			System.out.println("Kullan�c� e-posta do�rulama linkine t�klamad�!");
			return false;
		}
		else {
			System.out.println("Veri taban�ona eklendi: "+insider.getName());
			return true;
		}
	}

	@Override
	public void update(Entity insider) {
		System.out.println("Veri taban�nda g�ncellendi: "+insider.getName());
	}

	@Override
	public void delete(Entity insider) {
		System.out.println("Veri taban�ndan silindi : "+insider.getName());

		
	}
	

}
