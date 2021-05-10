package gameSatýþSimilasyon.LoggerPages;

import java.util.ArrayList;
import GamerPages.Gamer;

public class EDevletLog {
	
	@Override
	public void log(Gamer gamer,ArrayList<String> personalInformations) {
		System.out.println(personalInformations+" bilgilerine sahip "+ gamer.getUserName()+" kullanýcýsý loglandý.");
		
	}
	

}
