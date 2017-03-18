package com.hei.demo;

public class CharacterDemo {
	public static void main(String[] args) {
//		静态初始化一个char数组
		char[] charArray = {'*', '7', 'b', ' ', 'A'};
//		遍历这个char数组
	    for (int i = 0; i < charArray.length; i++) {
//	    	判断是数字的
	      if (Character.isDigit(charArray[i])) {
	        System.out.println(charArray[i] + "是一个数字。");
	      }
//	     	 判断是字母的
	      if (Character.isLetter(charArray[i])) {
	        System.out.println(charArray[i] + "是一个字母。");
//	        	判断是小写的
	        if (Character.isLowerCase(charArray[i])) {
		        System.out.println(charArray[i] + "是小写形式。");
		      }else if (Character.isUpperCase(charArray[i])) {//判断是大写的
		        System.out.println(charArray[i] + "是大写形式。");
		      }
	      }
//	      	判断是空格的
	      if (Character.isWhitespace(charArray[i])) {
	        System.out.println(charArray[i] + "是一个空格。");
	      }
	    }
	}
}
