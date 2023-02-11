package Test;

import java.util.Scanner;

import Main.DanhSachSinhVien;
import Main.SinhVien;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int flag ;
		do {
			System.out.println("----------MENU------------\n>>Moi ban chon: ");
			System.out.println(
					  "1.	Thêm sinh viên vào danh sách.\n"
					+ "2.	In danh sách sinh viên ra màn hình.\n"
					+ "3.	Kiểm tra danh sách có rỗng hay không.\n"
					+ "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
					+ "5.	Làm rỗng danh sách sinh viên.\n"
					+ "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
					+ "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
					+ "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
					+ "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
					+ "0.   Thoát khỏi chương trình");
			flag = sc.nextInt();
			sc.nextLine();
			
			if(flag == 1) {
				System.out.println("Nhap ma SV: ");
				String maSV = sc.nextLine();
				System.out.println("Nhap  ho ten: ");
				String hoTen = sc.nextLine();
				System.out.println("Nhap  nam sinh: ");
				int namSinh = sc.nextInt();
				System.out.println("Nhap diem trung binh: ");
				double diemTB = sc.nextDouble();
				SinhVien sv = new SinhVien(hoTen, maSV, namSinh, diemTB);
				dssv.themSinhVien(sv);
				
			}
			else if(flag == 2) {
				dssv.inDanhSachSinhVien();
			}
			else if(flag == 3) {
				System.out.println("Danh sach rong ? => "+ dssv.KiemTraDanhSach());
			}
			else if(flag == 4) {
				System.out.println("So luong sinh vien? => "+dssv.soLuongSinhVien());
			}
			else if(flag == 5) {
				dssv.lamRong();
			}
			else if(flag == 6) {
				
				System.out.println("Nhap vao ma sinh vien muon ktra: ");
				String maSV = sc.nextLine();
				SinhVien sv = new SinhVien(maSV);
				System.out.println("Sinh vien o trong danh sach ? => "+ dssv.kiemTraSinhVien(sv));
			}
			else if(flag == 7) {
				System.out.println("Nhap vao ma sinh vien muon XOA : ");
				String maSV = sc.nextLine();
				SinhVien sv = new SinhVien(maSV);
				System.out.println("xoa sinh vien trong danh sach ? => "+dssv.Xoa1SinhVien(sv));
				

			}
			else if(flag == 8) {
				
				System.out.println("Nhap ho va ten: ");
				String hoVaten =sc.nextLine();
				System.out.println("Ket qua tim kiem ");
				dssv.timSinhVien(hoVaten);
	
			}
			else if(flag == 9) {
				dssv.sapXepGIamDan();
				dssv.inDanhSachSinhVien();
				
			}
			
			
		}while(flag != 0);
	}
}
