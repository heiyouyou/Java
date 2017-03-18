package com.seven;
/**
 * 
 * 包含求各种数据类型绝对值的一个类
 * AbsoluteValue类
 * 创建人:黑有有
 * 时间：2016年5月15日-下午2:03:03 
 * @version 1.0.0
 *
 */
public class AbsoluteValue {
	/**
	 * 
	 * 以下都属于求绝对值方法的重载
	 * com.hei.seven 
	 * 方法名：abs
	 * 创建人：黑有有 
	 * 时间：2016年5月15日-下午2:06:27 
	 * @param a
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
//	重载方式1，求整数的绝对值
	public int abs(int a){
		return a >= 0 ? a : -a;
	}
//	重载方式2，求浮点数的绝对值
	public float abs(float a){
		return a >= 0 ? a : -a;
	}
//	重载方式3，求双精度的绝对值
	public double abs(double a){
		return a >= 0 ? a : -a;
	}
//	重载方式4，求长整型的绝对值
	public long abs(long a){
		return a >= 0 ? a : -a;
	}
	public static void main(String[] args){
//		创建一个实例化的对象x调用类AbsoluteValue里方法
		AbsoluteValue x = new AbsoluteValue();
//		调用形参为double的方法abs
		System.out.println(x.abs(-20.2));//20.2
//		调用形参类型为int的方法abs
		System.out.println(x.abs(-20));//20
//		调用形参类型为float的方法abs
		System.out.println(x.abs(-20.2f));//20.2
//		调用形参类型为long的方法abs
		System.out.println(x.abs(-20L));//20
	}
}
