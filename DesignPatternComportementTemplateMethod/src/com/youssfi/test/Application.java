package com.youssfi.test;

import com.youssfi.pm.Implementation1;
import com.youssfi.pm.Implementation2;
import com.youssfi.pm.TemplateClass;

public class Application {
	public static void main(String[] args) {
		TemplateClass t1 = new Implementation1();
		System.out.println(t1.operationTemplate());
		t1 = new Implementation2();
		System.out.println(t1.operationTemplate());
	}
}
