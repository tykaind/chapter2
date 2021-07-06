package com.javaex.ex09;

public class GoodApp {

	public static void main(String[] args) {
		
		
		Goods computer = new Goods("그램", 1000000);
		
		Goods camera = new Goods("니콘", 400000);
		
		computer.showInfo();
		camera.showInfo();
		
		Goods cup = new Goods("머그컵", 2000);
		cup.showInfo();
	}

}
