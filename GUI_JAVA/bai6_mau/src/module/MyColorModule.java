package module;

import java.awt.Color;

public class MyColorModule {
	private Color mauChu;
	private Color mauNen;
	private boolean mauVien ;
	
	public MyColorModule() {
		super();
		this.mauChu = Color.black;
		this.mauNen = Color.white;
		this.mauVien = false;

	}

	public Color getMauChu() {
		return mauChu;
	}

	public void setMauChu(Color mauChu) {
		this.mauChu = mauChu;
	}

	public Color getMauNen() {
		return mauNen;
	}

	public void setMauNen(Color mauNen) {
		this.mauNen = mauNen;
	}

	public boolean isMauVien() {
		return mauVien;
	}

	public void setMauVien(boolean mauVien) {
		this.mauVien = mauVien;
	}
	
	
}
