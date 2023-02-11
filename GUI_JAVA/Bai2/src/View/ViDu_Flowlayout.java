package View;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_Flowlayout extends JFrame{
		
	public ViDu_Flowlayout() {
		this.setTitle("cua so 1");
		this.setSize(400,400);
		this.setLocationRelativeTo(null); // can giua
		
		// Set layout! -> dang dung bo cung dang flowlayout
		
		FlowLayout flowlayout = new FlowLayout(); // tao
		FlowLayout flowlayout_2 = new FlowLayout(flowlayout.RIGHT); // tao
		FlowLayout flowlayout_3 = new FlowLayout(FlowLayout.LEFT,100,100); // tao
		this.setLayout(flowlayout);           // tao song thi set 
		//this.setLayout(flowlayout_2); 
		//this.setLayout(flowlayout_3);  			// tao song thi set 
		
		// tao button 
		JButton jbutton1 = new JButton("1");
		JButton jbutton2 = new JButton("2");
		JButton jbutton3 = new JButton("3");
		
		// co roi thi add
		this.add(jbutton1);
		this.add(jbutton2);
		this.add(jbutton3);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ViDu_Flowlayout();
	}
	
}
