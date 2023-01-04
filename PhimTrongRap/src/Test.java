
public class Test {
	public static void main(String[] args) {
		HangSanXuat h1 = new HangSanXuat("Hang A" , "Viet Nam");
		HangSanXuat h2 = new HangSanXuat("Hang B" , "Trung Quoc");
		HangSanXuat h3 = new HangSanXuat("Hang C" , "My");
		
		Ngay n1 = new Ngay(1, 2, 2021);
		Ngay n2 = new Ngay(3, 4, 2022);
		Ngay n3 = new Ngay(5, 6, 2023);
		
		Phim phim1 = new Phim("Phim Lap Trinh" , 2010, h1,100, n1);
		Phim phim2 = new Phim("Phim Toan" , 2012, h2,200, n2);
		Phim phim3 = new Phim("Phim Tieng Anh " , 2016, h3,300, n3);
		
		System.out.println("Check gia ve p1 re hon gia ve p2 = "+ phim1.CheckGiaVe(phim2));;
		System.out.println("Check gia ve p3 re hon gia ve p2 = "+ phim3.CheckGiaVe(phim2));;
	
		// ten hang san xuat thi co san ham Get roi! con
		// hang san xuat o trong phim thi k co san! 
		
		
		System.out.println("Ten Hang sx phim 1: "+ phim1.GetHangSanXuatPhim());
		System.out.println("Ten Hang sx phim 2: "+ phim2.GetHangSanXuatPhim());
		System.out.println("Ten Hang sx phim 3: "+ phim3.GetHangSanXuatPhim());
		
		System.out.println("Gia Phim 1 sau khi giam 3%= "+ phim1.GiaSauKhuyenMai(3));
		System.out.println("Gia Phim 2 sau khi giam 3.5%= "+ phim2.GiaSauKhuyenMai(3.5));
		System.out.println("Gia Phim 3 sau khi giam 10%= "+ phim3.GiaSauKhuyenMai(10));
	
	
	}
}
