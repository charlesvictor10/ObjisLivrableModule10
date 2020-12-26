package com.youssfi.Impl;

import java.util.Observable;
import java.util.Observer;

public class AffichageConditions implements Observer, Affichage {
	Observable sujet;
	private float temperature;
	private float humidite;
	
	public AffichageConditions(Observable obs){
		this.sujet = obs;
		sujet.addObserver(this);
	}

	public void update(Observable obs, Object arg) {
		if(obs instanceof DonneesMeteo){
			DonneesMeteo dm=(DonneesMeteo)obs;
			this.temperature=dm.getTemperature();
			this.humidite=dm.getHumidite();
			afficher();
		}
	}
	
	public void afficher() {
		System.out.println("Conditions actuelles:"+temperature+" degès et "+humidite+" % d'hmidité");
	}
}
