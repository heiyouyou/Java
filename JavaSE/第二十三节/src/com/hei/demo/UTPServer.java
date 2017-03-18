package com.hei.demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UTPServer {
	public static void main(String[] args) {
		DatagramSocket socket = null;
		try {
//			创建一个数据报对象接收客户端发送来的数据，并且指定监听客户端的端口
			socket = new DatagramSocket(9999);//DatagramSocket(int port)创建数据报套接字并将其绑定到本地主机上的指定端口。
			byte[] bt = new byte[1024];
//			DatagramPacket(byte[] buf, int length)构造 DatagramPacket，用来接收长度为length的数据包。
			DatagramPacket packet = new DatagramPacket(bt,bt.length);
			
//			接收客户端发送来的数据报文，相当于accept()方法一样需要等待客户端将数据完整的发送过来，才会执行下面的代码
			socket.receive(packet);//void receive(DatagramPacket p)从此套接字接收数据报包。 
//			byte[] getData()返回数据缓冲区。 用来获取数据报包中的数据信息， int getLength()返回将要发送或接收到的数据的长度。 
			String string = new String(packet.getData(),0,packet.getLength(),"utf-8");
			
//			InetAddress getAddress()返回某台机器的IP地址，此数据报将要发往该机器或者是从该机器接收到的。 
			System.out.println("服务端接收来自"+packet.getAddress()+"客户端的信息为："+string);
//			int getPort()返回某台远程主机的端口号，此数据报将要发往该主机或者是从该主机接收到的。 
			System.out.println("服务端接收来自"+packet.getPort()+"客户端的信息为："+string);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(socket!=null)socket.close();
		}
	}
}
