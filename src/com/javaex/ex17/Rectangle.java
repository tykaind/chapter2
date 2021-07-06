package com.javaex.ex17;

public class Rectangle extends Shape {
	//필드
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {
		System.out.println("Rectangle");
	}
	
	
	public Rectangle(String fillColor, String lineColor,int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		System.out.println("Rectangle(4)");
	}
	
	//메서드 겟/셋
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

    //메소드 1반
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}

}
