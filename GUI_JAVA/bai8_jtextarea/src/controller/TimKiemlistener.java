package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TimKiemView;

public class TimKiemlistener implements ActionListener{
	private TimKiemView timkiemview;

	
	
	public TimKiemlistener(TimKiemView timkiemview) {
		//super();
		this.timkiemview = timkiemview;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		this.timkiemview.timkiem();
		
	}
	
	
	
	
}
