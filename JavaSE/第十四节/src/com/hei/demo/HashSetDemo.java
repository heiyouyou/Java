package com.hei.demo;

import java.util.HashSet;
/**
 * 
 * 	能保证元素的排列顺序，顺序有可能发生变化
	不是同步的,即线程不安全
	HashSet 是哈希表实现的,HashSet中的数据是无序的，可以放入null，但只能存入放入一个null或者相同的元素(无重复)
	当向HashSet集合中存入一个元素时，HashSet会调用该对象的hashCode()方法来得到该对象的hashCode值，
 	然后根据 hashCode值来决定该对象在HashSet中存储位置。如果这个位置上没有元素，它就可以直接存储在这个位置上，
 	不用再进行任何比较了；如果这个位置上已经有元素了， 就调用它的equals方法与新元素进行比较，相同的话就不存了，不相同就散列其它的地址。

 * HashSetDemo类
 * 创建人:黑有有
 * 时间：2016年6月2日-下午5:11:38 
 * @version 1.0.0
 *
 */
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> hashset = new HashSet<Integer>();
//		HashSet可以添加相同的元素包括null，但是相同的元素只能存入一个进集合
//		HashSet集合不出现相同元素的原理：调用了hashCode()和equals()比较地址和值，如果在相同的地址中有相同的元素只会保留一个
		hashset.add(10);
		hashset.add(10);
		hashset.add(null);
		hashset.add(null);
		hashset.add(130);
		hashset.add(120);
//		System.out.println(hashset);//[null, 130, 120, 10]
//		HashSet集合是随机排序输出的
		for(Integer integer : hashset){
			System.out.println(integer);//null, 130, 120, 10
		}
	}
}
