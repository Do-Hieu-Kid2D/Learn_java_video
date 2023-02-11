import java.io.File;
import java.io.IOException;

public class Tao {
	public static void main(String[] args) {
		
		File foder1 = new File("D:\\java_workpace\\File1");// tao 1 doi tuong 
															// tro vao thu muc nay
		// check thu muc ton gtai hay k thong qua doi tuong 
		System.out.println("Foder1 da dc tao? => "+ foder1.exists());
		
		// taoj 1 file !!  => mkdir 
		File d1 = new File("D:\\\\java_workpace\\\\File1\\Tao_thu_1_thu_muc");
		d1.mkdir();
		
		// su dung mkdirs thi tao 1 luc dc nhieu lop cua thu muc!
		File d2 = new File("D:\\\\java_workpace\\\\File1\\Tao_thu_2\\\\phan_con\\\\con_thu2\\\\con_cuoi_cung");
		d2.mkdirs();
		
		// tao file moi 
		// khi tao file phai try cacht vi loi co the la:
		// duong dan sai, het o cung, nguoi tao k co quyen tao 
		File file1 = new File("D:\\java_workpace\\File1\\File1.doc");
		try {
			file1.createNewFile(); // 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
