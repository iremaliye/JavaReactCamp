package gameSatýþSimilasyon.SalesPages;

public class SalesManagerCampaigns {
	
public void add(PremiumGamer premiumGamer, Sales sales) {
		
		
		if(PremiumGamerValidation.isSame(premiumGamer, sales)==true) {
			System.out.println(premiumGamer.getUserName()+" kullanýcýsý "+sales.name+" kampayasýna zaten sahip.");
		}
		else {
			System.out.println(premiumGamer.getUserName()+" kullanýcýsý "+sales.name+" kampayasýna katýldý.");
		}
		
	}
	
	
	
	public void addMultiple(PremiumGamer premiumGamer,ArrayList<Campaigns> campaigns) {
		
		for (Campaigns campaign : campaigns) {
			add(premiumGamer,campaign);
		}
		
	}
		
	public void update(PremiumGamer premiumGamer, Sales sales) {
		
		if(PremiumGamerValidation.isSame(premiumGamer, sales)==true) {
			System.out.println(premiumGamer.getUserName()+" kullanýcýsý "+sales.name+" güncelledi.");
		}
		else {
			System.out.println(premiumGamer.getUserName()+" kullanýcýsý "+sales.name+" kampanyasýna sahip deðil.");
		}
		
	}

	public void delete(PremiumGamer premiumGamer, Sales sales) {
		
		if(PremiumGamerValidation.isSame(premiumGamer, sales)==true) {
			System.out.println(premiumGamer.getUserName()+" kullanýcýsý "+sales.name+" sildi.");
		}
		else {
			System.out.println(premiumGamer.getUserName()+" kullanýcýsý "+sales.name+" kampanyasýna sahip deðil.");
		}
	}

}
