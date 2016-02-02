
public class Gioco {
	private PortoNavale porto;
	private Invasore[] invasori;
	
	
	public PortoNavale getPorto() {
		return porto;
	}
	public void setPorto(PortoNavale porto) {
		this.porto = porto;
	}
	public Invasore[] getInvasori() {
		return invasori;
	}
	public void setInvasori(Invasore[] invasori) {
		this.invasori = invasori;
	}
	
	public int calcolaPD(){
		int tot = 0;
		for (Invasore i:invasori){
			tot += i.getP();
		}
		return tot;
	}
	
	public void calcolaDmg(){
		int dmg = this.calcolaPD();
		dmg = Math.round(dmg * 1.5f);
		this.porto.setMq(this.porto.getMq() - dmg);
		
	}
	
	public String stillAlive(){
		
		String alive;
		this.calcolaDmg();
		if (this.porto.getMq() > 0){
			return alive = "|| hai vinto! con " + this.porto.getMq() + "mq mancanti!";
			
		}
		else{
			return alive = "|| hai perso perdente";
		}
		
	}
	
	
	
	
}
