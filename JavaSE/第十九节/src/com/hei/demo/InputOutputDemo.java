package com.hei.demo;

public class InputOutputDemo {
	public static void main(String[] args) {
		/*
		 * wait notify notifyAll 都使用在同步中，因为要对持有监控器（锁）的线程进行操作
		 * 
		 * 	为啥操作线程的方法定义在Object中？
		 * 	1、因为这些方法在操作同步中的线程的时候，都必须要标识他们所操作线程持有的锁
		 * 	2、只有同一个锁上的被等待的线程，可以被同一个锁上的notify所唤醒
		 * 	3、不可以对不同锁中的线程进行唤醒，即等待与唤醒是同一把锁
		 * 	故此，锁可以是任意对象，所以可以被任意对象所调用的方法应该在Object类当中。
		 * */
		Resource resource = new Resource();
		Thread t1 = new Thread(new Input(resource));
		Thread t2 = new Thread(new Output(resource));
		t1.start();
		t2.start();	
	}
}
//原料对象类
class Resource{
	String name;
	String sex;
	boolean flag = false;
}
//一个
class Input implements Runnable{
//	私有化一个Resource类的变量
	private Resource resource;
//	构造函数注入一个Resource对象
	public Input(Resource r){
		this.resource = r;
	}
	public void run(){
		int x = 0;
		while(true){
			synchronized(resource){
				if(resource.flag){
					try {
//						wait()：令当前线程挂起并放弃CPU、同步资源，使别的线程可访问并修改共享资源，而当前线程排队等候再次对资源的访问
						resource.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(x==0){
					resource.name = "静静";
					resource.sex = "女";
				}else{
					resource.name = "土豆丝";
					resource.sex = "男";
				}
				x = (x+1)%2;
				resource.flag = true;
//				notify()：唤醒正在排队等待同步资源的线程中优先级最高者结束等待
				resource.notify();
			}
		}
	}
}
class Output implements Runnable{
	private Resource resource;
	public Output(Resource r){
		this.resource = r;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized(resource){
				if(!resource.flag){
					try {
						resource.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(resource.name+"---"+resource.sex);
				resource.flag = false;
				resource.notify();
			}
		}
	}
	
}