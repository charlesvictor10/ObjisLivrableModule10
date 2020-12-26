package com.youssfi.test;

import com.youssfi.dpcs.Context;
import com.youssfi.impl.StrategyImpl1;
import com.youssfi.impl.StrategyImpl2;

public class Application {
	public static void main(String[] args) {
		Context ctx = new Context();
		System.out.println("Strategy 1:");
		ctx.setStrategy(new StrategyImpl1());
		ctx.appliquerStrategy();
		System.out.println("Strategy 2:");
		ctx.setStrategy(new StrategyImpl2());
		ctx.appliquerStrategy();
	}
}
