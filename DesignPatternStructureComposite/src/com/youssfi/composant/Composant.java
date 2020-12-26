package com.youssfi.composant;

public abstract class Composant {
	protected String nom;
	public int level;
	
	public Composant(String nom) {
		this.nom = nom;
	}
	
	public abstract void operation();
}
