package com.hei.dynamic;

import java.lang.reflect.Method;

public class MethodTest {
	public static void main(String[] args) throws Exception{
//		获取Person类的字节码对象
		Class class1 = Person.class;
//		Method getMethod(String name, Class<?>... parameterTypes) 返回一个 Method 对象，它反映此 Class 对象所表示的类或接口的指定name公共成员方法。 
		Method method = class1.getMethod("show",new Class[]{String.class,Integer.class});//第二个参数表示一个动态长度的参数，相当于Class类型的数组
//		Object invoke(Object obj, Object... args) 对带有指定参数的指定对象调用由此 Method 对象表示的底层方法。 
		Object object = method.invoke(new Person(),new Object[]{"黑有有",23});
//		Object object = method.invoke(new Person(),"黑有有",23);//动态参数可以用逗号隔开
		System.out.println(object);//23
//		如果方法的返回值是一个基本类型，就会返回基本类型的包装类型
		System.out.println(object.getClass());//class java.lang.Integer
	}
}
class Person{
	public int show(String name,Integer age){
		System.out.println(name+"===="+age);
		return 23;
	}
}