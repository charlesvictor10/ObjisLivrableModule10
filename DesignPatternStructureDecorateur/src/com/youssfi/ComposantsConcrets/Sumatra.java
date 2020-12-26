package com.youssfi.ComposantsConcrets;

import com.youssfi.ClasseAbstraite.Boisson;

public class Sumatra extends Boisson {
	public Sumatra() {
		description = "Sumatra";
	}

	@Override
	public double count() {
		return 1.5;
	}
}
