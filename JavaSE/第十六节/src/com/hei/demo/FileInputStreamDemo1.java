package com.hei.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo1 {
  public static void main(String[] args) {
    try {
//    创建文件对象	
      File file = new File("input.txt");
      //使用文件对象创建文件输入流对象，相当于打开文件
      FileInputStream fis = new FileInputStream(file);
      for (int i = 0; i < file.length(); i++) {
        char ch = (char)(fis.read());//循环读取字符
        System.out.print(ch);
      }
      System.out.println();
      fis.close();//关闭流
    } catch (FileNotFoundException fnfe) {
      System.out.println("文件打开失败。");
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
  }
}
