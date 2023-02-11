package Main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import javax.swing.DefaultSingleSelectionModel;

/*  nguoi chơi có tài khoản với 1 số tiền!
	 * mỗi lần đặt cược được k quá số tiền mk sở hữu!
	 * => có 3 xúc xắc 1 -> 6 ở mỗi mặt ! tung lên và công diem 3 xuc xac!
	 * 
	 * kq = 3 hoặc 18 thì nhà cái ăn!
	 * kq = 4 -> 10  là xỉu ! đặt xỉu ăn!
	 * kq = 11-> 17  là tài ! -> tài ăn! 
	 *
	 * */
	 
public class TaiXiu {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// dinh dang cach viet va ten quoc gia
		Locale lc = new Locale("vi", "vn");
		// Locale lc = new Locale("en", "us"); ben my 
		
		// numberformat:
//	    NumberFormat numf = NumberFormat.getInstance(lc); // dinh dang so 
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);  // dinh dang hien tien te!!
		
		

		double taiKhoan = 5000000;
		double tienCuoc ;
		int luaChon = 1;
		
		do {
			System.out.println("-----------MOI BAN LUA CHON------------");
			System.out.println("       1.Choi\n       0.NGhi game");
			luaChon = sc.nextInt();
			if(luaChon == 1) {
				System.out.println("********BAT DAU CHOI!!");
				System.out.println("? Tai khoan ban con "+numf.format(taiKhoan) +" ban muon cuoc bao nhieu?");
				do {
					System.out.println("? dat tien(0 < tien cuoc < " +numf.format(taiKhoan)+") : ");
					tienCuoc = sc.nextDouble();
				} while(tienCuoc<0 || tienCuoc> taiKhoan) ;
				
				int luaCHonTaiXiu;
				do {
					System.out.println("? Ban cuoc TAI <-->1 | XIU <--> 2 ");
					luaCHonTaiXiu = sc.nextInt();
				}while(luaCHonTaiXiu !=1 && luaCHonTaiXiu != 2);
				
				Random xucxac = new Random();
				int xx1,xx2,xx3;
				
				xx1 = xucxac.nextInt(5) +1;
				xx2 = xucxac.nextInt(5) +1;
				xx3 = xucxac.nextInt(5) +1;
				
				int ketQua = xx1 +xx2+xx3;
				
				System.out.println(">> Ket qua 3 xux xac: "+xx1+" : "+xx2+" : "+xx3+"\n");
				
				if(ketQua ==3 || ketQua == 18) {
					System.out.println(">>KQ = "+ketQua+" => Nha Cai an het!!!!");
					taiKhoan -=  tienCuoc;
					System.out.println(">>tai khoan ban con: "+numf.format(taiKhoan));
					
				}
				else if( ketQua >4 && ketQua<11) { //  xiu 
					if(luaCHonTaiXiu == 1) { // 1 la tai 
						System.out.println(">>KQ = tai <=> BAN DA THUA!!");
						taiKhoan -= tienCuoc;
						System.out.println(">>tai khoan ban con: "+numf.format(taiKhoan));
					}
					else {
						System.out.println(">>kq = XIU <=>  BAN DA THANG!!");
						taiKhoan -= tienCuoc;
						System.out.println(">>tai khoan ban con: "+numf.format(taiKhoan));
					}
					
				}
				else  { //  tai 
					if(luaCHonTaiXiu == 2) { // 2 la xiu 
						System.out.println(">>KQ = TAI <=> BAN DA THUA!!");
						taiKhoan -= tienCuoc;
						System.out.println(">>tai khoan ban con: "+numf.format(taiKhoan));
					}
					else {
						System.out.println(">>KQ = XIU <=>  BAN DA THANG!!");
						taiKhoan -= tienCuoc;
						System.out.println(">>tai khoan ban con: "+numf.format(taiKhoan));
						
					}
				}
			}
			else {
				System.out.println("-----------THOAT GAME--------------\n Ban con: "+numf.format(taiKhoan));
			}
		}while(luaChon != 0);
			
			
	}
		
}
	
	

	