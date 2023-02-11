package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;

	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		//super();
		this.danhSach = danhSach;
	}

	public DanhSachSinhVien() { // constructor rong 
		//super(); 
		this.danhSach = new ArrayList<SinhVien>();
	}
	
	
	
	// 1.them sinh vien vao danh sach! 
	
	public void themSinhVien( SinhVien sv) {
		this.danhSach.add(sv);   // chen vao cuoi danh sach! 
	}
	
	// 2. In danh sach sinh vien //
	public void inDanhSachSinhVien() {
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien.toString());
		}
		
	}
	
	// 3. Check danh sach rong?
	public boolean KiemTraDanhSach() {
		return this.danhSach.isEmpty();
	}
	
	// 4. lay ra so luong sv trong danh sach! => so luong phan tu trong arraylist
	public int soLuongSinhVien() {
		return this.danhSach.size();
	}
	
	// 5. xoa all phan tu;
	public void lamRong() {
		this.danhSach.removeAll(danhSach);
	}
	
	// 6. Ktra ma sinh vien nay co ton tai k 
	public boolean kiemTraSinhVien(SinhVien sv ) {
		return this.danhSach.contains(sv);
	}
	
	// 7. xoa 1 sv ra khoi danh sach
	public boolean  Xoa1SinhVien(SinhVien sv) {
		return this.danhSach.remove(sv);
	}
	
	// 8. tim kiem 1 sinh vien theo ten!
	public void timSinhVien(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if(sinhVien.getHoVaTen().indexOf(ten) >0 ) {
				System.out.println(sinhVien);
			}
		}
	}
	
	// 9. Xuat ra ds sinh vien co diem tu thap den cao! 
	public void sapXepGIamDan() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				
				if(sv1.getDiemTrunBinh() < sv2.getDiemTrunBinh()) {
					return 1;
				}
				else if(sv1.getDiemTrunBinh() > sv2.getDiemTrunBinh()) {
					return -1;
				}
				else {
					return 0;
				}
			}
			
		});
	}
	
	
}
