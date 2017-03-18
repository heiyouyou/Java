package com.hei.demo;
/**
 * 
 * equals(Object anObject))方法则是比较两个字符串中的内容(值)是否相同，
        如果相等返回true，否则返回false。
 * StringDemo1类
 * 创建人:黑有有
 * 时间：2016年5月26日-下午5:03:00 
 * @version 1.0.0
 *
 */
public class StringDemo1 {
	public static void main(String[] args) {
		String str1 = "ICSS", str2 = "ICSS";
		String str3 = new String("ETC"), str4 = new String("ETC");
		if (str1 == str2) {
			System.out.println("str1和str2指向同一字符串");//相同 
		}else{
			System.out.println("str1和str2分别指向不同字符串"); 
		}
		if (str1.equals(str2)) {
			System.out.println("str1和str2的内容完全相同");//相同
		}else {
			System.out.println("str1和str2的内容不相同"); 
		}
		
		if (str3 == str4) {
			System.out.println("str3和str4指向同一字符串");
		}else {
			System.out.println("str3和str4分别指向不同字符串");//不同
		}
		
		if (str3.equals(str4)) {
			System.out.println("str3和str4的内容完全相同");//相同
		}else {
			System.out.println("str3和str4的内容不相同"); 
		}
	}
}

