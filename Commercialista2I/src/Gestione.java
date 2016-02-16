
public class Gestione {
	
	private Cliente[] clienti;

	public Cliente[] getClienti() {
		return clienti;
	}

	public void setClienti(Cliente[] clienti) {
		this.clienti = clienti;
	}
	
	public int totaleParcelle(){
		int tot = 0;
		for(Cliente i:clienti){
			tot += i.calcolaParcella();
		}
		return tot;
	}
	
	
	
	

}
