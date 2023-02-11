package Test;

import model.CounterMoDel;
import view.CountView;

public class Test {
	
	public static void main(String[] args) {
		CounterMoDel ct = new CounterMoDel();
		
		ct.incValue();
		ct.incValue();
		ct.incValue();
		System.out.println(ct.getValue());
		
		ct.decValue();
		System.out.println(ct.getValue());
		
		CountView ctv = new CountView();
	}
	
}
