package xu_ly_ngoai_le;

import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=66;
		try {

			System.out.println("Nhap so nguyen int = ");
			a= sc.nextInt();
			
		} catch (Exception e) {
			
			System.out.println("Vao khoi cacth dau tien!!!!");
		}
		finally {
			System.out.println("Day la finally auto xuat ra!!!! du dung hay sai>>");
		}
		
		System.out.println("Gia tri int = "+a);
		System.out.println("End main");
		return;
	}

}
