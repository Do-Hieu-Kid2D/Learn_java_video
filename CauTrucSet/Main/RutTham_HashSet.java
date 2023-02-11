package Main;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RutTham_HashSet {
	
		
	Set<String> thungPhieuDuThuong = new TreeSet<String>();
	
	
		
	public RutTham_HashSet() {	
	}
	
	public boolean themPhieu(String giaTri) {
		return this.thungPhieuDuThuong.add(giaTri);
		
	}
	
	public boolean xoaPhieu(String giaTRi) {
		return this.thungPhieuDuThuong.remove(giaTRi);
		
	}
	
	public boolean kiemTraPhieuTonTai(String giaTri) {
		return this.thungPhieuDuThuong.contains(giaTri);
		
	}
	
	public void xoaTatCaPhieu() {
		this.thungPhieuDuThuong.clear();
		
	}
	
	public int demSoLuongPHieu() {
		return this.thungPhieuDuThuong.size();
		
	}
	
	public String rutMotPhieu() {
		Random rd = new Random();
		int viTri = rd.nextInt(this.thungPhieuDuThuong.size());
		
		String ketQua = (String)  this.thungPhieuDuThuong.toArray()[viTri];
		return ketQua;
		
	}
	
	public void inTatCaPhieu() {
		//System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
		System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
	}
	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int luachon = 1 ; 
		RutTham_HashSet rt = new RutTham_HashSet();
		do {
			System.out.println("------------------\n--------MENU---------");
			System.out.println("1. Thêm mã số dự thưởng.\n"
					+ "2. Xóa 1 mã số dự thưởng.\n"
					+ "3. Kiểm tra 1 mã dự thưởng có tồn tại k?.\n"
					+ "4. Xóa tất cả phiếu dự thưởng.\n"
					+ "5. Dếm số lượng phiếu dự thưởng.\n"
					+ "6. Rút thăm trúng thưởng.\n"
					+ "7. In tat ca phieu!!\n"
					+ "0. Thoát Chương trình!!!.\n");
			
			luachon = sc.nextInt(); // sau khi nextIn() no xuong dong! cai xuong dong
									// nhap cho thang ben duoi???
			sc.nextLine(); // goi ham nay de no nhan cai xuong dong thua???
			
			
			if(luachon == 1 || luachon == 2 || luachon ==3) {
				
				System.out.println("Nhập mã phiếu dự thưởng:");
				String giaTri = sc.nextLine();
				
				if(luachon == 1) {
					System.out.println(">>Đã thêm phiếu: "+ giaTri+" Vào thùng!!= "+rt.themPhieu(giaTri));
				}
				else if(luachon ==2 ) {
					
					System.out.println(">>Đã xóa phiếu: "+ giaTri+" khoi thùng!!= "+rt.xoaPhieu(giaTri));
				}
				else {
					System.out.println(">>Kiểm tra phiếu = "+rt.kiemTraPhieuTonTai(giaTri));
				}
			}
			else if( luachon == 4) {
				rt.xoaTatCaPhieu();
			}
			else if( luachon == 5) {
				System.out.println("Tổng số lượng phiếu = "+rt.demSoLuongPHieu());
			}
			else if( luachon == 6) {
				System.out.println("Mã phiếu trúng thưởng: "+rt.rutMotPhieu());
			}
			else if( luachon == 7) {
				System.out.println("Cac ma phieu du thuong la: ");
				rt.inTatCaPhieu();
			}
			
			
		}while(luachon != 0 );
		
	
	}
}
