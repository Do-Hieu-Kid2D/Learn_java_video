package learnInterface;

public class Test {
	public static void main(String[] args) {
		System.out.println("Test cau a: ");
		MayTinhCasioFX500 mfx = new MayTinhCasioFX500();
		MayTinhViNACon500 vnc = new MayTinhViNACon500();
		
		System.out.println("fx 4 + 5 = "+ mfx.cong(4, 5));
		System.out.println(" vina 4 / 7 = "+ vnc.chia(4, 7));
		
		System.out.println("Test cau b: ");
		
		double[] arr1 = new double[] {1,6,24,-4,42,-5};
		double[] arr2 =  new double[] {1,63	,5,6,0-1,5};
		
		XapXepChon sxc = new XapXepChon();
		SapXepChen xxc = new SapXepChen();
		
		sxc.sapXepGiam(arr1);
		xxc.sapXepTang(arr2);
		
		System.out.println("ss chon giam = ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\nmang 2 ss chen tang ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		System.out.println("Cau 3 !!!! ");
		
		double[] arr3 = new double[] {1,6,2,5,6,8,2,1,-4,42,-5};
		PhanMemMayTinh pm = new PhanMemMayTinh();
		pm.sapXepGiam(arr3);
		
		System.out.println("giam mang 3  ");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		
		System.out.println("\npham mem may tinh cong = "+ pm.cong(3, 66));
		

		
		
	}
}
