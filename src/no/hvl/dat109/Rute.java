package no.hvl.dat109;

/**
 * @author Francis, Johann og Lasse
 *
 * En klasse for å representere en rute
 */
public class Rute {
	
	private int nummer;
	
	/**
	 * Oppretter et nytt rute-objekt
	 * 
	 * @param tall Tall som forteller hvilken rute det er
	 */
	public Rute(int nummer) {
		this.nummer = nummer;
	}

	/**
	 * @return Returnerer tallet til ruten
	 */
	public int getNummer() {
		return nummer;
	}

}
