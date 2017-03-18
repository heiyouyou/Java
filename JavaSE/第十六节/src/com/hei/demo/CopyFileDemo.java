package com.hei.demo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {
	public static void main(String[] args) throws IOException{
		File srcFile = new File("e:/src.dat");//源文件对象
	    File destFile = new File("e:/dest.dat");//目标文件对象
	    if (!(srcFile.exists())) {//判断源文件是否存在
	    	srcFile.createNewFile();//如果不存在则创建新文件
	    }
	    //使用源文件对象创建文件输入流对象
//		注意输入流的对象文件在磁盘中一定要存在，不存在会报错：系统找不到指定的文件
	    FileInputStream fis = new FileInputStream(srcFile);
	    //使用目标文件对象创建文件输出流对象
	    FileOutputStream fos = new FileOutputStream(destFile);
	    byte[] buf = new byte[1024];//创建字节数组，作为临时缓冲
	    System.out.println("开始复制文件...");
	    while (fis.read(buf) != -1) {//循环从文件输入流中读取数据
	      fos.write(buf);//写入到文件输出流中
	    }
	    System.out.println("文件复制成功！");
	    //关闭流
	    fis.close();
	    fos.close();
	}
}