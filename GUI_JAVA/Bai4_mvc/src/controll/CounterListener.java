package controll;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CountView;

public class CounterListener implements ActionListener {
	
	private CountView ctv;
	
	public CounterListener(CountView ctv) { // contruster
		this.ctv = ctv;		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("Ban da nhan nut@");
		String src = e.getActionCommand();// no lay ra ten cua..
		System.out.println("Ban da nhan nut "+ src);
		
		if (src.equals("UP")) {
			this.ctv.increment();
		}
		if (src.equals("DOWN")) {
			this.ctv.decrement();
		}
		if(src.equals("RESET")) {
			this.ctv.resetVal();
		}
	}

}
