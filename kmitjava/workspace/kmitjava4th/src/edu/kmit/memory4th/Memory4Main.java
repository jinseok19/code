package edu.kmit.memory4th;

public class Memory4Main {
	public static void main(String[] args) {
		// 부모를 생성
//		People p = new People();
//		p.print();
//		p.show();
		
		// 자식을 생성해 보자.
//		Child c = new Child();
//		c.eat();
//		c.study();
//		c.print();
//		c.show();
		
		// 설계도가 부모로 변경됐을때 호출되는 메소드 확인
//		People p1 = new Child();
//		p1.print();
//		p1.show();

		// 자식의 인스턴스가 존재할고, 부모의 설계도로 도어있는 객체를
		// 자식의 설계도로 변경하면, 부모와 자식의 메소드를 다 사용할 수 있다.
//		People p1 = new Child();
//		Child c2 = (Child)p1;
	}
}