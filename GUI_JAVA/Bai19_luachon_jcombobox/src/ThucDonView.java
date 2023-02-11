import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ThucDonView extends JFrame{
	public Thucdonmodel thucdonmodel;
	public JLabel thongTinLuaChon;
	public JButton jButtonThanhToan;
//	public ButtonGroup buttonGroupMonPHu;
	public ButtonGroup buttonGroup_MonChinh;
	public ArrayList<JCheckBox> list_buttonGroup_MonPhu;
	public JComboBox<String> jComboBox_MonChinh;
	public JList<String> jlist_monPhu;

	public ThucDonView() {
		thucdonmodel = new Thucdonmodel();
		this.innit();
		this.setVisible(true);
		
	}
	
	public void innit() {
		this.setTitle("Thuc Don Dkid");
		this.setSize(600,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		URL url_ha = ThucDonView.class.getResource("ha.jpg");
		Image img = Toolkit.getDefaultToolkit().createImage(url_ha);
		this.setIconImage(img);
		
		Font f = new Font("Arial", Font.BOLD,25);
		Font f2 = new Font("Arial", Font.BOLD,23);
		Font f3 = new Font("Arial", Font.BOLD,12);
		
		ThucDonController thucDonController = new ThucDonController(this);
		
		JPanel jPanel_header = new JPanel();
		JLabel jlabelTieuDe = new JLabel("Thực đơn nhà hàng:");
		jlabelTieuDe.setFont(f);
		jPanel_header.add(jlabelTieuDe);
		this.add(jPanel_header,BorderLayout.NORTH);
		
			// thuc don mon chinh 
		JPanel jpanelMonChinh = new JPanel();
		jpanelMonChinh.setBackground(Color.yellow);
		
		String[] cacmonChinh = new String[] {"Com","Pho", "Bun"};
		jComboBox_MonChinh = new JComboBox<String>(cacmonChinh);
		jComboBox_MonChinh.setFont(f);
		jpanelMonChinh.setLayout(new GridLayout(1,2));
		
		JLabel tetx_monChinh = new JLabel("Chon mon chinh:");
		tetx_monChinh.setFont(f);
		jpanelMonChinh.add(tetx_monChinh);
		jpanelMonChinh.add(jComboBox_MonChinh);
		
			// thuc don mon phu:
		JPanel jpanelMonPhu = new JPanel();
		jpanelMonPhu.setLayout(new GridLayout(2,2));
		//jpanelMonPhu.setBackground(Color.green);
		
		JLabel textMonPhu = new JLabel("Chon mon phu:");
		textMonPhu.setFont(f2);
		textMonPhu.setBackground(Color.green);
		textMonPhu.setOpaque(true);
		JLabel empty1 = new JLabel();
		JLabel empty2 = new JLabel();
		
		String[] cacmonPhu = new String[] {"Tra Sua","Nem", "Sua Chua","Banh Ngot"};
		jlist_monPhu = new JList<String>(cacmonPhu);
		jlist_monPhu.setFont(f);
		jpanelMonPhu.add(empty1);
		jpanelMonPhu.add(empty2);
		jpanelMonPhu.add(textMonPhu);
		jpanelMonPhu.add(jlist_monPhu);
		
			// bang thuc don:
		JPanel jpanelThucDon = new JPanel();
		jpanelThucDon.setLayout(new BorderLayout());
		jpanelThucDon.add(jpanelMonChinh,BorderLayout.NORTH);
		jpanelThucDon.add(jpanelMonPhu,BorderLayout.CENTER);
		this.add(jpanelThucDon, BorderLayout.CENTER);
		
			// thanh toan:
		JPanel jpanelThanhToan = new JPanel();
		jpanelThanhToan.setLayout(new GridLayout(1,2));
		thongTinLuaChon = new JLabel(".....");
		thongTinLuaChon.setFont(f3);
		thongTinLuaChon.setForeground(Color.red);
		jButtonThanhToan = new JButton("Thanh toan!");
		jButtonThanhToan.addActionListener(thucDonController);
		jpanelThanhToan.add(thongTinLuaChon);
		jpanelThanhToan.add(jButtonThanhToan);

		this.add(jpanelThanhToan,BorderLayout.SOUTH);
		
	}

	public void hienThiKetQua() {
		String kq = "Món chính: " + this.thucdonmodel.getLuaChon_MonChinh()
		+ "; Món phụ: " + this.thucdonmodel.getLuaChon_MonPhu()
		+ "; Tổng tiền: " + this.thucdonmodel.getTongTien();
		this.thongTinLuaChon.setText(kq);
		
	}
}
