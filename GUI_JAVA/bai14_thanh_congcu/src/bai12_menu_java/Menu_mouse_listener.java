package bai12_menu_java;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Menu_mouse_listener implements MouseListener{

		Testmenu testmenu;
		
	public Menu_mouse_listener(Testmenu testmenu) {
			this.testmenu = testmenu;
		}

	@Override
	public void mouseClicked(MouseEvent e) { 
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
//		if(e.getButton() == java.awt.event.MouseEvent.BUTTON3) { // neu la chuot phai:
//			this.testmenu.jpopupmenu.show(e.getComponent(), e.getX(), e.getY());;
//		}		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.isPopupTrigger()) { // neu la chuot phai:
			this.testmenu.jpopupmenu.show(e.getComponent(), e.getX(), e.getY());;
		}		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
