package com.hei.regexp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * 爬虫实例
 * ExpDemo02类
 * 创建人:黑有有
 * 时间：2016年6月28日-下午10:16:19 
 * @version 1.0.0
 *
 */
public class ExpDemo02 {
	public static void main(String[] args) throws Exception {
//		创建一个统一资源定位对象
		URL url = new URL("http://tieba.baidu.com/p/1341665815");
//		打开连接对象
		URLConnection connection = url.openConnection();
//		将字节流变成字符流
		BufferedReader bReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String line = null;
//		匹配手机电话号码的正则表达式
		String telReg = "1\\d{10}";
//		匹配邮箱的正则表达式
		String mailReg = "\\w+@[a-zA-Z0-9]+(\\.[a-zA-Z]+){1,3}";
//		将正则表达式变成Pattern对象
		Pattern pattern = Pattern.compile(mailReg);
//		循环获取页面的符合规则的邮箱
		while((line=bReader.readLine())!=null){
			Matcher matcher = pattern.matcher(line);
			while(matcher.find()){
				System.out.println(matcher.group());
			}
		}
	}
}
