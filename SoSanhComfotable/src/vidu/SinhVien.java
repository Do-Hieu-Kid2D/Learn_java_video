package vidu;

public class SinhVien implements Comparable<SinhVien>{
	private int maSinhVien;
	private String hoVaTen;
	private String tenLop;
	private double diemTrungBinh;
	
	public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTrungBinh = diemTrungBinh;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public String getTen() {
		String hoTen= this.hoVaTen.trim();
		int check =  hoTen.indexOf(" "); 
		int vt;
		if( check >0) {
			vt = hoTen.lastIndexOf(" ");
			return hoTen.substring(vt+1);
		}
		else {
			return hoTen; 
		}
			
	}
	
	@Override
	public int compareTo(SinhVien o) {
		// <0
		// =0
		// >0
		// Dua tren so sanh ten
		// Ten: Adam, Barack Obama,     Nguyen Van A     , Tran Thi Thanh Yen
		String tenThis = this.getTen();
		String tenO = o.getTen();
		
		return tenThis.compareTo(tenO);
		
		
	}
}


