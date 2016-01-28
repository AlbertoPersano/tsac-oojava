
public class Aereo extends Invasore{
	
	private int armamentiA;
	private int armamentiB;
	
	public int getArmamentiA() {
		return armamentiA;
	}
	public void setArmamentiA(int armamentiA) {
		this.armamentiA = armamentiA;
	}
	public int getArmamentiB() {
		return armamentiB;
	}
	public void setArmamentiB(int armamentiB) {
		this.armamentiB = armamentiB;
	}
	
	public void calcoloP(){
		int p = 0;
		p = (this.armamentiA * 10) + (this.armamentiB * 25);
		this.setP(p);
		
	}

}
