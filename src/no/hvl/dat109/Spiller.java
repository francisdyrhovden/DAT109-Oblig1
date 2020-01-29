package no.hvl.dat109;

/**
 * @author Francis, Johann og Lasse
 * 
 *         En klasse for å representere en spiller.
 */
public class Spiller {

	private String navn;
	private Brikke brikke;
	private int seksere;
	private boolean flyttetTilbake;

	/**
	 * Oppretter en ny spiller
	 * 
	 * @param navn  Navnet på spilleren
	 * @param farge Farge på brikken tilhørende spilleren
	 */
	public Spiller(String navn, String farge) {
		this.navn = navn;
		this.brikke = new Brikke(farge);
		this.seksere = 0;
		this.flyttetTilbake = false;
	}

	/**
	 * Lar spiller spille sitt trekk.
	 * 
	 * @param terning Terningen som skal trilles
	 */
	public void spillTrekk(Terning terning, Brett brett) {

		terning.trill();
		int verdi = terning.getVerdi();

		if (flyttetTilbake) {
			erPåStart(verdi);
		} else {

			if (verdi == 6) {
				seksere++;
			} else {
				seksere = 0;
			}

			if (treSeksere()) {
				System.out.println("Du trilte tre seksere på rad og blir flyttet tilbake til start.");
				brikke.flyttTilStart(brett);
				seksere = 0;
				flyttetTilbake = true;
			} else {
				brikke.flytt(verdi, brett);
			}
		}
	}

	/**
	 * @return Returnerer navnet på spilleren
	 */
	public String getNavn() {
		return navn;
	}

	/**
	 * @return Returnerer rutenummer til brikken til spilleren
	 */
	public int getRuteNr() {
		return brikke.getPlass().getNummer() + 1;
	}

	/**
	 * Sjekker om spilleren har trilt tre seksere på rad.
	 * 
	 * @return Returnerer true hvis spilleren har trilt tre seksere på rad.
	 */
	public boolean treSeksere() {
		return seksere == 3;
	}
	
	/**
	 * En metode for spesialtilfelle når spilleren har trilt tre seksere og blitt flyttet tilbake til start.
	 * Spilleren må trille en sekser for å kunne fortsette spillet.
	 * 
	 * @param verdi Verdien på terningen som trilles.
	 */
	public void erPåStart(int verdi) {
		if (verdi == 6) {
			flyttetTilbake = false;
			System.out.println("Du kan nå trille som normalt fra neste runde.");
		} else {
			System.out.println("Du må trille en sekser for å komme igang igjen.");
		}
	}
}
