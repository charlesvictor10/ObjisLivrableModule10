package com.youssfi.element;

import com.youssfi.composant.Composant;

public class Element extends Composant {

	public Element(String nom) {
		super(nom);
	}

	@Override
	public void operation() {
		String tab = "";
		for(int i = 0; i < level; i++) 
			tab += "--";
		System.out.println(tab+"Opération sur l'élément ("+nom+")");
	}
}
