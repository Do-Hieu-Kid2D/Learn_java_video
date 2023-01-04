package toStringJava;

import java.util.Objects;

public class MyDate {
	private int day, mont, year;

	public MyDate(int day, int mont, int year) {
		this.day = day;
		this.mont = mont;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day>=1 && day<=31) { // check data 
			this.day = day;
		}
	}

	public int getMont() {
		return mont;
	}

	public void setMont(int mont) {
		if(mont>=1 && mont <=12) {
			this.mont = mont;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year>0) {
			this.year = year;
		}
	}
	
	@Override
	public String toString() {
		
		return  this.day +"/"+this.mont +"/" +this.year;
	} 
	// cung co cach ghi tu dong! 

	
	@Override
	public int hashCode() {
		return Objects.hash(day, mont, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return day == other.day && mont == other.mont && year == other.year;
	}
	
	
}
