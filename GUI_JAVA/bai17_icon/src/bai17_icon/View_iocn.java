package bai17_icon;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class View_iocn extends JFrame{
	private JMenu menu,font;
	private JMenuItem i1,i2,i3,i4,i5;
	private JLabel jlable_center;
	private JButton jbutton_noth;
	private JMenuBar jMenuBar;
	public View_iocn() {
		this.init();
		this.setVisible(true);
		this.setLayout(new BorderLayout());
	}
	
	public void init() {
		this.setTitle("Hieu dep trai");
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		// Set icon cho trang jframe nay:
		// lay duong link hinh anh:
		URL url_notepad = View_iocn.class.getResource("notepad.png");
		// Tao hinh anh!
		Image img = Toolkit.getDefaultToolkit().createImage(url_notepad);
		// set hinh anh dc roi:
		this.setIconImage(img);
		// => day la cach viet tuong minh, co cach viet gon hon dung o duoi!
		// set icon cho jframe phai set chay chu k dc set tat 

		jMenuBar = new JMenuBar();
		menu = new JMenu("Menu");
		menu.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(View_iocn.class.getResource("menu.png"))));
		font = new JMenu("Font");
		i1 = new JMenuItem("new");
		i1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(View_iocn.class.getResource("new.png"))));
		i2 = new JMenuItem("save");
		i2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(View_iocn.class.getResource("Save.png"))));
		i3 = new JMenuItem("find");
		i3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(View_iocn.class.getResource("find.png"))));
		i4 = new JMenuItem("i4");
		i5 = new JMenuItem("i5");
		
		
		font.add(i4);
		font.add(i5);
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(font);
		
		jMenuBar.add(menu);
		this.setJMenuBar(jMenuBar);
		
		Font f = new Font("Arial",Font.BOLD, 23);
		
		jlable_center = new JLabel(new ImageIcon("ha_hieu_yeu.jpg"));
		jlable_center.setFont(f);
		jlable_center.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(View_iocn.class.getResource("ha_hieu_yeu.jpg"))));
		this.add(jlable_center, BorderLayout.CENTER);
		
		jbutton_noth = new JButton("Nut Bam!");
		jbutton_noth.setFont(f);
		this.add(jbutton_noth, BorderLayout.SOUTH);
		
		
	}
	
	public static void main(String[] args) {
		new View_iocn();
	}
}


