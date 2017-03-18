package com.hei.demo;

public class YieldDemo {
	public static void main(String[] args){
		Producer producer = new Producer();
		Customer customer = new Customer();
		producer.setPriority(4);
//		虽然使用了线程让步yield()但是由于优先级比producer低，该方法是没有效果的
//		customer.setPriority(1);
		customer.setPriority(Thread.MAX_PRIORITY);
//		void setDaemon(boolean on) 将该线程标记为守护线程(true)或用户线程(false)。
//		守护线程在jvm退出时自动结束，JVM不会等守护线程，守护线程服务于用户线程
		producer.setDaemon(true);
		customer.setDaemon(false);
		producer.start();
		customer.start();
//		stop():强制线程生命期结束， 已过时。该方法具有固有的不安全性
//		producer.stop();
//		static boolean interrupted() 测试当前线程是否已经中断。
		System.out.println(Thread.interrupted()); 
//		boolean isInterrupted() 测试线程是否已经中断。 
		System.out.println(producer.isInterrupted());
//		boolean isAlive()：返回boolean，判断线程是否还活着
		System.out.println(producer.isAlive());
//		try {
//			customer.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(customer.isAlive());
	}
}
class Producer extends Thread{
	public void run(){
		for(int i=0;i<50;i++){
//			static void yield()：线程让步
//			暂停当前正在执行的线程，执行机会让给把优先级相同或更高的线程，若队列中没有同优先级的线程，忽略此方法
			Thread.yield();
			System.out.println("I am producer..."+i);
		}
	}
}
class Customer extends Thread{
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println("I am customer..."+i);
		}
	}
}