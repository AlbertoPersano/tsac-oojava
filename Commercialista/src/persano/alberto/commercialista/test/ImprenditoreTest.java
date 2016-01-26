package persano.alberto.commercialista.test;

import static org.junit.Assert.*;

import org.junit.Test;

import persano.alberto.commercialista.Imprenditore;

public class ImprenditoreTest {

	@Test
	public void testCalcolaParcella() {
		
		Imprenditore menis = new Imprenditore();
		menis.setNumFatt(101);
		
		assertEquals(501, menis.calcolaParcella());
	}

}
