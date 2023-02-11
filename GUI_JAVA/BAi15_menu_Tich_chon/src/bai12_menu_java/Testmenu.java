package bai12_menu_java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.MenuBar;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.security.KeyStore;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

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
		
		// ==> CHI TAO duoc phim tat cho JMenuItem! 
		
		// tao 2 menu iterm cua hieu 
		
		// them KeyEvent.VK_H thi gach chan chu H:
		JMenuItem hoc = new JMenuItem("Hoc", KeyEvent.VK_H);
		// tao phim tat cho cai nay: 
		hoc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,InputEvent.CTRL_DOWN_MASK));
		hoc.addActionListener(menucontroller);
		
		JMenuItem choi = new JMenuItem("Choi", KeyEvent.VK_C);
		// tao phim tat cho choi 
		choi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		choi.addActionListener(menucontroller);
		// ha la jmenu nen k add dc phim tat? 
		JMenu love = new JMenu("Ha"); // tao 1 jmenu trong dong j item 
		
		JMenuItem Yeu_ha= new JMenuItem("Yeu Ha", KeyEvent.VK_Y); // jiterm la cap thap nhat
		Yeu_ha.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.CTRL_DOWN_MASK));
		Yeu_ha.addActionListener(menucontroller);
		
		JMenuItem kYeu_ha= new JMenuItem("Khong yeu", KeyEvent.VK_K);
		kYeu_ha.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
		kYeu_ha.addActionListener(menucontroller);
		
		love.add(Yeu_ha);
		love.add(kYeu_ha);
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
		thoat.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.ALT_DOWN_MASK));
		thoat.addActionListener(menucontroller);
		
		// add cai nay vao them 
		them.add(thoat);
		
		// add vao menubar!!
		menubar.add(menu_hieu);
		menubar.add(future);
		menubar.add(them);
		
		// them thanh menu vao chuong trinh!
		this.setJMenuBar(menubar);
		
		// tao thanh cong cu -> la noi an vao roi lam thao tac!
		// tao thanh cong cu bang jtoolbar
		JToolBar jtoolbar = new JToolBar();
		// tao cac nut thanh cong cu 
		JButton undo = new JButton("Undo");
		undo.setToolTipText("Hoan tac");
		undo.addActionListener(menucontroller);
		JButton redo = new JButton("Redo");
		redo.setToolTipText("Cung la khoi phuc lai?");
		redo.addActionListener(menucontroller);
		JButton cut = new JButton("Cut");
		cut.setToolTipText("Mang cai nay di!");
		cut.addActionListener(menucontroller);
		JButton paste = new JButton("Paste");
		paste.setToolTipText("Dan cai m copy");
		paste.addActionListener(menucontroller);
		// add vao thanh cong cu!
		jtoolbar.add(undo);
		jtoolbar.add(redo);
		jtoolbar.add(cut);
		jtoolbar.add(paste);
		
		this.setLayout(new BorderLayout());
		// khong giong menu toolbar can phai dc add!
		this.add(jtoolbar, BorderLayout.NORTH);
		
		// tao label hien thi chuong trinh! 
		Font f = new Font("Arial", Font.BOLD,33);
		jlable = new JLabel();
		jlable.setBackground(Color.yellow);
		jlable.setOpaque(true);
		jlable.setFont(f);
		
		
		//this.add(menubar,BorderLayout.NORTH);
		this.add(jlable,BorderLayout.CENTER);
		
		this.setVisible(true);
		
		
	}
	
	public void settextjlabel(String s) {
		this.jlable.setText(s);
	}
}
