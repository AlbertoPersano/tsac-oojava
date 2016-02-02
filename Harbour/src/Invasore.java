//Tutte le categorie di invasori sono caratterizzati da un codice identificativo, 
//da un modello e da un indice P indicante la potenza di fuoco.

public abstract class Invasore {
	private int id;
	private String modello;
	private int p;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}

	public abstract void calcoloP();
		
	
	
}
