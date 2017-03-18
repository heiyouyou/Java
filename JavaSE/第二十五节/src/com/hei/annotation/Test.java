package com.hei.annotation;
//使用 Annotation时要在其前面增加 @符号，并把该 Annotation当成一个修饰符使用。用于修饰它支持的程序元素
@Deprecated
public class Test {
	@Deprecated//用于表示某个程序元素(类、方法、变量等)已过时
	public static int i;
	@Override//限定重写父类方法, 该注解只能用于方法
	public String toString(){
		return "黑有有";
	}
	@Deprecated
	public void show(){
		System.out.println("helloworld");
	}
	@SuppressWarnings(value={"1","2"})//抑制编译器警告
	private String a = "1";
//	使用自定义注解类型
	@MyAnnotation(show = "黑有有")//注意：使用自定义注解，要为其进行赋值，前提是自定义注解的时候没有进行默认赋值，如果已经默认赋值，则可以使用的时候不赋值
	public static void main(){
		
	}
}
