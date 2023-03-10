package module;

import java.util.ArrayList;
import java.util.Objects;

public class Tinh {
	private String tenTinh;
	private int maTinh;
	public Tinh(int maTinh, String tenTinh ) {
//		super();
		this.tenTinh = tenTinh;
		this.maTinh = maTinh;
	}
	public String getTenTinh() {
		return tenTinh;
	}
	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}
	public int getMaTinh() {
		return maTinh;
	}
	public void setMaTinh(int maTinh) {
		this.maTinh = maTinh;
	}
	@Override
	public String toString() {
		return "Tinh [tenTinh=" + tenTinh + ", maTinh=" + maTinh + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(maTinh, tenTinh);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tinh other = (Tinh) obj;
		return maTinh == other.maTinh && Objects.equals(tenTinh, other.tenTinh);
	}
	
	// ham static k can phai thong qua doi tuong!
	// gam nay tra ve 1 ArrayList Tinh!
	public static ArrayList<Tinh> getDSTinh(){ 
		String[] arrTinh = {"An Giang",
				"Bà Rịa-Vũng Tàu",
				"Bắc Giang",
				"Bắc Kạn",
				"Bạc Liêu",
				"Bắc Ninh",
				"Bến Tre",
				"Bình Định",
				"Bình Dương",
				"Bình Phước",
				"Bình Thuận",
				"Cà Mau",
				"Cần Thơ",
				"Cao Bằng",
				"Đà Nẵng",
				"Đắk Lắk",
				"Đắk Nông",
				"Điện Biên",
				"Đồng Nai",
				"Đồng Tháp",
				"Gia Lai",
				"Hà Giang",
				"Hà Nam",
				"Hà Nội",
				"Hà Tĩnh",
				"Hải Dương",
				"Hải Phòng",
				"Hậu Giang",
				"TP. Hồ Chí Minh",
				"Hòa Bình",
				"Hưng Yên",
				"Khánh Hòa",
				"Kiên Giang",
				"Kon Tum",
				"Lai Châu",
				"Lâm Đồng",
				"Lạng Sơn",
				"Lào Cai",
				"Long An",
				"Nam Định",
				"Nghệ An",
				"Ninh Bình",
				"Ninh Thuận",
				"Phú Thọ",
				"Phú Yên",
				"Quảng Bình",
				"Quảng Nam",
				"Quảng Ngãi",
				"Quảng Ninh",
				"Quảng Trị",
				"Sóc Trăng",
				"Sơn La",
				"Tây Ninh",
				"Thái Bình",
				"Thái Nguyên",
				"Thanh Hóa",
				"Thừa Thiên - Huế",
				"Tiền Giang",
				"Trà Vinh",
				"Tuyên Quang",
				"Vĩnh Long",
				"Vĩnh Phúc",
				"Yên Bái",
		
		};
		ArrayList<Tinh> listTinh = new ArrayList<Tinh>();
		int i =0;
		for (String tenTinh : arrTinh) {
			Tinh t = new Tinh(i,tenTinh);
			listTinh.add(t);
		}
		return listTinh;
		
	}
	
}
	



