package com.hei.homework;

import java.util.Scanner;
/**
 * 用户从命令行输入一个字符串，请判断是否为回文字符串。（例如abcba/你好好你）
 * 用其他方法判断字符串是否为回文（不用数组）！
 * ReverseText类
 * 创建人:黑有有
 * 时间：2016年5月26日-下午7:39:40 
 * @version 1.0.0
 *
 */
public class ReverseText {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个回文字符串...");
//		用一个String类的对象接收输入的字符串
		String str = in.next();
//		创建一个StringBuffer类的实例
		StringBuffer str1 = new StringBuffer(str);
//		拿String类的str与StringBuffer类的str1经过翻转reverse进行比较
//		回文字符串特点：经reserve()后还会与原来的形式一样
		if(str.equals(str1.reverse().toString())){
			System.out.println("恭喜您输入的回文字符串是："+str);
		}else{
			System.out.println("您输入的不是一个回文字符串！！！");			
		}
		System.out.println("结束。。。。。");
	}
}
