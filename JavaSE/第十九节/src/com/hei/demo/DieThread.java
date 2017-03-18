package com.hei.demo;

public class DieThread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Lock(true));
		Thread t2 = new Thread(new Lock(false));
		t1.start();
		t2.start();
	}
}
class Lock implements Runnable{
	private boolean flag = false;
	public Lock(boolean flag){
		this.flag = flag;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(flag){
//			调用locka对象锁
			synchronized(MyLock.locka){
				System.out.println("if locka");
//				调用lockb对象锁
				synchronized(MyLock.lockb){
					System.out.println("if lockb");
				}
			}
		}else{
//			调用lockb对象锁
			synchronized(MyLock.lockb){
				System.out.println("else lockb");
//				调用locka对象锁
				synchronized(MyLock.locka){
					System.out.println("else locka");
				}
			}
		}
	}
	
}

class MyLock{
//	创建连个同步锁
	static Object locka = new Object();
	static Object lockb = new Object();
}