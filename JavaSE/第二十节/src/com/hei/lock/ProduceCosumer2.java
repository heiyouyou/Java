package com.hei.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProduceCosumer2 {
	/*
	 *  jdk1.5提供了多线程的升级解决方法（显示的锁机制）
	 *  将同步synchronized替换成了显示的Lock操作----》lock() unlock()
	 *  将Object中的wait、notify/notifyAll替换成了Condition类的(await/signal/signalAll)
	 *  该对象可以 Lock.newCondition()获取
	 *  一个锁可以绑定多个Condition对象，避免了因同步嵌套导致死锁问题的发生。
	 * 	释放锁的操作必须放在我们的try/finally代码块或者try..catch/finally代码块当中使用
	 * 	实现了本方只唤醒对方的操作！
	 * 
	 * */
	public static void main(String[] args) {
		Resource resource = new Resource();
		Product product = new Product(resource);
		Customer customer = new Customer(resource);
		Thread t1 = new Thread(product);
		Thread t2 = new Thread(product);
		Thread t3 = new Thread(customer);
		Thread t4 = new Thread(customer);
		t1.start();
		t2.start();		
		t3.start();		
		t4.start();		
	}
}
class Resource{
	private String name;
	private int count = 1;
	private boolean flag = false;
//	一个可重入的互斥锁 Lock，它具有与使用 synchronized方法和语句所访问的隐式监视器锁相同的一些基本行为和语义，但功能更强大。
//	Lock是一个接口，只能通过它的子类ReentrantLock创建实例
	private Lock lock = new ReentrantLock();//创建一个 ReentrantLock的实例。
//	Condition newCondition()返回用来与此 Lock实例一起使用的 Condition实例。 
	private Condition condition_pro = lock.newCondition();//调用ReentrantLock的方法newCondition()
	private Condition condition_cus = lock.newCondition();
	public void set( String name){
//		void lock()获取锁。 即是开启显示锁
		lock.lock();
			try {
				while(flag){
//					void await()造成当前线程在接到信号或被中断之前一直处于等待状态。 
					condition_pro.await();//生产者等待
				}
				this.name = name + count++;
				System.out.println(Thread.currentThread().getName()+"生产者生产的..."+this.name);
				flag = true;
//				void signal()唤醒一个等待线程。 
//				condition_pro.signal();
//				void signalAll()唤醒所有等待线程。 
				condition_cus.signalAll();//唤醒所有消费者线程
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
//				void unlock()试图释放此锁。 
//				注意：释放锁一定要放在finally块中
				lock.unlock();				
			}
	}
	public void get(){
		lock.lock();
			try {
				while(!flag){
					condition_cus.await();//消费者线程等待
				}
				System.out.println(Thread.currentThread().getName()+"消费者消费的.........."+this.name);
				flag = false;
//				void signalAll()唤醒所有等待线程。 
				condition_pro.signalAll();//唤醒所有生产者线程
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				lock.unlock();				
			}
	}
}
class Product implements Runnable{
	private Resource resource;
	public Product(Resource r){
		this.resource = r;
	}
	@Override
	public void run(){
		while(true){
			resource.set("商品");
		}
	}
}
class Customer implements Runnable{
	private Resource resource;
	public Customer(Resource r){
		this.resource = r;
	}
	@Override
	public void run(){
		while(true){
			resource.get();			
		}
	}
}