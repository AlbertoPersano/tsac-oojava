package persano.alberto.commercialista;

public class Cliente {
	private String nome;
	private String cognome;
	private String cf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	
	public int calcolaParcella() {
		return 0; // non so cosa ritornare, uso valore default
	}
	
	
	
}
