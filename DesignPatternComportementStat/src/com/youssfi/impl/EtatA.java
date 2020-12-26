package com.youssfi.impl;

public class EtatA extends Etat {

	public EtatA(ClasseAvecEtat classeAvecEtat) {
		super(classeAvecEtat);
	}

	@Override
	public void operationEtatA() {
		System.out.println("Classe d�j� dans l'�tat A");
	}

	@Override
	public void operationEtatB() {
		System.out.println("Changement d'�tat de A => B");
	}

	@Override
	public void operationEtatC() {
		System.out.println("Impossible de passer de A => C");
	}

	@Override
	public void doAction() {
		System.out.println("Etat courant: A");
	}

}
