
public class SinhVien {
	private int maSoSinhVien;
	private String hoTen;
	private Ngay ngaySinh;
	private double diemTrungBinh;
	private Lop lop;
	public SinhVien(int maSoSinhVien, String hoTen, Ngay ngaySinh, double diemTrungBinh, Lop lop) {
		//super();
		this.maSoSinhVien = maSoSinhVien;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diemTrungBinh = diemTrungBinh;
		this.lop = lop;
	}
	
	
	public String LayTenKhoa() {
		return this.lop.getTenKhoa();
	}
	
	public boolean KiemTraDiem() {
		return this.diemTrungBinh >=5.0000;
	}
	
	public boolean CheckNgaySinh(SinhVien SVKhac) {
		return this.ngaySinh.getNgay() == SVKhac.ngaySinh.getNgay();
	}
	
	public boolean CungNgayThangNam(SinhVien SvKhac) {
		return this.ngaySinh.equals(SvKhac.ngaySinh);
	}
	
	
	
}
