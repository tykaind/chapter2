package com.javaex.ex21;

public class Ex02 {

	public static void main(String[] args) {
		int[] intArray = new int[3];
		intArray[0] =1;
		intArray[1] =2;
		intArray[2] =3;
		
		try {
			for(int i=0; i<=intArray.length; i++) {
				System.out.println(i+"번째 배열의 숫자는 "+intArray[i]+" 입니다.");
			}
		}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("배열의 범위를 벗어났습니다.");
		}catch(ArithmeticException q) {
				System.out.println("값이 0 입니다.");
		}catch(NullPointerException w) {
				System.out.println("값이 없습니다.");
		}
		
	}

}
