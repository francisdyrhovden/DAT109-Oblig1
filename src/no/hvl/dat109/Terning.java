package no.hvl.dat109;

import java.util.Random;

/**
 * @author Francis
 *
 * En klasse for å representere en terning
 */
public class Terning {
	
	private int verdi;

	/**
	 * Oppretter et nytt terning-objekt
	 */
	public Terning() {
		this.verdi = 0;
	}
	
	/**
	 * Triller terningen og gir den ny verdi
	 */
	public void trill() {
		verdi = new Random().nextInt(6) + 1;
	}

	/**
	 * @return Returnerer verdien til terningen
	 */
	public int getVerdi() {
		return verdi;
	}
}
