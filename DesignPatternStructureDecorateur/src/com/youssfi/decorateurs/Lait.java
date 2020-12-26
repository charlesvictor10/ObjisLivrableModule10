package com.youssfi.decorateurs;

import com.youssfi.ClasseAbstraite.Boisson;
import com.youssfi.ClasseAbstraite.DecorateurIngredient;

public class Lait extends DecorateurIngredient {

	public Lait(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String description() {
		return boisson.getDescription()+", Lait";
	}

	@Override
	public double count() {
		return 1.5 + boisson.count();
	}
}
