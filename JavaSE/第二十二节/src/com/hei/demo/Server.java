package com.hei.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * 
 * Server 服务端
 * 创建人:黑有有
 * 时间：2016年6月21日-下午1:46:15 
 * @version 1.0.0
 *
 */
public class Server {
//	通过构造函数初始化服务端
	public Server(){
//		声明服务端的实例
		ServerSocket serverSocket = null;
//		声明客户端的实例
		Socket socket = null;
//		声明输入流实例
		InputStream inputStream = null;
//		声明输出流实例
		OutputStream outputStream = null;
		try {
//			ServerSocket(int port) 创建绑定到特定端口的服务器套接字，用相同的端口来监听客户端
			serverSocket = new ServerSocket(9999);
			//serverSocket.setSoTimeout(5000);
//			Socket accept() throws IOException 等待客户端的连接请求（只有收到请求才会继续往下执行），返回与该客户端进行通信用的Socket对象
			socket = serverSocket.accept();
			System.out.println("服务端收到客户端请求了...");
//			InputStream getInputStream() throws IOException 获取与Socket相关联的字节输入流，用于从Socket中读数据。
//			通过客户端获取字节读取流对象
			inputStream = socket.getInputStream();
			int len = 0;
			byte[] bt = new byte[1024];
			StringBuffer stringBuffer = new StringBuffer();
//			循环读取客户端发送来的信息
			while((len = inputStream.read(bt))!=-1){
				stringBuffer.append(new String(bt,0,len));
			}
//			InetAddress getInetAddress()返回套接字连接的地址对象。 
//			打印客户端发来的信息
			System.out.println("收到了来自"+socket.getInetAddress().getHostAddress()+"的消息，消息的内容为："+stringBuffer);

//			OutputStream getOutputStream() throws IOException 获取与Socket相关联的字节输出流，用于向Socket中写数据。
			outputStream = socket.getOutputStream();
			outputStream.write("哈哈，我不辛苦。。。。".getBytes());
//			void shutdownOutput() 禁用此套接字的输出流。 
			socket.shutdownOutput();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
//				void close()throws IOException 关闭监听客户端Socket
//				进行非空排除，防止空指针异常，同时进行关闭流操作
				if(outputStream!=null)outputStream.close();
				if(inputStream!=null)inputStream.close();
				if(socket!=null)socket.close();
				if(serverSocket!=null)serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args){
		new Server();
	}
}
