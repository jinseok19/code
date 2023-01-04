package edu.kmit.polymorphism;

/*
 * 다형성(polymorphism)
 *  - 다앙한 형태를 나타내는 성질!!
 *  - 부모의 메소드가 자식에 형태에 따라 다양하게 호출되는 것! (OOP 3대 특징 중 하나!!!!!)
 *  - 예!!)
 *    class People {
 *    	public void show(){}
 *    }
 *    class Student extends People{
 *    	public void show(){}
 *    }
 *    class Teacher extends People{
 *    	public void show(){}
 *    }
 *    
 *  - 다형성 발생원리 3가지~~!
 *   1) 부모의 이름으로 자식을 생성할 수 있다!!@!
 *   2) 부모의 이름으로 자식을 받을 수 있다!!
 *   3) 부모의 메서드로 자식의 메서드를 호출할 수 있다!!
 *   (단, 상속과 overriding이 되어있어야 한다!!!)
 * */

public class Polymorphism {
	public static void main(String[] args) {
		People p = new Student();
		p.show();
		
		People p1 = new Teacher();
		p1.show();
	}
}