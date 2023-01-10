
public class Test {
	public static void main(String[] args) {
		
		Ngay n1 = new Ngay(4, 1, 2020);
		Ngay n2 = new Ngay(1, 1, 2021);
		Ngay n3 = new Ngay(4, 1, 2020);
		
		Lop l1 = new Lop("KMT", "Dien tu");
		Lop l2 = new Lop("xyz", "Dien");
		Lop l3 = new Lop("abc", "Kinh te");
		
		SinhVien sv1 = new SinhVien(123, "Do Hieu", n1, 2.0, l1);
		SinhVien sv2 = new SinhVien(123, "Le Quyen", n2, 3, l2);
		SinhVien sv3 = new SinhVien(123, "ai do ", n3, 10.0, l3);
		
		System.out.println("Ten khoa sv 1 la: "+ sv1.LayTenKhoa());
		System.out.println("Ten khoa sv 2 la: "+ sv2.LayTenKhoa());
		System.out.println("Ten khoa sv 3 la: "+ sv3.LayTenKhoa());
		
		System.out.println(" sinh vien 1 qua mon = " + sv1.KiemTraDiem());
		System.out.println(" sinh vien 2 qua mon = " + sv2.KiemTraDiem());
		System.out.println(" sinh vien 3 qua mon = " + sv3.KiemTraDiem());
		
		System.out.println("(chi ngay sinh k thoi!!) sv1 == sv3 ? : " + sv1.CheckNgaySinh(sv3));
		System.out.println("(chi ngay sinh k thoi!!) sv1 == sv2 ? : " + sv1.CheckNgaySinh(sv2));
			
		System.out.println("ngay thang nam sinh sv1 == sv2: "+ sv1.CungNgayThangNam(sv2));
		System.out.println("ngay thang nam sinh sv1 == sv3: "+ sv1.CungNgayThangNam(sv3));
	}
}
