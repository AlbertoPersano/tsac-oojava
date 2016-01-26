package persano.alberto.commercialista;

public class Dipendente {
	
	private String nome;
	private String cognome;
	private String cf;
	
	
	
//#######################################################################################################
	
	public String getNome(){
		return nome;
	}
	
	public String getCognome(){
		return cognome;
	}
	
	public String getCf(){
		return cf;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setCognome(String cognome){
		this.cognome = cognome;
	}
	
	public void setCf(String cf){
		this.cf = cf;
	}
	
//########################################################################################################	
	
	public int calcolaParcella() {
		return 50;
	}
	
	
}
