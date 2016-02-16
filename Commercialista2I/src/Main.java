
public class Main {

	public static void main(String[] args){
		
		Dipendente yacopo = new Dipendente();
		yacopo.setCf("12345678");
		yacopo.setCognome("Cragnolini");
		yacopo.setNome("yacopo");
		
		
		LiberoProff yaroslav = new LiberoProff();
		yaroslav.setCf("112222");
		yaroslav.setCognome("yaroslav");
		yaroslav.setNome("vasili");
		yaroslav.setNumeroFatt(4);
		yaroslav.setPiva("12345867744ct");
		
		Imprenditore dinca = new Imprenditore();
		dinca.setCognome("D'Incà");
		dinca.setNome("Marco");
		dinca.setCf("2138564987D");
		dinca.setNumeroFatt(105);
		dinca.setRagSoc("SNC");
		dinca.setPiva("qèdlqwodkwqod668");
		
		
		Cliente[] esercito1 = new Cliente[]{yacopo, yaroslav, dinca};
		
		
		Gestione luxotica = new Gestione();
		luxotica.setClienti(esercito1);
		System.out.println(luxotica.totaleParcelle());
		
		
		
		
	}
}
