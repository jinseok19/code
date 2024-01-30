package edu.kmit.oop.hiearachy;

public class OOPMain {

	public static void main(String[] args) {
//		People p = new People();
//		p.setName("김태균");
//		p.setAge(40);
//		p.setSex("남자");
//		System.out.println(p.toString());
		
		Student s = new Student();
		s.setName("배수지");
		s.setAge(20);
		s.setSex("여자");
		s.setsId("2020");
		s.setSubject("연기/노래");
		System.out.println(s);
	}
}