package persano.alberto.videoteca;

public class Main {
	
	public static void main(String[] args){
		
		
		
		VHS vhs = new VHS();
		vhs.setGiorniPrenotazione(1);
		vhs.setTipo("vhs");
		
		DVD dvd = new DVD();
		dvd.setGiorniPrenotazione(1);
		dvd.setTipo("dvd");
		
		Bluray bluray = new Bluray();
		bluray.setGiorniPrenotazione(1);
		bluray.setTipo("bluray");
		
		Supporto[] supporti = new Supporto[]{vhs, bluray, dvd};
		
		Film film = new Film();
		film.setSupporti(supporti);
		
		
		System.out.println(film.calcolaParcellaPolimorph());
		
		
		
	}

}
