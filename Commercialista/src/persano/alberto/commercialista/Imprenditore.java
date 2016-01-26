	/*Commercialista
Si vuole gestire l'attività di un commercialista e in particolare l'incasso totale che deriva dalla sua attività di stesura delle dichiarazioni dei redditi dell'anno corrente.
I clienti del commercialista sono di tre tipologie: dipendenti, liberi professionisti e imprenditori.
I dipendenti sono caratterizzati da Nome, Cognome e CF.

Gli imprenditori sono caratterizzati da Nome, Cognome, CF, PIVA della Società, Ragione Sociale della Società e numero di fatture della Società registrate nell'anno soggetto alla dichiarazione dei redditi.

I liberi professionisti sono caratterizzati da Nome, Cognome, CF, PIVA e numero di fatture
registrate nell'anno soggetto alla dichiarazione dei redditi.
Per ognuna di queste categorie la parcella è così calcolata:
per i dipendenti c'è una quota fissa di 50 euro;
per i liberi professionisti c'è una quota fissa di 50 euro a cui si deve aggiungere 50 centesimi a fattura;
per gli imprenditori è di 500 euro se vengono registrate meno di 100 fatture. Ogni fattura dalla 101 esima in poi viene calcolata a 1 euro a fattura.

Sviluppare il programma come da specifiche in codice Java, facendo sì che l'algoritmo per il calcolo dell'incasso totale rimanga inalterato nel caso in cui in futuro il
commercialista abbia la necessità di ampliare le tipologie dei propri clienti.

Si creino i necessari UnitTest.

Il programma deve permettere di visualizzare a Console l'incasso totale.
*/



package persano.alberto.commercialista;

public class Imprenditore extends Dipendente{
		
	

	private String piva;
	private String ragSoc;
	private int numFattAnnuale;
	
	public int getNumFAtt(){
		return numFattAnnuale;
	}
	
	public void setNumFatt(int numFattAnnuale){
		this.numFattAnnuale = numFattAnnuale;
	}
	
	public String getPiva(){
		return piva;
	}
	
	public String getRagSoc(){
		return ragSoc;
	}
	
	public void setPiva(String piva){
		this.piva = piva;
	}
	
	public void setRagSoc(String ragSoc){
		this.ragSoc = ragSoc;
	}
	
	public int calcolaParcella() {
		if (numFattAnnuale < 100){
			return 500;
		}
		else{
			int totale = 500;
			numFattAnnuale -= 100;
			for (int i = 0; i < numFattAnnuale; i ++){
				totale = totale + 1;
				
			}
			return totale;
			
		}
		
	}
	
	
}
