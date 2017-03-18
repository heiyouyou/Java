package com.hei.regexp;

public class SplitDemo {
	public static void splitMethod(){
//		String string = "黑有有   jery    vick";
//		split()把字符串分割为字符串数组
//		String[] strArr = string.split(" +");//将多个空格的字符串切割成数组
		
		
		/*
		 * 分组：（.）\1 将正则表达式封装成为一个组，用（）完成
		 * 组的出现都有编号，从1开始，形式：\1，注意：在字符串中转义
		 * 要想使用已有的组可以通过\n(n为组的编号)的形式来获取
		 * 判断组数：((()()))---->从左边括号开始数，一个左开括号就代表为一组，所以共有4组
		 * 
		 * */
		//按照叠词完成切割
		String string = "sdaaasdqqqqqqqqancaabcgghc";
//		. 任何字符（与行结束符可能匹配也可能不匹配） 
		String reg = "(.)\\1+";//将字符串中重复出现的字符匹配出来
		String[] strArr = string.split(reg);
		System.out.println(strArr.length);//5
		for(String str : strArr){
			System.out.print(str+"\t");
		}
	}
	public static void main(String[] args) {
		splitMethod();//sd	sd	anc	bc	hc
	}
}
