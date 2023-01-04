package edu.kmit.interfaceexam;

public class InterfaceExam {
	/*
	 * interface(인터페이스)
	 * - 추상 메소드로만 이루어진 것
	 * - 자기 자신의 이름으로 자기 자신을 생성할 수 없다.
	 * - 연관되어 있는 클래스가 아니라 기능을 구현하는 것들을 모아 놓은 클래스
	 * - 인터페이스를 통해 다중속성을 흉내냄
	 * - 구현된 메소드가 하나라도 있으면 오류 발생
	 * - 키워드는 interface
	 * - 상속할때 사용하는 키워드는 implements
	 * - 변수는 자동으로 상수가 된다.
	 *   ex) int A = 1; // => public static final A = 1;
	 * - 변수를 선언만 할수는 없다.
	 * - 기본 접근 제한자는 private말고 public을 사용한다.
	 * - 인터페이스의 추상 메소드를 구현하지 못하면 자식 클래스는 추상 클래스가 된다.
	 * - 인터페이스가 여러개 일 때는 ','로 구분한다.
	 *   ex) class A implements IB,IC,ID{}
	 * - 일반 클래스와 인터페이스가 있을 경우에는 일반 클래스가 우선이다.
	 *   ex) class A extends B implements IC{}
	 * - 인터페이스 끼리 상속할 때는 키워드를 extends로 사용한다.
	 *   ex) interface IA extends IB,IC{}
	 * */
}
