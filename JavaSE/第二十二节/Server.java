
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * 
 * Server �����
 * ������:������
 * ʱ�䣺2016��6��21��-����1:46:15 
 * @version 1.0.0
 *
 */
public class Server {
//	ͨ�����캯����ʼ�������
	public Server(){
//		��������˵�ʵ��
		ServerSocket serverSocket = null;
//		�����ͻ��˵�ʵ��
		Socket socket = null;
//		����������ʵ��
		//InputStream inputStream = null;
//		���������ʵ��
		//OutputStream outputStream = null;
		try {
//			ServerSocket(int port) �����󶨵��ض��˿ڵķ������׽���
			serverSocket = new ServerSocket(9999);
//			Socket accept() throws IOException �ȴ��ͻ��˵��������󣬷�����ÿͻ��˽���ͨ���õ�Socket����
			socket = serverSocket.accept();
			System.out.println("������յ�������...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
//				void close()throws IOException �رռ����ͻ���Socket
//				���зǿ��ų�����ֹ��ָ���쳣��ͬʱ���йر�������
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
