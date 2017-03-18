package com.hei.demo;

public class SingleDemo {
//	1.单例设计模式之饿汉式：直接创建好对象以调用
//	构造函数私有化
	private SingleDemo(){};
//	设立静态变量，直接创建实例
	private final static SingleDemo s = new SingleDemo();
//	返回当前类实例的公有静态方法
	public static SingleDemo getInstance(){
		return s;
	}
	public static void main(String[] args) {
		SingleDemo s1 = SingleDemo.getInstance();
		SingleDemo s2 = SingleDemo.getInstance();
		System.out.println(s1==s2);//true
	}
}
