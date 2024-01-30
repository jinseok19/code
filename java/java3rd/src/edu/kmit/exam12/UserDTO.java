package edu.kmit.exam12;
// DTO(Data Transfer Object)
// PL (javascript/화면)
// BL (java)
// DL (DAO...)

public class UserDTO {
	private String id;
	private String passwd;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
}
