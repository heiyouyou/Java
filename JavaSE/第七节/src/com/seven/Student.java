package com.seven;

public class Student {
	private String name;
	private int age;
	private float height;
	private double weight;
	private int score;
	private String grade;
	public Student(String name,int age,float height,double weight,int score,String grade){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.score = score;
		this.grade = grade;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getGrade() {
		return grade;
	}
	public void setClass(String grade) {
		this.grade = grade;
	}
	public String getName(){
		return name;
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
		System.out.println("我叫"+name+"，我是"+grade+"班的一名男同学，今年"+age+"岁，身高："+height+"，体重"+weight+"，今年考了"+score+"分");
	}
}
