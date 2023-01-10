import java.util.Arrays;

public class ViDu {
	
	
	public static int[] dao( int[] x   ) {
		int[] kq = new int[x.length];
		int index =0;
		for(int i = x.length-1 ;i>=0 ;i--) {
			 kq[index] = x[i];
			 index++;
		}
		
		return kq;
	}
	
	
	public static void main(String[] args) {
		
		
		
		
		int[] a = {10,2,9,1,4,3,7,5,6};
		int[] b = new int[14] ;
		
		// ham hien ra mang 
			System.out.println("mang a= "+Arrays.toString(a));
////		System.out.println("mang b= ")+Arrays.toString(b);

		Arrays.sort(a); // sap xep tang 
		System.out.println("mang a sau sx= "+Arrays.toString(a));
		
		// tim kiem xem 1 gia tri o vi tri nao?
		System.out.println("tim 4 teong mang a= "+Arrays.binarySearch(a, 4));
		System.out.println("tim -1 teong mang a= "+Arrays.binarySearch(a, -1));
		
		// dien gia tri cho mang! 
		Arrays.fill(b, 9);
		System.out.println("mangb= "+Arrays.toString(b));
		
		// tu viet ham dao nguoc de sap xep giam 
		
		int[] mang= dao(a);
		System.out.println("Mang giam= "+Arrays.toString(mang));
		
	}
}	
