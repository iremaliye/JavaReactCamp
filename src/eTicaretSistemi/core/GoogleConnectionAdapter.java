package eTicaretSistemi.core;

import eTicaretSistemi.business.concretes.InsiderManager;
import eTicaretSistemi.dataAccess.abstracts.InsiderDao;
import eTicaretSistemi.entities.abstracts.Entity;
import eTicaretSistemi.googleConnection.GoggleConnectionManager;

public class GoogleConnectionAdapter extends InsiderManager{
	
	GoggleConnectionManager googleConnectionManager =new GoggleConnectionManager();
	

	public GoogleConnectionAdapter(Entity insider, InsiderDao hibernateInsiderDao) {
		super(insider, hibernateInsiderDao);
		
		if(hibernateInsiderDao.add(insider)) {
			googleConnectionManager.login("irem@gmail.com", "irem123");
		}
		else {
			System.out.println("Sistemde kayýtlý böyle bir google hesabý yok!");
		}
		
	}
	

}
