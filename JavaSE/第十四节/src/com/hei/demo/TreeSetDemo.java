package com.hei.demo;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 
 * 	TreeSet是SortedSet接口的唯一实现类，TreeSet可以确保集合元素处于排序状态。
	TreeSet 是二差树实现的,Treeset中的数据是自动排好序的，不允许放入null值(默认是升序)
	TreeSet支持两种排序方式，自然排序 和定制排序。其中自然排序为默认的排序方式。向TreeSet中加入的应该是同一个类的对象。
	TreeSet判断两个对象不相等的方式是两个对象通过equals方法返回false，或者通过CompareTo方法比较返回0。
 * TreeSetDemo类
 * 创建人:黑有有
 * 时间：2016年6月2日-下午5:59:42 
 * @version 1.0.0
 *
 */
public class TreeSetDemo {
	public static void main(String[] args) {
//		TreeSet集合输出时，默认以升序输出
		TreeSet<Integer> integers = new TreeSet<Integer>();
		integers.add(50);
		integers.add(5);
		integers.add(-50);
		integers.add(30);
		integers.add(220);
		integers.add(43);
		integers.add(43);
		
//		TreeSet集合不能添加null，会报空指针异常
//		integers.add(null);
		Iterator<Integer> iterator1 = integers.iterator();
		while(iterator1.hasNext()){
			Integer integer = iterator1.next();
			System.out.print(integer+" ");//-50 5 30 43 50 220 
		}
	}
}
