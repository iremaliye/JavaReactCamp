package gameSat��Similasyon.SalesPages;

import gameSat��Similasyon.GamerPages.PremiumGamer;

public class PemiumGamerCheck {
	public static boolean isSame(PremiumGamer premiumGamer,Sales sales) {
		boolean value = false;
		
		for (Campaigns campaign : premiumGamer.getCampaigns()) {
			if(sales.name == campaign.name) {
				value=true;
			}
		}
		return value;
	}

}
