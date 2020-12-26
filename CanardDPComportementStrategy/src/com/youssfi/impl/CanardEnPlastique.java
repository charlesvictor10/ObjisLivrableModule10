package com.youssfi.impl;

public class CanardEnPlastique extends Canard {
	public CanardEnPlastique() {
		comportementCancan = new CancanMuet();
		comportementVol = new NePasVoler();
	}
	
	@Override
	public void afficher() {
		System.out.println("Je suis un canard en plastique");
	}
}
