
public class Test {
	public static void main(String[] args) {

		HangSanXuat h1 = new HangSanXuat("Hang a", " Viet Nam");
		HangSanXuat h2 = new HangSanXuat("Hang b", " Viet Nam vip ");
		HangSanXuat h3 = new HangSanXuat("Hang c", " k phai Viet Nam");
		
		
//		PhuongTien m = new MayBay( h1, "Xang");
//		PhuongTien o = new Oto(h2, "Dau");
//		PhuongTien x = new XeDap(h3);
		
		MayBay m = new MayBay( h1, "Xang");
		Oto o = new Oto(h2, "Dau");
		XeDap x = new XeDap(h3);
		
		System.out.println("Hang sx may bay = "+ m.layTenHangSanXuat());
		System.out.println("Hang sx o to  = "+ o.layTenHangSanXuat());
		System.out.println("Hang sx xe dap = "+ x.layTenHangSanXuat());
				
		m.hoatDong();
		o.hoatDong();
		x.hoatDong();
		
		m.catCanh();
		m.haCanh();
		
		System.out.println("Nhien lieu xe dap = "+x.layNhienLieu());
		System.out.println("Nhien lieu o to  = " + o.layNhienLieu());
		System.out.println("Nhien lieu may bay  = " + m.layNhienLieu());
	}
}
	
