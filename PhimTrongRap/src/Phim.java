

public class Phim {
	private String tenPhim;
	private int namSanxuat;
	private HangSanXuat hangSanXuat;
	private double giaVe;
	private Ngay ngayChieu;
	
	public Phim(String tenPhim, int namSanxuat, HangSanXuat hangSanXuat, double giaVe, Ngay ngayChieu) {
		//super();
		this.tenPhim = tenPhim;
		this.namSanxuat = namSanxuat;
		this.hangSanXuat = hangSanXuat;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
		
	
		
	}

	public String getTenPhim() {
		return tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}

	public int getNamSanxuat() {
		return namSanxuat;
	}

	public void setNamSanxuat(int namSanxuat) {
		this.namSanxuat = namSanxuat;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public double getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}

	public Ngay getNgayChieu() {
		return ngayChieu;
	}

	public void setNgayChieu(Ngay ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	
	public boolean CheckGiaVe(Phim phimKhac) {
		return this.giaVe < phimKhac.giaVe;
		
	}
	
	public String GetHangSanXuatPhim() {
		return this.hangSanXuat.getTenHang();
	}
	
	public double GiaSauKhuyenMai(double x) {
		return this.giaVe*(1-(x/100.0));
	}
	
	
}
