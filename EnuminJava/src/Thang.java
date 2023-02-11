
public enum Thang {
	thang_1(31), // enum co the mang cac gia tri ben trong 
	thang_2(28),
	thang_3(31),
	thang_4(30),
	thang_5(31),
	thang_6(30);
	
	private final int soNgay;      /// 1 bien hang la songay
	
	// ham  Contruster 
	Thang (int songay) {
		this.soNgay = songay;
	}
	
	// ham lay so ngay !
	public int getSoNgay(){
		return this.soNgay;
	}
}
