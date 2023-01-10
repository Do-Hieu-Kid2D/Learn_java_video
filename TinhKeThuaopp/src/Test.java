
public class Test {
	public static void main(String[] args) {
		ConNguoi nguoi1 = new ConNguoi("Hieu", 2002);
		nguoi1.An();
		nguoi1.Uong();
		nguoi1.Ngu();
		
		HocSinh hs = new HocSinh("Hieu2", 1002, "lop 1", "Truong nguoi ta");
		
		hs.An();
		hs.Ngu();
		hs.Uong();
		hs.LamBaiTap();
		
	}
}
