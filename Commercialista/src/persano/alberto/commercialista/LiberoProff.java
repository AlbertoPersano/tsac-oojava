package persano.alberto.commercialista;

public class LiberoProff extends Dipendente{
	
	

	private String piva;
	private int numFattAnnuale;
	
	
	public String getPiva() {
		return piva;
	}
	public void setPiva(String piva) {
		this.piva = piva;
	}
	
	
	public int getNumFattAnnuale() {
		return numFattAnnuale;
	}
	public void setNumFattAnnuale(int numFattAnnuale) {
		this.numFattAnnuale = numFattAnnuale;
	}
	
	public int calcolaParcella() {
		float annuale = 0.5f * numFattAnnuale;
		int incremento = Math.round(annuale);
		return 50 + incremento;
	}
	/*
	public int calcoloStipendio(){
		
		float anzianit� = 0.05f * this.getAnzianit�();
		int old = Math.round(anzianit�);
		return this.getContratto().getStipendioBase() + old;*/
	
	
}
