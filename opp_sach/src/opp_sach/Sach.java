package opp_sach;

public class Sach {
	
	private String tenSach;
	private double giaBan;
	private int namSB;
	private Tacgia tg;
	public Sach(String tenSach, double giaBan, int namSB, Tacgia tg) {
		//super();
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.namSB = namSB;
		this.tg = tg;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getNamSB() {
		return namSB;
	}
	public void setNamSB(int namSB) {
		this.namSB = namSB;
	}
	public Tacgia getTg() {
		return tg;
	}
	public void setTg(Tacgia tg) {
		this.tg = tg;
	}
	
	public void intenSach() {
		System.out.println("ten sach ="+this.tenSach);
	}
	
	public boolean checkcungnam(Sach sachkhac) {
		 
			 return this.namSB == sachkhac.namSB;
	}
	
	public double giaSaukhigiam(double x) {
		return this.giaBan - (this.giaBan*(x/100.0));
	}

}
