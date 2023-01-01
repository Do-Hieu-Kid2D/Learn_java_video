package day_of_month;

import java.util.Scanner;

public class Day {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month,year;
		
		System.out.println("Nhap So thang= ");
		month= sc.nextInt();
		System.out.println("Nhap so nam= ");
		year= sc.nextInt();
		
		boolean flagYear = (year%4==0 || year%400==0)? true : false;

		switch (month) {
		case 1: case 3:case 5:case 7:case 8:case 10: case 12: {
			System.out.println("Thang " + month + " co 31 day!!");
			break;
		}
		case 4: case 6: case 9: case 11:{
			System.out.println("Thang "+month+" co 30 day!!!");
			break;
		}
		case 2:{
			System.out.println((flagYear)?"Nam nhuan Thang 2 co 29 ngay!!":"Nam k nhuan thang 2 co 28 ngay!!");
			break;
		}
		default:
			System.out.println("Nhap du lieu SAI!!!");
		}
		
	}
}
