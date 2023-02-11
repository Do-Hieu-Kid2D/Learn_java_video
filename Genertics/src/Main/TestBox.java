package Main;

public class TestBox {
	public static void main(String[] args) {
		
		Box box = new Box(15);  // box chua gia tri int 15 dc 
		System.out.println("Gai tri box = "+box.getVaVlue());
		
//			Box box = new Box(17.4); // k dc value la float 
//			Box box = new Box(" truyen String vao int" ); // k dc luon string vao int sao dc
//		 => khi k dung Gennertic
		
	}
}
