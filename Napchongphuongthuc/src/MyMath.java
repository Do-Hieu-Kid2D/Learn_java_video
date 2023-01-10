
public class MyMath {
	
	public int timMin(int a, int b) {  // ten giong nhau
		if(a<b) {
			return a;
		}
		else {
			return b; 
		}
	}
	
	public double timMin(double a, double b) {    // ten giong nhau
		if(a<b) {
			return a;
		}
		else {
			return b; 
		}
	}
	
	public int tinhTong(int a, int b) {
		return a+b;
	}
	
	public int tinhTong( int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
		
	}
	
	
	
	
	
	
	
}
