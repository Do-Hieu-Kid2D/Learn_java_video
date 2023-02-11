package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MyColorView;

public class MyColorListener implements ActionListener{
	
	MyColorView mycolorview ;
	
	public MyColorListener(MyColorView mycolorview) {
		this.mycolorview = mycolorview;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src=="Text Red") {
			this.mycolorview.changeText(Color.RED);
		}
		else if(src == "Text Yellow") {
			this.mycolorview.changeText(Color.YELLOW);
		}
		else if(src == "Text Green") {
			this.mycolorview.changeText(Color.GREEN);
		}
		else if(src == "Background green") {
			this.mycolorview.changeBackground(Color.green);
		}
		else if(src == "Background black") {
			this.mycolorview.changeBackground(Color.black);
		}
		else if(src == "Background red") {
			this.mycolorview.changeBackground(Color.red);
		}

		
	}
	

}
