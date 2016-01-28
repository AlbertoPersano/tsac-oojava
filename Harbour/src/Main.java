
public class Main {

	public static void main(String[] args){
		
		
		Sottomarino OttobreRosso = new Sottomarino();
		OttobreRosso.setArmamenti(3);
		OttobreRosso.setTonn(10);
		OttobreRosso.setModello("Rusky cyka");
		OttobreRosso.setId(1);
		
		
		Aereo BaroneRosso = new Aereo();
		BaroneRosso.setArmamentiA(2);
		BaroneRosso.setArmamentiB(1);
		BaroneRosso.setId(2);
		BaroneRosso.setModello("Aereo molto Rosso");
		
		Aereo PorcoRosso = new Aereo();
		PorcoRosso.setArmamentiA(1);
		PorcoRosso.setArmamentiB(1);
		PorcoRosso.setModello("Oink");
		PorcoRosso.setId(3);
		
		PortoNavale barkbark = new PortoNavale();
		barkbark.setMq(100);
		barkbark.setName("woof");
		barkbark.setNumNavi(27);
		
		
		
		Invasore[] invasori = new Invasore[]{OttobreRosso, BaroneRosso, PorcoRosso};
		Gioco gioco = new Gioco();
		gioco.setInvasori(invasori);
		gioco.setPorto(barkbark);
		
		System.out.println(gioco.stillAlive());
		
		
		
	}
}
