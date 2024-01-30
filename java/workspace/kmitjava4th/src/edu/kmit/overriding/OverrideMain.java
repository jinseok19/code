package edu.kmit.overriding;

/*
 * overriding(오버라이딩)
 * 자식에 있는 메소드와 동일한 메소드를 부모에 구현하면
 * 부모에 있는 메소드를 호출하더라도 자식의 메소드가 호출되는 것
 * 
 * overriding의 조건
 * 부모 클래스의 메소드와 이름이 동일할것
 * 매개변수의 타입과 개수, 순서가 동일 할 것
 * 리턴타입이 같을 것
 * (접근 제어자는 부모의 메소드 보다 같거나 크게)
 * */

public class OverrideMain {
	public static void main(String[] args) {
		Parent p = new Child();
		p.singing();
		p.eat();
	}
}
