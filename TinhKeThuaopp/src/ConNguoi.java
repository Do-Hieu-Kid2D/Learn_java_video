
public class ConNguoi {
	private String hoVaTen;
	private int namSinh;
	
	public ConNguoi(String hoVaTen, int namSinh) {
		
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
	}
	
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	public void An() {
		System.out.println("Con Nguoi an!!");
	}
	
	public void Uong() {
		System.out.println("Con Nguoi dang uong ne !!");
	}
	
	public void Ngu() {
		System.out.println("Ngu 7h 1 day!!");
	}
	
}
