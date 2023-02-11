import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Iterator;

import javax.swing.AbstractButton;

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
		
	}
	
	

}
