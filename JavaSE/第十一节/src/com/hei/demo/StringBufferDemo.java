package com.hei.demo;
/**
 * 
 * 	String在操作的时候会产生新的字符串对象，导致大量的内存耗用
	构造一个其中不带字符的字符串缓冲区(16个空值的字符串缓存区)，初始容量为 16 个字符。
	特点：
	1：可以对字符串内容进行修改。
	2：是一个容器。
	3：是可变长度的。
	4：缓冲区中可以存储任意类型的数据。
	5：最终会通过toString方法变成字符串。
	
	在Java中一旦创建了字符串就不能直接更改，这就是字符串的不变性；
	而StringBuffer类正是针对此问题而提供的字符可变序列；
	StringBuffer与String是同等的类，唯一区别是可以进行更改。
	StringBuffer产生的对象字符一旦没有引用指向，就会被堆里的GC回收，而String就算没有引用指向也不会被GC回收的
 * StringBufferDemo类
 * 创建人:黑有有
 * 时间：2016年5月26日-下午6:27:44 
 * @version 1.0.0
 *
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer stringBuffer1 = new StringBuffer();
//		可以传入一个字符串进行初始化
		StringBuffer stringBuffer2 = new StringBuffer("hello");
//		虽然StringBuffer类的缓存区初始容量为16 个字符，但是那只是一个空值的16个坑，只有赋值了才有长度可言
//		int length()获得当前StringBuffer对象的长度
		System.out.println(stringBuffer1.length());//0
		System.out.println(stringBuffer2.length());//5
//		StingBuffer类可以通过append()来初始化字符串
		stringBuffer1.append("abcde");
		System.out.println(stringBuffer1);//abcde
//		StringBuffer insert(int index, x x)可以将数据插入到指定index位置之前，x可以为任何类型的数据
		stringBuffer1.insert(2,"有有");
		System.out.println(stringBuffer1);//ab有有cde
//		void setCharAt(int index, char ch)使用 ch 指定的新值替换 index指定的位置上的字符
		stringBuffer1.setCharAt(1,'黑');
		System.out.println(stringBuffer1);//a黑有有cde
//		StringBuffer delete(int start, int end)删除缓冲区中的数据，包含start，不包含end。
//		注意：start和end不能为负数，右边end必须大于左边start，而且右边end可以无限大
		stringBuffer1.delete(4,6);
		System.out.println(stringBuffer1);//a黑有有e
//		StringBuffer deleteCharAt(int index)将删除 index指定的索引处的字符，只删除一个字符
		stringBuffer1.deleteCharAt(4);
		System.out.println(stringBuffer1);//a黑有有
//		StringBuffer reverse()将当前StringBuffer对象中的字符序列倒置
		stringBuffer1.reverse();
		System.out.println(stringBuffer1);//有有黑a
//		StringBuffer replace(int start, int end, String str)
//		此方法使用一组字符替换另一组字符。将用替换字符串从 start指定的位置开始替换，直到 end指定的位置结束（含头不含尾）
		stringBuffer1.replace(0,4,"youyouhei");
		System.out.println(stringBuffer1);//youyouhei
//		String toString()转换为字符串形式
//		支持链式调用，因为每个方法都是返回一个stringBuffer类的当前实例
		stringBuffer2.append("world").append("123").append(new StringBufferDemo());
//		默认调用toString()的方法将其变成字符串
		System.out.println(stringBuffer2);//打印：helloworld123com.hei.demo.StringBufferDemo@2a139a55
//		System.out.println(stringBuffer2.toString());//打印：helloworld123com.hei.demo.StringBufferDemo@2a139a55
	}
}
