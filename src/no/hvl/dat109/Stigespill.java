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
	 * Velger antall spillere og gjør de klar for spillet.
	 */
	public void setup() {
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
	}

	
	/**
	 * Starter selve spillet 
	 */
	public void spill() {
		setup();
		System.out.println("\n-------------------- SPILLET STARTER -------------------------------\n");

		while (vinner == null) {
			spillRunde();
		}
		System.out.println("\n" + vinner.getNavn() + " har vunnet.");
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
			s.spillTrekk(terning, brett);
			System.out.println(s.getNavn() + " trilte: " + terning.getVerdi());
			if (harVunnet(s)) {
				vinner = s;
				break;
			}
			System.out.println(s.getNavn() + " står nå på rute nr: " + s.getRuteNr() + "\n");
			
		}
	}
	
	
	/**
	 * Sjekker om spilleren har vunnet.
	 * 
	 * @param s Spilleren som potensielt har vunnet.
	 * @return Returnerer true om spiller har vunnet, og false hvis ikke.
	 */
	private boolean harVunnet(Spiller s) {
		return s.getRuteNr() >= WINPOINT;
	}
	
}
