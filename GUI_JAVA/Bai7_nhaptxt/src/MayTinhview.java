import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MayTinhview extends JFrame{
	
	private MaytinhModel maytinhmodel;
	private JTextField jtextfile_fist;
	private JTextField jtextfile_second;
	private JTextField jtextfile_ansewr;
	
	public MayTinhview() {
		this.maytinhmodel = new MaytinhModel();
		this.innit();
		this.setVisible(true);
	}

	private void innit() {
		this.setTitle("May tinh deu");
		this.setSize(400,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.setLocation(null);
		Font font = new Font("Arial",Font.BOLD,30);
		Font font2 = new Font("Arial",Font.BOLD,22);
		Maytinhactionlistenr maytinhactioner = new Maytinhactionlistenr(this);
		
		JLabel firstValue = new JLabel("FirstValue:");
		firstValue.setFont(font);
		JLabel secondValue = new JLabel("SecondsValue:");
		secondValue.setFont(font);
		JLabel Ansewr = new JLabel("Ansewr:");
		Ansewr.setFont(font);
		// class de nhap data:
		 jtextfile_fist = new JTextField(50);
		 jtextfile_second = new JTextField(50);
		 jtextfile_ansewr = new JTextField(50);
		jtextfile_fist.setFont(font);
		jtextfile_second.setFont(font);
		jtextfile_ansewr.setFont(font);
		
		JPanel jpanelio = new JPanel();
		jpanelio.setLayout(new GridLayout(3,2,10,5));
		
		// add 2 cap lan luot 
		jpanelio.add(firstValue);
		jpanelio.add(jtextfile_fist);
		jpanelio.add(secondValue);
		jpanelio.add(jtextfile_second);
		jpanelio.add(Ansewr);
		jpanelio.add(jtextfile_ansewr);
		
		
		// tao cac nut bam: va add hanh donh cho no 
		JButton nut_cong = new JButton("+");
		nut_cong.setFont(font2);
		nut_cong.addActionListener(maytinhactioner);
		JButton nut_tru = new JButton("-");
		nut_tru.setFont(font2);
		nut_tru.addActionListener(maytinhactioner);
		JButton nut_nhan = new JButton("*");
		nut_nhan.setFont(font2);
		nut_nhan.addActionListener(maytinhactioner);
		JButton nut_chia = new JButton("/");
		nut_chia.setFont(font2);
		nut_chia.addActionListener(maytinhactioner);
		JButton nut_pow = new JButton("^");
		nut_pow.setFont(font2);
		nut_pow.addActionListener(maytinhactioner);
		JButton nut_mod = new JButton("%");
		nut_mod.setFont(font2);
		nut_mod.addActionListener(maytinhactioner);
		
		JPanel jpanelNut = new JPanel();
		jpanelNut.setLayout(new GridLayout(2,3,5,5));
		jpanelNut.add(nut_cong);
		jpanelNut.add(nut_tru);
		jpanelNut.add(nut_nhan);
		jpanelNut.add(nut_chia);
		jpanelNut.add(nut_pow);
		jpanelNut.add(nut_mod);
		
		
		this.setLayout(new BorderLayout());
		this.add(jpanelio,BorderLayout.NORTH);
		this.add(jpanelNut,BorderLayout.SOUTH);
		
		
	}
	
	public void sum() {
		double fistvalue =Double.valueOf(jtextfile_fist.getText());
		double second =Double.valueOf(jtextfile_second.getText());
		this.maytinhmodel.setFistValue(fistvalue);
		this.maytinhmodel.setSecondValue(second);
		this.maytinhmodel.sum();
		// co ket qua roi! gio can day kq len man hinh
		this.jtextfile_ansewr.setText(this.maytinhmodel.getAnsewr()+"");
		
	}
	public void minus() {
		double fistvalue =Double.valueOf(jtextfile_fist.getText());
		double second =Double.valueOf(jtextfile_second.getText());
		this.maytinhmodel.setFistValue(fistvalue);
		this.maytinhmodel.setSecondValue(second);
		this.maytinhmodel.minus();
		// co ket qua roi! gio can day kq len man hinh
		this.jtextfile_ansewr.setText(this.maytinhmodel.getAnsewr()+"");
	}
	public void multiply() {
		double fistvalue =Double.valueOf(jtextfile_fist.getText());
		double second =Double.valueOf(jtextfile_second.getText());
		this.maytinhmodel.setFistValue(fistvalue);
		this.maytinhmodel.setSecondValue(second);
		this.maytinhmodel.multiply();
		// co ket qua roi! gio can day kq len man hinh
		this.jtextfile_ansewr.setText(this.maytinhmodel.getAnsewr()+"");
	}
	public void divide() {
		double fistvalue =Double.valueOf(jtextfile_fist.getText());
		double second =Double.valueOf(jtextfile_second.getText());
		this.maytinhmodel.setFistValue(fistvalue);
		this.maytinhmodel.setSecondValue(second);
		this.maytinhmodel.divide();
		// co ket qua roi! gio can day kq len man hinh
		this.jtextfile_ansewr.setText(this.maytinhmodel.getAnsewr()+"");
	}
	public void pow() {
		double fistvalue =Double.valueOf(jtextfile_fist.getText());
		double second =Double.valueOf(jtextfile_second.getText());
		this.maytinhmodel.setFistValue(fistvalue);
		this.maytinhmodel.setSecondValue(second);
		this.maytinhmodel.pow();
		// co ket qua roi! gio can day kq len man hinh
		this.jtextfile_ansewr.setText(this.maytinhmodel.getAnsewr()+"");
	}
	public void mod() {
		double fistvalue =Double.valueOf(jtextfile_fist.getText());
		double second =Double.valueOf(jtextfile_second.getText());
		this.maytinhmodel.setFistValue(fistvalue);
		this.maytinhmodel.setSecondValue(second);
		this.maytinhmodel.mod();
		// co ket qua roi! gio can day kq len man hinh
		this.jtextfile_ansewr.setText(this.maytinhmodel.getAnsewr()+"");
	}
	

}
