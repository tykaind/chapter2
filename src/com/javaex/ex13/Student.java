package com.javaex.ex13;

public class Student extends Person {

	//필드
	private String schoolNmae;
	
	//생성자
	public Student() {}
	
	public Student(String schoolNmae) {
		this.schoolNmae = schoolNmae;
	}
	
	
	
	
	//메소드 g.s
	public String getSchoolNmae() {
		return schoolNmae;
	}

	public void setSchoolNmae(String schoolNmae) {
		this.schoolNmae = schoolNmae;
	}
	
	
	
	//메소드-일반
	@Override
	public String toString() {
		return "Student [schoolNmae=" + schoolNmae + "]";
	}
	
	public void showInfo() {
		System.out.println("이름: "+getName());
		System.out.println("나이: "+getAge());
		System.out.println("학교: "+schoolNmae);
	}
	
}
