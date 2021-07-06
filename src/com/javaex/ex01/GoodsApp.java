package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		Goods computer = new Goods();
		Goods cup = new Goods();
		
		camera.name="니콘";
		computer.name="LG그램";
		cup.name="머그컵";
		
		camera.price=40000;
		computer.price=1000000;
		cup.price=2000;
		
		System.out.println(camera.name+","+camera.price);
		System.out.println(computer.name+","+computer.price);
		System.out.println(cup.name+","+cup.price);
	}

}
