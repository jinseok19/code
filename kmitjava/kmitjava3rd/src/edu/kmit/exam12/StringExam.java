package edu.kmit.exam12;

public class StringExam {
	public static void main(String[] args) {
		/*
		 * String은 문자열을 받을 수 있는 참조타입
		 * 특징)
		 *  참조타입이지만 기본타입의 성질을 갖고 있다.
		 *  1)immutable : 값을 다시 할당 하기 전까지 변하지 않는다.
		 *  2)concatenation : String타입을 만나는 순간 String타입이 된다.
		 *  
		 * */
		
		// immutable
//		String s = "조이서";
//		s.replace("조", "박");
//		System.out.println(s);
//		
//		int a = 10;
//		int c = a + 20;
//		System.out.println(a);// 10
		
		
		// concatenation
//		System.out.println(1+2+"이정훈"+100);
//		System.out.println(1+2+"이정훈"+(100+200));
//		System.out.println((1+2)+"이정훈");
//		System.out.println("이정훈"+1+2+100);
//		System.out.println("이정훈"+(1+2)+100);
		
		String s = "이태원";
		String s1 = new String("이태원");
		String s2 = "이태원";
		
		System.out.println(s==s1); //false
		System.out.println(s==s2); //true
		System.out.println(s.equals(s1)); //true
		System.out.println(s.equalsIgnoreCase(s2)); //true
	}
}
