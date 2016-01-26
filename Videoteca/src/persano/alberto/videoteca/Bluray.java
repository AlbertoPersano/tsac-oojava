package persano.alberto.videoteca;

public class Bluray extends Supporto {

	
	public int costoNoleggio(){
		int conteggio = 1;
		if (this.getGiorniPrenotazione() == 1){
			return 1;
			
		}
		else{
			for (int i = 0; i < this.getGiorniPrenotazione(); i ++){
				conteggio =+ (conteggio/100)*10;
			
			}
			return conteggio;
		}
	}
}
