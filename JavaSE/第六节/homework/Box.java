package com.demo;

public class Box {
	//私有化盒子高度
	private int height;
	//私有化盒子宽度
	private int width;
	//私有化盒子长度
	private int length;
	//私有化盒子体积
	private int volume;
	/**
	 * 
	 * 盒子对象的构造函数（构造方法没有返回值类型，也不能有返回值）
	 * @param height
	 * @param width
	 * @param length
	 */
	public Box(int height,int width,int length,int volume){
		this.height = height;
		this.width = width;
		this.length = length;
		this.volume = volume;
	}
	/**
	 * 
	 * 计算盒子体积的方法
	 * com.demo 
	 * 方法名：calcVolume
	 * 创建人：黑有有 
	 * 时间：2016年5月13日-下午6:58:34 
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
	public int calcVolume(){
//		return this.volume = this.height*this.width*this.length;
		return volume = height*width*length;
	}
	/**
	 * 
	 * 盒子体积的输出方法
	 * com.demo 
	 * 方法名：print
	 * 创建人：黑有有 
	 * 时间：2016年5月13日-下午6:58:55  void
	 * @exception 
	 * @since  1.0.0
	 */
	public void print(){
		System.out.println("该盒子的体积是："+calcVolume());
	}
}
