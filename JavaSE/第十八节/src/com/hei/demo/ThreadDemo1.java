package com.hei.demo;


public class ThreadDemo1 {
	
//	public void method(String str){
//		System.out.println(str);
//	}
//	public void method1(String str){
//		method(str);
//	}
////	每个Java程序都有一个隐含的主线程： main 方法
//	public static void main(String[] args) {
//		ThreadDemo1 demo1 = new ThreadDemo1();
//		demo1.method1("这是一个普通方法...");
//	}
	
	public static void main(String[] args) {
//		创建一个线程对象
		MyThread myThread = new MyThread();
//		只是单纯的调用了run()方法，并没有启动线程
//		myThread.run();
		
//		"MyThread开始执行"先打印
//		System.out.println("MyThread开始执行！");
//		调用start方法启动线程
		myThread.start();//最后打印
//		"MyThread执行完毕！"第二个打印
//		System.out.println("MyThread执行完毕！");
		
		MyRunnable myRunnable = new MyRunnable();
//		使用Thread的带参数的构造器进行传递Runnable的实现类实例
		Thread mr = new Thread(myRunnable);
//		System.out.println("MyRunnable开始执行");
//		注意：Runnable接口没有启动线程的方法start()
//		myRunnable.start();
		mr.start();
//		System.out.println("MyRunnable执行完毕");
		for(int i=0;i<10;i++){
			System.out.println("MainThread:"+i);
		}
	}
}

//通过继承Thread类实现自定义线程类
class MyThread extends Thread{
	@Override
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("MyThread:"+i);
		}
//		try {
////			static void sleep(long millis)在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），此操作受到系统计时器和调度程序精度和准确性的影响。
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////		发现：启动的线程与主线程是同步进行的。JVM只要发现有其他线程在执行，就不会退出。
//		System.out.println("MyThread睡了2秒钟最后一次执行");
	}
}
//通过实现Runnable接口自定义线程子类
class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("MyRunnable:"+i);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("MyRunnable2秒钟最后一次执行");
	}
	
}