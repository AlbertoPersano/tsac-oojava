package persano.alberto.commercialista.test;

import static org.junit.Assert.*;

import org.junit.Test;

import persano.alberto.commercialista.LiberoProff;

public class LiberoProffTest {

	@Test
	public void testCalcolaParcella() {
		
		LiberoProff tirindelli = new LiberoProff();
		tirindelli.setNumFattAnnuale(20);
		assertEquals(60, tirindelli.calcolaParcella());
		
	}

}
