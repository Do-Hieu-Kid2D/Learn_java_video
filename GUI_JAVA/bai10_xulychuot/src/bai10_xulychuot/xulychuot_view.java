package bai10_xulychuot;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.Format;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class xulychuot_view extends JFrame{
	// lop xu ly chuot view nay dang la lop con cua lop jFamre
	xulychuot_module xulychuot_module_view;
	private JLabel kq_vitri;
	private JLabel kq_solan_click;
	private JLabel toa_do_y;
	private JLabel toa_do_x;
	private JPanel vung_ket_qua;
	private JPanel khung_hinh;
	public xulychuot_view() {
		xulychuot_module_view = new xulychuot_module();
		this.init();
		this.setVisible(true);
	}
	
	private void init() {
		this.setTitle("Xu ly chuot");
		this.setSize(600,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Font f = new Font("Arial",Font.BOLD,22);
		//Format form1 = new 
		xulychuot_controller chuot_controller = new xulychuot_controller(this);
		// tao vung thao tac 
		khung_hinh = new JPanel();
		khung_hinh.setBackground(Color.yellow);
		khung_hinh.addMouseListener(chuot_controller);
		khung_hinh.addMouseMotionListener(chuot_controller);
		JLabel chu_khung_hinh = new JLabel("Di vao day choi ban oi!!!");
		chu_khung_hinh.setFont(f);
		khung_hinh.add(chu_khung_hinh);
		
		// tao vung tra ket qua 
		vung_ket_qua = new JPanel();
		vung_ket_qua.setLayout(new GridLayout(3,3,8,8));
		JLabel toa_do = new JLabel("Toa do:");
		toa_do.setFont(f);
		toa_do_x = new JLabel("x=");
		toa_do_x.setFont(f);
		toa_do_y = new JLabel("y=");
		toa_do_y.setFont(f);
		JLabel solan_click = new JLabel("So lan click:");
		solan_click.setFont(f);
		kq_solan_click = new JLabel("n");
		kq_solan_click.setFont(f);
		JLabel vitri = new JLabel("chuot trong nha:");
		vitri.setFont(f);
		kq_vitri = new JLabel("No!");
		kq_vitri.setFont(f);
		JLabel rong1 = new JLabel();
		JLabel rong2 = new JLabel();
		
		vung_ket_qua.add(toa_do);
		vung_ket_qua.add(toa_do_x);
		vung_ket_qua.add(toa_do_y);
		vung_ket_qua.add(solan_click);
		vung_ket_qua.add(kq_solan_click);
		vung_ket_qua.add(rong1);
		vung_ket_qua.add(vitri);
		vung_ket_qua.add(kq_vitri);
		vung_ket_qua.add(rong2);
		
		this.setLayout(new BorderLayout());
		this.add(khung_hinh,BorderLayout.CENTER);
		this.add(vung_ket_qua,BorderLayout.SOUTH);
		
	}
	public void click() {
		this.xulychuot_module_view.anclick();
		this.kq_solan_click.setText(this.xulychuot_module_view.getCount()+"");
	}
	
	public void chuot_di_vao() {
		this.xulychuot_module_view.divao();
		this.kq_vitri.setText(xulychuot_module_view.getVi_tri());
	}
	
	public void chuot_di_ra() {
		this.xulychuot_module_view.dira();
		this.kq_vitri.setText(xulychuot_module_view.getVi_tri());
	}
	public void cap_nhat_vitri(int x, int y) {
		this.xulychuot_module_view.cap_nhat_vi_tri(x, y);
		this.toa_do_x.setText(xulychuot_module_view.getX()+"");
		this.toa_do_y.setText(xulychuot_module_view.getY()+"");
	}
	
}
