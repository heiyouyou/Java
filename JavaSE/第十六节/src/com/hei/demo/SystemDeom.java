package com.hei.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemDeom {
	public static void main(String[] args) throws IOException {
//		System.in：由于in实际上是一个InputStream类的对象，它只能以字节形式接收数据，并且一次只能接受一个字节，这使输入操作很不便；
//		可借助InputStreamReade类将InputStream类型的字节输入流对象转换成Reader类型的字符读取流对象
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(inputStreamReader);
		System.out.println("请输入您的姓名：");
		String name = in.readLine();
		System.out.println("请输入您的年龄：");
		Integer age = Integer.parseInt(in.readLine());
		System.out.println("姓名："+name+" 年龄："+age);
		in.close();
		inputStreamReader.close();
	}
}
