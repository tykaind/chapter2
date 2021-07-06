package com.javaex.ex05;

public class GoodApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		
		
		Goods computer = new Goods("그램", 1000000);
		computer.showInfo();
	}

}
