
public class MayBay extends PhuongTien{
	private String tenNhienLieu;

	public MayBay(HangSanXuat hangSanXuat, String tenNhienLieu) {
		super("May Bay", hangSanXuat);
		this.tenNhienLieu = tenNhienLieu;
	}
	
	
	
	public String getTenNhienLieu() {
		return tenNhienLieu;
	}

	public void setTenNhienLieu(String tenNhienLieu) {
		this.tenNhienLieu = tenNhienLieu;
	}



	public void catCanh() {
		System.out.println(" Bay len !!!");
	}
	
	public void haCanh() {
		System.out.println(" Ha xuongggggggggggg !!!");
	}

	@Override
	public double layVanToc() {
		return 0;
	}

//	@Override
//	public String layNhienLieu() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	public String layNhienLieu() {
		
		return this.getTenNhienLieu();
	}
	
	
	
	
}
