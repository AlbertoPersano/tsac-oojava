package main.harbour;


public class Gioco {

	private Porto porto;

	public Gioco(Porto p) {
		this.porto = p;
	}
	
	public void attacco(Invasore invasori[]){
		for(Invasore inv: invasori){
			int potenzadifuoco = inv.potenzaFuoco(); // <---- polimorfismo (inv).
			porto.addMetriQuadriDistrutti(potenzadifuoco * 2.5);
		}
		
		System.out.println(porto.getDimensioneSqMetersNonDistrutta());
	}
	
	public boolean portoDistrutto(){
		return porto.getDimensioneSqMetersNonDistrutta() <= 0; 
	}
	
	
}