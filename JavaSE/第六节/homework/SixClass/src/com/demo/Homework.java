package com.demo;
/**
 * 
 * 
 * Homework类
 * 创建人:黑有有
 * 时间：2016年5月13日-下午6:38:56 
 * @version 1.0.0
 *
 */
public class Homework {
	public static void main(String[] args){
		//创建一个Calculator类的实例（对象）
		Calculator calculator = new Calculator();
		calculator.setA(10);
		System.out.println("a的值："+calculator.getA());
		calculator.setB(3);
		System.out.println("b的值："+calculator.getB());
		calculator.sum();
		calculator.minus();
		calculator.mul();
		calculator.division();
	}
}
