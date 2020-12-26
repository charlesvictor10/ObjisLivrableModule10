package com.youssfi.impl;

public class ImplementationB implements ImplementationInterface {

	@Override
	public void operationImpl1(String p) {
		System.out.println("OperationImpl1 de ImplementationB: "+p);
	}

	@Override
	public void operationImpl2(int p) {
		System.out.println("OperationImpl2 de ImplementationB: "+p);
	}
}
