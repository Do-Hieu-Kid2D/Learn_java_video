package practiceOPP;

public class TestMain {
	public static void main(String[] args) {
		HoaDonCoffee hd = new HoaDonCoffee("Hiu dep trai",100,5.1);
//		HoaDonCoffee h2 = new HoaDonCoffee(null, 0, 0)
		System.out.println("Tong tien = "+hd.TinhTien());
		System.out.println("check xem so luong >100? = "+hd.CheckData(100)); // true 
		System.out.println("check xem so luong >160? = "+hd.CheckData(160));  // false
		System.out.println("check xem so luong >16? = "+hd.CheckData(16));  //  true
		
		System.out.println("==========");
		System.out.println("tong tien >500?= "+hd.TongTienlonhon500k());
		System.out.println("==========");
		System.out.println("Vay nen so tien dc giam = "+hd.GiamGia(3));
		
		System.out.println("==========");
		System.out.println("Gia cuoi cung = "+ hd.TienTra(3));
	}

}
