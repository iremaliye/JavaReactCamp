package gameSatýþSimilasyon.SalesPages;

public class FreeGamerCheck {
	Gamer gamer;
	
	public static boolean isSameGame(Gamer gamer,Sales sales) {
		boolean value = false;
		
		for (Games game : gamer.getGames()) {
			if(sales.name == game.name) {
				value=true;
			}
		}
		return value;
	}


}
