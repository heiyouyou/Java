package com.hei.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


public class StringUtils {
	/**
	 * 获取具体某个对象对应类的具体信息
	 * com.hei.demo 
	 * 方法名：toString
	 * 创建人：黑有有 
	 * 时间：2016年6月18日-下午5:16:18 
	 * @param object
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
//	对象调用toString() 方法，默认值是由类名和哈希值组成的，实用性并不强。
//	重写Object类中的toString()方法
	public static String toString(Object object){
//		获取传入的对象的对应类的Class类实例
		Class class1 = object.getClass();
//		创建一个字符串缓冲流
		StringBuilder sb = new StringBuilder();
//		获取类实例的包名
		Package packageName = class1.getPackage();
		sb.append("包名："+packageName.getName()+"\t");
//		获取对象对应的具体类名
		String className = class1.getSimpleName();
		sb.append("类名"+className+"\n");
		sb.append("公共的构造方法为：\n");
//		获取某个类中的所有构造函数
		Constructor[] constructors = class1.getDeclaredConstructors();
//		遍历获取指定修饰符的构造函数
		for(Constructor constructor : constructors){
//			String toString(int mod) 返回此修饰符的小写名称。 
			String modifier = Modifier.toString(constructor.getModifiers());//获取每个构造函数的权限修饰符
//			containns(String name)包含name值的返回true
			if(modifier.contains("public")){
				sb.append(constructor+"\n");
			}
		}
		sb.append("公共字段：\n");
//		获取某个类中的所有字段
		Field[] fields = class1.getDeclaredFields();
//		遍历获取指定的字段
		for (Field field : fields) {
			String modifier = Modifier.toString(field.getModifiers());
			if(modifier.contains("public")){
				sb.append(field+"\n");
			}
		}
		sb.append("公共方法：\n");
//		获取某个类中的所有方法
		Method[] methods = class1.getDeclaredMethods();
//		遍历获取指定的方法
		for(Method method : methods){
			String modifier = Modifier.toString(method.getModifiers());
//			将包含有修饰符public的方法取出来
			if(modifier.contains("public")){
				sb.append(method+"\n");
			}
//			将只有修饰符public修饰的方法取出来
//			if(modifier.equals("public")){
//				sb.append(method+"\n");
//			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(StringUtils.toString(new Object()));
	}
}
