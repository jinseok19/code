package edu.kmit.thissuper;
/*
 * this
 *  클래스 내부에서 자기자신을 참조할 때 사용하는 키워드 이다.
 *  this.member field or this.member method를 사용할 수 있다. 
 *  P   p  = new P();
 *    this
 *  this() : 생성자로 사용이 가능합니다.
 *  this("블랙핑크",20); : 생성자 오버로딩도 사용할 수 있다.
 *  
 * super
 *  상속관계에서 자식 클래스가 부모 클래스에 접근할 때 사용하는 키워드
 *  super.memeber field or super.memeber method는 부모의 멤버 필드나 
 *  부모의 멤버 메소드를 사용하는 것이다.  
 *  
 *  부모의 생성자를 오버로딩할 수 있다.
 *  super()
 *  super("수지",20,"여자");
 * */
public class ThisSuperExam {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
}








