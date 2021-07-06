package com.javaex.ex21;

import java.util.Scanner;

public class ArithException {

	public static void main(String[] args) {
		
		double result;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값을입력: ");
		num = sc.nextInt();
		
		try {
			result = 100/num;
			System.out.println(result);
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌수 없습니다.");
		}finally {
			System.out.println("finally 영역");
		}
		
		sc.close();
		
	}

}
