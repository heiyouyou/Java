package com.hei.dynamic;

import java.lang.reflect.Proxy;

import com.hei.people.People;
import com.hei.people.Student;

public class DynamicProxyTest {
	public static void main(String[] args) {
		Student stu = new Student();
		DynamicProxy proxy = new DynamicProxy(stu);
//		static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
//		第一个参数表示具体对象的类加载器，第二个参数表示Class类的动态接口参数，第三个参数表示代理类的实例
		People people = (People)Proxy.newProxyInstance(Student.class.getClassLoader(),stu.getClass().getInterfaces(),proxy);
//		People people = (People)Proxy.newProxyInstance(People.class.getClassLoader(),stu.getClass().getInterfaces(),proxy);
		people.showName("张三李四");
	}
}
