package com.youssfi.fact;

import com.youssfi.dp.AbstractFactory;
import com.youssfi.dp.AbstractPlugin;
import com.youssfi.dp.PluginImplA;

public class FactoryImplA implements AbstractFactory {

	@Override
	public AbstractPlugin getInstence() {
		return new PluginImplA();
	}
}
