package com.hei.regexp;
/*
 * 判断字符串是否与正则相匹配 ，使用matches(String reg)
 * 把已有的字符串变成另外一个字符串使用替换  ，str.replaceAll(String reg,String newStr);
 * 把已有的字符串变成多个字符串使用split--->变成String[]
 * 想要获取符合要求的字符串  ---》reg--->Pattern类与Matcher类
 * */
public class ExpDemo01 {
	public static void main(String[] args){
		getDemo();
		getEmail("_42423432@qq.com.cn");//true
	}
	public static void getDemo(){
//		将下面的字符串变成："哲是一个很漂亮的女孩纸"
		String str = "哲哲...是是...一个很...漂漂漂...亮的女孩纸";
		str = str.replaceAll("\\.+","");
		System.out.println(str);//哲哲是是一个很漂漂漂亮的女孩纸
		str = str.replaceAll("(.)\\1+","$1");
		System.out.println(str);//哲是一个很漂亮的女孩纸
	}
	//匹配邮箱
	public static void getEmail(String email){
		String str = email;
		String reg = "\\w+@[a-zA-Z0-9]+(\\.[a-zA-Z]+){1,3}";
		System.out.println(str.matches(reg));
	}
}
