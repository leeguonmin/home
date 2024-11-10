package com.vorlzlwl;

public class Shape {
	protected String fill;
	protected String line;
	
    public Shape() {
    }

	
	public Shape(String fill, String line) {
		this.fill=fill;
		this.line=line;
	}
	
	public String getFill() {
		return fill;
	}
	
	
	public void setFill(String fill) {
		this.fill=fill;
	}
		
		
		public String getLine() {
			return line;
		}
	
	public void setLine(String line) {
		this.line=line;
	}
	
	
	

}
