import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Maytinhactionlistenr implements ActionListener{
	private MayTinhview maytinhView;

	public Maytinhactionlistenr(MayTinhview maytinhView) {
		//super();
		this.maytinhView = maytinhView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if(button.equals("+")){	
			this.maytinhView.sum();
		}
		else if(button.equals("*")) {
			this.maytinhView.multiply();
		}
		else if(button.equals("-")) {
			this.maytinhView.minus();
		}
		else if(button.equals("/")) {
				this.maytinhView.divide();
		}
		else if(button.equals("^")) {
			this.maytinhView.pow();
		}
		else if(button.equals("%")) {
			this.maytinhView.mod();
		}
	}
	
	
}
