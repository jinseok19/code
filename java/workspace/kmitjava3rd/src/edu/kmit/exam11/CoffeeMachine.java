package edu.kmit.exam11;

public class CoffeeMachine {
	// member field
	public int money;
	
	// 이름이 동일할때 우선순위는: 블록 변수 > 멤버 필드
	public void setMoney(int money) { // local variable
		this.money = money;
	}
	
	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		cm.setMoney(100);

		
	}
}
