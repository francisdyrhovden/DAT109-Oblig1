package no.hvl.dat109;

import java.util.ArrayList;
import java.util.List;

public class Brett {
	
	private List<Rute> ruter;
	
	public Brett() {
		ruter = new ArrayList<Rute>();
		for (int i = 0; i < 100; i++) {
			ruter.add(new Rute(i));
		}
	}
	
	public Rute finnNyRute(Rute rute, int verdi) {
		int nyRute = rute.getTall() + verdi;
		return ruter.get(nyRute);
	}
	

	
	
}
