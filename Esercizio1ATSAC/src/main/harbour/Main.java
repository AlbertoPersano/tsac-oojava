package main.harbour;

public class Main {
	public static void main(String[] args) {
		int nAttacks = 0;
		Porto porto = new Porto();
		porto.setNome("P2");
		porto.setnImbarcazioni(15);
		porto.setDimensioneSqMeters(500);
		
		Sottomarino s = new Sottomarino();
		s.setId("s1");
		s.setModello("fighter");
		s.setStazza(30);
		s.setnArmamenti(5);
		Cacciabombardiere a = new Cacciabombardiere();
		a.setId("a1");
		a.setModello("falker");
		a.setnArmamentiAlpha(5);
		a.setnArmamentiBeta(2);
			
		Invasore[] invasori = new Invasore[]{s,a};
		
		Gioco g = new Gioco(porto);
		while(!g.portoDistrutto()){
			g.attacco(invasori);
			nAttacks++;
		}
		
		System.out.println(nAttacks);
		System.out.println(s.potenzaFuoco());
		System.out.println(a.potenzaFuoco());
		System.out.println(porto.getDimensioneSqMetersNonDistrutta());
	}
}
