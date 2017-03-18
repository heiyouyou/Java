package com.hei.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw1 {
	public static void main(String[] args) {
//		从控制台输入一些字符串，并将该类信息保存到日志文件中去，保证日志文件是追加。

//		创建一个文件对象
		File file = new File("e:/hw1.txt");
//		将字节流System.in对象转成字符流对象
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//		将字符流对象变成对应的缓冲流对象
		BufferedReader sys = new BufferedReader(inputStreamReader);
		try {
//			创建一个文件写入流对象
			FileWriter fileWriter = new FileWriter(file,true);
//			创建一个文件写入流的缓冲流对象
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			System.out.println("请输入内容...");
//			获取控制输入的信息
			String str = sys.readLine();
//			当什么不输入时，跳出循环
			while(!(str.equals(""))){
				bufferedWriter.write(str);
				bufferedWriter.newLine();
				System.out.println("请输入内容...");
				str = sys.readLine();
			}
//			关闭所有流
			bufferedWriter.close();
			fileWriter.close();
			sys.close();
			inputStreamReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
