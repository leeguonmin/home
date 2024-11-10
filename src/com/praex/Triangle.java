package com.praex;

public class Triangle extends Shape {
	private int wid;
	private int hei;
	
	public Triangle() {
		System.out.println("생성자 트라이앵글(0) 실행");
	}

	public Triangle(int wid, int hei) {
		super("검정", "검정");
		this.wid=wid;
		this.hei=hei;
		System.out.println("생성자 트라이앵글(2) 실행");
	}
	
	public Triangle(String fill, String line, int wid, int hei) {
		super(fill,line);
		this.wid=wid;
		this.hei=hei;
		System.out.println("생성자 트라잉앵글(4) 실행");
	}
	
}
