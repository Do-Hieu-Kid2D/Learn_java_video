
public class MyDate {
	private int day, mont, year;

	public MyDate(int day, int mont, int year) {
		if(day>=1 && day<=31) { // check data 
			this.day = day;
		}
		else {
			this.day = 1;  // neu k dung thi lam j do?!!
		}
		
		if(mont>=1 && mont <=12) {
			this.mont = mont;
		}
		else {
			this.mont=1;
		}
		
		if(year>0) {
			this.year = year;
		}
		else {
			this.year=1;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMont() {
		return mont;
	}

	public void setMont(int mont) {
		this.mont = mont;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	
}
