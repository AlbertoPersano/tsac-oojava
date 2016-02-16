package main.harbour;


public class Sottomarino extends Invasore {
	
	private int nArmamenti;
	private int stazza;

	@Override
	public int potenzaFuoco(){
		float tot = (nArmamenti * stazza)*0.25f;
		return Math.round(tot);
	}


	public int getnArmamenti() {
		return nArmamenti;
	}


	public void setnArmamenti(int nArmamenti) {
		this.nArmamenti = nArmamenti;
	}


	public int getStazza() {
		return stazza;
	}


	public void setStazza(int stazza) {
		this.stazza = stazza;
	}
	

	
}

