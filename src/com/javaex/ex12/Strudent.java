package com.javaex.ex12;

public class Strudent {
	//필드
		private String name;
		private int age;
		private String schoolName;
		
	//생성자
		public Strudent() {
		}
		
		public Strudent(String name, int age,String schoolName) {
			this.name = name;
			this.age = age;
			this.schoolName = schoolName;
		}
		
		
	//메소드 g.s	
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getSchoolName() {
			return schoolName;
		}

		public void setSchoolName(String schoolName) {
			this.schoolName = schoolName;
		}
		//투스트링
		@Override
		public String toString() {
			return "Strudent [name=" + name + ", age=" + age + ", schoolName=" + schoolName + "]";
		}
		
		//메소드일반
		
		
		
}
