package persano.alberto.videoteca;

public class Film {
	
	private String titolo;
	private String regista;
	private String data;
	private String mainAttori;
	private Supporto[] supporti;
	private Supporto supporto;
	
	
	
	public Supporto[] getSupporti() {
		return supporti;
	}
	public void setSupporti(Supporto[] supporti) {
		this.supporti = supporti;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getRegista() {
		return regista;
	}
	public void setRegista(String regista) {
		this.regista = regista;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getMainAttori() {
		return mainAttori;
	}
	public void setMainAttori(String mainAttori) {
		this.mainAttori = mainAttori;
	}
	
	
	}
	
	
	
	

}
