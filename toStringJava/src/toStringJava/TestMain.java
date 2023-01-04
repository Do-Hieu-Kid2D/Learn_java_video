package toStringJava;

public class TestMain {
	public static void main(String[] args) {
		
		MyDate md1 = new MyDate(6, 3, 2023);
		MyDate md2 = new MyDate(8, 4, 2023);
		MyDate md3 = new MyDate(6, 3, 2023);
		MyDate md4 = new MyDate(4, 2, 2023);
		
		System.out.println(md1);
		System.out.println(md2);
		System.out.println(md3);
		System.out.println(md4);
		
		// function equal  - so sanh 2 doi tuong giong nhau k 
		
		if(md1 == md3) {
			System.out.println("Giong nhau!!");
		}
		else {
			System.out.println("khong giong nhau!!");
		} // => k so sanh kieu nay dc nha bro ! k dung == dc ! 
		
		System.out.println("So sanh md1 voi md2: "+md1.equals(md2));
		System.out.println("So sanh md1 voi md3: " +md1.equals(md3));
		System.out.println("So sanh md1 voi md4: " + md1.equals(md4));
		// and hascod- se tra ve 1 gia tri nao do ma t chua biet 
		
		System.out.println("hashcode md1= "+md1.hashCode());
		System.out.println("hashcode md2= "+md2.hashCode());
		System.out.println("hashcode md3= "+md3.hashCode()); // chua hieu 
	} 

}
