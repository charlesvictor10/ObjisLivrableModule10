package com.youssfi.Impl;

import java.util.Observable;

public class DonneesMeteo extends Observable {
	private float temperature;
	private float humidite;
	private float pression;
	
	public DonneesMeteo(){
	}

	public float getHumidite() {
		return humidite;
	}
	
	public void actualiserMesures() {
		setChanged();
		notifyObservers();
	}
	
	public void setMesures(float t, float h, float p) {
		this.temperature = t;
		this.humidite = h;
		this.pression = p;
		actualiserMesures();
	}
	
	public float getPression() {
		return pression;
	}
	
	public float getTemperature() {
		return temperature;
	}
}
