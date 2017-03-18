package com.seven;
/**
 * 
 * 定义 computer  计算机类：a、包含属性：品牌 brand； 型号 type ;  如 INTER i3  INTER i5  AMD六核。。。；产地 madeIn ；价格 price。b、包含方法：public void show(){ }显示所有的属性值。c：定义类时就给属性设置初始值：联想、T400 INTER 双核、中国、7000.00元。d：在测试类中创建对象 并调用show方法显示信息。e：然后修改这个对象每个属性的值：DELL、inter  i5、美国、8000.00元。f：再次调用show方法显示属性的值。
 * Computer类
 * 创建人:黑有有
 * 时间：2016年5月14日-上午11:33:17 
 * @version 1.0.0
 *
 */
public class Computer {
	private String brand = "联想";
	private String type = "T400 INTER 双核";
	private String madeIn = "中国";
	private double price = 7000.00;
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMadeIn() {
		return madeIn;
	}
	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * 
	 * 电脑信息展示的方法
	 * com.seven 
	 * 方法名：showMessage
	 * 创建人：黑有有 
	 * 时间：2016年5月14日-上午11:44:11  void
	 * @exception 
	 * @since  1.0.0
	 */
	public void showMessage(){
		System.out.println("品牌："+brand+"\n型号："+type+"\n产地："+madeIn+"\n价格："+price);
	}
}
