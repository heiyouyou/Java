package com.hei.demo;
/**
 * 
 * Java中，字符串是String类的对象；
	可以通过使用String类提供的方法来完成对字符串的操作；
	创建一个字符串对象之后，将不能更改构成字符串的字符；
	每当更改了字符串版本时，就创建了一个新的字符串对象，并在其内包含所做的修改，原始字符串保持不变。
 * StringDemo类
 * 创建人:黑有有
 * 时间：2016年5月26日-下午3:30:11 
 * @version 1.0.0
 *
 */
public class StringDemo {
	public static void main(String[] args) {
//		一般采用这种方式创建字符串
//		String string = "heiheiyou";
//		System.out.println(string.length());//9
//		char[] aryChar = {'I','C','S','S'};
//        String str1 = "ETC";
//        //利用一个字符串常量值创建新的字符串
//        String str2 = new String("ICSSETC");
//        //利用一个字符型数组创建新的字符串
//        String str3 = new String(aryChar);
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
		
//		String类中提供length成员方法 ，用来获得字符串的长度，方法原型：int length()
//		该方法返回字符串中有效字符的个数。
//		注意了：一个空格也算一个字符如：" "，只是单纯的双引号里面什么也没有，属于一个空字符:""
        String str1 = "John Smith";
//        String str1 = "";//长度为0
//        String str1 = " ";//长度为1
        String str2 = new String("I Love Java");
        System.out.println(str1.length());//10
        System.out.println(str2.length());//11
	}
}
