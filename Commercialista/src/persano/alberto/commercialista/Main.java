package persano.alberto.commercialista;

public class Main {

		public static void main(String[] args){
			Dipendente dip1 = new Dipendente();
			
			dip1.setNome("Gino");
			dip1.setCognome("Vagino");
			dip1.setCf("coseacaso");
			
			Dipendente dip2 = new Dipendente();
			
			dip2.setCf("randomizing");
			dip2.setCognome("Leone");
			dip2.setNome("Cartagino");
			
			Imprenditore imp1 = new Imprenditore();
			imp1.setCognome("cane");
			imp1.setNome("gattaccio");
			imp1.setNumFatt(101);
			imp1.setPiva("random");
			imp1.setRagSoc("srl");
			imp1.setCf("cosecasuali");
			
			LiberoProff lib1 = new LiberoProff();
			lib1.setCf("cose");
			lib1.setCognome("uncognome");
			lib1.setNome("razzo");
			lib1.setNumFattAnnuale(20);
			lib1.setPiva("randomizing");
			
			
			StudioComm gentili = new StudioComm(new Cliente[] {dip1, dip2, imp1, lib1});
			
			System.out.println(gentili.totaleParcellePolimorph());
			
			
			
			
		}
}
