import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ThucDonView extends JFrame{
	public Thucdonmodel thucdonmodel;
	public JRadioButton jradio_com;
	public JRadioButton jradio_pho;
	public JRadioButton jradio_bun;
	public JCheckBox jcheckTrasua;
	public JCheckBox jcheckNem;
	public JCheckBox jchecksuaChua;
	public JCheckBox jcheckbanhNgot;
	public JLabel thongTinLuaChon;
	public JButton jButtonThanhToan;
//	public ButtonGroup buttonGroupMonPHu;
	public ButtonGroup buttonGroup_MonChinh;
	public ArrayList<JCheckBox> list_buttonGroup_MonPhu;

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
		
		Font f = new Font("Arial", Font.BOLD,31);
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
		jradio_com = new JRadioButton("Com");
		jradio_com.setFont(f2);
		jradio_pho = new JRadioButton("Pho");
		jradio_pho.setFont(f2);
		jradio_bun = new JRadioButton("Bun");
		jradio_bun.setFont(f2);
		
		// add cac nut loai radio vao 1 nhom de chi co the chon 1;
		buttonGroup_MonChinh = new ButtonGroup();
		buttonGroup_MonChinh.add(jradio_com);
		buttonGroup_MonChinh.add(jradio_pho);
		buttonGroup_MonChinh.add(jradio_bun);
		
		
		JLabel text_monchinh = new JLabel("Chon mon chinh:");
		text_monchinh.setFont(f3);
		
		jpanelMonChinh.setLayout(new GridLayout(1,4));
		jpanelMonChinh.add(text_monchinh);
		jpanelMonChinh.add(jradio_com);
		jpanelMonChinh.add(jradio_pho);
		jpanelMonChinh.add(jradio_bun);
		
			// thuc don mon phu:
		JPanel jpanelMonPhu = new JPanel();
		jpanelMonPhu.setLayout(new GridLayout(2,3));
		jpanelMonPhu.setBackground(Color.green);
		
		JLabel textMonPhu = new JLabel("Chon mon phu:");
		textMonPhu.setFont(f2);
		JLabel empty = new JLabel();
		
		jcheckTrasua = new JCheckBox("Tra Sua");
		jcheckTrasua.setFont(f2);
		jcheckNem = new JCheckBox("Nem");
		jcheckNem.setFont(f2);
		jchecksuaChua = new JCheckBox("Sua Chua");
		jchecksuaChua.setFont(f2);
		jcheckbanhNgot= new JCheckBox("Banh Ngot");
		jcheckbanhNgot.setFont(f2);
		
		list_buttonGroup_MonPhu = new ArrayList<JCheckBox>();
		list_buttonGroup_MonPhu.add(jcheckbanhNgot);
		list_buttonGroup_MonPhu.add(jcheckNem);
		list_buttonGroup_MonPhu.add(jchecksuaChua);
		list_buttonGroup_MonPhu.add(jcheckTrasua);
		jpanelMonPhu.add(textMonPhu);
		jpanelMonPhu.add(jcheckTrasua);
		jpanelMonPhu.add(jcheckbanhNgot);
		jpanelMonPhu.add(empty);
		jpanelMonPhu.add(jcheckNem);
		jpanelMonPhu.add(jchecksuaChua);

		
			// bang thuc don:
		JPanel jpanelThucDon = new JPanel();
		jpanelThucDon.setLayout(new GridLayout(2,1));
		jpanelThucDon.add(jpanelMonChinh);
		jpanelThucDon.add(jpanelMonPhu);
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
