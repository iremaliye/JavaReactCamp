package gameSatýþSimilasyon.GamerPages;

import gameSatýþSimilasyon.LoggerPages.Logger;

public interface GameManager {
	void addGamer(Gamer gamer);
	void upDateGamer (Gamer gamer);
	void deleteGamer(Gamer gamer);
	void log(Gamer gamer,Logger logger,ArrayList<String> personalInformations)
	
	

}
