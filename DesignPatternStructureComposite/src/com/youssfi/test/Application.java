package com.youssfi.test;

import com.youssfi.composite.Composite;
import com.youssfi.element.Element;

public class Application {
	public static void main(String[] args) {
		Composite racine = new Composite("Composite 1");
		Composite composite2 = new Composite("Composite 2");
		racine.add(composite2);
		racine.add(new Element("El�ment 11"));
		racine.add(new Element("El�ment 12"));
		racine.add(new Element("El�ment 13"));
		composite2.add(new Element("El�ment 21"));
		composite2.add(new Element("El�ment 22"));
		racine.operation();
	}
}
