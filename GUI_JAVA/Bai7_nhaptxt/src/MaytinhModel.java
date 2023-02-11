
public class MaytinhModel {
	private double fistValue, secondValue, ansewr;
	
	public MaytinhModel() {
		// TODO Auto-generated constructor stub
	}

	public double getFistValue() {
		return fistValue;
	}

	public void setFistValue(double fistValue) {
		this.fistValue = fistValue;
	}

	public double getSecondValue() {
		return secondValue;
	}

	public void setSecondValue(double secondValue) {
		this.secondValue = secondValue;
	}

	public double getAnsewr() {
		return ansewr;
	}

	public void setAnsewr(double ansewr) {
		this.ansewr = ansewr;
	}
	
	public void sum() {
		ansewr = fistValue+secondValue;
	}
	public void minus() {
		ansewr = fistValue-secondValue;
	}
	public void multiply() {
		ansewr = fistValue*secondValue;
	}
	public void divide() {
		ansewr = fistValue/secondValue;
	}
	public void pow() {
		this.ansewr = Math.pow(fistValue,secondValue);
	}
	public void mod() {
		this.ansewr = fistValue%secondValue;
	}
	
	
	
}
