package Main;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCoUuTien {
	public static void main(String[] args) {
		
		Queue<String> danhSachSinhVien = new PriorityQueue<String>();
		
		
		// them 1 phan tu vao queue!
		danhSachSinhVien.offer("Heu dep !!");
		danhSachSinhVien.offer("Hai cham ");
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
