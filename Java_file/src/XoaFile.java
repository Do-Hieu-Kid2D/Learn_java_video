import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
	
public class XoaFile {
	
	public static void XoaFilelao(File fx) {
		if(fx.isFile()) {  // xoa neu la tap tin 
			fx.delete();
		} 
		else if(fx.isDirectory()){  // la thu muc thi can xoa de quy 
			File[] mangFile = fx.listFiles();
			for (File f : mangFile) {  // lay con no goi ham lai;
				XoaFilelao(f);
			}
			fx.delete(); // song roi tu xoa no 
		}
	}
	
	public static void copyAll(File f1, File f2) {
		try {
			// Copy ban than no
			Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(f1.isDirectory()){
			// Copy cac tap tin va thu muc con
			File[] mangCon = f1.listFiles();
			for (File file : mangCon) {
				File file_new = new File(f2.getAbsoluteFile()+"/"+file.getName());
				copyAll(file, file_new);
			}
		}
	}
	
	public static void main(String[] args) {
		File r = new File("D:\\java_workpace\\Java_file\\rong");
		File kr = new File("D:\\java_workpace\\Java_file\\k_rong");
		File text = new File("D:\\java_workpace\\Java_file\\ngu.docx");
		
		// deleteOnexit thi k tra ve kq ;
		// delete thi neu xoa dc -> true; k xoa ddc -> false;
		// va 2 cai nay chi de xoa thu muc rong va tap tin thoi
		System.out.println(kr.delete());
		System.out.println(r.delete());
		text.deleteOnExit();
		XoaFilelao(kr); // phai tu dih nghia!
		
		
		// ==> doi ten - di chuyen - coppy file!
		
		File f1 = new File("D:\\java_workpace\\Java_file\\mot.txt");
		File f2 = new File("D:\\java_workpace\\Java_file\\hai.txt");
		File f3 = new File("D:\\java_workpace\\Java_file\\hieu.txt");
		File f_temp = new File("D:\\java_workpace\\Java_file\\temp.txt");
		
		// 1.doi ten file - thu muc: 
		
		f2.renameTo(f_temp); // file sang tem moi nhung duong dan doi tuong
		// nay k thay doi ?! 
		System.out.println(f2.getName());
		System.out.println(f_temp.getName());
		System.out.println(f2.canExecute());
		System.out.println(f_temp.canExecute());
		
		// class Files cung co ho tro!
		try { // f3 thay f1 no xoa luon f1!! 
			Files.move(f1.toPath(), f3.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		// 2. di chuyen file :
		File f_2new= new File("D:\\java_workpace\\Java_file\\ds");
		try {
			Files.move(f_temp.toPath(), f_2new.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// copy ? ? ,............
		
	}
	
}
