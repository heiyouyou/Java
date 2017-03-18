package com.demo;
/**
 * 
 * 
 * Homework1类
 * 创建人:黑有有
 * 时间：2016年5月13日-下午7:12:39 
 * @version 1.0.0
 *
 */
public class Homework1 {
	public static void main(String[] args){
		//创建一个Box的对象box并初始化
		Box box = new Box(12,2,5,43);
		box.calcVolume();
		box.print();
		//创建一个Box的对象box1并初始化
		Box box1 = new Box(12,3,1,45);
		box1.calcVolume();
		box1.print();
	}
}
