package edu.kmitjava.exam07;

public class PassByValueExam {
	public static void main(String[] args) {
		// pass by value ?��?��
		int a = 10;
		int c = a + 20;
		a = c;
		System.out.println(a);
		
		// pass by reference
//		String str = "건담";
//		str = str.replace("�?", "�?");
//		System.out.println(str);
	}
}
