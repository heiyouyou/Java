package com.hei.tank;

public class TankTest {
	public static void main(String[] args) {
		Tank t = new Tank();
//		先注入具体的坦克对象
		TankTimeProxy ttp = new TankTimeProxy(t);
//		将代理时间类的对象注入代理打印日志类中
		TankLogProxy tlp = new TankLogProxy(ttp);
//		执行move()方法的顺序：TankLogProxy > TankTimeProxy > Tank，先将最深层的方法执行完，外层的方法才会执行完
		tlp.move();
	}
}
