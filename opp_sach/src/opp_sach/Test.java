package opp_sach;

public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(1, 1, 2021);
		Ngay ngay2 = new Ngay(2, 2, 2022);
		Ngay ngay3 = new Ngay(23, 2, 2023);
		
		Tacgia tg1 = new Tacgia("Hieu",ngay1);
		Tacgia tg2 = new Tacgia("Dkid", ngay2);
		Tacgia tg3 = new Tacgia("Do Van Ngu ", ngay3);
		
		Sach sach1 = new Sach("Lap trinh c", 5000, 2020, tg1);
		Sach sach2 = new Sach("Lap trinh java", 4006, 2010, tg2);
		Sach sach3 = new Sach("Lap trinh tro choi ", 1000, 2020, tg3);
		
		sach1.intenSach();
		sach2.intenSach();
		sach3.intenSach();
		
		System.out.println("so sanh s1 vs s3 "+sach1.checkcungnam(sach3));
		System.out.println("so sanh s1 vs s2 "+sach1.checkcungnam(sach2));
		
		System.out.println("sach 1 sau khi giam 3%= "+sach1.giaSaukhigiam(3));
		System.out.println("Sach 2 sau khi giam 4%= "+sach2.giaSaukhigiam(4));
		System.out.println("Sach 3 sau khi giam 10%= "+sach3.giaSaukhigiam(10));

		
		
		
	}
}
