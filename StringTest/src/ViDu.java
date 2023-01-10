import java.lang.reflect.Array;
import java.util.Arrays;

public class ViDu {
	public static void main(String[] args) {
		String a= " ngu";
		String b = a;
		a 	="hack";
		System.out.println("a= "+ a);
		System.out.println("b= "+ b);
		
		int[] m = new int[] {1,2,3,4};
		int[] m2= m;
		m[0]= 6;
		System.out.println("mang m = "+ Arrays.toString(m));
		System.out.println("mang m2 = "+ Arrays.toString(m2));
		
		int[] m3 = m.clone();
		m[0]=99;
		System.out.println("mang m = "+ Arrays.toString(m));
		System.out.println("mang m3 clone  = "+ Arrays.toString(m2));
		System.out.println("mang m2 = "+ Arrays.toString(m2));
		
		int[] m4 = new int[m.length];
		System.arraycopy(m, 0, m4, 0, m.length);
		System.out.println("mang m = "+ Arrays.toString(m));
		System.out.println("mang m4 = "+ Arrays.toString(m4));
		
		// cat chuoi !
		String s = "Do Hieu dep trai!!"; 
		String[] mangchar = s.split(" "); // gap dau cach la cat 
		System.out.println(Arrays.toString(mangchar));
		
		String s2 = " Hom nay, tao an nhieu. No qua";
		mangchar = s2.split("\\. | \\, "); // cat  2 dk 1 la dau cham, 2 la dau phay 
		System.out.println(Arrays.toString(mangchar));
		
		// ap dung de cat lay ten! 
		String hoTen = "Do Van Hieu";
		mangchar = hoTen.split(" ");
		System.out.println("ten = "+ mangchar[mangchar.length-1]);
		
		
	}
}
