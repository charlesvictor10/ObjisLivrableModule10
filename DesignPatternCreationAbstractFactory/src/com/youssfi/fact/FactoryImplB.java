package com.youssfi.fact;

import com.youssfi.dp.AbstractFactory;
import com.youssfi.dp.AbstractPlugin;
import com.youssfi.dp.PluginImplB;

public class FactoryImplB implements AbstractFactory {

	@Override
	public AbstractPlugin getInstence() {
		return new PluginImplB();
	}
}
