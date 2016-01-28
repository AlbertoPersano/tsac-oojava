
public class Sottomarino extends Invasore {
	
	private int armamenti;
	private int tonn;
	
	public int getArmamenti() {
		return armamenti;
	}
	public void setArmamenti(int armamenti) {
		this.armamenti = armamenti;
	}
	public int getTonn() {
		return tonn;
	}
	public void setTonn(int tonn) {
		this.tonn = tonn;
	}
	
	public void calcoloP(){
		this.setP(armamenti * tonn);
	}
	

}
