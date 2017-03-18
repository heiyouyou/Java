package com.hei.demo;

import java.util.LinkedList;

/**
 * 
 * 	LinkedList类用于创建链表数据结构；
	链表中元素的数量不受任何限制，可以随意地添加和删除；
	与ArrayList相比，如果需要频繁地插入和删除元素，LinkedList的性能更加优越；(因为内部是采用了指针指向进行增删，内部没有索引这样说,查找是通过节点类实现查找)
	若要采用查找元素，ArrayList性能高（索引）
	LinkedList类继承了AbstractSequentialList类，并实现了List接口；

 * LinkListDemo类
 * 创建人:黑有有
 * 时间：2016年5月31日-下午8:03:50 
 * @version 1.0.0
 *
 */
public class LinkedListDemo1 {
	public static void main(String[] args) {
//		LinkedList链表不建议采用父类引用List指向LinkedList的对象，因为父类的引用不能调用除了子类LinkedList中重写的方法其他方法
//		List<Integer> linkedList = new LinkedList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		System.out.println(linkedList);//[1, 2, 2, 3, 4, 5]
		
//		void addFirst(Object element)将指定元素添加到链表的开始处
		linkedList.addFirst(0);
		System.out.println(linkedList);//[0, 1, 2, 2, 3, 4, 5]
		
//		void addLast(Object element)将指定元素添加到链表的结尾处
		linkedList.addLast(6);
		System.out.println(linkedList);//[0, 1, 2, 2, 3, 4, 5, 6]
		
//		Object removeFirst()删除链表中的第一个元素
		linkedList.removeFirst();
		System.out.println(linkedList);//[1, 2, 2, 3, 4, 5, 6]
		
//		Object removeLast()删除链表中的最后一个元素
		linkedList.removeLast();
		System.out.println(linkedList);//[1, 2, 2, 3, 4, 5]
		
//		Object getFirst()返回链表中的第一个元素
		System.out.println(linkedList.getFirst());//1
		
//		Object getLast()返回链表中的最后一个元素
		System.out.println(linkedList.getLast());//5
	}
}
