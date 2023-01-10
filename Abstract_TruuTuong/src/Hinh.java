
public abstract class   Hinh {   // lop truu tuong lop cha cua tat ca 
	protected ToaDo toaDo;

	public Hinh(ToaDo toaDo) {
		super();
		this.toaDo = toaDo;
	}

	public ToaDo getToaDo() {
		return toaDo;
	}

	public void setToaDo(ToaDo toaDo) {
		this.toaDo = toaDo;
	}
	
	public abstract double tinhDienTich();// method truu tuong! lop cha dinh nghia  tinhdientich
										// - con cu the tinh nhu nao thi lop con tu dinh nghia 
		
		
	
	
}
