package model;

public class CounterMoDel {  // noi chua du lieu ! doi tuong?...
	
	private int value;
	
	public CounterMoDel() {
		this. value =0;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public void incValue() {
		this.value++;
	}
	
	public void decValue() {
		this.value--;
	}
	
	public void reset() {
		this.value =0;
	}
	
	
	
}
