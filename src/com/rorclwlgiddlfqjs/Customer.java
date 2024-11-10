package com.rorclwlgiddlfqjs;

public class Customer extends User {
	// 필드 선언
	int point;
	
	// 생성자 
	public Customer(String id,String password,String name, int point) {
		super(id,password,name);
		this.point=point;
	}
	
	@Override
	public void show() {
		System.out.printf("#아이디:%s, #패스워드:%s, #이름:%s, #포인트:%d%n", id, password, name, point);
	}

}
