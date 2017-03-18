package com.hei.demo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
//		一个Student类的HashSet集合
		HashSet<Student> hash1 = new HashSet<Student>();
		HashSet<Student> hash2 = new HashSet<Student>(); 
		Student stu1 = new Student("Jery",27);
		Student stu2 = new Student("Keven",32);
		Student stu3 = new Student("Arry",31);
		Student stu4 = new Student("KeKe",30);
		Student stu5 = new Student("Vicky",18);
		Student stu6 = new Student("Mini",21);
//		给hash1添加元素对象
		hash1.add(stu1);
		hash1.add(stu2);
		hash1.add(stu3);
		hash1.add(stu4);
//		给hash2添加元素对象
		hash2.add(stu5);
		hash2.add(stu6);
//		clear()清空集合hash1的所有元素
		hash1.clear();
//		addAll()为集合hash1添加一个同类的集合
		hash1.addAll(hash2);
//		hash1.removeAll(hash2);
//		boolean containsAll(collection e)判断调用的集合中是否有集合e，有则返回true，没有返回false
		System.out.println(hash1.containsAll(hash2));//false
		Iterator<Student> iterator = hash1.iterator();
		while(iterator.hasNext()){
			Student student2 = iterator.next();
			System.out.print(student2.getUsername()+"年龄："+student2.getAge()+"\t");
		}
//		for (Student student : hash1) {
////			打印的是对象的引用地址
////			System.out.println(student);
////			无序打印学生的详细信息
//			System.out.print(student.getUsername()+"年龄："+student.getAge()+"\t");//KeKe年龄：30	Jery年龄：27	Keven年龄：32	Arry年龄：31	
//		}
	}
}
