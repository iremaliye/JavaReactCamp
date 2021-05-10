package gameSatýþSimilasyon.GamerPages;

public class PremiumManager {
	@Override
	public void addGamer(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println(gamer.userName+" eklendi.");
	}

	@Override
	public void updateGamer(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println(gamer.userName+" güncellendi.");
	}

	@Override
	public void deleteGamer(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println(gamer.userName+" silindi.");
	}

	@Override
	public void log(Gamer gamer,Logger logger,ArrayList<String> personalInformations) {
		// TODO Auto-generated method stub
		logger.log(gamer,personalInformations);
	}

}
