package com.praex;

public class Shape {
	private String fill;
	private String line;
	
	public Shape() {
		System.out.println("생성자 Shape(1) 실행");
	}
	
	public Shape(String fill, String line) {
		this.fill=fill;
		this.line=line;
		System.out.println("생성자 Shape(2) 실행");
	}

}
