package com.hei.regexp;

public class ReplaceDemo {
	public static void main(String[] args){
		String string = "abcd340234534adas344asda3454353";
		replaceAllTest(string,"\\d{3}","#");//新的字符串为：abcd###adas#asda##3
	
		String str1 = "asdasnnadbbasdsaaa";
		replaceAllTest(str1,"(.)\\1","&");//asdas&ad&asds&a
//		将叠词或者多个连续的字符只替换成一个表示，如：aaa--->a
		replaceAllTest(str1,"(.)\\1+","$1");//asdasnadbasdsa，$表示前面正则表达式的(.)，1代表正则表达式的\\1组号
	}
	public static void replaceAllTest(String str,String reg,String newStr){
//		String replaceAll(String regex, String replacement)使用给定的 replacement替换此字符串所有匹配给定的正则表达式的子字符串。 
		str = str.replaceAll(reg,newStr);
		System.out.println("新的字符串为："+str);
	}
}
