package com.javaex.ex10;

public class Goods {
		//필드
		private String name;
		private int price;
		
		//생성자
		public Goods( ) {

		}
		
		public Goods(String name, int price) {
			this.name = name;
			this.price = price;
		}
		
		//메소드
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
		
		
}
