package com.hei.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * 从命令行输入一行字符串！要求从中随机选择6个字符组成验证码！
 * RandomValidate类
 * 创建人:黑有有
 * 时间：2016年6月1日-下午10:18:06 
 * @version 1.0.0
 *
 */
public class RandomValidate {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		System.out.println("请输入内容...");
		String string = in.nextLine();
//		判断字符串是否为空
		if(string.isEmpty())return;
		int index = 0;
		StringBuffer buffer = new StringBuffer();
		for(int i = 0;i < 6;i++){
			index = random.nextInt(string.length());
			buffer.append(string.charAt(index));
		}
		System.out.println("6个随机字符："+buffer);
	}
}
