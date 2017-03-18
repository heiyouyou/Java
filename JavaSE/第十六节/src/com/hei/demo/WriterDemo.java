package com.hei.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {
	public static void main(String[] args) {
		try {
//			写入流如果发现没有指定文件则会自动创建该文件
			File file = new File("test1.txt");
		    //通过文件对象创建文件写入字符流对象
		    FileWriter fw = new FileWriter(file);
		    //将文件写入字符流包装成缓冲流
		    BufferedWriter bw = new BufferedWriter(fw);
		    bw.write("大家好！");
		    bw.write("我正在学习Java。");
		    bw.newLine();//换个新行
		    bw.write("请多多指教。");
		    bw.newLine();//换新行
		    bw.write("Luckybug@21cn.com");
		    bw.close();//关闭流
		    fw.close();//关闭流
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
