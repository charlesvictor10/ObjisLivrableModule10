package com.youssfi.proxy;

import com.youssfi.abstra.Abstraction;
import com.youssfi.impl.Implementation;

public class Proxy implements Abstraction {
	private Implementation implementation;
	
	@Override
	public void operation() {
		System.out.println("V�rification des conditions d'acc�s par le proxy");
		implementation = new Implementation();
		implementation.operation();
	}
}
