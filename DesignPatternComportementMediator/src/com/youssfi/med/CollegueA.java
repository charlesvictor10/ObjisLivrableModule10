package com.youssfi.med;

public class CollegueA extends Collegue {

	public CollegueA(String name, Mediateur mediateur) {
		super(name, mediateur);
	}

	@Override
	public void envoyerMessage(Message m) {
		System.out.println("----------------------");
		System.out.println("Coll�gue nom="+name+", Envoi de message");
		m.setExpediteur(this.name); 
		mediateur.transmettreMessage(m);
		System.out.println("----------------------");
	}

	@Override
	public void recevoirMessage(Message m) {
		System.out.println("----------------------");
		System.out.println("Coll�gue nom="+name+", R�ception du message");
		System.out.println("From: "+m.getExpediteur());
		System.out.println("Contenu: "+m.getMessage());
		System.out.println("Traitement du message par ....."+this.name);
		System.out.println("-------------------");
	}

}
