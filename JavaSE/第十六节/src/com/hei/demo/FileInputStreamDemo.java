package com.hei.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;


public class FileInputStreamDemo {
	public static void main(String[] args) {
//		创建一个文件对象
		File file = new File("E:/潭州学院/java中级班作业和练习/Jery老师JavaSe班/jery老师javase班练习/第十六节/src/com/hei/text/input.txt");
//		注意：定义一个全局的in变量，在一个{代码块....}里的变量是属于局部变量！！！
		FileInputStream  in = null;
		try {
//			FileInputStream(File file) throws FileNotFoundException	使用File对象创建文件输入流对象，如果文件打开失败，将抛出异常
//			创建文件输入流对象
			in = new FileInputStream(file);
//			int read() throws IOException 读取文件中的数据，一次读取一个字节，读取的数据作为返回值返回，如果读到文件末尾则返回-1，有可能抛异常，必须捕捉
//			int len = in.read();
//			System.out.println(len);//97
//			将返回的int值强转成字符输出
//			System.out.println((char)len);//a
			int len = 0;
//			通过read()读取到文件末尾时返回-1作为循环的条件
//			while((len = in.read()) != -1){
////				打印的是ASCII码值
//				System.out.print(len);
////				将返回的int值强转成字符输出，注意如果文件中有中文字符（占两个字节），由于字节流只能一个一个读取，读取中文会出现乱码
//				System.out.print((char)len);
//			}
			
//			创建一个byte数组
//			注意了：当读取的文件字节数超出该数组的长度时，则内部会自动创建一个相同长度的新数组来装完文件中的字节数据
//			byte[] ba = new byte[7];
////			int read(byte[] b) throws IOException 读取文件中的数据，将读到的数据存放到byte型数组中，并返回读取的字节的数量，未读到数据返回-1，有可能抛异常，必须捕捉
//			while((len = in.read(ba)) != -1){
////				打印的是每次读取的字节数
//				System.out.println(len);
////				打印的是数组地址
//				System.out.println(ba);
////				注意：如果读取到最后一个数组的时候，字节数不够填满数组，则会从已经读取完的字节之前取够数组长度的字节数
////				如：按7个字节读取数据heiyouyouhei，第一次输出len=7，转换成字符串值为heiyouy；第二次输出5，转换成字符串值为ouheiuy
////				new String(byte b)将字节数组以字符串的形式输出
//				System.out.println(new String(ba));
//			}
			
//			定义了一个一次可读取的最大字节数数组
			byte[] ba = new byte[1024]; 
//			通过文件对象的length()方法获取文件的字节数（long类型）
			long total = file.length();
//			定义一个浮点型用来计算每次读取文件字节数的进度
			float num = 0f;
			int i = 0;
			while((len = in.read(ba)) != -1){
				i++;
//				每次读取的字节数叠加
				num += len;
				System.out.println("第"+i+"次读取的字节数："+len);
//				System.out.println("第"+i+"次进度条："+(num/total));
//				new DecimalFormat(String pattern)传入一定的格式，调用format(double d)将d数字四舍五入转换成字符串形式输出
				System.out.println("第"+i+"次进度条："+(new DecimalFormat("#.##").format(num/total)));
				System.out.println("第"+i+"次读取的内容："+new String(ba));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
//			判断输入流是否为null，防止空指针异常
			if(in != null){
				try {
//					void close() throws IOException	关闭流对象，有可能抛异常，必须捕捉
					in.close();//一般放在finally代码块中进行关闭流对象
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
			}
		}
	}
}
