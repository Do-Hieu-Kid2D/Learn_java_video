package vidu;

public class Test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(123, "Do Van H", "Lop A", 9);
		SinhVien sv2 = new SinhVien(123, "Do Van A ", "Lop b ", 9);
		SinhVien sv3 = new SinhVien(123, "Do Van K ", "Lop c", 9);
		
		// dung sau thi ra so duong!
		// dung truoc thi ra so am! 
		System.out.println(" SS sv1 voi sv2: "+ sv1.compareTo(sv2));
		System.out.println(" SS sv1 voi sv3: "+ sv1.compareTo(sv3));
		
	}
}
