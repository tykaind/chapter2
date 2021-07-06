package com.javaex.ex16;

import java.util.Scanner;

public class ClrcleApp {

	public static void main(String[] args) {
		boolean su = true;
		int j =1;
		Scanner sc = new Scanner(System.in);
		Circle[] c01 = new Circle[3];
		
		for(int i=0; i<c01.length; i++) {
			c01[i] = new Circle();
		}
		
		while(su){
			for(int i=0; i<c01.length; i++) {
				
			System.out.print("배경색:");
			String fillColor = sc.next();
			c01[i].setFillColor(fillColor);
			
			System.out.print("선색:");
			String lineColor = sc.next();
			c01[i].setLineColor(lineColor);
			
			System.out.print("반지름:");
			int radius = sc.nextInt();
			c01[i].setRadius(radius);
			
			System.out.println("--------------------");
			System.out.println(j+"번째 원도형 완성");
			System.out.println("--------------------");
			System.out.println("");
			j++;
			}
			su = false;
			for(int i=0; i<c01.length; i++) {
				c01[i].draw();
			}
		}
	}
}

