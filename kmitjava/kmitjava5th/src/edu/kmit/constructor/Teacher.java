package edu.kmit.constructor;

public class Teacher extends People {
	private String tId;
	private String tSubject;
	
	public Teacher(String name, int age, String sex, String tId, String tSubject) {
		super(name, age, sex);
		this.tId = tId;
		this.tSubject = tSubject;
	}
	// tId
	public String gettId() {
		return tId;
	}
	public void settId(String tId) {
		this.tId = tId;
	}
	
	// tSubject
	public String gettSubject() {
		return tSubject;
	}
	public void settSubject(String tSubject) {
		this.tSubject = tSubject;
	}
	@Override
	public String toString() {
		return super.toString() + " Teacher [tId=" + tId + ", tSubject=" + tSubject + "]";
	}
}
