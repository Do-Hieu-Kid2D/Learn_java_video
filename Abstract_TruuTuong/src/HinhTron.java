
public class HinhTron extends Hinh {
	
	private double banKinh;

	public HinhTron(ToaDo toaDo, double banKinh) {
		super(toaDo);
		this.banKinh = banKinh;
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}

	@Override
	public double tinhDienTich() {
		return Math.PI *banKinh*banKinh;
	}
	
	
	
	
			
	}
	

