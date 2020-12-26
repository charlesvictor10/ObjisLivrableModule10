package com.youssfi.ComposantsConcrets;

import com.youssfi.ClasseAbstraite.*;

public class Expresso extends Boisson {
	public Expresso() {
		description = "Expresso";
	}

	@Override
	public double count() {
		return 1.99;
	}
}
