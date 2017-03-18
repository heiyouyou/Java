package com.hei.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
//		Properties类
//		该类是位于util包里的一个工具类，与IO的结合能十分有效地读写文件，特别在准确快速读取方面效率十分高！
//		该类结合了util包里的HashMap的存储方法，使用了键值对方式

//		创建一个配置文件对象
		Properties p = new Properties();
		try {
			File file = new File("e:/pro.properties");
			FileInputStream inputStream = new FileInputStream(file);
			FileReader fileReader = new FileReader(file);
//			void load(InputStream in)通过字节流加载一个文件
//			p.load(inputStream);
//			void load(Reader reader)通过字符流加载一个文件
			p.load(fileReader);
//			String getProperty(String key) 通过键获得文件中对应的值
			System.out.println(p.getProperty("username"));
			System.out.println(p.getProperty("age"));
//			如果在配置文件找不到则返回null
			System.out.println(p.getProperty("content"));
//			Object setProperty(String key,String value)	存入一对键值对
			p.setProperty("id","12");
			System.out.println(p.getProperty("id"));//12
//			boolean containsKey(String key)配置文件对象是否包含某个键
			System.out.println(p.containsKey("username"));//true
			System.out.println(p.containsKey("hu"));//false
			System.out.println(p.containsKey("id"));//true
//			boolean containsValue(String value)配置文件对象是否包含某个值
			System.out.println(p.containsValue("黑有有"));//true
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
