import java.util.Scanner;

public class MyDate {
		//Scanner sc = new Scanner(System.in);
		
		private int day, month, year,h;
		
		public MyDate(int d, int m, int y) {
			this.day=d;
			this.month=m;
			this.year=y;
		}
		
		public void printday() {
			System.out.println("Ngay= "+this.day);
	    }
		
		public void printyear() {
			System.out.println("Thang= "+this.year);
		}
		public void printmonth() {
			System.out.println("Nam= "+this.month);
		}
		public void printdate() {
			System.out.println(this.day+"/"+this.month+"/"+this.year);
		}
		
}
