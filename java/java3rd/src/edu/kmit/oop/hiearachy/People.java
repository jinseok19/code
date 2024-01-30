package edu.kmit.oop.hiearachy;

public class People {
	private String name;
	private int age;
	private String sex;
	
	//name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//sex
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
