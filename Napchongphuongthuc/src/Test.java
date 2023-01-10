
public class Test {
	public static void main(String[] args) {
		MyMath m = new MyMath();
		
		System.out.println("Tim min int = "+ m.timMin(2, 4));
		System.out.println("Tim min double = "+ m.timMin(2.8, 4));
		
		System.out.println("Tim sum int 2 so   = "+ m.tinhTong(2, 4));
		int arr[]  = new int[] {1,2,43,4,5};
		System.out.println("Tim sum arr  int = "+ m.tinhTong(arr));
//		System.out.printl
		
	}
}
