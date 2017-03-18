
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
		//InputStream inputStream = null;
//		声明输出流实例
		//OutputStream outputStream = null;
		try {
//			ServerSocket(int port) 创建绑定到特定端口的服务器套接字
			serverSocket = new ServerSocket(9999);
//			Socket accept() throws IOException 等待客户端的连接请求，返回与该客户端进行通信用的Socket对象
			socket = serverSocket.accept();
			System.out.println("服务端收到请求了...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
//				void close()throws IOException 关闭监听客户端Socket
//				进行非空排除，防止空指针异常，同时进行关闭流操作
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
