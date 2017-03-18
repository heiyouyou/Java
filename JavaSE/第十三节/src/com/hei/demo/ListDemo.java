package com.hei.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * 	集合是将多个元素组成一个单元的对象；
	类似于数组，但数组最大的缺点是：长度受到限制（一经创建，就不可再改变），并且只能存放相同数据类型的元素；
	集合的长度没有限制，可以存放任意多的元素，而且元素的数据类型也可以不同；
	集合还提供一系列操纵数据的方法，如存储、检索等等。
	
	集合框架的优点：
	提供有用的数据结构和算法，从而减少编程工作；
	提高了程序速度和质量,因为它提供了高性能的数据结构和算法；
	允许不同 API 之间的相互操作，API之间可以来回传递集合；
	可以方便地扩展或改写集合。

	为了满足不同场合的需要，java.util包中包含有一系列集合类；
	如：ArrayList类、LinkedList类、Vector类、HashMap类等等；
	集合类中只能存放对象，而不能存放原始数据类型的元素，所以当有原始数据类型需要存放时，只能将其转换成相应的包装类对象。

	ArrayList是长度可变的对象引用数组，称为动态数组；
	随着元素的添加，元素数目的增大，数组容量也会随之自动扩展；
	访问和遍历数组元素时，ArrayList的性能优越；
	ArrayList类继承了AbstractList类并实现了List接口。

 * ListDemo类
 * 创建人:黑有有
 * 时间：2016年5月31日-下午5:49:33 
 * @version 1.0.0
 *
 */
public class ListDemo {
	public static void main(String[] args) {
//		ArrayList()创建一个空的ArrayList对象，将会以默认（10个空间）的大小来初始化内部的数组
//		ArrayList类继承了AbstractList类并实现了List接口。
//		没有<>表示任何引用数据类型的元素都可以装入(但会有黄色线警告)，并且使用了父接口List的引用指向子类的对象，实现多态
//		List arrayList = new ArrayList();
//		boolean add(Object element)向ArrayList对象中添加一个元素，该元素可以是任何类的对象
//		arrayList.add(1);
//		arrayList.add(2);
//		arrayList.add(3);
//		arrayList.add("字符串");
//		arrayList.add(null);
//		arrayList.add(4);
//		arrayList.add(5);
//		arrayList.add(6);
//		当添加的值也就是长度达到9时，集合arrayList初始的10个空间长度会按1.5倍进行增长，底层就是一个动态数组
//		arrayList.add(7);
		
//		int size()返回ArrayList对象的大小长度，即元素的数量
//		System.out.println(arrayList.size());//9
		
//		打印的是一个字符串形式的数组，不是打印地址，因为重写了toString方法（在AbstractCollection这个抽象类重写了）
//		System.out.println(arrayList);//[1, 2, 3, 字符串, null]
//		System.out.println(arrayList.toString());//[1, 2, 3, 字符串, null]
		
		
//		<>表示泛型，限定了集合arrayList装入的元素类型，注意：集合类不能装入原始数据类型的值，只能用相应的包装类来装入集合
//		List<int> arrayList = new ArrayList<int>();
		
//		用原始数据类型的相应的包装类来限定集合
		List<Integer> arrayList = new ArrayList<Integer>();
//		也可以不写父类接口List的泛型
//		List arrayList = new ArrayList<Integer>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
//		所有引用数据类型的默认值都是null,所以任何类型的ArrayList集合都可以添加null值
		arrayList.add(null);
//		因为有泛型限定，arrayList集合只能装入Integer类型的值
//		arrayList.add("字符串");
		
//		//普通for循环变量list集合
		for (int i = 0; i < arrayList.size(); i++){
//			只有数组才能有[]获取指定位置的值，集合不能这样写
//			System.out.print(arrayList[i]+" ");
//			Object get(int index)返回指定索引位置的元素
			System.out.print(arrayList.get(i)+" ");//1 2 3 4 5 null 
		}
		System.out.println();
		
//		//jdk1.5 增强for循环去遍历list集合
		for(Integer integer : arrayList){
			System.out.print(integer+" ");//1 2 3 4 5 null 
		}
		System.out.println();
		
//		while+Iterator实现打印效果
//		iterator()返回的是一个Iterator接口类的对象
//		什么类型的集合调用iterator()就用泛型限制接口Iterator
		Iterator<Integer> iterator = arrayList.iterator();
		while(iterator.hasNext()){//boolean hasNext()如果仍有元素可以迭代，则返回 true。
//			装入的是什么类型的数据，就用什么类型的变量来接收
			Integer i = iterator.next();//next()返回迭代的下一个元素
			System.out.print(i+" ");//1 2 3 4 5 null 
		}
		System.out.println("\n"+"==========");
		
//		boolean isEmpty()判断ArrayList对象是否为空，为空返回true，否则返回false
		System.out.println(arrayList.isEmpty());//false
		
//		void clear()清空ArrayList对象中的所有元素
		arrayList.clear();
		System.out.println(arrayList);//[]
		System.out.println(arrayList.isEmpty());//true
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(11);
		list.add(10);
		list.add(9);
		
//		通过addAll(Collection e)传入一个集合对象e，实现动态添加值
		arrayList.addAll(list);
		System.out.println(arrayList);//[12, 11, 10, 9]
		
//		add(Index,value)在指定位置之前添加value值
		arrayList.add(2,21);
		for (Integer integer : arrayList) {
			System.out.print(integer+" ");//12 11 21 10 9 
		}
		System.out.println();
		
//		int indexOf(Object element)	判断element在ArrayList对象中是否存在，存在返回对应的索引，否则返回-1
		System.out.println(arrayList.indexOf("11"));//-1
		System.out.println(arrayList.indexOf(11));//1
		
//		int lastIndexOf(Object element)	反向查找element在ArrayList对象中是否存在，存在返回对应的索引（还是从左边数起），否则返回-1
		System.out.println(arrayList.lastIndexOf(21));//2
		
//		list subList(int fromIndex,int toIndex)	截取集合中从fromIndex开始，不包含toIndex索引的所有元素，注意越界异常！
		List<Integer> list2 = arrayList.subList(1,3);
		System.out.println(list2);//[11, 21]
		
//		addAll(Index,Collection e)在指定位置之前添加集合e
		arrayList.addAll(2,list2);
		System.out.println(arrayList);//[12, 11, 11, 21, 21, 10, 9]
		
//		Object remove(int index)从ArrayList对象中删除指定索引位置的元素,返回的是删除的元素
		System.out.println(arrayList.remove(4));//21
		System.out.println(arrayList);//[12, 11, 11, 21, 10, 9]
		System.out.println(arrayList.get(3));//21
		
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(30);
		list3.add(40);
		list3.add(50);
		arrayList.addAll(3,list3);
		System.out.println(arrayList);//[12, 11, 11, 30, 40, 50, 21, 10, 9]
		
//		removeAll(collection e),移除在调用集合对象中的指定集合e
		arrayList.removeAll(list3);
		System.out.println(arrayList);//[12, 11, 11, 21, 10, 9]
		
//		Object set(int index, Object elem)将元素elem存放到由index指定的索引位置上
		list3.set(2,1);
		System.out.println(list3);//[30, 40, 1]
 
		
		
		int a[] = {1,2,3,4,5};
//		ArrayList集合底层就是调用了数组类Arrays的方法copyOf()进行动态扩展长度
//		copyOf(object[] a,int value),在数组a中copy长度为value的值出来作为一个新数组,并返回这个新数组
		int b[] = Arrays.copyOf(a,3);
		for (int i : b) {
			System.out.print(i+" ");//1 2 3 
		}
	}
}
