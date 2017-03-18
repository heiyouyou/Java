package com.hei.demo;

public class ThreadJoinDemo {
	public static void main(String[] args) {
		System.out.println("爸爸跟儿子的有趣的买烟故事...");
//		创建一个父类线程对象
		Father father = new Father();
		Thread f = new Thread(father);
//		启动父类线程
		f.start();
	}
}
//自定义一个父亲线程类
class Father implements Runnable{
	public void run(){
		System.out.println("爸爸叫儿子去买烟...");
//		在父类中执行了儿子的线程
		Thread son = new Thread(new Son());
		son.start();
		try {
//			当某个程序执行流中调用其他线程的 join()方法时，调用线程将被阻塞，直到其他线程执行完为止，该线程才会被打开执行；低优先级的线程也可以获得执行 
			son.join();//等待该线程终止，需要捕捉异常
//			join(long millis)等待该线程终止的时间最长为 millis毫秒后调用线程才执行。
//			son.join(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("买到烟了~~~爸爸很开心...");
	}
}
//自定义一个儿子线程类
class Son implements Runnable{
	public void run(){
		System.out.println("儿子去买烟了...");
		for(int i=0;i<5;i++){
			try {
//				static void sleep(long millis)：(指定时间:毫秒)令当前活动线程在指定时间段内放弃对CPU控制,使其他线程有机会被执行,时间到后重排队。
//				抛出InterruptedException异常
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("儿子买烟第"+i+"分钟");
		}
		System.out.println("儿子买烟回来了...");
	}
}