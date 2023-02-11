package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import controller.MyColorListener;
import module.MyColorModule;

public class MyColorView extends JFrame{
	private MyColorModule myColorModle;
	private JLabel jlable;
	
	public MyColorView() {
		this.myColorModle = new MyColorModule();
		this.init();
		this.setVisible(true);
	}
	
	private void init() {
		this.setTitle("My Color");
		this.setSize(500,600);
		//this.setLocation(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		try {
//			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		//Color backgroundColor = Color.BLUE;
		Font fontText = new Font("Arial", Font.BOLD, 100);
		jlable = new JLabel("Text......");
		jlable.setFont(fontText);
		//jlable.setOpaque(true);
		//jlable.setBackground(backgroundColor);
		jlable.setForeground(Color.BLUE);
		
		JPanel Vung_dieu_khien = new JPanel();
		Vung_dieu_khien.setLayout(new GridLayout(2,3,5,5));
		
		Font font = new Font("Arial", Font.BOLD, 20);
		
		MyColorListener mycolorlistener = new MyColorListener(this);
		
		
		JButton nut_text_do = new JButton("Text Red");
		nut_text_do.setFont(font);
		nut_text_do.setForeground(Color.RED);
		nut_text_do.addActionListener(mycolorlistener);
		
		JButton nut_text_vang = new JButton("Text Yellow");
		nut_text_vang.setFont(font);
		nut_text_vang.setForeground(Color.yellow);
		nut_text_vang.addActionListener(mycolorlistener);
		
		JButton nut_text_xanh = new JButton("Text Green");
		nut_text_xanh.setFont(font);
		nut_text_xanh.setForeground(Color.green);
		nut_text_xanh.addActionListener(mycolorlistener);
		
		JButton nut_nen_den = new JButton("Background black");
		nut_nen_den.setFont(font);
		nut_nen_den.setBackground(Color.black);
		nut_nen_den.setForeground(Color.white);
		nut_nen_den.addActionListener(mycolorlistener);
		nut_nen_den.setOpaque(true);
		nut_nen_den.setBorderPainted(false);
		
		
		JButton nut_nen_do = new JButton("Background red");
		nut_nen_do.setFont(font);
		nut_nen_do.setBackground(Color.red);
		nut_nen_do.setForeground(Color.white);
		nut_nen_do.addActionListener(mycolorlistener);
		nut_nen_do.setOpaque(true);
		nut_nen_do.setBorderPainted(false);
		
		JButton nut_nen_xanh = new JButton("Background green");
		nut_nen_xanh.setFont(font);
		nut_nen_xanh.setBackground(Color.GREEN);
		nut_nen_xanh.setForeground(Color.white);
		nut_nen_xanh.setOpaque(true);
		nut_nen_xanh.addActionListener(mycolorlistener);
		
		Vung_dieu_khien.add(nut_text_do);
		Vung_dieu_khien.add(nut_text_vang);
		Vung_dieu_khien.add(nut_text_xanh);
		Vung_dieu_khien.add(nut_nen_do);
		Vung_dieu_khien.add(nut_nen_den);
		Vung_dieu_khien.add(nut_nen_xanh);
		
		
		this.setLayout(new BorderLayout());
		this.add(jlable, BorderLayout.NORTH);
		this.add(Vung_dieu_khien,BorderLayout.CENTER);

	}
	
	public void changeText(Color color) {
		this.jlable.setForeground(color);
	}
	
	public void changeBackground(Color color) {
		jlable.setOpaque(true);
		this.jlable.setBackground(color);
	}
	
}
