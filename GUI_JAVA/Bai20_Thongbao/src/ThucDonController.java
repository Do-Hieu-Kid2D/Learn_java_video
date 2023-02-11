import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Iterator;

import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

public class ThucDonController implements ActionListener{
	ThucDonView donView;

	public ThucDonController(ThucDonView donView) {
		this.donView = donView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String monchinh = "";
		monchinh = donView.jComboBox_MonChinh.getSelectedItem().toString();
		
		String monphu = "";
		Object[]  monphu_duocchon = donView.jlist_monPhu.getSelectedValues();
		for (Object o : monphu_duocchon) {
			monphu = monphu +o.toString() + "; "; 
		}
		donView.thucdonmodel.setLuaChon_MonChinh(monchinh);
		donView.thucdonmodel.setLuaChon_MonPhu(monphu);
		donView.thucdonmodel.tinhTongTien();
		donView.hienThiKetQua();
		
		String sotien_chuoi = (String) JOptionPane.showInputDialog(
				donView,
				donView.thongTinLuaChon.getText()+"\nNhap so tien:",
				"Thong bao!",
				JOptionPane.PLAIN_MESSAGE
				 );
		
		try {
			double sotien = Double.valueOf(sotien_chuoi);
			double tienthua = sotien - donView.thucdonmodel.getTongTien();
			if(tienthua<0) {
				JOptionPane.showMessageDialog(donView, 
						"Nhap du lieu NGU!!",
						"ERROR!",
						JOptionPane.ERROR_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(donView, 
						"Tra lai tien cho khach:"+ tienthua +"",
						"Thong bao!!",
						JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(donView, 
					"Nhap du lieu NGU!!",
					"ERROR!",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
}
	
	
