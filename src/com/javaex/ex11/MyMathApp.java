package com.javaex.ex11;

public class MyMathApp {

	public static void main(String[] args) {

		
		  MyMath myMath = new MyMath();
		  
		  System.out.println(myMath.plus(100, 100));
		  System.out.println(myMath.plus(100.5, 100.2));
		  System.out.println(myMath.plus(100.5, 100));
		  System.out.println(myMath.plus(100, 100.2));
		 
		  System.out.println(MyMath.cirleArea(5));
		  
		  System.out.println(MyMath.plus(99, 99));
	}

}
