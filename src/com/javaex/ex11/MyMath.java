package com.javaex.ex11;

public class MyMath {

	//필드
	private static double pi =3.14;
	
	//생성자
	
	
	
	//메소드 g/s
	
	
	
	//메소드 일반 오버로딩을 사용한 중복메소드사용
	public static int plus(int a, int b) {
		int result = a + b; //복잡한 계산식 가정함
		return result;
	}
	public double plus(double a,double b) {
		double result = a + b;
		return result;
	}
	
	public double plus(double a,int b) {
		double result = a + b;
		return result;
	}
	
	public double plus(int a,double b) {
		double result = a + b;
		return result;
	}
	
	public static double cirleArea(double radius) {
		double result = radius * radius * MyMath.pi;
		return result;
	}
}
