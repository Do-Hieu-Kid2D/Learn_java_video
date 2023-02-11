package Main;

public class BoxGennertics<T> {   
	 
	private T value;

	public BoxGennertics(T value) {
		//super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	
	
	
	
	
	
}
