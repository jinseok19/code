package edu.kmit.oop.years;

public class IfLeapYears {
	public static void isLeapYear(int year) {
		boolean isT = false;
		//윤년이 되는 조건을 만족하면 윤년이라고 출력한다.
		if (((year%4) == 0 && (year%100) != 0)
				|| (year%400) == 0) {
			isT = true;
		} else {
			isT = false;
		}
		
		printYear(isT, year);
		
	}
	private static void printYear(boolean isT, int year) {
		if (isT) {
			System.out.println(year+"년은 윤년입니다.");			
		} else {
			System.out.println(year+"년은 윤년이 아닙니다.");
		}
		
	}
	public static void main(String[] args) {
		// IfLeapYears ify = new IfLeapYears();
		// ify.isLeapYear(2006);
		
		isLeapYear(2009);
	}
}
