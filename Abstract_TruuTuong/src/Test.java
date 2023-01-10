
public class Test {
	public static void main(String[] args) {
		
		ToaDo td1 = new ToaDo(1, 1);
		ToaDo td2 = new ToaDo(2, 2);
		ToaDo td3 = new ToaDo(3, 3);
		
		// Hinh h1 = new Hinh(td1); hinh dang la lop truu tuong -> cai nay la tao
								// qua contruster -> cacs bih thuong nay k dc!
		
		Hinh h1 = new Diem(td1);
		
		Hinh h2 = new HinhTron(td2, 3.5);
		
		Hinh h3 = new HInhChuNhat(td3, 2, 20);
		
		System.out.println("Dien tich diem = "+ h1.tinhDienTich());
		System.out.println("Dien tich Tron = "+ h2.tinhDienTich());
		System.out.println("Dien tich Chu Nhat = "+ h3.tinhDienTich());
		
		
		
		
		
		
		
		
		
		
		
		
	}
}	
