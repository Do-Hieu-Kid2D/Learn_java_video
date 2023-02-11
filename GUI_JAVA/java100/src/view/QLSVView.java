package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import module.QLSVmodule;
import module.ThiSinh;
import module.Tinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.GroupLayout.Group;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.QLSVController;

import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class QLSVView extends JFrame {
	
	public QLSVmodule model;
	public JPanel contentPane;
	public JTextField jtexMaSV;
	public JTable table;
	public JTextField jtextMaTS_TT;
	public JTextField jtextHoTen;
	public JTextField textField_2;
	public JTextField jtextNgaySinh_TT;
	public JTextField jtextDiem1_TT;
	public JTextField jtextDiem2_TT;
	public JTextField jtextDiem3_TT;
	public ButtonGroup btg_GioiTinh;
	public JComboBox comboBox_QueQuanTT;
	public JComboBox comboBox_QueQuan;
	public JLabel labelMaTS_TT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QLSVView() {
		this.model = new QLSVmodule();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 15, 759, 617);
		QLSVController actionQlsvController = new QLSVController(this);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuFile.setForeground(new Color(255, 0, 0));
		menuFile.setBackground(new Color(102, 204, 102));
		menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		menuBar.add(menuFile);
		
		JMenuItem menuitemClose = new JMenuItem("Close");
		menuitemClose.setForeground(new Color(255, 0, 0));
		menuitemClose.setBackground(new Color(102, 204, 102));
		menuitemClose.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuitemClose);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuitemOpen = new JMenuItem("Open");
		menuitemOpen.setForeground(new Color(255, 0, 0));
		menuitemOpen.setBackground(new Color(102, 204, 102));
		menuitemOpen.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuitemOpen);
		
		JSeparator separator_1 = new JSeparator();
		menuFile.add(separator_1);
		
		JMenuItem menuitemExit = new JMenuItem("Exit");
		menuitemExit.setForeground(new Color(255, 0, 0));
		menuitemExit.setBackground(new Color(102, 204, 102));
		menuitemExit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuitemExit);
		
		JMenu menuAbout = new JMenu("About");
		menuAbout.setForeground(new Color(255, 0, 0));
		menuAbout.setBackground(new Color(102, 204, 102));
		menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		menuBar.add(menuAbout);
		
		JMenuItem menuitemAboutMe = new JMenuItem("About me");
		menuitemAboutMe.setForeground(new Color(255, 0, 0));
		menuitemAboutMe.setBackground(new Color(102, 204, 102));
		menuitemAboutMe.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuAbout.add(menuitemAboutMe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelQueQuan = new JLabel("Quê quán:");
		labelQueQuan.setBackground(Color.YELLOW);
		labelQueQuan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelQueQuan.setHorizontalAlignment(SwingConstants.CENTER);
		labelQueQuan.setBounds(10, 9, 90, 32);
		contentPane.add(labelQueQuan);
		
		JLabel labelMaTS = new JLabel("Mã thí sinh:");
		labelMaTS.setBackground(Color.YELLOW);
		labelMaTS.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelMaTS.setBounds(314, 9, 112, 32);
		contentPane.add(labelMaTS);
		
		comboBox_QueQuan = new JComboBox();
		comboBox_QueQuan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ArrayList<Tinh> listTinh = Tinh.getDSTinh();
		comboBox_QueQuan.addItem("");
		for (Tinh tinh : listTinh) {
			comboBox_QueQuan.addItem(tinh.getTenTinh());
		}
		comboBox_QueQuan.setBounds(110, 12, 178, 32);
		contentPane.add(comboBox_QueQuan);
		
		jtexMaSV = new JTextField();
		jtexMaSV.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jtexMaSV.setBounds(423, 9, 198, 32);
		contentPane.add(jtexMaSV);
		jtexMaSV.setColumns(10);
		
		JButton timMaSV = new JButton("Tìm ");
		timMaSV.setFont(new Font("Tahoma", Font.PLAIN, 16));
		timMaSV.setBounds(646, 14, 89, 25);
		contentPane.add(timMaSV);
		timMaSV.addActionListener(actionQlsvController);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(10, 59, 710, 2);
		contentPane.add(separator_2);
		
		JLabel labelDanhSTS = new JLabel("Danh sách thí sinh:");
		labelDanhSTS.setForeground(Color.BLUE);
		labelDanhSTS.setHorizontalAlignment(SwingConstants.CENTER);
		labelDanhSTS.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelDanhSTS.setBackground(Color.YELLOW);
		labelDanhSTS.setBounds(20, 61, 163, 32);
		contentPane.add(labelDanhSTS);
		
		table = new JTable();
		table.setBorder(UIManager.getBorder("DesktopIcon.border"));
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 th\u00ED sinh", "H\u1ECD t\u00EAn", "Qu\u00EA qu\u00E1n", "Ng\u00E0y sinh", "Gi\u1EDBi t\u00EDnh", "\u0110i\u1EC3m 1", "\u0110i\u1EC3m 2", "\u0110i\u1EC3m 3"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(87);
		table.getColumnModel().getColumn(1).setPreferredWidth(133);
		table.getColumnModel().getColumn(2).setPreferredWidth(117);
		table.getColumnModel().getColumn(3).setPreferredWidth(101);
		table.getColumnModel().getColumn(4).setPreferredWidth(55);
		table.getColumnModel().getColumn(5).setPreferredWidth(42);
		table.getColumnModel().getColumn(6).setPreferredWidth(43);
		table.getColumnModel().getColumn(7).setPreferredWidth(40);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 104, 725, 181);
		contentPane.add(scrollPane);
		
		JLabel labelThongtinTS = new JLabel("Thông tin thí sinh:");
		labelThongtinTS.setForeground(Color.BLUE);
		labelThongtinTS.setHorizontalAlignment(SwingConstants.CENTER);
		labelThongtinTS.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelThongtinTS.setBackground(Color.YELLOW);
		labelThongtinTS.setBounds(10, 294, 155, 32);
		contentPane.add(labelThongtinTS);
		
		labelMaTS_TT = new JLabel("Mã thí sinh:");
		labelMaTS_TT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelMaTS_TT.setBackground(Color.YELLOW);
		labelMaTS_TT.setBounds(32, 324, 112, 32);
		contentPane.add(labelMaTS_TT);
		
		jtextMaTS_TT = new JTextField();
		jtextMaTS_TT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jtextMaTS_TT.setColumns(10);
		jtextMaTS_TT.setBounds(154, 327, 198, 25);
		contentPane.add(jtextMaTS_TT);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setForeground(Color.BLACK);
		separator_2_1.setBackground(Color.BLACK);
		separator_2_1.setBounds(10, 296, 710, 17);
		contentPane.add(separator_2_1);
		
		JLabel labelHoVaTen = new JLabel(" Họ và tên:  ");
		labelHoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelHoVaTen.setBackground(Color.YELLOW);
		labelHoVaTen.setBounds(32, 367, 99, 32);
		contentPane.add(labelHoVaTen);
		
		jtextHoTen = new JTextField();
		jtextHoTen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jtextHoTen.setColumns(10);
		jtextHoTen.setBounds(154, 370, 198, 25);
		contentPane.add(jtextHoTen);
		
		JLabel labelMaTS_1_1_1 = new JLabel("Mã thí sinh:");
		labelMaTS_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelMaTS_1_1_1.setBackground(Color.YELLOW);
		labelMaTS_1_1_1.setBounds(-37, 641, 112, 32);
		contentPane.add(labelMaTS_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(72, 641, 198, 32);
		contentPane.add(textField_2);
		
		JLabel labelQueQuan_TT = new JLabel("Quê quán:");
		labelQueQuan_TT.setHorizontalAlignment(SwingConstants.CENTER);
		labelQueQuan_TT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelQueQuan_TT.setBackground(Color.YELLOW);
		labelQueQuan_TT.setBounds(32, 401, 90, 32);
		contentPane.add(labelQueQuan_TT);
		
		comboBox_QueQuanTT = new JComboBox();
		comboBox_QueQuanTT.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_QueQuanTT.addItem("");
		for (Tinh tinh : listTinh) {
			comboBox_QueQuanTT.addItem(tinh.getTenTinh());
		}
		comboBox_QueQuanTT.setBounds(154, 406, 198, 25);
		contentPane.add(comboBox_QueQuanTT);
		
		JLabel labelNgaySinh_TT = new JLabel(" Ngày sinh:");
		labelNgaySinh_TT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelNgaySinh_TT.setBackground(Color.YELLOW);
		labelNgaySinh_TT.setBounds(32, 434, 112, 32);
		contentPane.add(labelNgaySinh_TT);
		
		jtextNgaySinh_TT = new JTextField();
		jtextNgaySinh_TT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jtextNgaySinh_TT.setColumns(10);
		jtextNgaySinh_TT.setBounds(154, 441, 198, 25);
		contentPane.add(jtextNgaySinh_TT);
		
		JLabel labelGioiTinh_TT = new JLabel("Giới tính:");
		labelGioiTinh_TT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelGioiTinh_TT.setBackground(Color.YELLOW);
		labelGioiTinh_TT.setBounds(423, 324, 112, 32);
		contentPane.add(labelGioiTinh_TT);
		
		JRadioButton radioNam = new JRadioButton("Nam");
		radioNam.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radioNam.setHorizontalAlignment(SwingConstants.TRAILING);
		radioNam.setBounds(501, 330, 65, 23);
		contentPane.add(radioNam);
		
		JRadioButton radioNu = new JRadioButton("Nữ");
		radioNu.setHorizontalAlignment(SwingConstants.LEFT);
		radioNu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radioNu.setBounds(578, 330, 65, 23);
		contentPane.add(radioNu);
		
		btg_GioiTinh = new ButtonGroup();
		btg_GioiTinh.add(radioNam);
		btg_GioiTinh.add(radioNu);
		
		JLabel labelDiem1_TT = new JLabel("Điểm 1:");
		labelDiem1_TT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelDiem1_TT.setBackground(Color.YELLOW);
		labelDiem1_TT.setBounds(423, 367, 112, 32);
		contentPane.add(labelDiem1_TT);
		
		jtextDiem1_TT = new JTextField();
		jtextDiem1_TT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jtextDiem1_TT.setColumns(10);
		jtextDiem1_TT.setBounds(509, 367, 57, 28);
		contentPane.add(jtextDiem1_TT);
		
		JLabel labelDiem2_TT = new JLabel("Điểm 2:");
		labelDiem2_TT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelDiem2_TT.setBackground(Color.YELLOW);
		labelDiem2_TT.setBounds(423, 401, 112, 32);
		contentPane.add(labelDiem2_TT);
		
		jtextDiem2_TT = new JTextField();
		jtextDiem2_TT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jtextDiem2_TT.setColumns(10);
		jtextDiem2_TT.setBounds(509, 403, 57, 28);
		contentPane.add(jtextDiem2_TT);
		
		JLabel labelDiem3_TT = new JLabel("Điểm 3:");
		labelDiem3_TT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelDiem3_TT.setBackground(Color.YELLOW);
		labelDiem3_TT.setBounds(423, 434, 112, 32);
		contentPane.add(labelDiem3_TT);
		
		jtextDiem3_TT = new JTextField();
		jtextDiem3_TT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jtextDiem3_TT.setColumns(10);
		jtextDiem3_TT.setBounds(509, 436, 57, 28);
		contentPane.add(jtextDiem3_TT);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setForeground(Color.BLACK);
		separator_2_2.setBackground(Color.BLACK);
		separator_2_2.setBounds(25, 477, 710, 2);
		contentPane.add(separator_2_2);
		
		JLabel labelChucNang = new JLabel("Chức năng:");
		labelChucNang.setForeground(Color.BLUE);
		labelChucNang.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelChucNang.setBackground(Color.YELLOW);
		labelChucNang.setBounds(32, 477, 112, 32);
		contentPane.add(labelChucNang);
		
		JButton JbuttonThem = new JButton("Thêm");
		JbuttonThem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		JbuttonThem.setBounds(66, 505, 99, 32);
		contentPane.add(JbuttonThem);
		JbuttonThem.addActionListener(actionQlsvController);
		
		JButton JbuttonCapNhat = new JButton("Cập nhật");
		JbuttonCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		JbuttonCapNhat.setBounds(336, 505, 105, 32);
		contentPane.add(JbuttonCapNhat);
		JbuttonCapNhat.addActionListener(actionQlsvController);
		
		JButton JbuttonXoa = new JButton("Xóa");
		JbuttonXoa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		JbuttonXoa.setBounds(200, 505, 99, 32);
		contentPane.add(JbuttonXoa);
		JbuttonXoa.addActionListener(actionQlsvController);
		
		JButton JbuttonLuu = new JButton("Lưu");
		JbuttonLuu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		JbuttonLuu.setBounds(474, 505, 99, 32);
		contentPane.add(JbuttonLuu);
		JbuttonLuu.addActionListener(actionQlsvController);
		
		JButton JbuttonHuyBo = new JButton("Hủy bỏ");
		JbuttonHuyBo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		JbuttonHuyBo.setBounds(608, 505, 99, 32);
		contentPane.add(JbuttonHuyBo);
		JbuttonHuyBo.addActionListener(actionQlsvController);
		

		setVisible(true);
	}

	public void xoaForm() {
		jtextMaTS_TT.setText("");
		jtextDiem1_TT.setText("");
		jtextDiem2_TT.setText("");
		jtextDiem3_TT.setText("");
		jtextNgaySinh_TT.setText("");
		jtextHoTen.setText("");
		comboBox_QueQuanTT.setSelectedIndex(-1); // j combox xoa ve nhu nay
		btg_GioiTinh.clearSelection();
	
	}

	public Tinh getTenTinhById(int indexQueQuan) {
		return Tinh.getDSTinh().get(indexQueQuan);
	}

	public void themThiSinh(ThiSinh ts) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		model_table.addRow(new Object[] {
				ts.getMaThiSinh() + "",
				ts.getTenThiSinh(), 
				ts.getQueQuan().getTenTinh(),
				//ts.getNgaySinh().toString(),
				ts.getNgaySinh().getDate() + "/" + 
				(ts.getNgaySinh().getMonth() + 1) + "/"+ 
				(ts.getNgaySinh().getYear() + 1900),
				(ts.isGioiTinh() ? "Nam" : "Nữ"), 
				ts.getDiem1() + "", 
				ts.getDiem2() + "",
				ts.getDiem3() + "", });
		
	}

	public void capNhatThiSinh(ThiSinh thiSinhMoi) {
		
		
	}
}
