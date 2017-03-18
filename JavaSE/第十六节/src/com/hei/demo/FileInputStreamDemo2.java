package com.hei.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo2 {
  public static void main(String[] args) {
    try {
      File file = new File("E:/潭州学院/java中级班作业和练习/Jery老师JavaSe班/jery老师javase班练习/第十六节/src/com/hei/text/input.txt");//创建文件对象
      FileInputStream fis = new FileInputStream(file);
      System.out.println(file.length());//29336字节数
      //根据文件的字节长度创建字节数组
      byte[] buf = new byte[(int)(file.length())];
      fis.read(buf);//读取文件中的数据存放到字节数组中
      String str = new String(buf);//利用字节数组创建字符串
      System.out.println(str);//打印字符串
      fis.close();//关闭流
    } catch (FileNotFoundException fnfe) {
      System.out.println("文件打开失败。");
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
  }
}
