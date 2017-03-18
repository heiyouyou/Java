package com.seven;
/**
 * 
 * 写一个人的类，类中有属性：姓名、年龄、性别。有一个展示自我信息的方法(show)。写一个测试类，定义一个人类的变量a，生成一个人的对象放入到a变量中去，将此人的姓名符值为“麻子”，年龄为18，性别为'男'。显示a的信息(调用show方法)。
 * Person类
 * 创建人:黑有有
 * 时间：2016年5月14日-上午11:14:21 
 * @version 1.0.0
 *
 */
public class Person {
	String name;
	int age;
	char sex;
	public void show(){
		System.out.println("姓名："+this.name+"\n年龄："+this.age+"\n性别："+this.sex);
		
	}
}
