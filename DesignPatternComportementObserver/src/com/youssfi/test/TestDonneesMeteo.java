package com.youssfi.test;

import com.youssfi.Impl.AffichageConditions;
import com.youssfi.Impl.DonneesMeteo;

public class TestDonneesMeteo {

	public static void main(String[] args) {
		DonneesMeteo dm = new DonneesMeteo();
		AffichageConditions ac = new AffichageConditions(dm);
		dm.setMesures(22,65,1020);
		dm.setMesures(25,75,1000);
		dm.setMesures(23,30,1800);
	}
}
