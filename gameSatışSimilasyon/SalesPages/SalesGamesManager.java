package gameSatýþSimilasyon.SalesPages;

public class SalesGamesManager {
	@Override
	public void add(Gamer gamer, Sales sales) {
		
		if(FreeGamerValidation.isSameGame(gamer, sales)==true) {
			System.out.println(gamer.getUserName()+" kullanýcýsý "+sales.name+" 'e zaten sahip.");
		}
		else {
			System.out.println(gamer.getUserName()+" kullanýcýsý "+sales.name+" satýn aldý.");
		}
			
	}

	
	public void addMultiple(Gamer gamer,ArrayList<Games> games) {
		
		for (Games game : games) {
			add(gamer,game);
		}
		
	}
	
	
	public void add(Gamer gamer, Sales sales,double campaignRate) {
		// TODO Auto-generated method stub
		;
		if(FreeGamerValidation.isSameGame(gamer, sales)==true) {
			System.out.println(gamer.getUserName()+" kullanýcýsý "+sales.name+" 'e zaten sahip.");
		}
		else {
			System.out.println(gamer.getUserName()+" kullanýcýsý "+"%"+campaignRate+" indirimle "+sales.name+" satýn aldý.");
		}
	}
	
	
	public void addMultipleWithCampaign(Gamer gamer,ArrayList<Games> games,double campaignRate) {
		
		for (Games game : games) {
			add(gamer,game,campaignRate);
		}
		
	}

	@Override
	public void update(Gamer gamer, Sales sales) {
		// TODO Auto-generated method stub
		
		if(FreeGamerValidation.isSameGame(gamer, sales)==true) {
			System.out.println(gamer.getUserName()+" kullanýcýsý "+sales.name+" güncelledi.");
		}
		else {
			System.out.println(gamer.getUserName()+" kullanýcýsý "+sales.name+" sahip deðil.");
		}
	}

	@Override
	public void delete(Gamer gamer, Sales sales) {
		// TODO Auto-generated method stub
		if(FreeGamerValidation.isSameGame(gamer, sales)==true) {
			System.out.println(gamer.getUserName()+" kullanýcýsý "+sales.name+" sildi.");
		}
		else {
			System.out.println(gamer.getUserName()+" kullanýcýsý "+sales.name+" sahip deðil.");
		}
	}


}
