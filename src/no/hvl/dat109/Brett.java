package no.hvl.dat109;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Francis, Johann og Lasse
 * 
 * En klasse for å representere et brett
 */
public class Brett {
	
	private List<Rute> ruter;
	
	/**
	 * Oppretter et nytt Brett-objekt med 100 ruter
	 */
	public Brett() {
		ruter = new ArrayList<Rute>();
		for (int i = 0; i < 100; i++) {
			ruter.add(new Rute(i));
		}
	}
	
	/**
	 * @param rute Nåværende rute som brikken står på
	 * @param verdi Verdien på terningen og antall plasser som brikken skal flyttes
	 * @return Returnerer den nye ruten som brikken skal flyttes til
	 */
	public Rute finnNyRute(Rute rute, int verdi) {
		int nyRute = rute.getTall() + verdi;
		if (nyRute <= 99) {
			return ruter.get(nyRute);	
		} else {
			return ruter.get(99);
		}
	}
	

	
	
}
