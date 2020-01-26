package no.hvl.dat109;

/**
 * @author Francis, Johann og Lasse
 *
 * En klasse for å representere en brikke
 */
public class Brikke {

	private String farge;
	private Rute rute;
	
	/**
	 * Oppretter en ny brikke
	 * 
	 * @param farge Angir fargen som brikken skal ha
	 */
	public Brikke(String farge) {
		this.farge = farge;
		this.rute = new Rute(0);
	}

	/**
	 * @return Returnerer fargen til brikken
	 */
	public String getFarge() {
		return farge;
	}

	/**
	 * @return Returnerer ruten som brikken står på
	 */
	public Rute getPlass() {
		return rute;
	}

	/**
	 * @param rute Angir ruten som brikken skal stå på
	 */
	public void setPlass(Rute rute) {
		this.rute = rute;
	}
	
}
