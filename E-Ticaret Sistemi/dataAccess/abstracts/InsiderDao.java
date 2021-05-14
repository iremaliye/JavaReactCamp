package eTicaretSistemi.dataAccess.abstracts;

import eTicaretSistemi.entities.abstracts.Entity;

public interface InsiderDao {
	boolean add(Entity insider);
	void update (Entity insider);
	void delete (Entity insider);
	

}
