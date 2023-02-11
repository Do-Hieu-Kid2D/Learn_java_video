package Main;

import java.util.LinkedList;
import java.util.Queue;

public class ViDuQueue {
	public static void main(String[] args) {
		// queue interface 
		Queue<String> danhSachSinhVien = new LinkedList<String>();
		
		// them 1 phan tu vao queue!
		danhSachSinhVien.offer("Hieu dep trai!!");
		danhSachSinhVien.offer("Hoi cham");
		danhSachSinhVien.offer("Thay TITV");
		
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
