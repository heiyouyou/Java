package com.hei.demo;

import java.util.Date;
/**
 * 
 * 	Date类对象用来表示时间和日期；
	该类提供一系列操纵日期和时间各组成部分的方法；
	Date类最多的用途是获取系统当前的日期和时间。
 * DateDemo类
 * 创建人:黑有有
 * 时间：2016年5月31日-上午11:03:21 
 * @version 1.0.0
 *
 */
public class DateDemo {
	public static void main(String[] args) {
//		Date()使用系统当前时间创建日期对象
		Date date = new Date();
		System.out.println(date);//Tue May 31 10:57:43 CST 2016
		
//		getTime()返回自 1970 年 1 月 1 日 00:00:00 GMT以来到 Date 对象表示时间的毫秒数。
		System.out.println(date.getTime());//1464663980537
		
//		Date(long date)	使用自1970年1月1日以后的指定毫秒数创建日期对象
		Date date2 = new Date(1464663980537L);//注意了传入的是一个Long类型数字
//		默认调用的toString()方法，而且重写了Object的toString方法
		System.out.println(date2);//Tue May 31 11:06:20 CST 2016
		System.out.println(date2.toString());//Tue May 31 11:06:20 CST 2016
		
//		Date(int year, int month, int date)创建指定年、月、日的日期对象
		Date date3 = new Date(2016,5,31);//横线表示已经过时的方法
		System.out.println(date3.toString());//Sat Jul 01 00:00:00 CST 3916
		
//		String toLocalString()返回本地时间以字符串的形式展现
		System.out.println(date2.toLocaleString());//2016-5-31 11:06:20
		
//		将日期格式的对象变成字符串
		String strDate = date3.toString();
		System.out.println(strDate.substring(24));//3916
		System.out.println(strDate.substring(strDate.length()-4));//3916
		
		Date date4 = new Date(2016,5,28);
		Date date5 = new Date(2016,5,29); 
		Date date6 = new Date(2016,5,28);
//		boolean after(Date when)如果当前日期对象在when指定的日期对象之后，返回true，否则返回false
		System.out.println(date4.after(date5));//false
		
//		boolean before(Date when)如果当前日期对象在when指定的日期对象之前，返回true，否则返回false
		System.out.println(date4.before(date5));//true
		
//		boolean equals(Object obj)如果两个日期对象完全相同(比较类型与值)，返回true，否则返回false
		System.out.println(date4.equals(date5));//false
		System.out.println(date4.equals(date6));//true
		
//		void setTime(long time)设置日期对象，以表示自1970年1月1日起的指定毫秒数
		date4.setTime(1464663980537L);
		System.out.println(date4);//Tue May 31 11:06:20 CST 2016
//		int hashCode()返回此对象的哈希码值。
		System.out.println(date4.hashCode());//80132268
	}
}
