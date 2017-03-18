package com.hei.seven;
/**
 * 
 * 构造函数的重载
 * Student类
 * 创建人:黑有有
 * 时间：2016年5月15日-下午2:37:58 
 * @version 1.0.0
 *
 */
public class Student {
	private int age;
	private String name;
	private double money;
	public Student(){
//		这里的name值默认为null
		System.out.println(this.name+"你调用了无参的构造函数");
	}
	public Student(int age){
		this.age = age;
//		这里的name值默认为null
		System.out.println(this.name+"你调用了一个参数的构造函数");
	}
	public Student(int age,String name){
		this.age = age;
		this.name = name;
//		这里的name值指代当前对象的name
		System.out.println(this.name+"你调用了两个参数的构造函数");
	}
	public Student(int age,String name,double money){
		this.age = age;
		this.name = name;
		this.money = money;
//		这里的name值指代当前对象的name
		System.out.println(this.name+"你调用了三个参数的构造函数");
	}
	public static void main(String[] args){
		Student stu1 = new Student();//null你调用了无参的构造函数
		Student stu2 = new Student(42);//null你调用了一个参数的构造函数
		Student stu3 = new Student(21,"heihei");//heihei你调用了两个参数的构造函数
		Student stu4 = new Student(42,"youyou",24.3);//youyou你调用了三个参数的构造函数
	}
}
