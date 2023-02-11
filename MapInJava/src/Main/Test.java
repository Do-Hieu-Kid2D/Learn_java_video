package Main;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		TuDien tuDien = new TuDien();
		
		Scanner sc = new Scanner(System.in);
		
		int flag ;
		do {
			System.out.println("---------TRA TU DIEN--------\n");
			System.out.println(">> Moi Lua Chon:\n"
					+ "1. Them 1 tu.\n"
					+ "2. Xoa 1 tu.\n"
					+ "3. Tra tu.\n"
					+ "4. In danh sach tu khoa.\n"
					+ "5. In ra song luong tu trong tu dien.\n"
					+ "6. Xoa tat ca!!!.\n"
					+ "0. OUT!\n");
			flag = sc.nextInt();
			sc.nextLine();
			
			switch(flag) {
			case 1:
				System.out.println("Nhap tu khoa: ");
				String tuKhoa = sc.nextLine();
				System.out.println("Nhap y nghia: ");
				String yNghia = sc.nextLine();
				tuDien.themTu(tuKhoa, yNghia);
				break;
			case 2:
				System.out.println("Nhap tu khoa: ");
				tuKhoa = sc.nextLine();
				tuDien.xoaTu(tuKhoa);
				break;
			case 3:
				System.out.println("Nhap tu khoa: ");
				tuKhoa = sc.nextLine();
				System.out.println("Ket qua tra tu:\n>>"+tuKhoa+ "  : "+tuDien.traTu(tuKhoa));
				break; 
			case 4:
				System.out.println("So luong tu hien tai:");
				tuDien.inTuKhoa(); 
				break;
			case 5:
				System.out.println("So luong tu khoa: "+tuDien.laySoLuong());
				break;
			case 6:
				System.out.println("------DA XOA TAT CA---------");
				tuDien.xoaTuDien();
				break;
			case 0:
				System.out.println("Thoat game!!!! ----");
					
				
			}
			
		}while(flag !=0);
		
		
	}
}
