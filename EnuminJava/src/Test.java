
public class Test {
	public static void main(String[] args) {
		
		ThoiKhoaBieu t2 = new ThoiKhoaBieu(Day.thu2, "Toan ly hoa"); 
		ThoiKhoaBieu t3 = new ThoiKhoaBieu(Day.thu3, "Toan sinh anh"); 
		ThoiKhoaBieu t4 = new ThoiKhoaBieu(Day.thu4, "Tthu w a"); 
		ThoiKhoaBieu t5 = new ThoiKhoaBieu(Day.thu5, "Tkhong t5 hoa"); 
		ThoiKhoaBieu t6 = new ThoiKhoaBieu(Day.thu6, "Toan t6 00oa"); 
		ThoiKhoaBieu t7 = new ThoiKhoaBieu(Day.thu7, "Toan ly vn a"); 
		
		System.out.println(t2.toString());
		
		int x = Thang.thang_1.getllSoNgay();
		System.out.println("enum thang 1: "+x+" days");
	}
}
