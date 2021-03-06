package persano.alberto.commercialista.test;

import static org.junit.Assert.*;

import org.junit.Test;

import persano.alberto.commercialista.Cliente;
import persano.alberto.commercialista.Dipendente;
import persano.alberto.commercialista.Imprenditore;
import persano.alberto.commercialista.LiberoProff;
import persano.alberto.commercialista.StudioComm;

public class StudioCommTest {

	@Test
	public void TesttotaleParcellePolimorph(){
		
		
		LiberoProff tirindelli = new LiberoProff();
		tirindelli.setNumFattAnnuale(20);
		
		Imprenditore menis = new Imprenditore();
		menis.setNumFatt(101);
		

		Dipendente gino = new Dipendente();
		
		StudioComm gentili = new StudioComm(new Cliente[] {tirindelli, menis, gino});
		
		assertEquals(611, gentili.totaleParcellePolimorph());
		
		
		
		
	}

}
