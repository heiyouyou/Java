package com.hei.demo;

//创建一个枚举类，默认继承了java.lang.Enum这个公共枚举类
public enum ColorEnum {
//	注意了：枚举类的实例一定要放在第一行，并且多个实例用逗号隔开，并且用分号；做结束符，当然如果后面有代码，则必须要用分号；做结束符
	RED,GREEN,BLUE;
//	以上代码相当于如下：
//	public static final ColorEnum RED = new ColorEnum();
//	public static final ColorEnum GREEN = new ColorEnum();
//	public static final ColorEnum BLUE = new ColorEnum();
	private Integer temp;
}
