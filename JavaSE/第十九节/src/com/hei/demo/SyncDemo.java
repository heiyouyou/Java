package com.hei.demo;

public class SyncDemo {
	public static void main(String[] args) {
		/*
		 * 	多线程的安全性问题：
		 * 		函数需要被对象所调用的，那么函数有一个所属对象的引用，就是this
		 * 		所以同步函数使用的锁为this锁
		 * 总结：---》两个线程或者两个以上线程共同访问共享数据的时候，要保证两者持有同一把锁，才能保证数据的安全性
		 * 		
		 * 注意:
		 * 	如果同步函数被静态修饰后，使用的锁是什么？
		 * 	发现不是this锁，因为静态方法中不能有this关键字
		 * 	静态进内存的时候，内存中没有本类的对象，一定有该类对应的字节码文件对象。  即类名.class（唯一），所以字节码文件锁属于静态同步方法的锁
		 * */
		Tick t1 = new Tick();
		Thread thread = new Thread(t1,"线程1");
		Thread thread1 = new Thread(t1,"线程2");
//		thread.start();
		thread1.start();
		try {
//			让主线程睡10毫秒
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		flag等待主线程醒来才能改变值
		t1.flag = false;
		thread.start();
//		thread1.start();
	}
}
class Tick implements Runnable{
	private static int tick = 100;
	Object obj = new Object();
	public boolean flag = true;
	@Override
	public void run(){
		if(flag){
			while(true){
//				同步代码块与同步方法用的不是一把对象锁，所以出现了数据的不同步安全问题
//				synchronized(obj){
//				此处用了this锁解决了与同步方法数据不同步的安全问题，可以证明同步方法用的就是this锁
//				synchronized(this){
//				用字节码文件对象锁，因为此时同步方法被static修饰，才能够解决多线程同步的出现的安全问题
				synchronized(Tick.class){
					if(tick > 0){
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+"Code剩余票数"+tick--);
					}
				}
			}			
		}else{
			while(true){
				show();							
			}
		}
	}
//	非静态的同步方法属于对象的方法，所以用的是this锁
//	public synchronized void show(){

//	被static修饰的同步方法是属于当前类的方法，所以用的是当前类字节码对象锁
	public static synchronized void show(){
		if(tick > 0){
			try{
				Thread.sleep(10);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"show剩余票数"+tick--);

		}
	}
}