/**
 * 
 */
package no.hvl.dat109.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat109.Brett;
import no.hvl.dat109.Rute;

/**
 * @author Francis, Johann og Lasse
 *
 */
public class BrettTest {

	 Brett brett;
	 Rute start;
	 Rute rute;
	 Rute stige;
	 Rute slange;
	
	
	@BeforeEach
	void setup() {
		brett = new Brett();
		start = new Rute(0);
		rute = new Rute(6);
		stige = new Rute(13);
		slange = new Rute(6);
		
	}
	
	/**
	 * Tester om metoden getStart() gir oss første ruten.
	 */
	@Test
	void getStartTest() {
		assertEquals(brett.getStart().getNummer(), start.getNummer());
	}
	
	/**
	 * Tester om metoden finnNyRuteTest() gir oss riktig rute. Tester også når man lander på slanger og stiger.
	 */
	@Test
	void finnNyRuteTest() {
		assertEquals(brett.finnNyRute(start, 6).getNummer(), rute.getNummer());
		assertEquals(brett.finnNyRute(brett.getStart(), 3).getNummer(), stige.getNummer());
		assertEquals(brett.finnNyRute(brett.getStart(), 16).getNummer(), slange.getNummer());
	}
	
}
