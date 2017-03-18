package com.hei.demo;
/**
 * 
 * 	Math类中提供了一系列基本数学运算和几何运算的方法；
	该类的构造方法被修饰为private，因此不能实例化；
	该类中的所有方法都是静态的，可以通过类名直接调用；
	该类被修饰为final，因此没有子类。

 * MathDemo类
 * 创建人:黑有有
 * 时间：2016年5月27日-下午7:51:32 
 * @version 1.0.0
 *
 */
public class MathDemo {
	public static void main(String[] args){
		//Math类当中所有的方法都是静态方法
//		static int abs(int a)求a的绝对值，有4种重载，还有float，double和long
//		System.out.println(Math.abs(22));//22
//		System.out.println(Math.abs(-22f));//12.0
//		System.out.println(Math.abs(-22d));//22.0
//		System.out.println(Math.abs(-22L));//22
		
//		static double pow(double a,double b)求a的b次方幂
//		System.out.println(Math.pow(2,4));//16.0
		
//		static double sqrt(double a)求a的平方根
//		System.out.println(Math.sqrt(16));//4.0
		
//		static int round(float a)求a的四舍五入取整结果
//		System.out.println(Math.round(4.56));//5
//		static double ceil(double a)返回不小于a的最小整数值（向上取整）
//		System.out.println(Math.ceil(4.26));//5
//		static double ceil(double a)返回不小于a的最小整数值（向下取整）
//		System.out.println(Math.floor(5.67));//5
		
//		static double sin(double a)返回a的正弦值
//		System.out.println(Math.sin(90));
//		static double cos(double a)返回a的余弦值
//		System.out.println(Math.cos(45));
		
//		Math类中还包括两个常用的常量：
//		E：自然常量
		System.out.println(Math.E);//2.718281828459045
//		PI：圆周率π
		System.out.println(Math.PI);//3.141592653589793
	}
}
