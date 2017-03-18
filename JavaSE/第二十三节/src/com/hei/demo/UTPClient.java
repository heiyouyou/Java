package com.hei.demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UTPClient {
	public static void main(String[] args) {
//		声明一个数据报对象引用
		DatagramSocket socket = null;
		try{
//			创建一个DatagramSocket对象
			socket = new DatagramSocket();//DatagramSocket()构造数据报套接字并将其绑定到本地主机上任何可用的端口。			
//			将字符串变成字节数组
			byte[] bt = "大家晚上好！！！我是潭州学院的学员~~".getBytes();
//			创建一个数据报包对象，通过DatagramPacket(byte[] buf, int length, InetAddress address, int port)构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。
			DatagramPacket packet = new DatagramPacket(bt,bt.length,InetAddress.getByName("127.0.0.1"),9999);
//			发送数据给服务端
			socket.send(packet);//void send(DatagramPacket p)从此套接字发送数据报包。 
		}catch(Exception e){
			e.printStackTrace();
		}finally{
//			 void close()关闭此数据报套接字。 与TCP/IP协议通信不同的是：无异常抛出
			if(socket!=null)socket.close();
		}
	}
}
