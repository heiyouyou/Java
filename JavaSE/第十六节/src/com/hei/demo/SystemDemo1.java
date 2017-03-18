package com.hei.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemDemo1 {
	public static void main(String[] args) {
		try {
//			创建一个文件对象
			File file = new File("e:/system.txt");
//			创建一个控制台输入的对象转成Reader对象
			InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//			将控制台输入流对象变成对应的缓冲输入流对象
			BufferedReader in = new BufferedReader(inputStreamReader);
//			创建一个写入流对象
			FileWriter fileWriter = new FileWriter(file);
//			将写入流对象转成对应的缓冲写入流对象
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			System.out.println("请输入内容...");
//			获取控制台输入的字符内容
			String str = in.readLine();
//			当用户输入!!!时跳出循环，否则继续输入内容
			while(!(str.equals("!!!"))){
				bufferedWriter.write(str);
				bufferedWriter.newLine();
				System.out.println("请输入内容...");
				str = in.readLine();
			}
			System.out.println("输入结束...");
//			关闭流
			bufferedWriter.close();
			fileWriter.close();
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
