package com.hei.tank;
//时间代理类
public class TankTimeProxy implements Moveable {
	private Moveable moveable;
	public TankTimeProxy(Moveable m){
		this.moveable = m;
	}
	public void move(){
		long start = System.currentTimeMillis();
		System.out.println("当前时间为："+start);
		moveable.move();
		long end = System.currentTimeMillis();
		System.out.println("移动所消耗的时间为："+(end-start));
	}
}
