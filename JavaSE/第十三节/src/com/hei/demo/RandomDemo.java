package com.hei.demo;

import java.util.Random;

/**
 * 	Random类专门用来生成随机数；
	该类的构造方法有2种重载方式。
	经常使用new Random创建一个随机数对象，然后调用nextInt(参数)，去规定随机数的范围。
 * RandomDemo类
 * 创建人:黑有有
 * 时间：2016年5月31日-下午5:05:35 
 * @version 1.0.0
 *
 */
public class RandomDemo {
	public static void main(String[] args) {
		Random random = new Random();
////		int nextInt()从随机数生成器返回下一个整型值(有正负)
//		System.out.println(random.nextInt());
		
////		long nextLong()从随机数生成器返回下一个长整型值
//		System.out.println(random.nextLong());
		
////		float nextFloat()从随机数生成器返回0.0到1.0之间的下一个浮点值
//		System.out.println(random.nextFloat());
		
////		double nextDouble()从随机数生成器返回0.0到1.0之间的下一个双精度值
//		System.out.println(random.nextDouble());
		
////		double nextGaussian()从随机数生成器返回下一个高斯分布的双精度值。中间值为0.0，而标准差为1.0
//		System.out.println(random.nextGaussian());

//		产生20个int类型的随机数
//		for (int i = 0; i < 20; i++) {
//			System.out.print(random.nextInt()+" ");
//		}
//		System.out.println();
		
////		产生20个范围在0~10的随机数，注意不包括10（含头不含尾）
//		for (int i = 0; i < 20; i++) {
////			nextInt(bound)产生一个范围在[0,bound)之间的值
//			System.out.print(random.nextInt(10)+" ");
//		}
//		System.out.println();
		
//		String string = "潭州学院是一个非常棒的在线教育机构";
//		int index = 0;
////		随机产生由5个字符组成的字符串
//		for(int i = 0;i<5;i++){
//			index = random.nextInt(string.length());
//			System.out.print(string.charAt(index));
//		}
		
		System.out.println();
		for (int i = 0; i < 5; i++) {
//			Math类中random()产生的是一个0.0~1.0的一个double随机数，但不包括1.0
//			double ran = Math.random();
//			System.out.print(ran);
			System.out.print(RandomDemo.getRandomNum(1,10)+" ");
		}
		
	}
	/**
	 * 
	 * 产生一个指定范围的double随机数
	 * com.hei.demo 
	 * 方法名：getRandomNum
	 * 创建人：黑有有 
	 * 时间：2016年5月31日-下午5:38:38 
	 * @param start
	 * @param end
	 * @return double
	 * @exception 
	 * @since  1.0.0
	 */
	public static double getRandomNum(int start,int end){
		return Math.floor(Math.random()*((end-start+1)+start));
	}
}
