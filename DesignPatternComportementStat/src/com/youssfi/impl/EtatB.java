package com.youssfi.impl;

public class EtatB extends Etat {

	public EtatB(ClasseAvecEtat classeAvecEtat) {
		super(classeAvecEtat);
	}

	@Override
	public void operationEtatA() {
		System.out.println("Pas de possibilit� de passer de B vers A");
	}

	@Override
	public void operationEtatB() {
		System.out.println("D�j� dans l'�tat B");
	}

	@Override
	public void operationEtatC() {
		classeAvecEtat.setEtat(new EtatC(classeAvecEtat));
		System.out.println("Changement d'�tat de B vers C");
	}

	@Override
	public void doAction() {
		System.out.println("Etat courant: B");
	}
}
