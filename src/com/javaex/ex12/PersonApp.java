package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {

		Person p1 = new Person("정우성", 60);
		p1.showInfo();
		System.out.println(p1.toString());

		System.out.println("--------------------------------");

		Strudent s1 = new Strudent("유재석",30,"땡땡고등학교");
		System.out.println(s1.toString());
	}

}
