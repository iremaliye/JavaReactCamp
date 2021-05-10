package gameSatışSimilasyon.SalesPages;

public class SalesManagerCampaigns {
	
public void add(PremiumGamer premiumGamer, Sales sales) {
		
		
		if(PremiumGamerValidation.isSame(premiumGamer, sales)==true) {
			System.out.println(premiumGamer.getUserName()+" kullanıcısı "+sales.name+" kampayasına zaten sahip.");
		}
		else {
			System.out.println(premiumGamer.getUserName()+" kullanıcısı "+sales.name+" kampayasına katıldı.");
		}
		
	}
	
	
	
	public void addMultiple(PremiumGamer premiumGamer,ArrayList<Campaigns> campaigns) {
		
		for (Campaigns campaign : campaigns) {
			add(premiumGamer,campaign);
		}
		
	}
		
	public void update(PremiumGamer premiumGamer, Sales sales) {
		
		if(PremiumGamerValidation.isSame(premiumGamer, sales)==true) {
			System.out.println(premiumGamer.getUserName()+" kullanıcısı "+sales.name+" güncelledi.");
		}
		else {
			System.out.println(premiumGamer.getUserName()+" kullanıcısı "+sales.name+" kampanyasına sahip değil.");
		}
		
	}

	public void delete(PremiumGamer premiumGamer, Sales sales) {
		
		if(PremiumGamerValidation.isSame(premiumGamer, sales)==true) {
			System.out.println(premiumGamer.getUserName()+" kullanıcısı "+sales.name+" sildi.");
		}
		else {
			System.out.println(premiumGamer.getUserName()+" kullanıcısı "+sales.name+" kampanyasına sahip değil.");
		}
	}

}
