package com.youssfi.test;

import com.youssfi.abstra.Abstraction;
import com.youssfi.proxy.Proxy;

public class Client {
	public static void main(String[] args) {
		Abstraction proxy = new Proxy();
		proxy.operation();
	}
}
