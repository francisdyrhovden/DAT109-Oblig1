package no.hvl.dat109;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Francis, Johann og Lasse
 * 
 *         En klasse for å representere et brett
 */
public class Brett {

	private List<Rute> ruter;

	/**
	 * Oppretter et nytt Brett-objekt med 100 ruter med slanger og stiger.
	 */
	public Brett() {
		ruter = new ArrayList<Rute>();
		for (int i = 0; i < 100; i++) {
			ruter.add(new Rute(i));
		}

		// Slanger
		ruter.get(98).getSlange().setLengde(21);
		ruter.get(94).getSlange().setLengde(20);
		ruter.get(92).getSlange().setLengde(20);
		ruter.get(86).getSlange().setLengde(63);
		ruter.get(63).getSlange().setLengde(4);
		ruter.get(61).getSlange().setLengde(43);
		ruter.get(53).getSlange().setLengde(20);
		ruter.get(16).getSlange().setLengde(10);

		// Stiger
		ruter.get(3).getStige().setLengde(10);
		ruter.get(8).getStige().setLengde(22);
		ruter.get(19).getStige().setLengde(18);
		ruter.get(27).getStige().setLengde(57);
		ruter.get(39).getStige().setLengde(19);
		ruter.get(50).getStige().setLengde(16);
		ruter.get(62).getStige().setLengde(18);
		ruter.get(70).getStige().setLengde(20);
	}

	/**
	 * Velger den nye ruten som brikken skal flyttes til.
	 * 
	 * @param rute  Nåværende rute som brikken står på
	 * @param verdi Verdien på terningen og antall plasser som brikken skal flyttes
	 * @return Returnerer den nye ruten som brikken skal flyttes til.
	 */
	public Rute finnNyRute(Rute rute, int verdi) {
		int nyRute = rute.getNummer() + verdi;

		if (nyRute > 99) {
			return rute;
		} else {

			if (ruter.get(nyRute).getSlange().getLengde() > 0) {
				nyRute -= ruter.get(nyRute).getSlange().getLengde();
				System.out.println("DU LANDET PÅ EN SLANGE");
			} else if (ruter.get(nyRute).getStige().getLengde() > 0) {
				nyRute += ruter.get(nyRute).getStige().getLengde();
				System.out.println("DU LANDET PÅ EN STIGE");
			}
			return ruter.get(nyRute);
		}
	}

	/**
	 * Gir oss første ruten på brettet.
	 * 
	 * @return Returnerer første ruten på brettet.
	 */
	public Rute getStart() {
		return ruter.get(0);
	}

}
