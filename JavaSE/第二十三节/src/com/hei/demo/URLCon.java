package com.hei.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class URLCon {
	public static void main(String[] args) {
//		声明一个字节读取流
		InputStream inputStream = null;
//		创建具有缓冲效果的字符流
		BufferedReader bufferedReader = null;
		try {
//			URL url = new URL("http://www.jd.com");
//			InputStream openStream()打开到此URL的连接并返回一个用于从该连接读入的 InputStream。 
//			inputStream = url.openStream();//从网络上读取数据
			
//			将字节流转成高速的缓冲读取流，注意读取的数据编码集要与服务端的相同，防止乱码
//			bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"gbk"));
//			String line = null;
//			循环读取指定网址下的数据
//			while((line=bufferedReader.readLine())!=null){
//				System.out.println(line);
//			}
			
//			创建一个URL的对象
//			注意:创建一个本地文件的URL实例，注意文件协议file///格式，
//			URL url = new URL("file:///E:/潭州学院/java中级班作业和练习/Jery老师JavaSe班/jery老师javase班练习/第二十三节/test.txt");
			URL url = new URL("http://www.qq.com");			
			
//			返回一个 URLConnection对象，它表示到 URL所引用的远程对象的连接。每次调用此 URL的协议处理程序的 openConnection方法都打开一个新的连接。
			URLConnection connection = url.openConnection();
			
//			getContentLength()返回 content-length头字段的值（即是文件的大小）。此连接的 URL引用的资源的内容长度，或者如果内容长度未知，则返回 -1。
			System.out.println(connection.getContentLength());//-1
			
//			String getContentType()返回content-type头字段的值（即是文件的类型）。 
			System.out.println(connection.getContentType());//text/html;charset=GB2312
			
//			Object getContent()获取此 URL连接的内容。 
			System.out.println(connection.getContent());//sun.net.www.content.text.PlainTextInputStream@42a57993

//			返回 last-modified头字段的值。结果为距离格林威治标准时间 1970 年 1 月 1 日的毫秒数。
			System.out.println(connection.getLastModified());//0
//			long getDate()返回 date头字段的值（即是该 URL引用的资源的发送日期，或者如果为未知，则返回 0。返回的值为距离格林威治标准时间 1970 年 1 月 1 日的毫秒数。） 
			long data = connection.getDate();
			if(data>0){
				Date date = new Date(data);
//				通过SimpleDataFormat()格式化日期
				System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));//2016-06-23 13:47:43
			}else{
				System.out.println(data);
			}
//			InputStream getInputStream() 返回从此打开的连接读取的输入流。 在读取返回的输入流时，如果在数据可供读取之前达到读入超时时间，则会抛出 SocketTimeoutException。 
			inputStream = connection.getInputStream();
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"gbk"));
			String line = null;
//			循环读取指定地址的文件数据
			while((line=bufferedReader.readLine())!=null){
				System.out.println(line);//这是一个测试文件！！！
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
//			关闭流的操作
			try {
				if(bufferedReader!=null)bufferedReader.close();
				if(inputStream!=null)inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
