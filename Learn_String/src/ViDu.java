import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		System.out.println("Nhập chuỗi:");
		s = sc.nextLine();
		
		System.out.println("---------------");
		System.out.println("Chuỗi: " + s);
		// Độ dài chuỗi!! 
		int doDai = s.length();
		System.out.println("Do dai choi = "+ doDai); 
		
		// chatAt(vitri) -> lay ra 1 ki tu  tai  vi tri chi dinh ! 	
		// chuoi bat dau tu 0-> length() -1 ; 
		System.out.println("lay ki tu: ");
		for(int i = 0; i< doDai ; i++) {
			System.out.println("Vi tri "+i+" la: "+ s.charAt(i));
			
		}
		
		//getChar( VT begin , VT end -1 , arr chep vao, sao chep tu vi tri? trong arr moi)
		char[] arrchar = new char[100];
		s.getChars(0, 5, arrchar, 10);
		for(int i=0 ; i< arrchar.length; i++) {
			System.out.println("gia tri  arr["+i+"]= "+arrchar[i]);
			
		}
		
//		s.getBytes  -> ??????????????
		
		
		
		
	}
}
