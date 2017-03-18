package com.hei.regexp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PatternMatcherDemo {
	//获取 ：将字符串的符合规则的字串去除
	/*操作步骤：
	 * 	1.将正则表达式封装成对象   ---》Pattern，使用compile()方法 
	 *  2.让正则对象和要操作的字符串关联》》使用mathcer()方法
	 *  3.关联之后，获取正则匹配器对象（匹配引擎） ---》Matcher
	 *  4.通过引擎对符合规则的字串进行操作。。方法：find()、mathces()、start()，end()例如：可以获取字串
	 * */
	public static void main(String[] args){
		getDemo();
		getDemo2();
	}
	public static void getDemo(){
		String string = "12345";
		String reg = "[1-9]\\d{4,14}";
		//static Pattern compile(String regex)将给定的正则表达式编译成Pattern对象。 
		Pattern pattern = Pattern.compile(reg);//将正则表达式封装成Pattern对象
		
		//Matcher matcher(CharSequence input)将字符序列（如：String,StringBuffer,StringBuilder）封装成Matcher对象
		Matcher mathcer = pattern.matcher(string);//将正则对象和要操作的字符串关联
		
		//对String类的matches(reg)方法，底层就是调用的Pattern与Matcher对象完成的，显得比较方便而已。
		string.matches(reg);
		
		//boolean matches()尝试将整个区域与模式匹配。 
		System.out.println(mathcer.matches());//true
	}
	
	public static void getDemo2(){
		String string = "tan xue zhou yuan shi yi ge xian shang jiao yu ji gou";
//		\b单词边界，以符合规则的字符前后有没有空格或者什么也没有，从而成为独立的一个整体
		String reg = "\\b[a-z]{3}\\b";
//		包装正则表达式成为Pattern对象
		Pattern pattern = Pattern.compile(reg);
//		关联字符串构成匹配器
		Matcher mathcer = pattern.matcher(string);
//		boolean find()尝试查找与该模式匹配的输入序列的下一个子序列。 
		boolean flag = mathcer.find();
		System.out.println(flag);//true
		
//		类似Iterator的迭代器
		while(mathcer.find()){//
//		String group()返回由以前匹配操作所匹配的输入子序列。 
			System.out.println(mathcer.group());
//			int end()返回最后匹配字符之后的后一位索引。 int start()返回以前匹配的初始索引。 
			System.out.println(mathcer.start()+"==="+mathcer.end());//0===3
		}
	}
}
