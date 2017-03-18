package com.hei.demo;

public class ProduceCostomer {
	public static void main(String[] args) {
//		创建也原料对象
		Resourced r = new Resourced();
//		创建线程对象
		Produce pro = new Produce(r);
		Customer cus = new Customer(r);
		
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(pro);
		Thread t3 = new Thread(cus);
		Thread t4 = new Thread(cus);
//		启动线程
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
class Resourced{
	private String name;
	private int count = 1;
	private boolean flag = false;
	public synchronized void set(String name){
		while(flag){
			try{
				this.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.name = name + "---"+count++;
		System.out.println(Thread.currentThread().getName()+"生产者"+this.name);
		flag = true;
//		otifyAll ()：唤醒正在排队等待资源的所有线程结束等待.
		this.notifyAll();
	}
	public synchronized void out (){
		while(!flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"消费者..."+this.name);
		flag = false;
		this.notifyAll();
	}
}
class Produce implements Runnable{
	private Resourced resource;
	public Produce (Resourced r){
		this.resource = r;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			resource.set("--商品--");
		}
	}
}
class Customer implements Runnable{
	private Resourced resource;
	public Customer(Resourced r){
		this.resource = r;
	}
	public void run(){
		while(true){
			resource.out();
		}
	}
}