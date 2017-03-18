package com.hei.seven;
//导入求绝对值的类或包
import com.seven.AbsoluteValue;
//import com.seven.*;
/**
 * 
 * 对静态成员的理解
 * StaticDemo类
 * 创建人:黑有有
 * 时间：2016年5月15日-下午3:21:46 
 * @version 1.0.0
 *
 */
public class StaticDemo {
//	私有化的非静态成员变量（不同对象有着各自的属性a）
	private int a;
//	私有化的静态成员变量并初始化为2（b在内存中只有一份供所有对象使用，同样类也可以调用）
	private static int b = 2;
//	公共的非静态方法（非静态的方法既可以访问非静态的成员，也可以访问静态的成员）
	public int sum(){
		this.sum1();
		return this.a + b;
	}
//	公共的静态方法
	public static int sum1(){
		System.out.println("你调用了静态的方法");
		return b;//静态的方法sum1只能够访问静态的b
//		return this.b;//静态的方法sum1不能用this关键字，因为静态成员不属于任何对象私有，是公有的
//		return a;//静态的方法sum1不能够访问非静态的a
	}
	/**
	 * 
	 * 返回当前对象达到链式调用的方法
	 * com.hei.seven 
	 * 方法名：sum2
	 * 创建人：黑有有 
	 * 时间：2016年5月15日-下午3:18:09 
	 * @return StaticDemo
	 * @exception 
	 * @since  1.0.0
	 */
	public StaticDemo sum2(){
		this.a++;
		return this;
	}
	public static void main(String[] args){
//		可以通过类访问静态的成员方法
		int aa = StaticDemo.sum1();
		System.out.println(aa);//2
//		创建两个对象
		StaticDemo sta1 = new StaticDemo();
		StaticDemo sta2 = new StaticDemo();
		StaticDemo sta3 = new StaticDemo();
//		修改对象sta1的私有属性a的值
		sta1.a = 1;
//		对象可以访问静态的成员变量并且修改其值
		sta1.b = 3;
//		声明一个变量来接收返回值
		int c = sta1.sum();
		System.out.println(c);//4
		sta2.a = 2;
		int d = sta2.sum();
		System.out.println(d);//5
		System.out.println(StaticDemo.b);//3
//		System.out.println(b);//3，也可以不用类名调用静态成员
//		链式调用方法
		int e = sta3.sum2().sum();
		System.out.println(e);//4
		AbsoluteValue ab = new AbsoluteValue();
		int ee = ab.abs(-9);
		System.out.println(-9+"的绝对值是："+ee);//-9的绝对值是：9
	}
}
