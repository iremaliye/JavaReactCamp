package gameSat��Similasyon;

import java.util.ArrayList;

import gameSat��Similasyon.GamerPages.FreeGamer;
import gameSat��Similasyon.GamerPages.FreeGamerManager;
import gameSat��Similasyon.LoggerPages.EDevletLog;
import gameSat��Similasyon.SalesPages.Campaigns;
import gameSat��Similasyon.SalesPages.Games;
import gameSat��Similasyon.SalesPages.SalesGamesManager;
import gameSat��Similasyon.SalesPages.SalesManagerCampaigns;

public class Main {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		
		public static void main(String[] args) {
			
			Games CallofDuty = new Games(" Call of Duty",50);
			Games SniperElite4 = new Games("Sniper Elite 4",90);
			Games Battlefield= new Games("Battlefield",70);
			Games CounterStrike = new Games("Counter Strike",40);
			Games Mafia3 = new Games("Mafia3",60);
			Games GTA5 = new Games("GTA5",120);
			Games Pubg = new Games("Pubg",20);
			Games Dirt4 = new Games("Dirt4",45);
			
			
			
			
			ArrayList<Games> open = new ArrayList<Games>();
			open.add(Pubg);
			open.add(Dirt4);
			open.add(GTA5);
			open.add(Mafia3);
			
			ArrayList<Games> close = new ArrayList<Games>();
			close.add(GTA5);
			close.add(CounterStrike);
			close.add(Mafia3);
			
			ArrayList<Games> rolePlay = new ArrayList<Games>();
			rolePlay.add(CallofDuty);
			rolePlay.add(Pubg);
			
			ArrayList<Games> combined = new ArrayList<Games>();
			combined.add(GTA5);
			combined.add(Battlefield);
			combined.add(SniperElite4);
			
			ArrayList<String> edevletInformationsirem = new ArrayList<String>();
			edevletInformationsirem.add("12345678901");
			edevletInformationsirem.add("�rem Aliye");
			edevletInformationsirem.add("Akman");
			edevletInformationsirem.add("26/08/2001");
			
			ArrayList<String> edevletInformationsfatma = new ArrayList<String>();
			edevletInformationsfatma.add("23456789100");
			edevletInformationsfatma.add("Fatma");
			edevletInformationsfatma.add("Demir");
			edevletInformationsfatma.add("20/10/2003");
			
			ArrayList<String> edevletInformationsesma = new ArrayList<String>();
			edevletInformationsesma.add("45785926546");
			edevletInformationsesma.add("Esma");
			edevletInformationsesma.add("�zt�rk");
			edevletInformationsesma.add("01/02/1995");
			
			ArrayList<String> edevletInformationsseda = new ArrayList<String>();
			edevletInformationsseda.add("26154869257");
			edevletInformationsseda.add("seda");
			edevletInformationsseda.add("Akman");
			edevletInformationsseda.add("04/07/1992");
			

			
			Campaigns yaz�l�m = new Campaigns("Yaz�l�m M�hendisleri G�n�",60);
			Campaigns  bilgisayar= new Campaigns("bilgisayar M�hendisleri G�n�",40);
			Campaigns yaz = new Campaigns("Yaz �ndirimi",20);
			Campaigns k�� = new Campaigns("K�� �ndirimi",35);
		
			
			ArrayList<Campaigns> seasonCampaigns = new ArrayList<Campaigns>();
			seasonCampaigns.add(yaz�l�m);
			seasonCampaigns.add(bilgisayar);
			
			ArrayList<Campaigns> specialCampaigns = new ArrayList<Campaigns>();
			specialCampaigns.add(yaz);
			specialCampaigns.add(k��);
			
			FreeGamer irem = new FreeGamer("Dobby","irem123","irem@gmail.com",50,50.789,open);
			FreeGamer fatma = new FreeGamer("King","fatma123","fatma@gmail.com",23,23.567,close);
			
		
			FreeGamerManager freeGamerManager = new FreeGamerManager();
			
			
			System.out.println("Free Kullan�c� Dobby'e ait  i�lemler : ");
			
			freeGamerManager.addGamer(irem);
			freeGamerManager.deleteGamer(irem);
			freeGamerManager.updateGamer(irem);
			
			System.out.println("\n");
			System.out.println("Free Kullan�c� King'e ait  i�lemler : ");
			
			freeGamerManager.addGamer(fatma);
			freeGamerManager.deleteGamer(fatma);
			freeGamerManager.updateGamer(fatma);
			
			
			System.out.println("\n");
			System.out.println("Free Kullan�c�lar i�in loglama : ");
			
			freeGamerManager.log(irem,new EDevletLog(), edevletInformationsirem);
			freeGamerManager.log(fatma,new EDevletLog(), edevletInformationsfatma);
			
			
			PremiumGamer esma = new PremiumGamer("Gamer","12345","esma@gmail.com",45,8534.2,rolePlay,seasonCampaigns);
			PremiumGamer seda = new PremiumGamer("Pro","002233","seda@gmail.com",88,8534.2,combined,specialCampaigns);
			
			PemiumGamerCheck premiumGamerManager = new PemiumGamerCheck();
			
			System.out.println("\n");
			System.out.println("Premium Kullan�c� Gamer'a ait  i�lemler : ");
			
			premiumGamerManager.addGamer(esma);
			premiumGamerManager.deleteGamer(esma);
			premiumGamerManager.updateGamer(esma);
			
			System.out.println("\n");
			System.out.println("Premium Kullan�c� Pro'ya ait  i�lemler : ");
			
			premiumGamerManager.addGamer(seda);
			premiumGamerManager.deleteGamer(seda);
			premiumGamerManager.updateGamer(seda);
			
			
			System.out.println("\n");
			System.out.println("Premium Kullan�c�lara ait loglama i�lemleri : ");
			
			premiumGamerManager.log(esma,new EDevletLog(), edevletInformationsesma);
			premiumGamerManager.log(esma,new EDevletLog(), edevletInformationsseda);
			
			
			SalesGamesManager sellGame = new SalesGamesManager();
			
			System.out.println("\n");
			System.out.println("Free Kullan�c� Dobby'e ait Oyun ��lemleri : ");
			
			sellGame.add(irem,Pubg);
			sellGame.delete(irem,Pubg); 
			sellGame.update(irem,CounterStrike);
			
			sellGame.addMultiple(irem, combined);
			
			System.out.println("\n");
			System.out.println("Free Kullan�c� King'e ait Oyun ��lemleri : ");
			
			sellGame.add(fatma,GTA5);
			sellGame.delete(fatma, GTA5); 
			sellGame.update(fatma, GTA5);

			
			System.out.println("\n");
			System.out.println("Premium Kullan�c� Gamer'a ait Oyun ��lemleri : ");
		
			sellGame.add(esma, Pubg,esma.getCampaigns().get(1).getCampaingRate());
			sellGame.delete(esma, Pubg); 
			sellGame.update(esma, Pubg);
			
			System.out.println("\n");
			System.out.println("Premium Kullan�c� Pro'ya ait Oyun ��lemleri : ");
			
			sellGame.add(seda, GTA5,seda.getCampaigns().get(0).getCampaingRate());
			sellGame.delete(seda,Mafia3); 
			sellGame.update(seda, Dirt4);
			
			
			sellGame.addMultipleWithCampaign(seda, close, seda.getCampaigns().get(1).getCampaingRate());
			
			
			SalesManagerCampaigns salesManagerCampaigns = new SalesManagerCampaigns();
			
			System.out.println("\n");
			System.out.println("Premium Kullan�c� Gamer Kampanya ��lemleri : ");
			
			salesManagerCampaigns.add(esma,yaz);
			salesManagerCampaigns.update(esma,yaz );
			salesManagerCampaigns.delete(esma, yaz);
			
			
			salesManagerCampaigns.addMultiple(esma, specialCampaigns);
			
			System.out.println("\n");
			System.out.println("Premium Kullan�c� Pro Kampanya ��lemleri : ");
			
			salesManagerCampaigns.add(seda, k��);
			salesManagerCampaigns.update(seda, k��);
			salesManagerCampaigns.delete(seda, k��);
		

	}

}
