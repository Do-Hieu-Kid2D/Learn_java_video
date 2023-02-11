package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.LastbuttonListener;
import module.LasButtonModel;

public class lastButtonView extends JFrame{ // hien thi dung jfame 
	
	LasButtonModel lastbuttonmodel;
	private JLabel jlable;
		
	public lastButtonView() {
		this.lastbuttonmodel = new LasButtonModel(1);
		
		init();
	}

	private void init() {
		this.setTitle("Button last!");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500,600);
		
		// tao font chu: la 1 doi tuong 
		Font font = new Font("Times New Roman", Font.BOLD, 35);
		Font font2 = new Font("Arial", Font.BOLD, 35);
		
		JPanel jpanel_centrel = new JPanel(); // tao 1 khoi o giua 
		jpanel_centrel.setLayout(new GridLayout(2,2));
		

		JButton nut1 = new JButton("1");
		JButton nut2 = new JButton("2");
		JButton nut3 = new JButton("3");
		JButton nut4 = new JButton("4");
		
		// Set font chu: dung doi tuong do de set font 
		nut1.setFont(font);
		nut2.setFont(font);
		nut3.setFont(font2);
		nut4.setFont(font2);
		
		// Add cai ma se dieu khien cai nut nay:
		nut1.addActionListener(listener);
		nut2.addActionListener(listener);
		nut3.addActionListener(listener);
		nut4.addActionListener(listener);
		
		/// add 4 nut nay vao khoi o giua 
		jpanel_centrel.add(nut1);
		jpanel_centrel.add(nut2);
		jpanel_centrel.add(nut3);
		jpanel_centrel.add(nut4); // add 4 nut nay vao khoi o giua 
		
		// tao khoi o duoi // mac dinh no la boderlayout
		JPanel jpanel_bottom = new JPanel(); 
		jlable = new JLabel("------"); 
		jlable.setFont(font);
		jpanel_bottom.add(jlable);
		
		// jlable hien thi chu, ban dau k hien j									
		// tao khoi,tao doi tuong text ben duoi song thi add vao jpanel
		// bai nay gon 2 jpanel dang nam trong doi tuong LasButtonModel
		// va dung class lastButtonView de dinh nghia cach hien thi 
		// doi tuong nay ra cua so!
		
		// set layout cua doi tuong nay la dang boderlayout
		// layout centrel chua jpanel_centrel
		// layout south <phia nam> thi add cai phan txt vao
		this.setLayout(new BorderLayout());
		this.add(jpanel_centrel, BorderLayout.CENTER);
		this.add(jpanel_bottom, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	// Tao listener // lop nay tao 1 doi tuong LastbuttonListener
	// theo ta dinh nghia ben controller 
	ActionListener listener = new LastbuttonListener(this);
	
	
	
	
	public void changeTo_1() {
		this.lastbuttonmodel.setVaLue(1);
		jlable.setText("Last button: "+this.lastbuttonmodel.getVaLue());
	}
	public void changeTo_2() {
		this.lastbuttonmodel.setVaLue(2);
		jlable.setText("Last button: "+this.lastbuttonmodel.getVaLue());
	}
	public void changeTo_3() {
		this.lastbuttonmodel.setVaLue(3);
		jlable.setText("Last button: "+this.lastbuttonmodel.getVaLue());
	}
	public void changeTo_4() {
		this.lastbuttonmodel.setVaLue(4);
		jlable.setText("Last button: "+this.lastbuttonmodel.getVaLue());
	}
		
		
	
	
}
