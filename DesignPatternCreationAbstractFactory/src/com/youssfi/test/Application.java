package com.youssfi.test;

import com.youssfi.dp.AbstractFactory;
import com.youssfi.dp.AbstractPlugin;
import com.youssfi.fact.FactoryImplA;

public class Application {

	public static void main(String[] args) throws Exception {
		// Instanciation statique de la fabrique
		AbstractFactory factory=new FactoryImplA();
		AbstractPlugin plugin=factory.getInstence();
		plugin.traitement();
		// Instanciation dynamique de la fabrique
		factory =(AbstractFactory) Class.forName("com.youssfi.fact.FactoryImplB").newInstance();
		plugin=factory.getInstence();
		plugin.traitement();
	}
}
