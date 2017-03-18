package com.hei.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws Exception{
//		static InetAddress getByName(String host) 在给定主机名的情况下确定主机的 IP地址。 
		InetAddress address = InetAddress.getByName("www.tanzhouedu.com");
		InetAddress address2 = InetAddress.getByName("www.google.com");		
		System.out.println(address);//www.tanzhouedu.com/124.160.136.232
	
		//InetAddress重写了Object的toString()，将此 IP地址转换为 String。 
		System.out.println(address2.toString());//www.google.com/216.58.197.100
		
		byte[] bt = new byte[]{124,(byte)160,(byte)136,(byte)232};
//		static InetAddress getByAddress(byte[] addr) 在给定byte数组的原 IP地址的情况下，返回 InetAddress 对象。 
		InetAddress address3 = InetAddress.getByAddress(bt);
		System.out.println(address3);// /124.160.136.232
		
//		static InetAddress getByAddress(String host,byte[] addr) 根据提供的主机名和 IP地址创建 InetAddress。 
		InetAddress address4 = InetAddress.getByAddress("www.tanzhouedu.com",bt);
		System.out.println(address4);//www.tanzhouedu.com/124.160.136.232
	
//		static InetAddress getLocalHost() 返回本地主机。 
		InetAddress inetAddress = InetAddress.getLocalHost();
		System.out.println(inetAddress);//DELL-Free-Wells/192.168.0.104
//		 String getHostName() 获取此IP地址的主机名。 
		System.out.println(inetAddress.getHostName());//DELL-Free-Wells
//		String getHostAddress()返回 IP地址字符串（以文本表现形式）。 
		System.out.println(inetAddress.getHostAddress());//192.168.0.104

//		boolean isReachable(int timeout) 测试是否可以达到该地址。
		boolean t = inetAddress.isReachable(100); 
		System.out.println(t);//false
		
	}
}
