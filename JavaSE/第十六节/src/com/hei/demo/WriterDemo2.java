package com.hei.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo2 {
	public static void main(String[] args) {
		try {
			File srcFile = new File("e:/read.txt");
			File targetfile = new File("e:/write.txt");
			FileReader reader = new FileReader(srcFile);
//			FileWriter(File file) throws IOException 使用File对象创建文件写入流对象，如果文件打开失败，将抛出异常，必须捕捉
//			FileWriter writer = new FileWriter(targetfile);
//			FileWriter(File file, boolean append) throws IOException 使用File对象创建文件写入流对象，并由参数append指定是否追加，异常情况同上
			FileWriter writer = new FileWriter(targetfile,true);
//			int len = 0;
//			常规不高效的写入数据
//			char[] ch = new char[100];
//			while((len = reader.read(ch)) != -1){
//				writer.write(ch,0,len);
//			}
//			BufferedReader(Reader in)将字符读取流对象包装成缓冲读取流对象
			BufferedReader bufferedReader = new BufferedReader(reader);
//			BufferedWriter(Writer out)将字符写入流对象包装成缓冲写入流对象
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			String str = null;
//			String readLine()throws IOException	从缓冲读取流中读取一行字符，以字符串的形式返回，读到末尾返回null，有可能抛异常，必须捕捉
			while((str = bufferedReader.readLine()) != null){
//				System.out.println(str);
				
//				void write(String str)throws IOException将一行字符串写入到缓冲写入流中，有可能抛异常，必须捕捉
//				bufferedWriter.write(str);//这样是将源文件中的数据无格式写入指定目标文件中
				
//				bufferedWriter.write(str+"\r\n");//可以这样将读取完一行后进行自动换行写入数据，但是不同系统的有时不兼容支持
				
				bufferedWriter.write(str);
//				void newLine()throws IOException将一个回车换行符写入到文件中，从而达到换行的效果，有可能抛异常，必须捕捉
				bufferedWriter.newLine();
			}
			System.out.println("拷贝文件内容成功...");
//			一定注意：先开启的流最后面再关闭，后面开启的流最先关闭；还有如果流不关闭，就无法写入数据到指定文件中去，除非强制使用flush()刷新写入文件中
//			bufferedWriter.close();
//			bufferedReader.close();
//			writer.close();
//			reader.close();
//			注意：当没有关闭流时，可以使用flush()强制刷新数据写入指定文件中，但是有时不写也可以，只要源文件的大小超过了缓冲写入流8k缓存区，就会自动写入目标文件中
//			而且只有字符缓冲写入流有这个方法
			bufferedWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
