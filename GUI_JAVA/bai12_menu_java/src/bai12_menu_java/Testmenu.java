package bai12_menu_java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.MenuBar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Testmenu extends JFrame{ private JLabel jlable;

// tao 1 jframe hien thi 
	public Testmenu() {
		// thiet lap jframe 
		this.setTitle("Test menu!!"); 
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		// khoi tao 1 menu 
		JMenuBar menubar = new JMenuBar();
		
		// tao actionlistenrer
		Menucontroller menucontroller = new Menucontroller(this);
		
		// tao cac menu chinh - menu chinh : Hieu 
		JMenu menu_hieu = new JMenu("Hieu");
		menu_hieu.addActionListener(menucontroller);
		// tao 2 menu iterm cua hieu 
		JMenuItem hoc = new JMenuItem("Hoc");
		hoc.addActionListener(menucontroller);
		JMenuItem choi = new JMenuItem("Choi");
		choi.addActionListener(menucontroller);
		JMenu love = new JMenu("Ha"); // tao 1 jmenu trong dong j item 
		JMenuItem Yeu_ha= new JMenuItem("Yeu Ha"); // jiterm la cap thap nhat
		JMenuItem kYeu_ha= new JMenuItem("Ha khong yeu");
		Yeu_ha.addActionListener(menucontroller);
		kYeu_ha.addActionListener(menucontroller);
		love.add(Yeu_ha);
		love.add(kYeu_ha);
		love.addActionListener(menucontroller);
		// add 2 menuiterm vao menu hieu!
		menu_hieu.add(hoc);
		menu_hieu.addSeparator();
		menu_hieu.add(choi);
		menu_hieu.addSeparator();
		menu_hieu.add(love);
		
		// tao menu future! 
		JMenu future = new JMenu("Future");
		menu_hieu.addActionListener(menucontroller);
		// tao 2 menuitern cho Future!
		JMenuItem thanh_cong = new JMenuItem("Len");
		thanh_cong.addActionListener(menucontroller);
		JMenuItem that_bai = new JMenuItem("Xuong");
		that_bai.addActionListener(menucontroller);
		// add vao!
		future.add(thanh_cong);
		future.addSeparator();
		future.add(that_bai);
		
		// tao menu them!
		JMenu them = new JMenu("Them!");
		JMenuItem thoat = new JMenuItem("Thoat");
		thoat.addActionListener(menucontroller);
		
		// add cai nay vao them 
		them.add(thoat);
		
		// add vao menubar!!
		menubar.add(menu_hieu);
		menubar.add(future);
		menubar.add(them);
		
		// them thanh menu vao chuong trinh!
		this.setJMenuBar(menubar);
		
		// tao label hien thi chuong trinh! 
		Font f = new Font("Arial", Font.BOLD,33);
		jlable = new JLabel();
		jlable.setBackground(Color.yellow);
		jlable.setOpaque(true);
		jlable.setFont(f);
		
		this.setLayout(new BorderLayout());
		//this.add(menubar,BorderLayout.NORTH);
		this.add(jlable,BorderLayout.CENTER);
		
		this.setVisible(true);
		
		
	}
	public void settextjlabel(String s) {
		this.jlable.setText(s);
	}
}
