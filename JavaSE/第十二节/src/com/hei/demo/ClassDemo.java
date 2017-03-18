package com.hei.demo;

import java.lang.reflect.Field;
/**
 * 
	Class类的实例用于记录对象的类描述信息；
	如果在程序运行时，需要检索某个对象的相关类信息，可以调用该对象的getClass方法来获得记录其描述信息的Class类实例；
	Class类没有公共的构造方法，无法通过new运算符实例化，
	只能通过对象的getClass方法，或是通过Class的静态方法forName来获得实例
 * ClassDemo类
 * 创建人:黑有有
 * 时间：2016年5月28日-上午9:51:02 
 * @version 1.0.0
 *
 */
public class ClassDemo {
	public static void main(String[] args) {
		Student student = new Student();
//		Class getClass()返回当前对象的类描述对象，此方法被继承到所有类中，就是获取当前对象所属的类详细信息的对象
//		Class class1 = student.getClass();
//		System.out.println(class1);//class tom.hei.demo.Student
		
//		getFields()获取的是Student类下的公有化public成员属性详细信息以数组的形式存在
//		Field[] fields =  class1.getFields();
//		getDeclareFidelds()获取的是Student类下所有成员属性详细信息包括被private修饰的
//		Field[] fields1 =  class1.getDeclaredFields();
//		foreach(循环的类型  对应的数组值自定义标识 : 要进行循环的数组名)
//		for (Field s : fields) {//s 相当于 fields[i]每个值
//			System.out.println(s);//public int tom.hei.demo.Student.number
//		}
//		for(Field s1 : fields1){
//			System.out.println(s1);
//			打印如下:
//			private int tom.hei.demo.Student.age
//			private java.lang.String tom.hei.demo.Student.username
//			public int tom.hei.demo.Student.number
//		}
		
		
//		static Class forName(String className)throws ClassNotFoundException	
//		使用参数className来指定具体的类，来获得相关的类描述对象，
//		该方法有可能抛出类加载异常（ClassNotFoundException），必须捕捉
			try {
//				获取指定类的描述对象
				Class class2 = Class.forName("com.hei.demo.Student1");
				System.out.println(class2);//class com.hei.demo.Student
				Student student1 = new Student();
//				String getName()返回当前类描述对象的类名称
				System.out.println(student1.getClass().getName());//com.hei.demo.Student
//				Class getSuperclass()获得当前类描述对象的父类的描述对象
				System.out.println(student1.getClass().getSuperclass().getName());//java.lang.Object
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

//			打印java.lang.StringBuffer的根系结构：
//			java.lang.StringBuffer
//			java.lang.AbstractStringBuilder
//			java.lang.Object
		try {
			Class class3 = Class.forName("java.lang.StringBuffer");
//			循环到根系顶级的Object跳出循环
			while(class3!=null){
				System.out.println(class3.getName());
				class3 = class3.getSuperclass();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
