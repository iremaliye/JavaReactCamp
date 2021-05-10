package gameSatýþSimilasyon.SalesPages;

public class Campaigns extends Sales {
	double campignRate;
	
	public Campaigns(String name,double campaignRate); {
		super(name);
		this.campignRate=campaignRate;
		
	}
	

	public double getCampignRate() {
		return campignRate;
	}
}