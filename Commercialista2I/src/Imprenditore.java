
public class Imprenditore extends Cliente implements InterfacciaParc {
	
	private String piva;
	private String ragSoc;
	private int numeroFatt;
	
	public String getPiva() {
		return piva;
	}
	public void setPiva(String piva) {
		this.piva = piva;
	}
	public String getRagSoc() {
		return ragSoc;
	}
	public void setRagSoc(String ragSoc) {
		this.ragSoc = ragSoc;
	}
	public int getNumeroFatt() {
		return numeroFatt;
	}
	public void setNumeroFatt(int numeroFatt) {
		this.numeroFatt = numeroFatt;
	}
	
	public int calcolaParcella(){
		// 500 euro se vengono registrate meno di 100 fatture, >100 1€ a fattura
		
		if(numeroFatt < 100){
			return 500;
		}
		else{
			return 500 + (numeroFatt - 100); // il numero della singola fattura in eccesso coincide con il singolo euro
											 // quindi non ho dovuto istanziare una nuova variabile
			
		}
		
	}
	

}
