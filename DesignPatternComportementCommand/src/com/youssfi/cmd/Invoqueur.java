package com.youssfi.cmd;

import java.util.HashMap;
import java.util.Map;

public class Invoqueur {
	private Map<String, Commande> commandes = new HashMap<String, Commande>();
	
	public void addCommande(String cmdName, Commande cmd) {
		commandes.put(cmdName, cmd);
	}
	
	public void invoquer(String cmdName) {
		Commande cmd = commandes.get(cmdName);
		if(cmd != null)
			cmd.executer();
	}
}
