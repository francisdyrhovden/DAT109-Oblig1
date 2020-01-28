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
	 * Lar spiller spille sitt trekk.
	 * 
	 * @param terning Terningen som skal trilles
	 */
	public void spillTrekk(Terning terning, Brett brett) {
		terning.trill();
		int verdi = terning.getVerdi();
		brikke.flytt(verdi, brett);
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
	
	
	/**
	 * @return Returnerer rutenummer til brikken til spilleren
	 */
	public int getRuteNr() {
		return brikke.getPlass().getNummer()+1;
	}	
}
