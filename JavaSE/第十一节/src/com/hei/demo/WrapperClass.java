package com.hei.demo;
/**
 * 
 * java.lang包是java内置的一个基础包，其中包含了一系列程序中经常要用到的类；
	在默认情况下，每个java程序都会自动导入该包，因此无需在程序中显式地声明。
 * WrapperClass类
 * 创建人:黑有有
 * 时间：2016年5月26日-下午1:28:52 
 * @version 1.0.0
 *
 */
public class WrapperClass {
	public static void main(String[] args) {
		/*
		 java数据类型：基础数据类型和引用数据类型
		  基础数据类型：byte(1) short(2) int(4) long(8) float(4) double(8) boolean(1) char(2)
		 引用数据类型：Interface/class/Array
		 */
		/*
		  	在某些必须操作对象的场合，原始数据类型就不能使用了；
			Java提供一系列包装类，以便将原始数据类型当作对象进行操作；
			在java.lang包中，对于每个原始数据类型都有一个相应的包装类。
		 	包装类：Byte/Short/Integer/Long/Float/Double/Boolean/Character
		 */
//		可以使用原始类型作为参数，实例化相应的包装类对象。
//		Boolean objBool = new Boolean(true);
//	    Character objChar = new Character('X');
//	    Integer objInt = new Integer(100);
//	    Long objLong = new Long(2568);
//	    Double objDou = new Double(3.1415);
//	          也可以用原始数据类型来接收对应包装类实例化后的对象，这个过程称为拆箱
//	    boolean objBool = new Boolean(true);
//	    char objChar = new Character('X');
//	    int objInt = new Integer(100);
//	    long objLong = new Long(2568);
//	    double objDou = new Double(3.1415);
//	    System.out.println(objBool);//true
//	    System.out.println(objChar);//X
//	    System.out.println(objInt);//100
//	    System.out.println(objLong);//2568
//	    System.out.println(objDou);//3.1415
		
	    /*
	     * 每个包装类都有一个静态的valueOf方法，用于将字符串转换成相应包装类的对象。
	     */
//	    String str = "120";	    
//	    //字符串中出现不是数字的字符，将会引发NumberFormatException异常
////	    String str = "120fds";
//	    String str1 = "true";
//	    char str2 = '字';
////	    除了Character这个valueOf()只能传入原始数据类型的字符作为参数之外,，而其他包装类则可以传入字符串或者对应的原始数据类型作为参数
////		valueOf()返回的是对应的包装类型实例，
//	    Byte objByte = Byte.valueOf(str);
//	    Short objShort = Short.valueOf(str);
//	    Integer objInt = Integer.valueOf(str);
//	    Long objLong = Long.valueOf(str);
//	    Float objFloat = Float.valueOf(str);
//	    Double objDou = Double.valueOf(str);
//	    Boolean objBoo = Boolean.valueOf(str1);
//	    Character objChar = Character.valueOf(str2);
//	    System.out.println(objByte);//120
//	    System.out.println(objShort);//120
//	    System.out.println(objInt);//120
//	    System.out.println(objLong);//120
//	    System.out.println(objFloat);//120.0
//	    System.out.println(objDou);//120.0
//	    System.out.println(objBoo);//true
//	    System.out.println(objChar);//字
		
//	         引用数据类型转成对应的原始数据类型的过程称之为拆箱；而原始数据类型转成引用数据类型的过程称之为装箱
//	         只有原始数据类型转成引用数据类型才可以调用方法
//	    int num = 24;
//	    Integer num1 = num;//装箱过程
//	    System.out.println(num1);//24
		
//	    String str = "127";
////	    除了Character类以外，其它的包装类都有静态的parseXxx方法（Xxx指代具体的数据类型），用于将字符串转换成相对应的原始数据类型值。
//	    //分别调用各个包装类的paseXxx方法对字符串进行转换，如果字符串中含有非数字字符，将报异常:java.lang.NumberFormatException:
////	   paseXxx()这个方法返回的是包装类型对应的原始数据类型，与valueOf()相反
////	    注意了：转换的字符串数字不能大于原始数据类型值对应的范围，否则报错：java.lang.NumberFormatException
////	    如：String str = "129";
//	    byte b = Byte.parseByte(str);//转换的值范围：-2^7~(2^7)-1 ==>-128~127
//	    short s = Short.parseShort(str);//转换的值范围：-2^15~(2^15)-1
//	    int i = Integer.parseInt(str);//转换的值范围：-2^31~(2^31)-1
//	    long l = Long.parseLong(str);//转换的值范围：-2^63~(2^63)-1
//	    float f = Float.parseFloat(str);//转换的值范围：-2^31~(2^31)-1
//	    double d = Double.parseDouble(str);//转换的值范围：-2^63~(2^63)-1
//	    boolean t = Boolean.parseBoolean("true");
//	    System.out.println(i);//116
//	    System.out.println(s);//116
//	    System.out.println(b);//116
//	    System.out.println(l);//116
//	    System.out.println(f);//116.0
//	    System.out.println(d);//116.0
//	    System.out.println(t);//true
	    
//	    char ch = ' ';
//	    char ch = '';这是空字符，不是空格
//	    boolean isLetter(char ch) 判断字符ch是否为英文字母
//	    System.out.println(Character.isLetter(ch));
////	    boolean isDigit(char ch) 判断字符ch是否为0~9之间的数字
//	    System.out.println(Character.isDigit(ch));
////	    boolean isUpperCase(char ch) 判断字符ch是否为大写形式
//	    System.out.println(Character.isUpperCase(ch));
////	    boolean isUpperCase(char ch) 判断字符ch是否为大写形式
//	    System.out.println(Character.isLowerCase(ch));
//	    boolean isWhitespace(char ch)	判断字符ch是否为空格或换行符(\n)或回车符(\r)或制表符(\t)
//	    System.out.println(Character.isWhitespace(ch));
//	    以上方法都是静态方法，可以直接通过类名调用，返回值均为boolean类型，如果是返回true，否则返回false。
		
	}
}
