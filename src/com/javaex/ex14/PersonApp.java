package com.javaex.ex14;

public class PersonApp {

	public static void main(String[] args) {
		
		//디폴트 생성자 사용
		Student s1 = new Student();
		s1.setName("정우성");
		s1.setAge(40);
		s1.setSchoolNmae("서울고등학교");
		
		Student s2 = new Student("이효리",40,"나는학교");
		s2.showInfo();
		
	}

}
