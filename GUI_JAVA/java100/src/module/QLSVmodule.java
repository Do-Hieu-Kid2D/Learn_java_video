package module;

import java.util.ArrayList;

public class QLSVmodule {
	private ArrayList<ThiSinh> dsThiSinh;
	private String truongHopNUtLuu;
	private String tenFile;
	
	public QLSVmodule() {
		this.dsThiSinh = new ArrayList<ThiSinh>();
		this.truongHopNUtLuu = "";
		this.tenFile="";
	}

	public QLSVmodule(ArrayList<ThiSinh> dsThiSinh) {
//		super();=
		this.dsThiSinh = dsThiSinh;
	}

	public ArrayList<ThiSinh> getDsThiSinh() {
		return dsThiSinh;
	}

	public void setDsThiSinh(ArrayList<ThiSinh> dsThiSinh) {
		this.dsThiSinh = dsThiSinh;
	}
	public void insert(ThiSinh thiSinh) {
		this.dsThiSinh.add(thiSinh);
	}
	
	public void delete(ThiSinh thiSinh) {
		this.dsThiSinh.remove(thiSinh);
	}
	
	public void update(ThiSinh thiSinh) {
		this.dsThiSinh.remove(thiSinh);
		this.dsThiSinh.add(thiSinh);
	}

	public String getLuaChon() {
		return truongHopNUtLuu;
	}

	public void setLuaChon(String truongHopNUtLuu) {
		this.truongHopNUtLuu = truongHopNUtLuu;
	}

	public String getTenFile() {
		return tenFile;
	}

	public void setTenFile(String tenFile) {
		this.tenFile = tenFile;
	}
	
	
	
	
	
}
