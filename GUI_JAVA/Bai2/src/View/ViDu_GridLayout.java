package View;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_GridLayout extends JFrame{
		
	public ViDu_GridLayout() {
		this.setTitle("cua so 1");
		this.setSize(400,400);
		this.setLocationRelativeTo(null); // can giua
		
		// Set layout! -> dang dung bo cung dang GridLayout
		
		GridLayout gridlayout = new GridLayout(); // tao
		GridLayout gridlayout_2 = new GridLayout(4,4); // tao
		GridLayout gridlayout_3 = new GridLayout(4,4,25,25); // tao
		//this.setLayout(gridlayout);           // tao song thi set 
		//this.setLayout(gridlayout_2); 
		this.setLayout(gridlayout_3);  			// tao song thi set 
		
		// tao button 
//		JButton jbutton1 = new JButton("1");
//		JButton jbutton2 = new JButton("2");
//		JButton jbutton3 = new JButton("3");
		
//		this.add(jbutton1);
//		this.add(jbutton2);
//		this.add(jbutton3);
		
//		day can nhieu nut dien vao du cac o 
		for(int i =0; i<16;i++) {
			JButton jbutton = new JButton(i+1+"");
			this.add(jbutton);
		}
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ViDu_GridLayout();
	}
	
}
