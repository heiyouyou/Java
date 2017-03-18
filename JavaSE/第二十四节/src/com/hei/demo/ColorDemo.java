package com.hei.demo;

public class ColorDemo {
//	声明三个不可改变的类的实例
	public static final ColorDemo RED = new ColorDemo("红色");
	public static final ColorDemo GREEN = new ColorDemo("绿色");
	public static final ColorDemo BLUE = new ColorDemo("蓝色");
//	私有化一个变量
	private String name;
//	覆盖原有的空构造函数，并且进行初始化
	private ColorDemo(String name){
		this.name = name;
	}
//	覆盖set、get方法
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
//	创建一个获取私有实例的方法，根据传入的参数整数，返回对应的颜色实例
	public static ColorDemo getInstance(int type){
		switch(type){
			case 1:
				return ColorDemo.RED;
			case 2:
				return ColorDemo.GREEN;
			case 3:
				return ColorDemo.BLUE;
			default:
				return null;
		}
		
	}
	public static void main(String[] args){
		System.out.println(ColorDemo.getInstance(1).getName());//红色
//		获取枚举类中的对象
		System.out.println(ColorEnum.RED);//RED
//		可以知道枚举类重写了toString()方法
		System.out.println(ColorEnum.RED.toString());//RED
		System.out.println(ColorEnum.values());
		
//		values()获取一个枚举类中的所有对象，返回值是一个枚举类数组
		for(ColorEnum colorEnum:ColorEnum.values()){
//			 int ordinal()返回枚举常量的序数（它在枚举声明中的位置，其中初始常量序数为零）。 
			System.out.println(colorEnum+"=="+colorEnum.ordinal());//RED==0、GREEN==1、BLUE==2
		}
//		valueOf(String name)获取指定名称的枚举类实例
		System.out.println(ColorEnum.valueOf("RED"));//RED
//		System.out.println(ColorEnum.valueOf("rED"));//如果找不到，则报异常： java.lang.IllegalArgumentException

//		static valueOf(Class<T> enumType, String name)返回带指定名称的指定枚举类型的枚举常量。 
		System.out.println(ColorEnum.valueOf(ColorEnum.class,"GREEN"));//GREEN
		
//		int compareTo(E o)比较此枚举与指定对象的顺序大小
		System.out.println(ColorEnum.GREEN.compareTo(ColorEnum.RED));//1
		System.out.println(ColorEnum.RED.compareTo(ColorEnum.BLUE));//-2
		System.out.println(ColorEnum.RED.compareTo(ColorEnum.RED));//0
		
//		String name()返回此枚举常量的名称，在其枚举声明中对其进行声明。 
		System.out.println(ColorEnum.BLUE.name());//BLUE
		
//		int hashCode()返回枚举常量的哈希码。 
		System.out.println(ColorEnum.BLUE.hashCode());//1829164700
		
//		Class<E> getDeclaringClass()返回与此枚举常量的枚举类型相对应的 Class对象。 
		System.out.println(ColorEnum.BLUE.getDeclaringClass());//class com.hei.demo.ColorEnum

//		protected  Object clone()抛出 CloneNotSupportedException。 
//		ColorEnum.BLUE.clone();//枚举类不支持克隆方法clone()，因为枚举类中的实例是不可以改变的
	}
}
