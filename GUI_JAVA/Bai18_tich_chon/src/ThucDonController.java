import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;

public class ThucDonController implements ActionListener{
	ThucDonView donView;

	public ThucDonController(ThucDonView donView) {
		this.donView = donView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String monchinh = "";
		Enumeration<AbstractButton> button_monchinh = donView.buttonGroup_MonChinh.getElements();
		while(button_monchinh.hasMoreElements()) {
			AbstractButton b = button_monchinh.nextElement();
			if(b.isSelected()) {
				monchinh = b.getText();
			}
		}
		String monPhu = "";
		for (AbstractButton b : donView.list_buttonGroup_MonPhu) {
			if(b.isSelected()) {
				monPhu = monPhu+b.getText()+"; ";
			}
		}
		donView.thucdonmodel.setLuaChon_MonChinh(monchinh);
		donView.thucdonmodel.setLuaChon_MonPhu(monPhu);
		donView.thucdonmodel.tinhTongTien();
		donView.hienThiKetQua();
		
	}
	
	

}
