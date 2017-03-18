package com.hei.demo;

import java.io.File;
import java.util.Date;

/**
 * 
 * 	File类的对象不但可以表示文件，还可以表示目录，在程序中一个File类对象可以代表一个文件或目录；
	当创建一个文件对象后，就可以利用它来对文件或目录的属性进行操作，如：文件名、最后修改日期、文件大小等等；
	需要注意的是，File对象并不能直接对文件进行读/写操作，只能查看文件的属性(右键属性栏)；
 * FileDemo类
 * 创建人:黑有有
 * 时间：2016年6月4日-上午10:06:36 
 * @version 1.0.0
 *
 */
public class FileDemo {
	public static void main(String[] args){
//		File(String pathname)指定文件（或目录）名和路径创建文件对象
		
//		路径可以使用两个反斜杠隔开（但是在linux服务器上不支持）
//		File file = new File("e:\\File\\1.txt");
//		路径也可以使用一个正斜杠隔开（linux服务器上也支持）
		File file = new File("e:/File/1.txt");
		
//		String getAbsolutePath()获得文件的绝对路径
		System.out.println(file.getAbsolutePath());//e:\File\1.txt

//		即使路径在本地磁盘不存在，但还是可以创建出对象，而且不会在本地磁盘创建出该路径
//		File file = new File("e:/Files/1.txt");
//		System.out.println(file.getAbsolutePath());//e:\Files\1.txt
		
//		String getPath()与String getAbsolutePath()方法一样都是获取绝对路径
		System.out.println(file.getPath());//e:\File\1.txt
		
//		String getName()获得路径中最深的文件或文件夹的名称
		System.out.println(file.getName());//1.txt
		
//		String getParent()返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null。
		System.out.println(file.getParent());//e:\File
		
//		File getParentFile()返回此抽象路径名父目录的抽象路径名；如果此路径名没有指定父目录，则返回 null。
		System.out.println(file.getParentFile());//e:\File
		
//		boolean isFile()判断对象是否为文件，是文件返回true，否则返回false
		System.out.println("是不是一个文件对象？"+file.isFile());//true
		
//		boolean isDirectory()判断是否为目录（文件夹），是目录（文件夹）返回true，否则返回false
		System.out.println("是不是一个文件夹？"+file.isDirectory());//false
		
//		
		System.out.println("file的当前大小字节数："+file.length());//6

//		boolean canRead()测试应用程序是否可以读取此抽象路径名表示的文件。可以读取就返回true
		System.out.println("file的文件是不是只读文件？"+file.canRead());//true
		
//		boolean canWrite()测试应用程序是否可以修改此抽象路径名表示的文件。可以修改就返回true
		System.out.println("file的文件是不是可写文件？"+file.canWrite());//true
		
//		boolean isHidden()测试此抽象路径名指定的文件是否是一个隐藏文件。是隐藏文件就返回true
		System.out.println("file的文件是不是隐藏文件？"+file.isHidden());//false

//		long lastModified()返回此抽象路径名表示的文件最后一次被修改的时间。
		long t = file.lastModified();
		System.out.println(t);//1465007676466
		System.out.println(new Date(t).toLocaleString());//2016-6-4 10:34:36
	}
}
