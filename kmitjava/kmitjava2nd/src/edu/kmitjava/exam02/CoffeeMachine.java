package edu.kmitjava.exam02;

/*
 * ?΄??€, λ©€λ²??, λ©€λ²λ©μ?
 * */
public class CoffeeMachine {
	private int money;
	private int cup;
	
	public void makeCoffee() {
		if(money<=0) {
			System.out.println("??΄ ??΄? ??");
		}else {
			cup = money/100;
			System.out.println("μ»€νΌκ°? "+cup+"? ???΅??€.");
		}
	}
}