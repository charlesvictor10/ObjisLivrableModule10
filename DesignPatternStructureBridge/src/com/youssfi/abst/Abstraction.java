package com.youssfi.abst;

import com.youssfi.impl.ImplementationInterface;

public abstract class Abstraction {
	private ImplementationInterface implementation;
	
	public void operationImpl1(String p) {
		implementation.operationImpl1(p);
	}
	
	public void operationImpl2(int p) {
		implementation.operationImpl2(p);
	}
	
	public Abstraction(ImplementationInterface implementation) {
		this.implementation = implementation;
	}
	
	public abstract void operation();
}
