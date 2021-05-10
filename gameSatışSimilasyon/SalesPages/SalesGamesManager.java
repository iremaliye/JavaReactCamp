package gameSat��Similasyon.SalesPages;

public class SalesGamesManager {
	@Override
	public void add(Gamer gamer, Sales sales) {
		
		if(FreeGamerValidation.isSameGame(gamer, sales)==true) {
			System.out.println(gamer.getUserName()+" kullan�c�s� "+sales.name+" 'e zaten sahip.");
		}
		else {
			System.out.println(gamer.getUserName()+" kullan�c�s� "+sales.name+" sat�n ald�.");
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
			System.out.println(gamer.getUserName()+" kullan�c�s� "+sales.name+" 'e zaten sahip.");
		}
		else {
			System.out.println(gamer.getUserName()+" kullan�c�s� "+"%"+campaignRate+" indirimle "+sales.name+" sat�n ald�.");
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
			System.out.println(gamer.getUserName()+" kullan�c�s� "+sales.name+" g�ncelledi.");
		}
		else {
			System.out.println(gamer.getUserName()+" kullan�c�s� "+sales.name+" sahip de�il.");
		}
	}

	@Override
	public void delete(Gamer gamer, Sales sales) {
		// TODO Auto-generated method stub
		if(FreeGamerValidation.isSameGame(gamer, sales)==true) {
			System.out.println(gamer.getUserName()+" kullan�c�s� "+sales.name+" sildi.");
		}
		else {
			System.out.println(gamer.getUserName()+" kullan�c�s� "+sales.name+" sahip de�il.");
		}
	}


}
