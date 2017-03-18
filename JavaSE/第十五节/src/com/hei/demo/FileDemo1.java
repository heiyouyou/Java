package com.hei.demo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ListModel;

public class FileDemo1 {
	public static void main(String[] args) {
//		File file = new File("d:/file1/txt");
////		boolean exists()判断文件或文件夹是否真实存在，存在返回true，否则返回false
//		if(file.exists()){
//			System.out.println("文件存在");
//		}else{
//			System.out.println("文件不存在");
//		}
		
//		try{
//			File file = new File("e:/file1/1.txt");
//			if(!file.exists()){
////				boolean createNewFile() throws IOException：创建新文件，创建成功返回true，否则返回false，有可能抛出IOException异常，必须捕捉
//				file.createNewFile();//只能用来创建文件不能用来创建文件夹
//			}else{
//				System.out.println("文件存在");
//			}			
//		}catch(IOException e){
//			e.printStackTrace();
//		}
		
//		File file = new File("e:/hei/1.txt");
//		File file = new File("e:/hei/2/3");
////		不存在时，进行创建文件夹或者文件
//		if(!file.exists()){
////			file.mkdir();//mkdir()只能用来创建单个文件夹，即使填的是文件路径也是创建出单个文件夹来
//			file.mkdirs();//mkdirs()只能用来创建多个文件夹，即使填的是文件路径也是创建出多个文件夹来
//		}else{
//			System.out.println("文件夹存在");
//		}
////		boolean delete()删除路径最深的文件或者文件夹，删除成功返回true，否则返回false
//		file.delete();
		
		File file = new File("e:/File");
//		String list()返回的是一个当前文件对象下所有子文件和子文件夹的名称字符串数组
//		String[] list = file.list();
//		for(String l : list){
//			System.out.println(l);//打印的是每个文件和文件夹的名称
//		}
//		File[] listFiles()返回文件夹内的子文件与子文件夹的File数组
//		for(File l : file.listFiles()){
//			System.out.println(l.getAbsolutePath());
////			System.out.println(l);//打印的是每个文件和文件夹的绝对路径
//		}
		List<File> files = getFiles(file);
		for(File f : files){
			System.out.println(f.getName());
		}
		
	}
//	注意了：创建装文件的集合不要放在遍历获取文件的方法里，因为每次调用该方法都会将重新创建一个新的同名集合，这样就会将前面的同名集合给覆盖掉了
	private static ArrayList<File> listFiles = new ArrayList<File>();
//	循环遍历获取指定文件夹下所有的文件
	public static List<File> getFiles(File directory){
		File[] files = directory.listFiles();
		for(File file2 : files){
//			如果遍历出来的是文件，则将次文件放入集合中
			if(file2.isFile()){
				listFiles.add(file2);
			}
//			如果遍历出来的是文件夹，则继续调用获取文件的方法进行递归获取文件
			if(file2.isDirectory()){
				getFiles(file2);
			}
		}
//		返回一个已经获取了指定路径下的所有字文件集合
		return listFiles;
	}
}
