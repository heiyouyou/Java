package com.hei.demo;

public class SingleDemo2 {
//	2.单例设计模式之饿汉式：使用到的时候才会创建对象
//	创建一个静态的对象空引用
	private static SingleDemo2 single = null;
//	私有化构造函数
	private SingleDemo2(){};
//	获取实例的静态公有方法
	Object obj = new Object();
	public static synchronized SingleDemo2 getInstance(){
//		进一步过滤掉被阻止的线程进行判断同步锁是否开着的次数,达到高效的效果
//		if(single == null){
//			这里不能用Object当做对象锁，因为方法属于静态方法，不能出现非静态的变量
//			synchronized(SingleDemo2.class){
//				判断对象引用是否为空
				if(single == null){
//				创建一个新对象
					single = new SingleDemo2();
				}			
//			}			
//		}
//		返回创建的对象
		return single;
	}
	public static void main(String[] args) {
//		获取到同一个对象，在多线程处理一份数据的时候不安全
		SingleDemo2 s1 = SingleDemo2.getInstance();
		SingleDemo2 s2 = SingleDemo2.getInstance();
		SingleDemo2 s3 = SingleDemo2.getInstance();
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//true
	}
}
