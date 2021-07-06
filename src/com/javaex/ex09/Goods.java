package com.javaex.ex09;

public class Goods {
	
	//필드
	private String name;
	private int price;
	private static int count;
	
	//생성자
	public Goods( ) {
		count = count +1;
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		count = count +1;
	}
	
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}








	public void showInfo() {
		System.out.print("상품이름: "+name+" || ");
		System.out.print("가격: "+price+" || ");
		System.out.println("카운트: "+count);
		System.out.println("=============================================");
		
	}
}
