package edu.kmit.method2main;

import edu.kmit.method2.IfLeapYears2;

/*
 *  import
 *  다른 패키지에 있는 클래스를 현재 패키지에서 사용하기위해 
 *  가져오는 방법
 *  import와 package의 순서는 package가 제일 먼저온다.
 *  
 * */

public class Main {
	public static void main(String[] args) {
//		int year = 2004;
//		IfLeapYears ify = new IfLeapYears();
//		ify.printYear(ify.isLeapYear(year));
		
		IfLeapYears2 ify2 = new IfLeapYears2();
		ify2.year(2000, 2010);
	}
}
