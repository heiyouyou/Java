

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
//	���캯����ʼ���ͻ���
	public Client(){
//		�����ͻ��˵�ʵ������
		Socket socket = null;
//		��������ֽ���������
		OutputStream out = null;
//		���������ֽ���������
		//InputStream in = null;
		try {
//			Socket(String host,int port) ����һ�����׽��ֲ��������ӵ�ָ�������ϵ�ָ���˿ںš�
			//������һ���׽��ֲ��������ӵ�ָ�������ϵ�ָ���˿ں�, �ͻ���socket
			socket = new Socket("127.0.0.1",9999);
//			OutputStream getOutputStream() throws IOException ��ȡ��Socket��������ֽ��������������Socket��д���ݡ�
			out = socket.getOutputStream();
//			���ַ������ֽ��������ʽ����д��
			out.write("������Ϻã��Ұ����ǣ�������".getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
//				���зǿ��ų�����ֹ��ָ���쳣��ͬʱ���йر�������
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
