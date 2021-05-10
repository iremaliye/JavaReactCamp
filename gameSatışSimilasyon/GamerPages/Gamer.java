package gameSat��Similasyon.GamerPages;

import gameSat��Similasyon.ArrayList;
import gameSat��Similasyon.SalesPages.Games;

public class Gamer {
	int id;
	String userName;
	String password;
	String email;
	int level;
	double xp;
	
	ArrayList<Games> games;
	
	
	
	public Gamer(int id, String userName, String password, String email, int level, double xp) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.level = level;
		this.xp = xp;
	}
	
	public String getUserName() {
		return userName;
	}



	public String getPassword() {
		return password;
	}



	public String getEmail() {
		return email;
	}



	public int getLevel() {
		return level;
	}



	public double getXp() {
		return xp;
	}



	public ArrayList<Games> getGames() {
		return Gamer;
	}

	

}
