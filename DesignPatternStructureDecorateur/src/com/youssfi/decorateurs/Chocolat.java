package com.youssfi.decorateurs;

import com.youssfi.ClasseAbstraite.Boisson;
import com.youssfi.ClasseAbstraite.DecorateurIngredient;

public class Chocolat extends DecorateurIngredient {

	public Chocolat(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String description() {
		return boisson.getDescription()+", Chocolat";
	}

	@Override
	public double count() {
		return 0.20 + boisson.count();
	}	
}
