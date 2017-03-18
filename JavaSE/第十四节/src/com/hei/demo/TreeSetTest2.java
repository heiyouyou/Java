package com.hei.demo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest2 {
	public static void main(String[] args) {
//		传入一个按年龄排序的排序器进行规定升降序的输出；true为降序，false为升序
		TreeSet<Student> hash1 = new TreeSet<Student>(new StudentComparator(true));
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
