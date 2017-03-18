package com.hei.homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;


public class hw2 {
	public static void main(String[] args) {
//		从控制台进行输入用户名以及用户密码，判断是否登录成功！要求准确的用户名和密码存在配置文件中！
//		创建一个文件对象
		File file = new File("e:/pro.properties");
//		将字节流System.in对象转成字符流对象
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//		将字符流对象变成对应的缓冲流对象
		BufferedReader sys = new BufferedReader(inputStreamReader);
//		创建一个配置文件对象
		Properties p = new Properties();
//		创建一个文件读取流对象
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
//			以字符流的方式加载文件
			p.load(fileReader);
			System.out.println("请输入用户名：");
			String name = sys.readLine();
			System.out.println("请输入密码：");
			String pwd = sys.readLine();
//			获取到配置文件中的正确用户名
			String n = p.getProperty("username");
//			获取到配置文件中的正确密码
			String pw = p.getProperty("pwd");
//			判断输入的用户名和密码是否正确
			if(n.equals(name) && pw.equals(pwd)){
				System.out.println("恭喜您成功登陆用户~~~");
			}else{
				System.out.println("您输入的用户名或密码错误！！！");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				fileReader.close();
				sys.close();
				inputStreamReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
