package bai12_menu_java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;

public class Menu_actionlistener implements ActionListener{
	Testmenu testmenu ;

	public Menu_actionlistener(Testmenu testmenu) {
		this.testmenu = testmenu;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		
		if(button == "toolbar") {
		
			AbstractButton checkbox = (AbstractButton) e.getSource();
			boolean check = checkbox.getModel().isSelected();
			if(check) {
				System.out.println("ngu1");
				this.testmenu.hienthi_jtoolbar();
			}
			else {
				System.out.println("ngu2");
				this.testmenu.tat_jtollbar();
			}
		}
	}
	

}
