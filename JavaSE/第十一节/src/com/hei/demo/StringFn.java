package com.hei.demo;

import java.io.UnsupportedEncodingException;

/**
 * 
 * 字符串常用方法的操作
 * StringFn类
 * 创建人:黑有有
 * 时间：2016年5月26日-下午5:35:29 
 * @version 1.0.0
 *
 */
public class StringFn {
	public static void main(String[] args) {
//		字符串常用方法的操作
//		String str1 = "12 3 ";
//		String str2 = "afh34";
//		String str3 = "abcdef";
//		String str4 = "ABcdef";
//		int compareTo(String anotherString)	根据ASCII码比较字符串anoterString和当前字符串的大小(ASCII码差值)，比较方式类似于C语言中的strcmp函数		
//		System.out.println(str1.compareTo(str2));//-48
//		boolean startsWith(String prefix)	判断当前字符串是否以字符串prefix为开头
//		System.out.println(str1.startsWith("12"));//true
//		boolean endsWith(String suffix)	判断当前字符串是否以字符串suffix为后缀
//		System.out.println(str2.endsWith("34"));//true
//		如果需要搜索某个字符（或某个子串）在字符串中是否出现过，这就要使用到indexOf方法和lastIndexOf方法。
//		int indexOf(String str)	搜索字符串str在当前字符串中第一次出现的索引，没有出现则返回-1
//		System.out.println(str3.indexOf("ab"));//0
//		int indexOf(int ch)	搜索字符ch（ASCII码转成相应的字符）在当前字符串中第一次出现的索引，没有出现则返回-1
//		System.out.println(str3.indexOf(97));//0
//		int lastIndexOf(String str)	反向搜索字符串str在当前字符串中出现的索引，没有出现则返回-1
//		System.out.println(str3.lastIndexOf("cd"));//2
//		int lastIndexOf(int ch)	反向搜索字符ch（ASCII码转成相应的字符）在当前字符串中出现的索引，没有出现则返回-1
//		System.out.println(str3.lastIndexOf(99));//2
//		System.out.println(str3.equals(str4));//false
//		boolean equalsIgnoreCase(String anotherString)	判断字符串anotherString是否与当前字符串相等，忽略大小写形式
//		System.out.println(str3.equalsIgnoreCase(str4));//true
//		System.out.println(str1.length());//5
//		trim()去掉字符串中的前后空格 用于返回一个前后不含任何空格的调用字符串的副本
//		System.out.println(str1.trim().length());//4
		
//		String str = "潭州学院";
//		String str1= "143";
//		char charAt(int index)用于从指定位置提取单个字符，该位置由index指定，索引值必须为非负
//		System.out.println(str.charAt(2));//学
//		String substring(int index)用于提取从index指定的位置开始的字符串部分
//		System.out.println(str.substring(2));//学院
//		String substring(int begin, int end)用于提取 begin 和 end 位置之间的字符串部分,即begin---->end-1（含头不含尾）
//		注意了java中subtring索引不支持负数，而且右边一定得大于左边，否则报错：java.lang.StringIndexOutOfBoundsException
//		System.out.println(str.substring(0,2));//潭州
//		System.out.println(str.substring(0,-2));//报错：java.lang.StringIndexOutOfBoundsException
//		String concat(String str)用于连接两个字符串，并新建一个包含调用字符串的字符串对象
//		System.out.println(str.concat(str1));//潭州学院143
//		String replace(char oldChar, char newChar)用于将调用字符串中出现oldChar指定的字符全部都替换为newChar指定的字符
//		System.out.println(str.replace("潭州","tanzhou"));//tanzhou学院
//		replaceAll(String regex, String replacement)用于将调用字符串中出现或者匹配regex(正则)的字符串全部都替换为replacement指定的字符
//		System.out.println(str.replaceAll("潭州","tanzhou"));//tanzhou学院
//		System.out.println(str1.replaceAll("\\d","tan"));//tantantan
		
//		String str1 = "  Java is OOP";
//	    String str2 = new String(" ACCP");
//	    System.out.println(str1.charAt(2));//"J"
//	    System.out.println(str1.substring(5));//"a is OOP"   
//	    System.out.println(str1.substring(2, 9));//"Java is"    
//	    System.out.println(str1.concat(str2));//  Java is OOP  ACCP
//	    System.out.println(str1 + str2);//  Java is OOP  ACCP
//	    System.out.println(str1.replace('a','e'));//  Jeve is OOP
//	    System.out.println(str1.trim());//Java is OOP
		
//		String str1 = "Java is OOP";
//      String str2;
//      String toUpperCase()返回当前字符串的全大写形式
//      str2 = str1.toLowerCase();
//      System.out.println(str2);//java is oop
//      str1还是没有变化的，字符串是不可变的
//      System.out.println(str1);//Java is OOP
//      String toUpperCase()返回当前字符串的全大写形式
//      str2 = str1.toUpperCase();
//      System.out.println(str2);//JAVA IS OOP
		
		String str = "a0123";
//		返回当前字符串转化成byte型数组的形式（以ASCII码输出）
//		byte[] bt = str.getBytes();
		byte[] bt;
		try {
//			也可以传入相应的编码集，但须要捕获异常
			bt = str.getBytes("utf-8");
			for(int i = 0;i<bt.length;i++){
				System.out.print(bt[i]+"\t");//97	48	49	50	51
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
//		返回当前字符串的字符数组形式，类似于C语言中字符串的保存形式
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]+"\t");//a	0	1	2	3
		}
	}
}
