package com.hei.demo;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GenericType {
	public static void main(String[] args) {
		Student s = new Student();
//		获取Student实例的Class类实例
		Class class1 = s.getClass();
//		System.out.println(class1);//class com.hei.demo.Student
//		获取class1父类的Class实例
		Class class2 = class1.getSuperclass();
		System.out.println(class2);//class com.hei.demo.Person
		System.out.println(class2.getName());//com.hei.demo.Person
//		获取带泛型的父类Class实例，返回的是Type类型
		Type t = class1.getGenericSuperclass();
		System.out.println(t);//com.hei.demo.Person<com.hei.demo.Student>
//		ParameterizedType表示参数化类型，属于Type的子接口
		ParameterizedType p = (ParameterizedType)t;
//		Type[] getActualTypeArguments() 返回表示此类型实际类型参数的 Type 对象的数组。 
		Type type = p.getActualTypeArguments()[0];
		System.out.println(type);//class com.hei.demo.Student
		System.out.println("=================");
//		static Package getPackage(String name) 通过调用方的 ClassLoader实例中的名称找到一个包。 
		Package package1 = Package.getPackage("java.lang");
//		String getName() 返回此包的名称。 
		System.out.println(package1.getName());//java.lang
//		static Package[] getPackages() 获得调用方的 ClassLoader 实例当前已知的所有包。 
		Package[] packages = Package.getPackages();//获取jdk中所有的包
//		遍历获取所有包名
		for(Package pac : packages){
			System.out.println(pac.getName());
		}
	}
}
//泛型类
class Person<T>{
	
}
//泛型类具体化
class Student extends Person<Student>{
	
}