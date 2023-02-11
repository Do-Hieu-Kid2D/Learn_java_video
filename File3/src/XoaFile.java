import java.io.File;

public class XoaFile {
	public static void main(String[] args) {
		File f_r = new File("‪D:\\java_workpace\\File3\\rong");
		File f_c = new File("‪D:\\java_workpace\\File3\\Co_Chua");
		File f_txt = new File("‪D:\\java_workpace\\File3\\ngu.txt");
		File foder1 = new File("D:\\java_workpace\\File1");// tao 1 doi tuong 
		// XOA thu muc rong and file deleteOnExit 
		
		System.out.println(f_r.exists());
		
	}
	
}
