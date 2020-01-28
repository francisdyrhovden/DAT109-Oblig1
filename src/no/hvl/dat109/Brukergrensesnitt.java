/**
 * 
 */
package no.hvl.dat109;

import java.util.Scanner;

/**
 * @author Francis, Johann og Lasse
 *
 */
public class Brukergrensesnitt {
	
	private Stigespill stigespill;
	
	public Brukergrensesnitt(Stigespill stigespill) {
		this.stigespill = stigespill;
	}

	public void start() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Spillet er klar til å starte.\n Skriv inn antall spillere (2-4)");
		int antall = sc.nextInt();
		Spiller[] spillere = new Spiller[antall];
		
		for (int i = 0; i < spillere.length; i++) {
			System.out.println("Skriv inn navn for spiller " + (i+1));
			String navn = sc.next();
			System.out.println("Skriv inn farge på brikke for spiller " + (i+1));
			String farge = sc.next();
			spillere[i] = new Spiller(navn,farge);
		}
		
		stigespill.setup(spillere);
		stigespill.spill();
		
		sc.close();
	}
}
