package com.javaex.ex21;

public class Ex01 {

	public static void main(String[] args) {
		//NullPointerException
		
		Rectangle r01 = new Rectangle("빨강","검정",5,5);
		
		r01.setFillColor("파랑");
		r01 = null;
		
		try {
			r01.draw();	
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			
			System.out.println("값이 없어 초기값으로 초기화 해줬습니다.");	
			r01 = new Rectangle("흰색","흰색",10,10);
			r01.draw();
		}

	}

}
