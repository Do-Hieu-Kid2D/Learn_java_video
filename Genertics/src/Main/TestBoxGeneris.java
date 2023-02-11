package Main;

public class TestBoxGeneris {
	public static void main(String[] args) {
		
		BoxGennertics box1  = new BoxGennertics<Integer>(16);
		System.out.println("Gia Tri Interger: "+ box1.getValue());
		
		BoxGennertics box2 = new BoxGennertics<String>("Hieu Dep Trai!!!!");
		System.out.println("Gia tri String: "+ box2.getValue());
		
		BoxGennertics box3 = new BoxGennertics<Double>(33.456);
		System.out.println("Gia tri double: "+box3.getValue());
		
		// voi gennertics thi T se dc thay the bang kieu du lieuj moi lan ta
		// truyen vao khac cung cu oke !!!
		
		
		
	}
}
