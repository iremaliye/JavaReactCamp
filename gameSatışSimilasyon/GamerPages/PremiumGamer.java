package gameSatýþSimilasyon.GamerPages;

public class PremiumGamer extends Gamer{
	
	ArrayList<Campaigns> campaigns;
	
	public PremiumGamer(String userName, String password, String email, int level, double experience, ArrayList<Games> games,ArrayList<Campaigns> campaigns) {
		super(userName, password, email, level, xp, games);
		this.campaigns=campaigns;
	}

	public ArrayList<Campaigns> getCampaigns() {
		return campaigns;
	}

}
