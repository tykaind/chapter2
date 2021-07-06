package com.javaex.ex02;

public class Goods {
	
		private String name;
		private int price;

		//메소드-일반
		public void setName(String n) {
			name = n;	
		}
		
		public void setPrice(int p) {
			price = p;
		}
		
		public String getName() {
			return name;
		}
		
		public int getPrice() {
			return price;
		}
		
		public void showInfo() {
			System.out.print("상품이름: "+name+", ");
			System.out.println("가격: "+price);
			System.out.println();
			
		}
		
		
}
