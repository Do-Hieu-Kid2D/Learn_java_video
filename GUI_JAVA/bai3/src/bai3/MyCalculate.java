package bai3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.concurrent.CancellationException;

import javax.management.remote.JMXConnectorFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyCalculate extends JFrame{
	
	public MyCalculate() {
		this.setTitle("My Calculate");
		this.setSize(350,470);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JTextField jtex = new JTextField(); 
		JPanel jpanned_head = new JPanel(); // jpanned vat chua co the 
											// chua cac vat khac
		// new phan head??
		jpanned_head.setLayout(new BorderLayout());
		jpanned_head.add(jtex, BorderLayout.CENTER); // tao phan nhap txt
		
		/// new button 
		JButton jbutton_0 = new JButton("0");
		JButton jbutton_1 = new JButton("1");
		JButton jbutton_2 = new JButton("2");
		JButton jbutton_3 = new JButton("3");
		JButton jbutton_4 = new JButton("4");
		JButton jbutton_5 = new JButton("5");
		JButton jbutton_6 = new JButton("6");
		JButton jbutton_7 = new JButton("7");
		JButton jbutton_8 = new JButton("8");
		JButton jbutton_9 = new JButton("9");
		JButton jbutton_cong = new JButton("+");
		JButton jbutton_tru = new JButton("-");
		JButton jbutton_nhan = new JButton("*");
		JButton jbutton_chia = new JButton("/");
		JButton jbutton_bang = new JButton("=");
		
		JPanel jpaner_button = new JPanel();
		jpaner_button.setLayout(new GridLayout(5,3));
		
		// add cac nut nao jpaner
		jpaner_button.add(jbutton_0);
		jpaner_button.add(jbutton_1);
		jpaner_button.add(jbutton_2);
		jpaner_button.add(jbutton_3);
		jpaner_button.add(jbutton_4);
		jpaner_button.add(jbutton_5);
		jpaner_button.add(jbutton_6);
		jpaner_button.add(jbutton_7);
		jpaner_button.add(jbutton_8);
		jpaner_button.add(jbutton_9);
		jpaner_button.add(jbutton_cong);
		jpaner_button.add(jbutton_tru);
		jpaner_button.add(jbutton_nhan);
		jpaner_button.add(jbutton_chia);
		jpaner_button.add(jbutton_bang);
		
		// roi moi add vao ct chinh 
		this.setLayout(new BorderLayout());// ct chinh dang borderlayout 
		this.add(jpanned_head, BorderLayout.NORTH);
		this.add(jpaner_button,BorderLayout.CENTER);
			
		this.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		try {

			// cac cach dinh dang nhin va cam nhan l=kahc 
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			
			// giao diem cua may chay no! 
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MyCalculate();
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
	}
	
}
