
public class LiberoProff extends Cliente implements InterfacciaParc{

	private String piva;
	private int numeroFatt;
	
	
	
	
	public String getPiva() {
		return piva;
	}
	public void setPiva(String piva) {
		this.piva = piva;
	}
	public int getNumeroFatt() {
		return numeroFatt;
	}
	public void setNumeroFatt(int numeroFatt) {
		this.numeroFatt = numeroFatt;
	}
	
	public int calcolaParcella(){
		// quota fissa di 50 euro a cui bisogna aggiugnere 0.50 cent a fattura
		return 50 + Math.round(0.5f * numeroFatt);
		
		
	}
	/*	public int calcolaParcella() {
		float annuale = 0.5f * numFattAnnuale;
		int incremento = Math.round(annuale);
		return 50 + incremento;
	}*/

}
