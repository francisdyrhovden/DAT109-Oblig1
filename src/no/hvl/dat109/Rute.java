package no.hvl.dat109;

/**
 * @author Francis, Johann og Lasse
 *
 * En klasse for å representere en rute
 */
public class Rute {
	
	private int nummer;
	private Slange slange;
	private Stige stige;
	
	/**
	 * Oppretter et nytt rute-objekt
	 * 
	 * @param tall Tall som forteller hvilken rute det er
	 */
	public Rute(int nummer) {
		this.nummer = nummer;
		this.slange = new Slange();
		this.stige = new Stige();
	}

	public int getNummer() {
		return nummer;
	}
	
	public Slange getSlange() {
		return slange;
	}
	
	public Stige getStige() {
		return stige;
	}

}
