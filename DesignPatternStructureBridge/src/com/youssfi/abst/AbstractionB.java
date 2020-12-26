package com.youssfi.abst;

import com.youssfi.impl.ImplementationInterface;

public class AbstractionB extends Abstraction {

	public AbstractionB(ImplementationInterface implementation) {
		super(implementation);
	}

	@Override
	public void operation() {
		System.out.println("Méthode opération de AbstractionB");
		operationImpl2(9);
		operationImpl2(5);
		operationImpl1("Z");
	}
}
