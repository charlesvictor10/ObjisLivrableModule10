package com.youssfi.impl;

public class ImplStandard implements Standard {

	@Override
	public void operation(int nb1, int nb2) {
		System.out.println("Standard, r�sultat est: "+nb1*nb2);
	}
}
