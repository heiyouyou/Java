package com.seven;

public class Student {
	private String name;
	private int age;
	private float height;
	private double weight;
	private int score;
	private String Class;
	public Student(String name,int age,float height,double weight,int score,String Class){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.score = score;
		this.Class = Class;
	}
	public void dining(){
		System.out.println("我在吃饭...体重增加1");
		weight++;
	}
	public void walk(){
		System.out.println("我在走路...体重减少1");
		weight--;
	}
	public void showMessage(){
		System.out.println("我叫"+name+"，我是"+Class+"班的一名男同学，今年"+age+"岁，身高："+height+"，体重"+weight+"，今年考了"+score+"分");
	}
}
