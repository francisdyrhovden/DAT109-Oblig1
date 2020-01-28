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
		ruter.get(98).getSlange().setLengde(21);
		ruter.get(94).getSlange().setLengde(20);
		ruter.get(92).getSlange().setLengde(20);
		ruter.get(86).getSlange().setLengde(63);
		ruter.get(63).getSlange().setLengde(4);
		ruter.get(61).getSlange().setLengde(43);
		ruter.get(53).getSlange().setLengde(20);
		ruter.get(16).getSlange().setLengde(10);
	}
	
	/**
	 * @param rute Nåværende rute som brikken står på
	 * @param verdi Verdien på terningen og antall plasser som brikken skal flyttes
	 * @return Returnerer den nye ruten som brikken skal flyttes til
	 */
	public Rute finnNyRute(Rute rute, int verdi) {
		int nyRute = rute.getNummer() + verdi;
		
		if (rute.getSlange().getLengde() > 0) {
			nyRute -= rute.getSlange().getLengde();
			System.err.println("DU LANDET PÅ EN SLANGE");
		}
		
		if (nyRute <= 99) {
			return ruter.get(nyRute);	
		} else {
			return ruter.get(99);
		}
	}
	

	
	
}
