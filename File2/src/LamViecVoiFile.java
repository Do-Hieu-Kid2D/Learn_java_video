import java.io.File;
import java.lang.invoke.LambdaConversionException;
import java.text.FieldPosition;
import java.util.Scanner;

public class LamViecVoiFile {
	
	File file ;
	
	public LamViecVoiFile( String tenFile ) { // contructer 
		//super();
		this.file = new File(tenFile);
		
	}
	
	public boolean KiemTraThucThi() {
		// co the thuc thi?
		return this.file.canExecute();
	}
	
	public boolean kiemTradoc() {
		// co the doc?
		return this.file.canRead();
	}
	public boolean kiemTraviet() {
		// co the viet ?
		return this.file.canWrite();
	}
	
	public void inDuongDan() {
		System.out.println("Duong dan:\n\t>>:  "+ this.file.getAbsolutePath());
	}
	public void inTen() {
		System.out.println("ten file: "+ this.file.getName());
	}
	
	public void kiemTrafoderortaptin() {
		if(this.file.isDirectory()) {
			System.out.println("Day la thu muc");
		}
		else if(this.file.isFile()) {
			System.out.println("Day la file nha");
		}
	}
	
	public void inDanhSachfilecon() {
		if(this.file.isDirectory()) {
			System.out.println("Day la thu muc\n>> cac tap tin,thu muc con:");
			File[] mangfile = this.file.listFiles();
			for ( File file  : mangfile) {
				System.out.println(file.getAbsolutePath());
			}
		}
		else if(this.file.isFile()) {
			System.out.println("\n>>\tDay la file => k the in dc oke!!!!!\n");
		}
	}
	
	public void inCayThuMuc() {
		this.inChiTietCayThucMuc(this.file , 1);
	}
	
	public void inChiTietCayThucMuc(File f, int bac) {
//		System.out.print("|");
		for (int i = 0; i < bac; i++) {
			System.out.print("\t");
		}
		System.out.print("|__");
		System.out.println(f.getName());
		if (f.canRead()&&f.isDirectory()) {
			File[] mangCon = f.listFiles();
			for (File fx : mangCon) {
				inChiTietCayThucMuc(fx, bac + 1);
			}
		}
		
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ten file: ");
		String tenfile = sc.nextLine();
		LamViecVoiFile lv = new LamViecVoiFile(tenfile);
		
		int flag;
		do {
			System.out.println("------------MENU----------");
			System.out.println("1. Kiểm tra file có thể thực thi: ");
			System.out.println("2. Kiểm tra file có thể đọc: ");
			System.out.println("3. Kiểm tra file có thể ghi: ");
			System.out.println("4. In đường dẫn: ");
			System.out.println("5. In tên file: ");
			System.out.println("6. Kiểm tra file là thư mục hoặc tập tin: ");
			System.out.println("7. In ra danh sách các file con: ");
			System.out.println("8. In ra cây thư mục: ");
			System.out.println("0. Thoát chương trình.");
			flag = sc.nextInt();
			sc.nextLine();
			
			switch(flag) {
			case 1:
				System.out.println("File co the thuc thi? => "+lv.KiemTraThucThi());
				break;
			case 2:
				System.out.println("File co the doc? => "+lv.kiemTradoc());
				break;
			case 3:
				System.out.println("File co the ghi? => "+lv.kiemTraviet());
				break;
			case 4:
				lv.inDuongDan();
				break;
			case 5:
				lv.inTen();
				break;
			case 6:
				lv.kiemTrafoderortaptin();
				break;
			case 7:
				lv.inDanhSachfilecon();
				break;
			case 8:
				lv.inCayThuMuc();
				break;
			
			}
			
			
			
			
			
		}while(flag !=0);
		
		
	}
	
	
}
