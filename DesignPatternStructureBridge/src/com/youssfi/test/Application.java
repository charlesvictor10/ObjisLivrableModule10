package com.youssfi.test;

import com.youssfi.abst.Abstraction;
import com.youssfi.abst.AbstractionA;
import com.youssfi.abst.AbstractionB;
import com.youssfi.impl.ImplementationA;
import com.youssfi.impl.ImplementationB;
import com.youssfi.impl.ImplementationInterface;

public class Application {
	public static void main(String[] args) {
		ImplementationInterface implA = new ImplementationA();
		ImplementationInterface implB = new ImplementationB();
		Abstraction absAA = new AbstractionA(implA);
		Abstraction absAB = new AbstractionA(implB);
		Abstraction absBA = new AbstractionB(implA);
		Abstraction absBB = new AbstractionB(implB);
		System.out.println("---------------------------");
		absAA.operation();
		System.out.println("---------------------------");
		absAB.operation();
		System.out.println("---------------------------");
		absBA.operation();
		System.out.println("---------------------------");
		absBB.operation();
	}
}
