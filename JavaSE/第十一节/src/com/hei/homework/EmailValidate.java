package com.hei.homework;

import java.util.Scanner;

/**
 * 
 * 	题目：用户从命令行输入一个字符串，要求判断是否为合法的email地址，如果合法，请判断是否为sina的邮箱地址。合法邮箱规则:
	有且仅有一个@和.
	@在.之前 且@不能是第一位  .不能是最后一位
	@与.不能相邻
	新浪邮箱应当以@sina.com结尾
 * EmailValidate类
 * 创建人:黑有有
 * 时间：2016年5月26日-下午7:08:53 
 * @version 1.0.0
 *
 */
public class EmailValidate {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入您的新浪邮箱...");
		String emailStr = in.nextLine();
		char[] emailChar = emailStr.toCharArray();
//		for(int i = 0;i<emailChar.length;i++){
//			if("@".equals(emailChar[i])){
//				
//			}else if()
//		}
	}
}
