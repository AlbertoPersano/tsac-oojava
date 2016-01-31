package persano.alberto.videoteca;

public class VHS extends Supporto{
	
	
	
	
	public int costoNoleggio(){
		if (this.getGiorniPrenotazione() == 1){
			return 1;
		}
		else{
			int conteggio = 1;
			for( int i = 1; i < this.getGiorniPrenotazione(); i++){
				conteggio += 2;
			}
			return conteggio;
			}	
		}
		
		
		
	}
	


