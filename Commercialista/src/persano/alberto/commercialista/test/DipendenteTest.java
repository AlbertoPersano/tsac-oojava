package persano.alberto.commercialista.test;

import static org.junit.Assert.*;

import org.junit.Test;

import persano.alberto.commercialista.Dipendente;

public class DipendenteTest {

	@Test
	public void testCalcolaParcella() {
		
		Dipendente gino = new Dipendente();
		
		assertEquals(50, gino.calcolaParcella());
	}

}
