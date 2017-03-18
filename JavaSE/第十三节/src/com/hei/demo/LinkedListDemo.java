package com.hei.demo;

import java.util.LinkedList;

public class LinkedListDemo {
	 public static void main(String[] args) {
	    LinkedList ll = new LinkedList();//创建空的链表
	    for (int i = 1; i <= 10; i++) {
	      Double temp = new Double(Math.sqrt(i));//创建包装类对象，使用Math类中的sqrt()函数开平方根
	      ll.add(temp);   //将包装类对象添加到链表中
	    }
	    System.out.println("链表中的元素：");
	    //循环打印链表中的元素
	    for (int i = 0; i < ll.size(); i++) {
	      System.out.print(ll.get(i)+" ");
	    }
	    System.out.println("*********************************");
	    ll.removeFirst();  //删除第一个元素
	    ll.removeLast();   //删除最后一个元素
	    System.out.println("删除第一个元素和最后一个元素后的链表：");
	    for (int i = 0; i < ll.size(); i++) {
	      System.out.print(ll.get(i)+" ");
	    }
	 }
}
