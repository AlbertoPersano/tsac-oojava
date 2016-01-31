package persano.alberto.videoteca;

public class DVD extends Supporto{

	public int costoNoleggio(){
		float conteggio = 0;
			if (this.getGiorniPrenotazione()> 0 && this.getGiorniPrenotazione() == 1){	
					conteggio += 1.50;
			}
			else if (this.getGiorniPrenotazione() > 0 && this.getGiorniPrenotazione() > 1){
				conteggio += 3;
			}
		
			if (this.getGiorniPrenotazione() > 2){
			for ( int j = 2; j < this.getGiorniPrenotazione(); j++){
				conteggio += 2;
			}
		}
		return Math.round(conteggio);
		
	}
}
