package com.hei.demo;

public class ProduceCosumer {
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
	public synchronized void set( String name){
		while(flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.name = name + count++;
		System.out.println(Thread.currentThread().getName()+"生产者生产的..."+this.name);
		flag = true;
		this.notifyAll();
	}
	public synchronized void get(){
		while(!flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"消费者消费的.........."+this.name);
		flag = false;
		this.notifyAll();
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