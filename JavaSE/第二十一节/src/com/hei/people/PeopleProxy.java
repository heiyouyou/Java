package com.hei.people;
//创建一个实现了接口People的代理类
public class PeopleProxy implements People {
	private People people;
//	构造函数注入具体的对象给参数people赋值
	public PeopleProxy(People p){
		this.people = p;
	}
//	代理类的showName()方法
	public void showName(String name){
		System.out.println("我是一个代理，我为自己代言！！！");
//		通过多态的特点调用了具体对象的showName()方法
		people.showName(name);
	}
}
