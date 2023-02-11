package bai12_menu_java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menucontroller  implements ActionListener{
	private Testmenu tetsmenu;
	
	public Menucontroller(Testmenu tetsmenu) {
		this.tetsmenu =tetsmenu;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String an_button = e.getActionCommand();
		
		if(an_button.equals("Hoc")) {
			this.tetsmenu.settextjlabel("Bro an vao jmenuiten : Hoc");
		}
		else if(an_button.equals("Choi")) {
			this.tetsmenu.settextjlabel("Bro an vao jmenuiten : Choi");
		}else if(an_button.equals("Ha")) {
			this.tetsmenu.settextjlabel("Bro an vao jmenuiten : Ha");
		}
		else if(an_button.equals("Len")) {
			this.tetsmenu.settextjlabel("Bro an vao jmenuiten : Len");
		}
		else if(an_button.equals("Xuong")) {
			this.tetsmenu.settextjlabel("Bro an vao jmenuiten : Xuong");
		} 
		else if(an_button.equals("Thoat")) {
			System.exit(0);
		} 
		else if(an_button.equals("Yeu Ha")) {
			this.tetsmenu.settextjlabel("Yeu Ha");
		} 
		else if(an_button.equals("Khong yeu")) {
			this.tetsmenu.settextjlabel("Khong yeu");
		}
		else if(an_button.equals("Undo")) {
			this.tetsmenu.settextjlabel("An Undo");
		} 
		
		else if(an_button.equals("Redo")) {
			this.tetsmenu.settextjlabel("Cham Redo ");
		} 
		
		else if(an_button.equals("Cut")) {
			this.tetsmenu.settextjlabel("Lam Cut");
		} 
		
		else if(an_button.equals("Paste")) {
			this.tetsmenu.settextjlabel("may Paste");
		} 
		
		
		
	}


	
	
	
}
