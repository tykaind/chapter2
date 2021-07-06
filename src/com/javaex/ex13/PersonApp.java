package com.javaex.ex13;

public class PersonApp {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("정우성");
		s1.setAge(40);
		s1.setSchoolNmae("서울고등학교");
		
		s1.showInfo();
		/*
		 * System.out.println(s1.toString()); 
		 * System.out.println(s1.getName());
		 * System.out.println(s1.getAge());
		 */
		
	}

}
