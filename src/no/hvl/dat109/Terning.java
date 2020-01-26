package no.hvl.dat109;

import java.util.Random;

public class Terning {
	
	private int verdi;

	public Terning() {
		this.verdi = 0;
	}
	
	public void trill() {
		verdi = new Random().nextInt(6) + 1;
	}

	public int getVerdi() {
		return verdi;
	}

	public void setVerdi(int verdi) {
		this.verdi = verdi;
	}
}
