package Main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
	
	private Map<String , String > data = new TreeMap<String, String >(); // co thu tu 
	// private Map<String , String > data = new HashMap<String, String >(); // k thu tu 
	//1. them 1 tu  !!! 
	public String themTu(String tuKhoa , String yNghia) {
		return this.data.put(tuKhoa, yNghia);
	}
	
	// 2. xoa 1 tu 
	public String xoaTu(String tuKhoa) {
		return this.data.remove(tuKhoa);	
	}
	
	// 3. Tra tu
	public String traTu(String tuKhoa) { // nhap tu khoa de tra value 
		String valueOfKey = this.data.get(tuKhoa);
		return valueOfKey;
	}
	
	// 4. In ra danh sach cac khoa! -> chi key thoi!
	public void inTuKhoa() {
		Set<String> tapHopTuKhoa = this.data.keySet(); 
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
	}
	
	// 5. In so luong cac tu khoa!
	public int laySoLuong() {
		return this.data.size();
	}
	
	// 6. xoa all
	public void xoaTuDien() {
		this.data.clear();
	}
	
	
	
	
	
	
	
}

