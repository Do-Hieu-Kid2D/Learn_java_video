package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;

import module.ThiSinh;
import module.Tinh;
import view.QLSVView;

public class QLSVController implements ActionListener{
	QLSVView qlsvview;
	private ThiSinh thiSinhMoi;
	
	public QLSVController(QLSVView qlsvview) {
		this.qlsvview = qlsvview;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String mayBamGi = e.getActionCommand();
		JOptionPane.showMessageDialog(
				qlsvview,
				"Bạn vừa nhấn vào: "+ mayBamGi,
				"Thông báo!",
				JOptionPane.INFORMATION_MESSAGE);
		
		if(mayBamGi.equals("Thêm")) {
			qlsvview.xoaForm();
			qlsvview.model.setLuaChon("Thêm");
		}else if(mayBamGi.equals("Lưu")) {
			if(qlsvview.model.getLuaChon().equals("Thêm") || 
				qlsvview.model.getLuaChon().equals("")) {			
	// lay du lieu tu ben view là người dùng nhập vào đã! 
				try {
					int maThiSinh = Integer.valueOf(qlsvview.jtextMaTS_TT.getText());
					String tenThiSinh = qlsvview.jtextHoTen.getText(); 
					int indexQueQuan = qlsvview.comboBox_QueQuanTT.getSelectedIndex();
					Tinh tinh = qlsvview.getTenTinhById(indexQueQuan-1);
					Date ngaySinh = new Date(qlsvview.jtextNgaySinh_TT.getText());
					String chonGioiTinh = qlsvview.btg_GioiTinh.getSelection()+"";
					boolean gioiTinh = true;
					if(chonGioiTinh.equals("Nam")) {
						gioiTinh = true;
					}else if(chonGioiTinh.equals("Nữ")) {
						gioiTinh = false;
					}
					float diem1 = Float.valueOf(qlsvview.jtextDiem1_TT.getText());
					float diem2 = Float.valueOf(qlsvview.jtextDiem2_TT.getText());
					float diem3 = Float.valueOf(qlsvview.jtextDiem3_TT.getText());
		// da lay full thong tin! gio tao ra 1 thi sinh mới:
					thiSinhMoi = new ThiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh,
							gioiTinh, diem1, diem2, diem3);
					qlsvview.themThiSinh(thiSinhMoi);
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				}
			}else if(qlsvview.model.getLuaChon().equals("Cập nhật")) {
				qlsvview.capNhatThiSinh(thiSinhMoi);
				
			}
		
			
		}
	}
	
	

}
