package edu.kmit.method2;

public class IfLeapYears {
	 public int year;
	
	// 연도를 입력하면 윤년인지 아닌지 판단해서 리턴해주는 메소드
	public boolean isLeapYear(int year) {
		boolean isT = false;
		this.year = year;
		
		//윤년이 되는 조건을 만족하면 윤년이라고 출력한다.
		if (((year%4) == 0 && (year%100) != 0)
				|| (year%400) == 0) {
			isT = true;
		} else {
			isT = false;
		}
		return isT;
	}
	
	// 어떤 년이 윤년인지를 출려하는 메소드 
	public void printYear(boolean isT) {
		if (isT) {
			System.out.println(year+"년은 윤년입니다.");			
		} else {
			System.out.println(year+"년은 윤년이 아닙니다.");
		}
		
	}
}
