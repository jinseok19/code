package edu.kmit.constructor;

public class Teacher extends People {
	private String tId;
	private String tSubject;
	
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
	
	
}
