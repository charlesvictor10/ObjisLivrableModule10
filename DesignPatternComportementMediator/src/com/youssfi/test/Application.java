package com.youssfi.test;

import com.youssfi.med.Collegue;
import com.youssfi.med.CollegueA;
import com.youssfi.med.CollegueB;
import com.youssfi.med.MediateurImpl1;
import com.youssfi.med.Message;

public class Application {
	public static void main(String[] args) {
		MediateurImpl1 mediateur = new MediateurImpl1();
		Collegue a1 = new CollegueA("C1", mediateur);
		Collegue a2 = new CollegueA("C2", mediateur);
		Collegue b1 = new CollegueB("C3", mediateur);
		a1.envoyerMessage(new Message("je suis à 20m", "C2"));
		a2.envoyerMessage(new Message("Je suis à 300m", "C1"));
		b1.recevoirMessage(new Message("Message bien reçu", "C3"));
	}
}
