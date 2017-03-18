package com.hei.demo;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
	public static void main(String[] args) {
//		ArrayList(插入删除元素耗性能)与 LinkedList(查找耗性能)的优缺点，添加元素ArrayList比LinkedList快
		LinkedList<Integer> list = new LinkedList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		long timeStart = 0;
		long timeEnd = 0;
//		System.currentTimeMillis()获取当前系统的时间毫秒数
		timeStart = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++) {
			list.add(i);
		}
		timeEnd = System.currentTimeMillis();
		System.out.println("LinkedList添加元素消耗的时间："+(timeEnd-timeStart));
		timeStart = System.currentTimeMillis();
		list.remove(8888888);
		timeEnd = System.currentTimeMillis();
		System.out.println("LinkedList移除元素消耗的时间："+(timeEnd-timeStart));
		System.out.println("==========================");
		timeStart = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++) {
			list2.add(i);
		}
		timeEnd = System.currentTimeMillis();
		System.out.println("ArrayList添加元素消耗的时间："+(timeEnd-timeStart));
		timeStart = System.currentTimeMillis();
		list2.remove(8888888);
		timeEnd = System.currentTimeMillis();
		System.out.println("ArrayList移除元素消耗的时间："+(timeEnd-timeStart));
		
	}
}
