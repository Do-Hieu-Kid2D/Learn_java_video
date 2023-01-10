
public class Oto extends PhuongTien{
	private String tenNhienLieu;

	public Oto( HangSanXuat hangSanXuat, String tenNhienLieu) {
		super("O to" , hangSanXuat);
		this.tenNhienLieu = tenNhienLieu;
	}

	@Override
	public double layVanToc() {
		return 160;
	}

	@Override
	public String layNhienLieu() {
		return this.tenNhienLieu;
	}
	
	
}
