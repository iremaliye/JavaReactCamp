package eTicaretSistemi.entities.concretes;

import eTicaretSistemi.entities.abstracts.Entity;

public class Insider implements Entity {
	private String name;
	private String surname;
	private String password;
	private String email;
	private boolean clicked;
	
	
	public Insider(String name, String surname, String password, String email, boolean clicked) {
		super();
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.email = email;
		this.clicked = clicked;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isClicked() {
		return clicked;
	}


	public void setClicked(boolean clicked) {
		this.clicked = clicked;
	}


	@Override
	public boolean clicked() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

}
