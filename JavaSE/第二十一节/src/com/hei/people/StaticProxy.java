package com.hei.people;

public class StaticProxy {
	public static void main(String[] args) {
//		创建两个具体对象
		Student student = new Student();
		Star star = new Star();
//		通过构造函数注入两个具体对象
		PeopleProxy proxy = new PeopleProxy(student);
		PeopleProxy proxy2 = new PeopleProxy(star);
//		通过代理类简洁调用了具体对象的showName()方法
		proxy.showName("土豆丝");
		proxy2.showName("黑有有");
	}
}
