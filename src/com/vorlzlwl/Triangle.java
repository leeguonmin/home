package com.vorlzlwl;

import com.praex.Shape;

public class Triangle extends Shape {
	private int wid;
	private int hei;
	
	public Triangle(int wid, int hei) {
		this.wid=wid;
		this.hei=hei;
	}
	
	public void show() {
		System.out.println("====삼격형===");
		System.out.println("#면색:" + fill);
		System.out.println("#선색:"+ line);
		System.out.println("#가로:"+ wid);
		System.out.println("#세러:+hei");
	}
	
}

