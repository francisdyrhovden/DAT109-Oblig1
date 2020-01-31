/**
 * 
 */
package no.hvl.dat109.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

import no.hvl.dat109.Brett;
import no.hvl.dat109.Brikke;

/**
 * @author Francis, Johann og Lasse
 *
 */
public class BrikkeTest {

	Brett brett;
	Brikke brikke;
	Brikke brikke2;
	Brikke brikke3;
	
	@BeforeEach
	void setup() {
		brett = new Brett();
		brikke = new Brikke("gul");
		brikke2 = new Brikke("blå");
		brikke3 = new Brikke("rød");
	}
	
	/**
	 * Tester om metoden flytt() flytter brikken til riktig rute. Sjekker også med stiger og slanger.
	 */
	@Test
	void flyttTest() {
		brikke.flytt(4, brett);
		assertEquals(4, brikke.getPlass().getNummer());
		brikke2.flytt(8, brett);
		assertEquals(30, brikke2.getPlass().getNummer());
		brikke3.flytt(16, brett);
		assertEquals(6, brikke3.getPlass().getNummer());
	}
	
	/**
	 * Tester om metoden flyttTilStart() flytter brikken til start.
	 */
	@Test
	void flyttTilStartTest() {
		brikke.flytt(5, brett);
		brikke.flyttTilStart(brett);
		assertEquals(0, brikke.getPlass().getNummer());
	}
	
}
