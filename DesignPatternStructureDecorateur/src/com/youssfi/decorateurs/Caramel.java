package com.youssfi.decorateurs;

import com.youssfi.ClasseAbstraite.Boisson;
import com.youssfi.ClasseAbstraite.DecorateurIngredient;

public class Caramel extends DecorateurIngredient {

	public Caramel(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String description() {
		return boisson.getDescription()+", Caramel";
	}

	@Override
	public double count() {
		return 0.22 + boisson.count();
	}
}
