import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class GhiFile {
	public static void main(String[] args) {
			
//		try {
//			PrintWriter pw = new PrintWriter("‪D:\\java_workpace\\GhiFile\\ngu.txt", "UTF-8");
//			pw.println("Hieu dep trai");
//			pw.flush();
//			pw.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			PrintWriter pw = new PrintWriter("‪D:\\java_workpace\\GhiFile\\ngu.txt", "UTF-8");
			pw.println("Xin chào, mình là TITV");
			pw.print("Dữ liệu: ");
			pw.print(3.14);
			pw.print(' ');
			pw.print(" là số PI");
			pw.println();
//			Student st = new Student(100, "Nguyen Van A");
//			pw.println(st);
//			pw.println();
//			pw.flush();
//			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Doc du lieu tu file ra 
		
		
		
		
		
		
	}
}
