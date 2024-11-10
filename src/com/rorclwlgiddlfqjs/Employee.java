package com.rorclwlgiddlfqjs;

public class Employee extends User {
	// 필드 선언 
	int salary;
	
	public Employee(String id, String password, String name, int salary) {
		super(id,password,name);
		this.salary=salary;
	}
	
	@Override
	public void show() {
		System.out.printf("#아이디:%s, #패스워드:#s, #이름:%s, #월급:%d%n", id,password,name,salary);
		System.out.printf("운영자의 월급은 %d원 이빈다.",salary);
	}

}
