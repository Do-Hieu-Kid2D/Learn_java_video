package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Model.TimKiemModel;
import controller.TimKiemlistener;

public class TimKiemView extends JFrame {
	
	private TimKiemModel timkiemmodel;
	private JTextArea jtextarea_vanBan;
	private JTextField jtextfile_tuKhoa;
	private JLabel jlabel_ketqua;
	
	public TimKiemView() {
		this.timkiemmodel = new TimKiemModel();
		this.init();
		this.setVisible(true);
	
	}

	private void init() {
		
		this.setTitle("Tim Kiem");
		this.setSize(450,530);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Font font1 = new Font("Arial", Font.BOLD, 25);
		Font font2= new Font("Arial", Font.BOLD, 17);
		
		
		// tao va add phan van ban vao center 
		JLabel jlabel_vanBan = new JLabel("Van ban");
		jlabel_vanBan.setFont(font1);
		jtextarea_vanBan = new JTextArea(23,44);
		jtextarea_vanBan.setFont(font2);
		
		// tao 1 cai JScrollPane roi add van ban vao
		JScrollPane jscropane = new JScrollPane(jtextarea_vanBan, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//jscropane.setViewport();
		
		// tao them cai phan tu khoa - thong ke - ket qua 
		JLabel jlabel_tuKhoa = new JLabel("Tu khoa:");
		jlabel_tuKhoa.setFont(font1);
		jtextfile_tuKhoa = new JTextField();
		jtextfile_tuKhoa.setFont(font2);
		
		JPanel jpane_Bottom = new JPanel();
		jpane_Bottom.setLayout(new GridLayout(2,2,22,22));
		// add 2 cai dau vao hang tren cua 2 - 2 
		jpane_Bottom.add(jlabel_tuKhoa);
		jpane_Bottom.add(jtextfile_tuKhoa);
		
		TimKiemlistener timkiemlistener = new TimKiemlistener(this);
		
		// tao nut bam va vung tra kq 
		JButton jbutton_thongke = new JButton("Thong ke");
		jbutton_thongke.setFont(font2);
		jbutton_thongke.addActionListener(timkiemlistener);
		jbutton_thongke.setBackground(Color.green);
		
		
		jlabel_ketqua = new JLabel("..............");
		jlabel_ketqua.setBackground(Color.yellow);
		jlabel_ketqua.setFont(font2);
		jlabel_ketqua.setOpaque(true);
		
		jpane_Bottom.add(jbutton_thongke);
		jpane_Bottom.add(jlabel_ketqua);
		
		// add lable vaof bac 
		// add cai van ban vao giua 
		// add 4 cai nay vao phia nam:
		this.setLayout(new BorderLayout());
		this.add(jlabel_vanBan, BorderLayout.NORTH);
		this.add(jscropane, BorderLayout.CENTER);
		this.add(jpane_Bottom, BorderLayout.SOUTH);
	
		
	}
	
	public void timkiem() {
		this.timkiemmodel.setVanBan(jtextarea_vanBan.getText());
		this.timkiemmodel.setTuKhoa(jtextfile_tuKhoa.getText());
		this.timkiemmodel.timKiem();
		this.jlabel_ketqua.setText(this.timkiemmodel.getKetQua());	
	}

}
