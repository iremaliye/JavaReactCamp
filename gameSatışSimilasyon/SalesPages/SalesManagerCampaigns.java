package gameSat��Similasyon.SalesPages;

public class SalesManagerCampaigns {
	
public void add(PremiumGamer premiumGamer, Sales sales) {
		
		
		if(PremiumGamerValidation.isSame(premiumGamer, sales)==true) {
			System.out.println(premiumGamer.getUserName()+" kullan�c�s� "+sales.name+" kampayas�na zaten sahip.");
		}
		else {
			System.out.println(premiumGamer.getUserName()+" kullan�c�s� "+sales.name+" kampayas�na kat�ld�.");
		}
		
	}
	
	
	
	public void addMultiple(PremiumGamer premiumGamer,ArrayList<Campaigns> campaigns) {
		
		for (Campaigns campaign : campaigns) {
			add(premiumGamer,campaign);
		}
		
	}
		
	public void update(PremiumGamer premiumGamer, Sales sales) {
		
		if(PremiumGamerValidation.isSame(premiumGamer, sales)==true) {
			System.out.println(premiumGamer.getUserName()+" kullan�c�s� "+sales.name+" g�ncelledi.");
		}
		else {
			System.out.println(premiumGamer.getUserName()+" kullan�c�s� "+sales.name+" kampanyas�na sahip de�il.");
		}
		
	}

	public void delete(PremiumGamer premiumGamer, Sales sales) {
		
		if(PremiumGamerValidation.isSame(premiumGamer, sales)==true) {
			System.out.println(premiumGamer.getUserName()+" kullan�c�s� "+sales.name+" sildi.");
		}
		else {
			System.out.println(premiumGamer.getUserName()+" kullan�c�s� "+sales.name+" kampanyas�na sahip de�il.");
		}
	}

}
