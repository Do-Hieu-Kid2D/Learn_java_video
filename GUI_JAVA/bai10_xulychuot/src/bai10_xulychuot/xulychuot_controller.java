package bai10_xulychuot;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class xulychuot_controller implements MouseListener,MouseMotionListener{
	private xulychuot_view xulychuot_view;
	
	public xulychuot_controller(xulychuot_view xulychuot_view) {

		this.xulychuot_view = xulychuot_view;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		xulychuot_view.click();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		xulychuot_view.chuot_di_vao();
		int x = e.getX();
		int y = e.getY();
		xulychuot_view.cap_nhat_vitri(x,y);
	}
	@Override
	public void mouseExited(MouseEvent e) {
		xulychuot_view.chuot_di_ra();
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stu
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		xulychuot_view.cap_nhat_vitri(x,y);
		
	}
	
}
