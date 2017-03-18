package com.demo;
/**
 * 
 * 
 * Calculator类
 * 创建人:黑有有
 * 时间：2016年5月13日-下午6:29:58 
 * @version 1.0.0
 *
 */
public class Calculator {
	//私有化成员变量a
	private int a;
	//私有成员变量b
	private int b;
	//实现私有变量a的设置值
	public void setA(int a){
//		这里的this用于指代当前调用该方法的对象，不能去掉，去掉和与形参a冲突，此时a就为0；
		this.a = a;
	}
	//获取私有变量a的值
	public int getA(){
//		return this.a;
		return a;
	}
	public int getB() {
//		return this.b;
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	/**
	 * 
	 * 两个数的加法
	 * com.demo 
	 * 方法名：sum
	 * 创建人：黑有有 
	 * 时间：2016年5月13日-下午6:26:08  void
	 * @exception 
	 * @since  1.0.0
	 */
	public void sum(){
		System.out.println("a和b的和："+(a+b));
	}
	/**
	 * 
	 * 两个数的减法
	 * com.demo 
	 * 方法名：minus
	 * 创建人：黑有有 
	 * 时间：2016年5月13日-下午6:26:32  void
	 * @exception 
	 * @since  1.0.0
	 */
	public void minus(){
		System.out.println("a和b的差："+(a-b));
	}
	/**
	 * 
	 * 两个数的乘法
	 * com.demo 
	 * 方法名：mul
	 * 创建人：黑有有 
	 * 时间：2016年5月13日-下午6:27:20  void
	 * @exception 
	 * @since  1.0.0
	 */
	public void mul(){
		System.out.println("a和b的积："+(a*b));
	}
	/**
	 * 
	 * 两个数的除法
	 * com.demo 
	 * 方法名：division
	 * 创建人：黑有有 
	 * 时间：2016年5月13日-下午6:29:22  void
	 * @exception 
	 * @since  1.0.0
	 */
	public void division(){
		System.out.println("a和b的商："+(a/b));
	}
	
}
