package com.hei.demo;

public class Outer {
	public String username;
	public int age;
//	public static String sex;
	public String sex;
	public void showMessage(){
		System.out.println(this.username+"=="+this.sex+"=="+this.age);
	}
	
//	注意：成员内部类中不能定义被static修饰的成员变量和方法
//	public class Inner{
//		public String sex;
////		public String static sex;
//		public void showUserMessage(){
////			成员内部类可以访问到外部类的成员属性和成员方法，包括静态的成员变量，并且如果内部类中有和外部类中同名的成员变量，则会使用的是自己的
//			System.out.println(sex+"==="+age);
//		}
//	}
	
//	注意：静态内部类中可以拥有静态和非静态的成员变量和成员方法，但是静态静态的成员方法只能访问静态的成员变量
	public static class Inner{//如果访问的是外部类的成员，只能访问静态的成员
		public static String sex;
		public int age;
		public void showUserMessage(){
			System.out.println(sex+"==="+age);
		}
	}
}
