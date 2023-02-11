package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_Boderlayout extends JFrame{
		
	public ViDu_Boderlayout() {
		this.setTitle("cua so 1");
		this.setSize(400,400);
		this.setLocationRelativeTo(null); // can giua
		
		// Set layout! -> dang dung bo cung dang boderlayout
		// khi add can chi ro add vao phia nao! 
		// chi co 5 phia de gan 
		
		BorderLayout borderlayout = new BorderLayout(); // tao
		BorderLayout borderlayout_2 = new BorderLayout(15,15); // tao

		this.setLayout(borderlayout);           // tao song thi set 
		this.setLayout(borderlayout_2);
		
		// tao button 
		JButton jbutton1 = new JButton("1");
		JButton jbutton2 = new JButton("2");
		JButton jbutton3 = new JButton("3");
		JButton jbutton4 = new JButton("4");
		JButton jbutton5 = new JButton("5");
		
		
		// co roi thi add
		this.add(jbutton1,BorderLayout.NORTH);
		this.add(jbutton2,BorderLayout.SOUTH);
		this.add(jbutton3,BorderLayout.WEST);
		this.add(jbutton4,BorderLayout.EAST);
		this.add(jbutton5,BorderLayout.CENTER);	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ViDu_Boderlayout();
	}
	
}
