package persano.alberto.commercialista;

public class StudioComm {

	private Dipendente[] dipendenti;
	
	public StudioComm (Dipendente[] dipendenti){
		this.dipendenti = dipendenti;
	}
	public Dipendente[] getDipendenti(){
		return dipendenti;
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
		for (Dipendente d: dipendenti){
			tot+= d.calcolaParcella();
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
