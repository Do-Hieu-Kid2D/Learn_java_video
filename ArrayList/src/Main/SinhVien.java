package Main;

public class SinhVien implements Comparable<SinhVien> {
	private String hoVaTen,maSinhVien;
	private int namSinh;
	private double diemTrunBinh;
	public SinhVien(String hoVaTen, String maSinhVien, int namSinh, double diemTrunBinh) {
		//super();
		this.hoVaTen = hoVaTen;
		this.maSinhVien = maSinhVien;
		this.namSinh = namSinh;
		this.diemTrunBinh = diemTrunBinh;
	}
	
	
	public SinhVien(String maSinhVien) {
		//super();
		this.maSinhVien = maSinhVien;
	}


	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public double getDiemTrunBinh() {
		return diemTrunBinh;
	}
	public void setDiemTrunBinh(double diemTrunBinh) {
		this.diemTrunBinh = diemTrunBinh;
	}
	@Override
	public String toString() {
		return "SinhVien [hoVaTen=" + hoVaTen + ", maSinhVien=" + maSinhVien + ", namSinh=" + namSinh
				+ ", diemTrunBinh=" + diemTrunBinh + "]";
	}
	@Override
	public int compareTo(SinhVien o) {
		return this.maSinhVien.compareTo(o.maSinhVien);
	}
	
	
	
	
	
}
