package com.hei.demo;


public class TicketDemo {
	public static void main(String[] args) {
		/**
		 * 多线程出现了安全问题：
		 * 问题的原因：
		 * 当多条语句在操作同一个线程共享数据时，一个线程对多条语句只执行了一部分，还没有执行完，另一个线程参与进来执行。导致共享数据的错误。
		 * 解决办法:
		 * 对多条操作共享数据的语句，只能让一个线程都执行完，在执行过程中，其他线程不可以参与执行。
		 * 具体方法：
		 * 同步代码块    synchronized(obj){需要同步的代码} 
		 * 好处： 解决了多线程的安全性问题
		 * 弊端：多个线程每次需要判断锁，较为消耗资源
		 * 
		 */
		Ticket t1 = new Ticket();
//		创建了三个线程对象，同时处理一份数据ticket，容易出现数据混乱不安全问题
		Thread thread = new Thread(t1,"线程1");
		Thread thread1 = new Thread(t1,"线程2");
		Thread thread2 = new Thread(t1,"线程3");
//		启动线程
		thread.start();
		thread1.start();
		thread2.start();
	}
}
//Runnable接口的实现类
class Ticket implements Runnable{
//	加上static也是无法解决多线程处理一份共享数据的安全性问题
//	private static int ticket = 100;
	private int ticket = 1;
	Object Obj = new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
//			同步代码块    synchronized(obj){需要同步的代码}用来锁定当前对象，只有进去的线程执行完毕才会打开锁 	
			synchronized(Obj){
				if(ticket>0){
					try {
//						当前线程睡眠10再次执行
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"剩余票数："+ticket--);
				}
			}
		}
	}
	
}