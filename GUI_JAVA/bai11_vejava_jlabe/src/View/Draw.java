package View;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

public class Draw extends JLabel {

	public Draw() {
		this.setBackground(Color.yellow);
		this.setOpaque(true);
	}
	
	// viet lai phuong thuc nay!
	// doi tuong Graphics g se giup ta ve 
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red); // set mau duong ve 
		g.drawLine(15, 15, 50, 150);//ve lan 1 
		
		g.setColor(Color.black); // set lai mau 
		// ve lan 2: hinh ovan cach le trai 0 , tren dinh 0 
		g.drawOval(0, 0, 100, 100); 
		
		//ve lan 3 hinh chu nhat cach le ttrai 40 , dinh 100
		g.drawRect(40, 100, 200, 200);	
		
		g.setColor(Color.pink);
		g.fillOval(44, 44, 99, 100);
		g.fillRect(55, 11, 33, 39);
		//g.fillPolygon(null);
		
		g.drawString("HeLlo Hieu dep trai1!!!", 400, 300);
	}
	

}
