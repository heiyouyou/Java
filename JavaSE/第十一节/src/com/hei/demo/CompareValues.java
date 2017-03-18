package com.hei.demo;

public class CompareValues {
	public static void main(String[] args) {
//		1.基础类型直接比较用==比较的是值，一个基础一个引用==比较的也是值
//		2.引用类型不同的不能用==比较，编译报错,可以用equals进行比较(先比较数据类型，然后比较值)
//		3.两个Byte/Short/Integer/Long类型的比较注意数据缓存。-128-127之间的比较相等
//		int a = 23; 
//		int b = 23;
//		short c = 23; 
//		float d = 23.0f; 
//		float e = 23f;
//		System.out.println(a == b);//true
//		System.out.println(a == c);//true
//		System.out.println(a == d);//true
//		System.out.println(a == e);//true
//		Integer aa = 23;
//		Integer bb = 23;
//		Short a1 = -129; 
//		Short b1 = -129; 
//		Float cc = 23f;
//		Float dd = 23f;
//		System.out.println(a == aa);//true
//		System.out.println(a == cc);//true
		
//		不同引用类型的值是不能用 == 比较的，编译阶段报错
//		System.out.println(aa == cc);
//		equals(obj)是用来比较类型和值的，只有两个条件都满足了，结果才会返回true，否则返回false
//		System.out.println(aa.equals(cc));//false
//		System.out.println(dd.equals(bb));//false
//		System.out.println(dd.equals(cc));//true
//		System.out.println(aa.equals(bb));//true
//		System.out.println(a1.equals(b1));//true
//		a属于原始数据类型，经装箱过程变成了与aa相同的数据类型
//		System.out.println(aa.equals(a));//true
//		两个相同引用类型的比较，可以用==号，对于Byte/Short/Integer/Long类型的比较注意数据缓存，他们的数据缓存都是-128~127
//		只要比较的值在这范围之间，都是从一个地方取出来比较的，是相等的，如果超出这个范围的值，它内部是返回了一个对象的，对象地址不同，则结果就是false
//		引用数据类型用两个等号==是用来比较值和类型还有地址的
//		System.out.println(aa == bb);//true
//		System.out.println(a1 == b1);//false
		
//		字符串常量池（存在堆中）：没有相同的字符串出现，而且不能被GC(垃圾回收机制)回收，所以一旦定义就不可改变了
//		String str1 = "潭州学院";
//		String str2 = "潭州学院";
//		通过new关键字创建了一个在堆中的对象，从而从字符串常量池copy了一份"潭州学院"作为自己的属性
//		String str3 = new String("潭州学院");
//		字符的拼接，最后还是存在字符串常量池中
//		String str4 = "潭州"+"学"+"院";
//		String str5 = "潭州";
//		String str6 = "学院";
//		两个字符地址的拼接（拼接出了一个对象地址），虽然值还是“潭州学院”，但是不是指向了字符串常量池中了~而是指向了一个新地址（对象）
//		String str7 = str5 + str6;
//		System.out.println(str1 == str2);//true
//		System.out.println(str1 == str3);//false
//		System.out.println(str1 == str4);//true
//		System.out.println(str1 == str7);//false
//		字符串中equals既可以比较对象地址也可以比较类型和值，所以只要满足了其中一个条件都是返回true
//		字符串比较值只要用到了equals()，只要值相等，他们就是相等的（返回true）
//		System.out.println(str1.equals(str2));//true
//		System.out.println(str1.equals(str3));//true
//		System.out.println(str1.equals(str4));//true
//		System.out.println(str1.equals(str7));//true
		
//		String str1 = "黑有有";
//		一开始str2指向了字符串常量池的"黑有有"
//		String str2 = str1;
//		一开始比较的值和地址都是相等的，所以返回了true
//		System.out.println(str1 == str2);//true
//		后来str1重新调整了指向，指向了字符串常量池中的"youyouhei"
//		str1 = "youyouhei";
//		当两个字符串比较时，值和地址已经不想等了，所以返回false
//		System.out.println(str1 == str2);//false
		
	}
}
