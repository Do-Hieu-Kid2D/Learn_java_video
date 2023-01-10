
public abstract class PhuongTien {
	protected String tenPhuongTien;
	protected HangSanXuat hangSanXuat;
	
	public PhuongTien(String tenPhuongTien, HangSanXuat hangSanXuat) {
		super();
		this.tenPhuongTien = tenPhuongTien;
		this.hangSanXuat = hangSanXuat;
	}
	
	public String getTenPhuongTien() {
		return tenPhuongTien;
	}
	public void setTenPhuongTien(String tenPhuongTien) {
		this.tenPhuongTien = tenPhuongTien;
	}
	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	
	public String layTenHangSanXuat() {
		return this.hangSanXuat.getTenHang();
		
	}
	
	public void  hoatDong() {
		System.out.println("Phuong tien nao cung di chuyen ");
	}
	
	public abstract double layVanToc(); 
	
	public abstract String layNhienLieu();
		
}
