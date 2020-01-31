package no.hvl.dat109.test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat109.Spiller;
import no.hvl.dat109.Stigespill;

/**
 * @author Francis, Johann og Lasse
 *
 */
public class StigespillTest {

	Stigespill stigespill;
	Spiller spiller;
	
	@BeforeEach
	void setup() {
		stigespill = new Stigespill();
		spiller = new Spiller("navn", "farge");
	}

	/**
	 * Tester metoden harVunnet().
	 */
	@Test
	void harVunnetTest() {
		assertFalse(stigespill.harVunnet(spiller));
	}
}
