import java.util.Scanner;
import java.util.Stack;

public class Tetst {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String> stackChuoi =  new Stack<String>();
		
		// push them 1 gia tri 
		// pop  lay 1 gia tri ra  -> xoa no khoi stack // do lon stack giam di 1 
		// peek satu stack 
		// clear  xoa all data stack 
		// contains("gia tri") -> k tra gia tri nay co trong chuoi k??
		
		// ví dụ đảo ngược chuỗi dùng stack 
		
		System.out.println("Nhap chuoi: ");
		String s = sc.nextLine();
		
		for (int i = 0; i < s.length(); i++) {
			stackChuoi.push(s.charAt(i)+"");
			
		}
		
		System.out.println("Chuoi dao nguoc: ");
		
		for (int i = 0; i < s.length(); i++) {
			
			System.out.print(stackChuoi.pop());
			
		}
		
		// doi so thap phan ra nhị phân! kết quả dư push vào stack
		// khi lấy kết quả thì lấy từ stack ra!
		System.out.println("\nNhập số thập phân: ");
		int x = sc.nextInt();
		Stack<Integer>  chuoiSo = new Stack<Integer>();
		
		while(x>0) {
			int soDu = x%2;
			chuoiSo.push(soDu);
			x=x/2;
		}
		System.out.println("\nket qua chuyen doi: ");
		int n = chuoiSo.size();
		for (int i = 0; i < n  ; i++) {
			System.out.print(chuoiSo.pop());
		}
		
	}
}
