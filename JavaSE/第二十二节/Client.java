

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
//	构造函数初始化客户端
	public Client(){
//		声明客户端的实例引用
		Socket socket = null;
//		声明输出字节流的引用
		OutputStream out = null;
//		声明输入字节流的引用
		//InputStream in = null;
		try {
//			Socket(String host,int port) 创建一个流套接字并将其连接到指定主机上的指定端口号。
			//创建了一个套接字并将其链接到指定主机上的指定端口号, 客户端socket
			socket = new Socket("127.0.0.1",9999);
//			OutputStream getOutputStream() throws IOException 获取与Socket相关联的字节输出流，用于向Socket中写数据。
			out = socket.getOutputStream();
//			将字符串以字节数组的形式进行写入
			out.write("大家晚上好，我爱你们！！！！".getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
//				进行非空排除，防止空指针异常，同时进行关闭流操作
				if(out!=null)out.close();
				if(socket!=null)socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args){
		new Client();
	}
}
