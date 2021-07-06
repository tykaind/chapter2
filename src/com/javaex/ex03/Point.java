package com.javaex.ex03;

public class Point {
	//필드
	private int x,y;
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int yy) {
		this.y = yy;
	}

	
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "] 이다.");	
	}
}
