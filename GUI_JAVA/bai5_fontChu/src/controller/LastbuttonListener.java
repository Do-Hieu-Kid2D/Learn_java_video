package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.lastButtonView;

public class LastbuttonListener implements ActionListener {
	// ben control nay cung can goi thang view ma mk da tao vao day 
	private lastButtonView lastButtonView;
	
	// ham constructer !!....
	public LastbuttonListener(view.lastButtonView lastButtonView) {
		//super();
		this.lastButtonView = lastButtonView;
	}

	@Override // ham  actionPerformed de nghe chi thi ?,.....
	public void actionPerformed(ActionEvent e) {
		String nguonSuKien = e.getActionCommand(); // lay dc lenh cho vao String
		if(nguonSuKien == "1") {
			this.lastButtonView.changeTo_1();
		}
		else if(nguonSuKien == "2") {
			this.lastButtonView.changeTo_2();
		}
		else if(nguonSuKien == "3") {
			this.lastButtonView.changeTo_3();
		}
		else if(nguonSuKien == "4") {
			this.lastButtonView.changeTo_4();
		}
		
	}
	
	
	
}
