package com.youssfi.abst;

import com.youssfi.impl.ImplementationInterface;

public class AbstractionA extends Abstraction {
	public AbstractionA(ImplementationInterface implementation) {
		super(implementation);
	}

	@Override
	public void operation() {
		System.out.println("Méthode opération de AbstractionA");
		operationImpl1("X");
		operationImpl2(5);
		operationImpl1("Y");
	}
}
