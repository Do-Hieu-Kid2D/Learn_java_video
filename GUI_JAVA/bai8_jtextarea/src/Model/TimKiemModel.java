package Model;

public class TimKiemModel {
	
	private String vanBan, tuKhoa, ketQua;
	
	public TimKiemModel() {
		this.vanBan="";
		this.tuKhoa="";
		this.ketQua="";
	}

	public String getVanBan() {
		return vanBan;
	}

	public void setVanBan(String vanBan) {
		this.vanBan = vanBan;
	}

	public String getTuKhoa() {
		return tuKhoa;
	}

	public void setTuKhoa(String tuKhoa) {
		this.tuKhoa = tuKhoa;
	}

	public String getKetQua() {
		return ketQua;
	}

	public void setKetQua(String ketQua) {
		this.ketQua = ketQua;
	}
	
	
	public void timKiem() {
		int dem = 0;
		int vitri =0;
		while(true) {
			int i = this.vanBan.indexOf(this.tuKhoa,vitri);
			if(i==-1) {
				// k tim thay tu khoa trong van ban !
				break;
			}else {
				dem++; // co 1 chư 
				vitri= i+1; // sau do tim them tu thang sau do 
			}
		}
		this.ketQua="Co so luong: "+dem+" "+ this.tuKhoa;
		System.out.println("Co so luong: "+dem+" "+ this.tuKhoa);
	}
	
}
