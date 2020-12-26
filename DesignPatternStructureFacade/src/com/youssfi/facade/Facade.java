package com.youssfi.facade;

import com.youssfi.classe.ClasseA;
import com.youssfi.classe.ClasseB;

public class Facade {
	private ClasseA a = new ClasseA();
	private ClasseB b = new ClasseB();
	
	public void operation2() {
		System.out.println("Opération 2 de Facade:");
		a.operation2();
	}
	
	public void operation41() {
		System.out.println("Opération 41 de Facade:");
		b.operation4();
		a.operation1();
	}
}
