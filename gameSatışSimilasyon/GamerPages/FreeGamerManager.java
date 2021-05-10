package gameSatýþSimilasyon.GamerPages;

import java.util.ArrayList;

public class FreeGamerManager implements GamerManager{
	
	public void addGamer(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println(gamer.userName+" eklendi.");
	}

	public void updateGamer(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println(gamer.userName+" güncellendi.");
	}

	public void deleteGamer(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println(gamer.userName+" silindi.");
	}

	public void log(Gamer gamer,Logger logger,ArrayList<String> personalInformations) {
		// TODO Auto-generated method stub
		logger.log(gamer,personalInformations);
	}


}
