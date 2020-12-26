package com.youssfi.composition;

import com.youssfi.impl.ImplAdapter;
import com.youssfi.impl.Standard;

public class AdaptateurComposition implements Standard {
	private ImplAdapter adaptee = new ImplAdapter();
	
	@Override
	public void operation(int nb1, int nb2) {
		int nb = adaptee.operation2(nb1, nb2);
		adaptee.operation3(nb);
	}
}
