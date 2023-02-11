package Main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ViDuDeque {
	
	public static void main(String[] args) {
		
		Deque<String> danhSachSinhVien = new ArrayDeque<String>();
		
		danhSachSinhVien.offer("thu 1 ");
		danhSachSinhVien.offer("thu 2 ");
		danhSachSinhVien.offerFirst("offerFist");
		danhSachSinhVien.offer("Thu 3 ");
		danhSachSinhVien.offerFirst("offerFist lan 2 ");
		danhSachSinhVien.offerLast("offferLAst");
		
		
		// lay ra va xoa khoi queue ! 
		while(true) {
			String ten = danhSachSinhVien.poll();
			if(ten == null ) {
				break;
			}
			System.out.println(ten);
			
		}
		
	}
}
