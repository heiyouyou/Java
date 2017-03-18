package com.hei.demo;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 
 * 	自然排序：
	自然排序使用要排序元素的CompareTo（Object obj）方法来比较元素之间大小关系，然后将元素按照升序排列。
	Java提供了一个Comparable接口，该接口里定义了一个compareTo(Object obj)方法，该方法返回一个整数值，
	实现了该接口的对象就可以比较大小。obj1.compareTo(obj2)方法如果返回0，则说明被比较的两个对象相等，
	如果返回一个正数，则表明obj1大于obj2，如果是 负数，则表明obj1小于obj2。
	如果我们将两个对象的equals方法总是返回true，则这两个对象的compareTo方法返回应该返回0
	
	定制排序：
	自然排序是根据集合元素的大小，以升序排列，如果要定制排序，应该使用Comparator接口，实现 int compare(T o1,T o2)方法
 * TreeSetDemo类
 * 创建人:黑有有
 * 时间：2016年6月2日-下午5:59:42 
 * @version 1.0.0
 *
 */
public class TreeSetDemo2 {
	public static void main(String[] args) {
//		new TreeSet(Campator e) 传入一个排序器的实现类的实例可以实现升降序排序
		TreeSet<Integer> integers = new TreeSet<Integer>(new IntegerComparator(true));
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
