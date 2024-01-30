package edu.kmit.arrays;

/*
 * 배열(Array) 
 *  - 정의 : 같은 타입을 여러개 나열한 것
 *  - 용도 : 같은 타입의 변수를 여러개 만들 경우에 사용 
 *  - ex) int a = 10, int b = 20, ... 100개(규칙)
 *  - 1차원, 2차원,   3차원,    다차원 
 *    a[]   a[][]  a[][][]
 *  - 배열은 기본타입도 참조타입도 다 만들 수 있다.
 *  - 배열은 참조타입이다!!.
 * 배열을 사용하는 방법?!!
 *  - 1) int[] a = {1,2,3,4,5}
 *  - 2) int[] a1 = new int[]{1,2,3,4,5}
 *  - 3) int[] a2;
 *       a2 = new int[5];
 *       a2[0] = 1;
 *       a2[1] = 2;
 *       a2[2] = 3;
 *       a2[3] = 4;
 *       a2[4] = 5; 
 * */
public class ArrayExam {
	public static void main(String[] args) {
		// 1) 
//		int[] a = {1,2,3,4,5};
//		System.out.println(a[1]);
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]+",");
//		}
//		System.out.println();
//		//enhanced for (향상된 for문)
//		// - 배열이나 리스트같은 JCF(자료구조)에 있는 값을 뽑을때 사용한다.
//		// iterator pattern (내용물이 바닥날 때까지 뽑는다.)
//		// - 값을 빼낼 수 있는 방법이 없을때, 
//		// - 그 안에 값이 들어있면 들어있는 내용을 뽑아내는 패턴
//		for (int i : a) {
//			System.out.print(i+"/");
//		}
		
		// 2번째 
//		int[] a2 = new int[] {1,2,3,4,5};
//		for (int i : a2) {
//			System.out.print(i+"/");
//		}
		
		// 3번째 
//		int[] a3 = null;
//		a3 = new int[5];
//		a3[0] = 1;
//		a3[1] = 2;
//		a3[2] = 3;
//		a3[3] = 4;
//		a3[4] = 5;	
//		for (int i : a3) {
//			System.out.print(i+",");
//		}
		
		// 배열의 복사(copy)
		// shallow copy(얕은 카피)
		int[] a5 = {1,2,3,4,5};
		int[] c = a5;
		c[4]=100;
		System.out.println(a5[4]);
				
		// deep copy(깊은 카피)
		int[] b = {1,2,3,4,5};
		int[] d = new int[5];
		// API(Application Programming Interface)
		// - 애플리케이션 프로그래밍을 하기위한 약속,규칙
		// static으로 선언이 되어있으면 객체를 생성하지 않고 사용할 수 있다. 
		// ex) Math.PI => System.out.println(Math.PI); // 3.14
		System.arraycopy(b, 0, d, 0, b.length);
		d[3] = 50;
		System.out.println(b[3]);
	}
}
























