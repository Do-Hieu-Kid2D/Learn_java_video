package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controll.CounterListener;
import model.CounterMoDel;

public class CountView extends JFrame{
	
	private CounterMoDel countermodel; // khai bao 1 doi tuong 
										// kieu controll
	private JButton jbutton_up;
	private JButton jbutton_down;
	private JButton jbutton_reset;
	private JLabel jlable_value;
	
	public CountView() {
		this.countermodel = new CounterMoDel(); // vao contructer new!   
		this.init(); // ham init de khoi tao data doi tuong moi 
		this.setVisible(true);
	}
	
	public void init() {
		this.setTitle("Counter");
		this.setSize(279,388);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ActionListener ac = new CounterListener(this);
		
		jbutton_up = new JButton("UP");
		jbutton_up.addActionListener(ac);
		
		jbutton_down = new JButton("DOWN");
		jbutton_down.addActionListener(ac);
		
		jbutton_reset = new JButton("RESET");
		jbutton_reset.addActionListener(ac);
		
		jlable_value = new JLabel(this.countermodel.getValue()+"",JLabel.CENTER);
		JPanel jpanel = new JPanel();
		jpanel.setLayout(new BorderLayout());
		jpanel.add(jbutton_up,BorderLayout.WEST);
		jpanel.add(jbutton_down,BorderLayout.EAST);
		jpanel.add(jbutton_reset,BorderLayout.SOUTH);
		jpanel.add(jlable_value,BorderLayout.CENTER);
		
		this.setLayout(new BorderLayout()); // set layout cjo chuong trinh chinh 
		this.add(jpanel,BorderLayout.CENTER);
	}// het ham init 
	
	public void increment() {
		this.countermodel.incValue();
		this.jlable_value.setText(this.countermodel.getValue()+"");
		// settext lay gia tri ra 
	}
	
	public void decrement() {
		this.countermodel.decValue();
		this.jlable_value.setText(this.countermodel.getValue()+"");
		// settext lay gia tri ra 
	}
	
	public void resetVal() {
		this.countermodel.reset();
		this.jlable_value.setText(this.countermodel.getValue()+"");
	}
	
	
	
	
}
