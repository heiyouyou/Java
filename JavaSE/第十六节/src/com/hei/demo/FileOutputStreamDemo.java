package com.hei.demo;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamDemo {
	public static void main(String[] args){
//		FileOutputStream类称为文件输出流，继承于OutputStream类，是进行文件写操作的最基本类；
//		它的作用是将内存中的数据输出到文件中，我们可以利用它来写文件。
		File file = new File("E:/潭州学院/java中级班作业和练习/Jery老师JavaSe班/jery老师javase班练习/第十六节/src/com/hei/text/outinput.txt");
		FileOutputStream output = null;
		try{
//			FileOutputStream(File file) throws FileNotFoundException 使用File对象创建文件输出流对象，如果文件打开失败，将抛出异常
//			注意：如果文件路径在磁盘中不存在，FileOutputStream则会自动创建改路径和文件
//			output = new FileOutputStream(file); 
			
//			FileOutputStream(File file, boolean append)throws FileNotFoundException	使用File对象创建文件输出流对象，并由参数append指定是否追加文件内容，true为追加，false为不追加，异常情况同上
//			output = new FileOutputStream(file,true); 			
			
//			FileOutputStream(String name) throws FileNotFoundException 直接使用文件名或路径创建文件输出流对象，异常情况同上
//			output = new FileOutputStream("E:/潭州学院/java中级班作业和练习/Jery老师JavaSe班/jery老师javase班练习/第十六节/src/com/hei/text/t.txt"); 			
			
//			FileOutputStream(String name, boolean append) throws FileNotFoundException 直接使用文件名或路径创建文件输出流对象，并由参数append指定是否追加，异常情况同上
			output = new FileOutputStream("E:/潭州学院/java中级班作业和练习/Jery老师JavaSe班/jery老师javase班练习/第十六节/src/com/hei/text/t.txt",true); 			
			String content = "嘿嘿嘿今天是一个高考日！！！祝广大学子考试顺利！！！";

//			void write(int b) throws IOException 往文件中写数据，一次写一个字节，有可能抛异常，必须捕捉
//			output.write(97);//将int类型的值按ASCII码自动转成对应的字符：a
//			调用字符串的方法getBytes()将字符串变成字节数组
			byte[] bt = content.getBytes();
//			void write(byte[] b) throws IOException	往文件中写数据，将byte数组中的数据全部写入到文件中，有可能抛异常，必须捕捉
//			注意：写入中文的字节数组是不会出现乱码的，因为在内存中已经将中文字符转成了字节一次性装入了字节数组
			output.write(bt);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
//				void close() throws IOException	关闭流对象，有可能抛异常，必须捕捉
				output.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
