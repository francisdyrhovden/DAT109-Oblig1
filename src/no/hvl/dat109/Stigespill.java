package no.hvl.dat109;

import java.util.Scanner;


/**
 * @author Francis, Johann og Lasse
 * 
 *	En simulering av et stigespill
 */
public class Stigespill {

	private final static int WINPOINT = 99;

	private Terning terning;
	private Brett brett;
	private Spiller[] spillere;
	private Spiller vinner;

	
	/**
	 * Oppretter et nytt stigespill objekt 
	 */
	public Stigespill() {
		this.terning = new Terning();
		this.brett = new Brett();
		this.vinner = null;
	}

	
	/**
	 * Starter selve spillet 
	 */
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Spillet er klar til å starte.\n Skriv inn antall spillere (2-4)");
		int antall = sc.nextInt();
		spillere = new Spiller[antall];
		
		for (int i = 0; i < spillere.length; i++) {
			System.out.println("Skriv inn navn for spiller " + (i+1));
			String navn = sc.next();
			System.out.println("Skriv inn farge på brikke for spiller " + (i+1));
			String farge = sc.next();
			spillere[i] = new Spiller(navn,farge);
		}
		sc.close();

		while (vinner == null) {
			spillRunde();
		}
		System.out.println(vinner.getNavn() + " har vunnet");
	}

	/**
	 * Starter en ny runde i spillet
	 */
	public void spillRunde() {
		
		for (Spiller s : spillere) {
			System.out.println(s.getNavn() + " sin tur. Trykk enter for å trille");
			try {
				System.in.read();
			} catch(Exception e) {
			}
			s.trill(terning);
			Rute rute = s.getBrikke().getPlass();
			System.out.println(s.getNavn() + " var på rute nr: " + rute.getTall());
			int verdi = terning.getVerdi();
			System.out.println(s.getNavn() + " trilte: " + verdi);
			if (rute.getTall() + verdi >= WINPOINT) {
				vinner = s;
				break;
			}
			Rute nyRute = brett.finnNyRute(rute, verdi);
			s.getBrikke().setPlass(nyRute);
			System.out.println(s.getNavn() + " står nå på rute nr: " + s.getBrikke().getPlass().getTall() + "\n");
			
		}

	}
}
