package com.hei.demo;

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {
	    ArrayList al = new ArrayList();//创建一个空ArrayList对象
	    for (int i = 0; i < 10; i++) {
	      Integer num = new Integer(i);//创建整型包装类对象
	      al.add(num);//将该对象存放到ArrayList中
	    }
	    System.out.println("数组中的元素：");
	    for (int i = 0; i < al.size(); i++) {
	      Integer temp = (Integer)(al.get(i));//获得ArrayList中索引为i的元素
	      System.out.println(temp);
	    }
	    System.out.println("*********************************");
	    al.clear();  //清空
	    System.out.println("数组被清空后的情况：");
	    System.out.println("数组长度为：" + al.size());
	    if (al.isEmpty()) {    //判断是否为空
	      System.out.println("数组现在为空。");
	    }
	    else {
	      System.out.println("数组现在不为空。");
	    }
	}
}
