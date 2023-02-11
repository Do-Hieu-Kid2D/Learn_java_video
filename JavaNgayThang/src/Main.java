import java.lang.ref.Cleaner.Cleanable;
import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		
		long t1 = System.currentTimeMillis(); // lay thoi gian miligiay tu 1/1/1970 den now!!
		for (int i = 0; i < 1000; i++) {         // currentTimeMillis()
			System.out.print("ngu");
		}
		
		long t2 = System.currentTimeMillis();
		
		System.out.println("Thoi gian chay= "+ (t2-t1) +" mls");
		
		
		// timeUnit -> chuyen doi 
		// chuyển đổi giữa các đơn vị thời gian, và thực sự có ích trong một số tình huống.
		
		long mili = TimeUnit.DAYS.toSeconds(3000*365);// doi 3000*365 ngay ra giay 
		System.out.println("3000 nam = "+mili +" s");
		long mili2 = TimeUnit.DAYS.toMillis(3000*365);// doi 3000*365 ngay ra Millis 
		System.out.println("3000 nam = "+mili2 +" mls");
		long gio_giay = TimeUnit.MICROSECONDS.toHours(mili2); // doi tu mili giay ra gio 
		System.out.println("va bang = "+gio_giay +" hours");
		long ngay = TimeUnit.HOURS.toDays(gio_giay);
		System.out.println("so gio nay = "+ngay+" ngay!!!");
		
		// date  // thang chay tu 0 nen +1 // nam thi k hieu 
		Date d = new Date(System.currentTimeMillis());
		System.out.println(d.getDate()+"/"+(d.getMonth()+1) +"/"+ (d.getYear()+1900));
		
		// calendar  ,-> lịch // // thang chay tu 0 nen +1  
		Calendar c =  Calendar.getInstance();
		System.out.println("hien tai: "+ c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
		
		c.add(Calendar.HOUR,30);
		System.out.println("them 30 hours: "+ c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
		
		c.add(Calendar.DATE, 14);
		System.out.println("them 14 days : "+ c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
		
		// Dateformat -> dinh dang ngay 
		DateFormat df = new SimpleDateFormat();
		System.out.println("Mac sinh= "+ df.format(d)); // truyen vao ngay class Date 
		
		DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("keiu khac: "+df2.format(d));
		
		
		
	}
}
