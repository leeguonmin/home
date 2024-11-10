package com.rorclwlgiddlfqjs;

public class User {
//	 필드 선언 
	String id;
	String password;
	String name;
	
	// 기본 생성자 
	public User(String id, String password, String name) {
		this.id=id;
		this.password=password;
		this.name=name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public String password() {
		return password;
	}
	
	public void setpassword(String password) {
		this.password=password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	
	public void show() {
		System.out.printf("#아이디:%s, #패스워드:#s, #이름:%s%n", id,password,name);
	}
	

}
