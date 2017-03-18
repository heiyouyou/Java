package com.seven;

public class TestStudent {
	 public static void main(String[] args){
		 Student stu1 = new Student("有有",21,175.4f,65.3,89,"通信13-2");
		 Student stu2 = new Student("油油",23,178f,70,85,"通信13-2");
		 System.out.println(stu1.getGrade());
		 stu1.showMessage();
		 stu1.dining();
		 stu1.walk();
		 stu2.showMessage();
		 stu2.dining();
		 stu2.walk();
	 }
}
