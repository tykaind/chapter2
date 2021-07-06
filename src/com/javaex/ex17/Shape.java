package com.javaex.ex17;

public class Shape {
	//필드
	private String fillColor;
	private String lineColor;
	
	//생성자
	public Shape() {
		System.out.println("Shape(2)");
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("Shape(2)");
	}
	
	//메소드 겟셋
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
	//메소드 1반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	public void draw() {
		System.out.println("색깔:"+fillColor+" 선색:"+lineColor+" 도형을 그렸습니다.");
	
	}
	
}
