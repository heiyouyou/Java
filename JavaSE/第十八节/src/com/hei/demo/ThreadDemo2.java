package com.hei.demo;

public class ThreadDemo2 {
	public static void main(String[] args) {
		MyThreadOne one = new MyThreadOne();
//		int getPriority() 返回线程的优先级。
		System.out.println("初始优先级为："+one.getPriority());//5
//		static int NORM_PRIORITY 分配给线程的默认优先级，所有线程的默认优先级都是5
		System.out.println("初始优先级为："+Thread.NORM_PRIORITY);//5
		
//		void setPriority(int newPriority) 更改线程的优先级。 
		one.setPriority(Thread.MAX_PRIORITY);//static int MAX_PRIORITY 线程可以具有的最高优先级。 
		System.out.println("MyThreadOne的优先级为："+one.getPriority());//10
		
//		void setName(String name)：设置该线程名称
		one.setName("MyThreadOne");
		MyThreadTwo two = new MyThreadTwo();
//		Thread(Runnable target, String name)：创建新的Thread对象 ，名字为name
		Thread tt = new Thread(two,"MyThreadTwo");
		
		tt.setPriority(Thread.MIN_PRIORITY);//static int MIN_PRIORITY 线程可以具有的最低优先级。 
		System.out.println("MyThreadTwo的优先级为："+tt.getPriority());//1
		one.start();
		tt.start();
	}
}
//奇数线程类
class MyThreadOne extends Thread{
	public void run(){
		for(int i=1;i<100;i+=2){
//			String getName()：返回线程的名称
			System.out.println(this.getName()+"奇数："+i);
		}
	}
}
//偶数线程类
class MyThreadTwo implements Runnable{
	public void run(){
		for(int i=0;i<=100;i+=2){
//			注意：Runnable是没有getName()方法的
//			System.out.println(this.getName()+"偶数："+i);
//			static Thread currentThread()返回对当前正在执行的线程对象的引用。
			System.out.println(Thread.currentThread().getName()+"偶数："+i);
		}
	}
}