package com.hei.demo;

public class ThreadBasic {     
    public static void main(String[] args) {        
         Thread t = new Thread(new ThreadTest(), "thread-1");
         t.start();
//       void interrupt()中断线程。
         t.interrupt();
         System.out.println(t.isInterrupted());
    }
}
/**
 * 
 * InterruptedException的解读
	最近写了些多线程的程序，用Thread.sleep()的时候有时会碰到InterruptedException。查了一些资料，下面是我自己的一些理解。
	阻塞方法：
	一些多线程相关的方法是阻塞方法，比如Thread.sleep(), Thread.wait(), Thread.join()。
	这些方法的执行通常需要比较长的时间来完成，当代码执行到阻塞方法时，一般要等待该方法返回后
	才能继续往下执行，而InterruptedException提供了一种特殊的机制提前结束阻塞方法。
	中断变量：
	每个线程都会维护一个bool变量，表示线程处于中断（true）或者非中断状态(false)。在线程初始的情况下中断变量为false。
	这个变量的bool值可以通过Thread.isInterrupted()方法来读取，通过Thread.interrupted()方法来清除中断（即将中断变量置为false）。
	线程中断：
	一个线程可以通过调用Thread.interrupt()方法来中断另外一个线程，具体过程如下：
	1.中断变量被设置为true。
	2.如果线程执行到了阻塞方法，那么该方法取消阻塞，并将中断变量重新置为false。
	（这种机制是通过阻塞方法内部不断轮询中断变量的值来实现的）
	例子：
 * 
 * ThreadTest类
 * 创建人:黑有有
 * 时间：2016年6月13日-上午12:21:16 
 * @version 1.0.0
 *
 */
class ThreadTest implements Runnable {
     @Override
     public void run() {
    	 System.out.println("before sleep1");
         	try {
         		Thread.sleep(50001);
         		System.out.println(1);
	        } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName());
		        Thread.currentThread().interrupt();
		        System.out.println("after interrupt1");
		    }        
         	System.out.println("after sleep1");    
	        try {
		         Thread.sleep(50002);
		         System.out.println(2);
		    } catch (InterruptedException e) {
	             // TODO Auto-generated catch block
	             //e.printStackTrace();
	             System.out.println(Thread.currentThread().getName());
		         Thread.currentThread().interrupt();
			     System.out.println("after interrupt2");
			}
	        System.out.println("after sleep2");    
     }
}