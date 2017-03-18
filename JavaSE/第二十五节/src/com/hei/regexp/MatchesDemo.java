package com.hei.regexp;

public class MatchesDemo {
	public static void matchesTest(){
		String str = "aasdfds1";
//		匹配只有一个英文字母的字符串
		String reg1 = "[a-z]";
		
//		匹配有1个或多个英文字母的字符串
		String reg = "[a-z]+";
//		匹配有1个或多个英文字母的字符串加数字的
		String reg2 = "[a-z]+\\d{1,4}";
//		用String串对象提供的matches(String reg)匹配整个字符串，只有一出不符合就匹配结束，匹配结果返回boolean类型的false,匹配成功返回true
		System.out.println(str.matches(reg1));//false
		System.out.println(str.matches(reg));//false
		System.out.println(str.matches(reg2));//true
		
	}
	public static void main(String[] args){
		matchesTest();
	}
}
