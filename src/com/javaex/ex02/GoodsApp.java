package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera= new Goods();
		Goods computer= new Goods();
		Goods cup= new Goods();

		//camera.setName="니콘";
		camera.setName("니콘");
		
		//computer.name="LG그램";
		computer.setName("LG그램");
		
		//cup.name="머그컵";
		cup.setName("머그컵");
		
		//camera.price=40000;
		camera.setPrice(40000);
		
		//computer.price=1000000;
		computer.setPrice(1000000);
		
		//cup.price=2000;
		cup.setPrice(2000);
		
		String cm = camera.getName();
		
		
		/*
		 * System.out.println(cm+","+camera.getPrice());
		 * System.out.println(computer.getName()+","+computer.getPrice());
		 * System.out.println(cup.getName()+","+cup.getPrice());
		 */
		
		
		
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
		
		
	}

}
