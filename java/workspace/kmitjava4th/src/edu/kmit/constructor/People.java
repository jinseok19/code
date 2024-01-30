package edu.kmit.constructor;

/*
 * 생성자(constructor)
 *  : 클래스명과 동일하고 리턴타입이 없다.(메소드는 아니다!!)
 *  : 객체를 초기화할 때 사용한다.
 *  : 객체 생성시 최초 한번만 호출된다.
 *  
 *  : public class People {
 *  	public People() {
 *  		}
 *  	}
 *  
 *  default 생성자가 존재한다.
 *  default 생성자는 아규먼트가 아무것도 없는 것을 말한다.
 *  public class People{
 *  	public People(){} // default 생성자
 *  }
 *  
 *  default 생성자는 개발자가 생성하지 않아도 자동으로 생성된다.
 *  
 *  생성자 오버로딩을 구현하게 되면, default 생성자는
 *  자동으로 생성되지 않기 때문에, 구현해 주어야 한다.
 *  
 *  생성자 오버로딩(overloading)
 *  모양은 똑같으나 아규먼트의 갯수와 타입이 다른 것
 *  public class People{
 *  	public People(){}
 *  	public People(String name, int age){}
 *  	public People(String name){}
 *  }
 *  
 * */

public class People {
	private String name;
	private int age;
	
	// 생성자
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public People() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}
	
}
