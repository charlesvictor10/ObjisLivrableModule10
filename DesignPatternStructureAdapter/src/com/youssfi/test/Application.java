package com.youssfi.test;

import com.youssfi.composition.AdaptateurComposition;
import com.youssfi.heritage.AdaptateurHeritage;
import com.youssfi.impl.ImplStandard;
import com.youssfi.impl.Standard;

public class Application {
	public static void main(String[] args) {
		Standard standard = new ImplStandard();
		standard.operation(7, 9);
		Standard adaptee1 = new AdaptateurHeritage();
		adaptee1.operation(7, 9);
		Standard adaptee2 = new AdaptateurComposition();
		adaptee2.operation(7, 9);
	}
}
