package no.hvl.dat109;

/**
 * @author Francis, Johann og Lasse
 * 
 * En klasse for å representere en spiller.
 */
public class Spiller {
	
	private String navn;
	private Brikke brikke;
	
	
	/**
	 * Oppretter en ny spiller
	 * 
	 * @param navn Navnet på spilleren
	 * @param farge Farge på brikken tilhørende spilleren
	 */
	public Spiller(String navn, String farge) {
		this.navn = navn;
		this.brikke = new Brikke(farge);
	}
	
	
	/**
	 * Lar spiller trille en terning
	 * 
	 * @param terning Terningen som skal trilles
	 */
	public void trill(Terning terning) {
		terning.trill();
	}

	
	/**
	 * @return Returnerer navnet på spilleren
	 */
	public String getNavn() {
		return navn;
	}

	
	/**
	 * @return Returnerer brikken til spilleren
	 */
	public Brikke getBrikke() {
		return brikke;
	}
	
}
