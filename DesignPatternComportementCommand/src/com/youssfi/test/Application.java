package com.youssfi.test;


import com.youssfi.cmd.CommandeA;
import com.youssfi.cmd.CommandeB;
import com.youssfi.cmd.Invoqueur;
import com.youssfi.cmd.Recepteur;

public class Application {
	public static void main(String[] args) {
		Recepteur rec = new Recepteur();
		CommandeA commandeA = new CommandeA(rec);
		CommandeB commandeB = new CommandeB(rec);
		
		Invoqueur invoqueur = new Invoqueur();
		invoqueur.addCommande("CA", commandeA);
		invoqueur.addCommande("CB", commandeB);
		
		invoqueur.invoquer("CA");
		invoqueur.invoquer("CB");
		invoqueur.invoquer("CC");
	}
}
