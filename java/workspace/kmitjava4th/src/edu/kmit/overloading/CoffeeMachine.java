package edu.kmit.overloading;

/*
 * overloading(오버로딩)
 * - 메소드의 이름과 리턴타입은 같고,
 *   아규먼트의 객수와 타입이 다르면 다른 메소드 처럼 동작하는 것
 * */

public class CoffeeMachine {
	String coffee;
	int milk;
	int price;
	
	public void eat(String coffee, int price) {
		System.out.println(coffee+"를"+price+"에 먹었네요.");
	}
	public void eat(String coffee, int milk, int price) {
		System.out.println("라떼를"+price+"에 먹었네요.");
	}
}