package com.hei.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


public class Person {
	private String name;
//	@MyTiger(value = "黑有有",age = 21)
	@MyTiger(age = 21)
	public void setName(String name){
		this.name = name;
	}
	@Override
	public String toString(){
		return "";
	}
	public static void main(String[] args){
//		拿到Person类的字节码文件对象
		Class class1 = Person.class;
//		遍历拿到Perosn类中所有方法并且通过反射获取方法上的注解
		for(Method method : class1.getDeclaredMethods()){
//			System.out.println(method);
//			getAnnotations()如果存在该元素的指定类型的注释，则以Annotation数组形式返回这些注释
//			for(Annotation annotation : method.getAnnotations()){
//				System.out.println(annotation);//@com.hei.annotation.MyTiger(value=哈哈哈！！！, age=21)
//			}
			
//			getAnnotation(Class<T> annotationClass)如果存在该元素的指定类型的注解，则返回这些注解，否则返回 null。 
			MyTiger an = method.getAnnotation(MyTiger.class);
			System.out.println(method+"=="+an);
			if(an!=null){
				System.out.println(method+"=="+an.value()+"=="+an.age());//public void com.hei.annotation.Person.setName(java.lang.String)==哈哈哈！！！==21
			}
		}
	}
}
