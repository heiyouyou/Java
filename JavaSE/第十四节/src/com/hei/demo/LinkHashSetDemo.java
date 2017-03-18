package com.hei.demo;

import java.util.LinkedHashSet;

/**
 * 
 * LinkedHashSet继承了HashSet集合，同样是根据元素的hashCode值来决定元素的存储位置，但是它同时使用链表维护元素的次序。
        这样使得元素看起 来像是以插入顺序保存的，也就是说，当遍历该集合时候,LinkedHashSet将会以元素的添加顺序访问集合的元素。
   LinkedHashSet在迭代访问Set中的全部元素时，性能比HashSet好，但是插入时性能稍微逊色于HashSet。
 * LinkHashSetDemo类
 * 创建人:黑有有
 * 时间：2016年6月2日-下午5:44:53 
 * @version 1.0.0
 *
 */
public class LinkHashSetDemo {
	public static void main(String[] args) {
//		LinkedHashSet是通过链表维护的，有着LinkedList的特点也有HashSet的特点：怎么插入元素，它就怎么输出元素，不能存入相同的元素
		LinkedHashSet<Integer> linkset = new LinkedHashSet<Integer>();
		linkset.add(12);
		linkset.add(223);
		linkset.add(null);
		linkset.add(12);
		linkset.add(30);
		linkset.add(30);
		for (Integer integer : linkset) {
			System.out.println(integer);
		}
	}
}
