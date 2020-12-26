package com.youssfi.test;

import com.youssfi.ClasseAbstraite.Boisson;
import com.youssfi.ComposantsConcrets.Colombia;
import com.youssfi.ComposantsConcrets.Expresso;
import com.youssfi.ComposantsConcrets.Sumatra;
import com.youssfi.decorateurs.Caramel;
import com.youssfi.decorateurs.Chocolat;
import com.youssfi.decorateurs.Lait;

public class ApplicationDecorateur {
	public static void main(String[] args) {
		Boisson b1 = new Expresso();
		System.out.println(b1.getDescription()+": "+b1.count()+" €");
		
		Boisson b2 = new Colombia();
		b2 = new Caramel(b2);
		b2 = new Chocolat(b2);
		System.out.println(b2.getDescription()+": "+b2.count()+" €");
		
		Boisson b3 = new Sumatra();
		b3 = new Caramel(b3);
		b3 = new Chocolat(b3);
		b3 = new Lait(b3);
		System.out.println(b3.getDescription()+": "+b3.count()+" €");
	} 
}
