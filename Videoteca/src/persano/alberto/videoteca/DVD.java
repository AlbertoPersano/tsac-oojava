package persano.alberto.videoteca;

public class DVD extends Supporto{

	public int costoNoleggio(){
		float conteggio = 0;
		if (this.getGiorniPrenotazione() <= 2){
			for (int i = 0; i < this.getGiorniPrenotazione(); i++){
				conteggio += 1.50;
			}
		}
		else{
			for ( int j = 0; j < this.getGiorniPrenotazione(); j++){
				conteggio += 2;
			}
		}
		return Math.round(conteggio);
		
	}
}
