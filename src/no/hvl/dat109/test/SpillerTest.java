/**
 * 
 */
package no.hvl.dat109.test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat109.Brett;
import no.hvl.dat109.Spiller;
import no.hvl.dat109.Terning;

/**
 * @author Francis, Johann og Lasse
 *
 */
public class SpillerTest {

	Spiller spiller;
	Brett brett;
	Terning terning;
	
	@BeforeEach
	void setup() {
		spiller = new Spiller("Navn", "farge");
		brett = new Brett();
		terning = new Terning();
	}
	
	/**
	 * Tester om metoden spillTrekk() fungerer.
	 */
	@Test
	void spillTrekkTest() {
		spiller.spillTrekk(terning, brett);
		int verdi = terning.getVerdi();
		if (verdi != 3) {
		assertEquals(terning.getVerdi()+1, spiller.getRuteNr());
		} else {
			assertEquals(14, spiller.getRuteNr());
		}
		assertFalse(spiller.treSeksere());
	}
}
