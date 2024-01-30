package edu.kmit.constructor;

public class People {
	private String name;// null
	private int age;
	private String sex;
	
	// default 생성자를 구현
	public People() {}
	
	public People(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	// name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// sex
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
	

	
	
}







