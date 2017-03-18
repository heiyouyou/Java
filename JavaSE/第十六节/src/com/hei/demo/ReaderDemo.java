package com.hei.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
	public static void main(String[] args) {
		try{			
			File file = new File("e:/read.txt");
//			判断是否存在指定文件，不存在则创建改文件
			if(!(file.exists())){
				file.createNewFile();
			}
//			创建一个字符读取流对象
//			FileReader(File file) throws FileNotFoundException 使用File对象创建文件读取流对象，如果文件打开失败，将抛出异常
			FileReader reader = new FileReader(file);

//			FileReader(String name) throws FileNotFoundException使用文件名或路径创建文件读取流对象，如果文件打开失败，将抛出异常
//			FileReader reader = new FileReader("e:/read.txt");
			
			int len = 0;
//			循环打印读取到的字符
//			int read()每次只能读取一个字符，将读取到的文件数据返回出来，并且读到文件末尾返回-1
//			while((len = reader.read()) != -1){
////				System.out.println(len);//打印每个字符对应的Unicode编码值
//				System.out.print((char)len);//强制转换成字符
//			}
			
			char[] ch = new char[100];
			int i = 0;
//			int read(char[] b) throws IOException 读取文件中的数据，将读到的数据存放到byte型数组中，并返回读取的字符的数量，未读到数据返回-1，有可能抛异常，必须捕捉
			while((len = reader.read(ch)) != -1){
				i++;
				System.out.println("第"+i+"次读取的字符数为："+len);
//				new String(char[] ch)可将字符数组变成字符串
//				System.out.println("第"+i+"次读取的字符为："+new String(ch));
//				String(char[] value, int offset, int count)返回一个从字符数组value中开始位置第offset字符开始截取个数为count的字符组成的字符串
				System.out.println("第"+i+"次读取的字符为："+new String(ch,0,10));
			}
			reader.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
