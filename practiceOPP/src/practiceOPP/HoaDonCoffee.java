package practiceOPP;

import java.util.Scanner;

public class HoaDonCoffee {
//		Scanner sc = Scanner(System.in);
		private String tenLoaiCaPhe;
		private double giaTien;
		private double soLuong;
		//private double giam;
		public HoaDonCoffee(String ten, double gia, double kg) {
		
			this.tenLoaiCaPhe = ten;
			this.giaTien = gia;
			this.soLuong = kg;
			
		}
		
		public double TinhTien() {
			return this.giaTien*this.soLuong;
		}
		public boolean CheckData(float check) {
			return this.soLuong >=check;
		}
		
		public boolean TongTienlonhon500k() {
			return TinhTien()>500;
		}
		
		public double GiamGia(double x) {
			if(TongTienlonhon500k()) {
				return TinhTien()*(x/100);
			}
			else 
				return 0;
		}
		
		public double TienTra(double x) {
			return TinhTien()- GiamGia(x);
		}
}
