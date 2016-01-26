package persano.alberto.commercialista;

public class StudioComm {

	private Cliente[] clienti;
	
	public StudioComm (Cliente[] clienti){
		this.clienti = clienti;
	}
	public Cliente[] getClienti(){
		return clienti;
	}
	
	private LiberoProff[] liberiProff;
	private Imprenditore[] imprenditori;
	
	
	
	public LiberoProff[] getLiberiProff() {
		return liberiProff;
	}

	public void setLiberiProff(LiberoProff[] liberiProff) {
		this.liberiProff = liberiProff;
	}

	public Imprenditore[] getImprenditori() {
		return imprenditori;
	}

	public void setImprenditori(Imprenditore[] imprenditori) {
		this.imprenditori = imprenditori;
	}
	
	public int totaleParcellePolimorph(){
		int tot = 0;
		for (Cliente c: clienti){
			tot+= c.calcolaParcella();
		}
		return tot;
	}
	
	/*public int totaleParcelle(){
		int tot = 0;
		for(LiberoProff p: liberiProff){
			tot += p.calcolaParcella();
		}
		for(Imprenditore i: imprenditori){
			tot += i.calcolaParcella();
		}
		return tot;
	}*/
	
}
