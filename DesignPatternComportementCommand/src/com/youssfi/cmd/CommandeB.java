package com.youssfi.cmd;

public class CommandeB implements Commande {
	private Recepteur recepteur;
		
	public CommandeB(Recepteur recepteur) {
		super();
		this.recepteur = recepteur;
	}

	@Override
	public void executer() {
		recepteur.action2();
	}
}
