package no.hvl.dat109;

/**
 * @author Francis, Johann og Lasse
 * 
 * En klasse for å representere en spiller.
 */
public class Spiller {
	
	private String navn;
	private Brikke brikke;
	private int seksere;
	
	
	/**
	 * Oppretter en ny spiller
	 * 
	 * @param navn Navnet på spilleren
	 * @param farge Farge på brikken tilhørende spilleren
	 */
	public Spiller(String navn, String farge) {
		this.navn = navn;
		this.brikke = new Brikke(farge);
		this.seksere = 0;
	}
	
	
	/**
	 * Lar spiller spille sitt trekk.
	 * 
	 * @param terning Terningen som skal trilles
	 */
	public void spillTrekk(Terning terning, Brett brett) {
		terning.trill();
		int verdi = terning.getVerdi();
		if (verdi == 6) {
			seksere++;
		}
		
		if (seksere == 3) {
			System.out.println("Du trilte tre seksere på rad og blir flyttet tilbake til start.");
			brikke.flyttTilStart(brett);
		} else {			
			brikke.flytt(verdi, brett);
		}
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
