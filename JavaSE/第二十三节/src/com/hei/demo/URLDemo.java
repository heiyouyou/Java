package com.hei.demo;

import java.net.URL;

public class URLDemo {
	public static void main(String[] args) {
		try {
//			注意：类URL的构造方法都声明抛出非运行时异常，必须要对这一异常进行处理，通常是用 try-catch语句进行捕获。
//			public URL (String spec)：通过一个表示URL地址的字符串可以构造一个URL对象
			URL url = new URL("https://www.tanzhouedu.com:8080/index.html?name=Wells&age=22#URLDemo");
			
//			public URL(URL context, String spec)：通过基 URL和相对 URL构造一个 URL对象。
			URL url2 = new URL(url,"http://www.baidu.com");
			
//			public URL(String protocol,String host, String file)根据指定的 protocol名称、host名称和 file名称创建 URL。
			URL url3 = new URL("http","www.tanzhouedu.com","download.html"); 
			
//			public URL(String protocol,String host,int port,String file)根据指定 protocol、host、port 号和 file创建 URL 对象。
			URL url4 = new URL("http","www.tanzhouedu.com",80,"download.html");
			
//			注意：一个URL对象生成后，其属性是不能被改变的，但可以通过它给定的方法来获取这些属性
//			toString()构造此 URL的字符串表示形式。
			System.out.println("URL的字符串:"+url.toString());//https://www.tanzhouedu.com:8080/index.html?name=Wells&age=22#URLDemo
			System.out.println(url2);// http://www.baidu.com
			System.out.println(url3);// http://www.tanzhouedu.comdownload.html
			System.out.println(url4);// http://www.tanzhouedu.com:80download.html
			
//			public String getProtocol()获取该URL的协议名
			System.out.println("通讯协议:"+url.getProtocol());//https
			
//			String getAuthority()获取此URL的授权部分 
			System.out.println("认证:"+url.getAuthority());//www.tanzhouedu.com:8080
			
//			public String getFile()获取该URL的文件名，包括？号后面，#前面的内容
			System.out.println("URL的文件名称:"+url.getFile());///index.html?name=Wells&age=22
			
//			public String getHost()获取该URL的主机名（域名）
			System.out.println("主机:"+url.getHost());//www.tanzhouedu.com
			
//			public String getPort()获取该URL的给定的端口号，如果没有设置端口号，则返回 -1
			System.out.println("端口号:"+url.getPort());//8080
			
//			int getDefaultPort()获取与此 URL关联协议的默认端口号。 如：http协议默认端口是80，https协议默认端口是443
			System.out.println("默认端口号:"+url.getDefaultPort());//443

//			public String getRef()获取该URL在文件中的相对位置（即是#号锚点后面的内容）
			System.out.println("锚点:"+url.getRef());//URLDemo
			
//			public String getQuery()获取该URL的查询名（即？号后面，#前面的内容）
			System.out.println("查询参数:"+url.getQuery());//name=Wells&age=22
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
