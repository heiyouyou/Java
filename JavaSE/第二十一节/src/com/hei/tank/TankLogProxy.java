package com.hei.tank;
//打印日志的代理类
public class TankLogProxy implements Moveable{
//	聚合实现的过程
	private Moveable moveable;
	public TankLogProxy(Moveable m){
		this.moveable = m;
	}
	public void move(){
		System.out.println("move start！！！！！");
		moveable.move();
		System.out.println("move end！！！！！");
	}
	
}
