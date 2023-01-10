
public class XeDap extends PhuongTien{

	public XeDap( HangSanXuat hangSanXuat) {
		super("Xe Dap", hangSanXuat);
	}

	@Override
	public double layVanToc() {
		return 10;
	}

	@Override
	public String layNhienLieu() {
		return null;
	}
	

}
