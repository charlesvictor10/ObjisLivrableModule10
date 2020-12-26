package com.youssfi.cmd;

public class CommandeA implements Commande {
	private Recepteur recepteur; 
		
	public CommandeA(Recepteur recepteur) {
		super();
		this.recepteur = recepteur;
	}

	@Override
	public void executer() {
		recepteur.action1();
	}
}
