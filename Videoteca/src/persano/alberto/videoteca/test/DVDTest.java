package persano.alberto.videoteca.test;

import static org.junit.Assert.*;

import org.junit.Test;

import persano.alberto.videoteca.DVD;

public class DVDTest {

	@Test
	public void test() {
		
		DVD cane = new DVD();
		cane.setGiorniPrenotazione(4);
		cane.setTipo("Romance");
		
		
		assertEquals(7, cane.costoNoleggio());
	}

}
