package com.hei.demo;
/**
 * 
 * 	Java中的类体系遵循单根结构，即任何一个类往上追溯都到达同一个父类；
	Object类就是这个单根体系的根，也就是说它是其它所有类的共同父类；
	如果用户定义的类没有扩展任何其它类，则默认扩展自Object类；
	Object类中定义的一些方法，会被继承到所有类中   hashCode() toString()

 * ObjectDemo类
 * 创建人:黑有有
 * 时间：2016年5月27日-下午8:05:35 
 * @version 1.0.0
 *
 */
public class ObjectDemo {
	public static void main(String[] args) {
		Student student = new Student("黑有有",21);
		Student student1 = new Student("黑有有",21);
		Student student2 = new Student("heihei",22);
		
//		String toString()返回当前对象的字符串表示，如果有必要，应该在自定义的类中覆盖该方法
//		当子类没有重写Object里的toString()方法时，并且当打印对象的引用时，默认调用了该方法，打印出对象的地址
//		System.out.println(student);//tom.hei.demo.Student@2a139a55
//		System.out.println(student.toString());//tom.hei.demo.Student@2a139a55
//		用 == 号比较的是对象内存地址
		System.out.println(student == student1);//false
		
		
//		boolean equals(Object obj)判断当前对象是否与参数obj（内容和地址）相等，如果有必要，应该在自定义的类中覆盖该方法
//		如果没有重写就调用了Object的equals()方法  
//		调用了自己重写的equals()方法
		System.out.println(student.equals(student1));//true
		System.out.println(student.equals(student));//true
		System.out.println(student1.equals(student2));//false
//		调用自己重写的toString()方法，即使不调用也会自己默认调用该方法
		System.out.println(student1);//黑有有年龄：21
		System.out.println(student1.toString());//黑有有年龄：21
	}
}
