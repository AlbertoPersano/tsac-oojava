package persano.alberto.videoteca.test;

import static org.junit.Assert.*;

import org.junit.Test;

import persano.alberto.videoteca.VHS;

public class VHSTest {

	@Test
	public void testCostoNoleggio() {
		
		VHS Titanic = new VHS();
		Titanic.setGiorniPrenotazione(4);
		Titanic.setTipo("dramma");
		
		assertEquals(7, Titanic.costoNoleggio());
	}

}
