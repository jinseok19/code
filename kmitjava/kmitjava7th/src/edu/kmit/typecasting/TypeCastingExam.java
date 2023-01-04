package edu.kmit.typecasting;

public class TypeCastingExam {
	public static void main(String[] args) {
		/*
		 * 형변환(typecasting)
		 * - 기본 타입
		 * 						커짐
		 *   ------------------------------------------->
		 *   byte short int long float double boolean char
		 *  
		 *  
		 *  
		 *   byte a = 10;
		 *   int b = a; // (auto)promotion, implicit(암시적),
		 *   			// up casting
		 *   int c = 20;
		 *   byte d = (byte)c; // (down)casting, explicit(명시적)
		 *   !!주의!!: 범위가 벗어나면 쓰레기 값이 저장될 수 있다.!
		 *   
		 *   
		 *   
		 *   
		 * - 참조 타입
		 *   Student s = new Student();
		 *   People p = s; // (auto) promotion, implicit(암시적),
		 *   			   // up casting
		 *   Student s1 = (student)p; // (down) casting,
		 *   						  // explicit(명시적)
		 * 
		 * */
		
		Student s = new Student();
		People p = s;
		Student s1 = (Student) p;
		
		/*
		 * Wrapper class
		 * - 기본타입을 참조타입으로, 참조타입을 기본타입으로 변환할때
		 *   사용하는 클래스
		 * - Byte, Short, Integer, Long, Float, Double,
		 *   Boolean, Character
		 * */
		int n = 10;
		Integer i = new Integer(n);// 기본 => 참조
		int n1 = i.intValue(); // 참조 => 기본
		int n2 = i; // 참조 => 기본
		
		Object o = 10; // 기본 -> 참조
		int n3 = (int) o; // 참조 -> 기본
		int n4 = (Integer) o; // 참조 -> 기본
		
		// Boxing : 기본타입 -> 참조타입
		// unBoxing : 참조타입 -> 기본타입
		// Boxing과 unBoxing을 할때 사용하는 클래스가 Wrapper class이다!
		
		// Integer.parseInt();
		// -> 문자열을 기본타입 숫자 int로 변환할 때 사용하는 메소드이다!
		int pwd = Integer.parseInt("12345");
		
		// 단축 대입 연산자
		// +=, -=, /=, *=, %=
		// a+=1 => a = a + 1, a-=1 => a = a - 1 
	}
}


























