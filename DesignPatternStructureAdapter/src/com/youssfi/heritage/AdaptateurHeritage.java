package com.youssfi.heritage;

import com.youssfi.impl.ImplAdapter;
import com.youssfi.impl.Standard;

public class AdaptateurHeritage extends ImplAdapter implements Standard {

	@Override
	public void operation(int nb1, int nb2) {
		int nb = operation2(nb1,nb2);
		operation3(nb);
	}
}
