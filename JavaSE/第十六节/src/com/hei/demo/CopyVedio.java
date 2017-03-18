package com.hei.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyVedio {
	public static void main(String[] args) throws IOException {
//		创建一个源文件对象
		File srcFile = new File("E:/潭州学院/java中级班视频/jsjQuery前端/bootstrap特训班/07-作业解答/Bootstrap_2016-05-04_1.wmv");
//		创建一个目标文件对象
		File targetFile = new File("e:/k1.wmv");
//		创建一个输入流对象
		FileInputStream in = new FileInputStream(srcFile);
//		创建一个输出流对象
		FileOutputStream out= new FileOutputStream(targetFile);
		byte[] bt = new byte[1024];
		int len = 0;
//		获取复制之前的开始系统时间
		long startTime = System.currentTimeMillis();
		while((len = in.read(bt)) != -1){
			System.out.println(len);
//			将每次读取到的数据写入目标文件
//			out.write(bt);
//			write(byte[] e,int startoff,int count)传入一个字节数组，从startoff位置开始写入count个字节进文件
			out.write(bt,0,len);
		}
//		获取复制结束后的系统时间
		long endTime = System.currentTimeMillis();
		System.out.println("复制完成...");
		System.out.println("本次复制耗时："+((endTime-startTime)/1000)+"秒");
	}
}
