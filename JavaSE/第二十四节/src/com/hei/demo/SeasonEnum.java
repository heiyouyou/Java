package com.hei.demo;

public enum SeasonEnum {
//	注意：原有的空构造函数已经被覆盖，所以要进行传参调用指定的构造函数
	SPRING("春天","春天很美"),
	SUMMER("夏天","夏天很热"),
	AUTUMN("秋天","夏天很爽"),
	WINTER("冬天","冬天很冷");
	private String name;
	private String des;
//	覆盖空的构造函数，并且枚举类中的构造函数默认只能是被private所修饰的
	private SeasonEnum(String name,String des){
		this.name = name;
		this.des = des;
	}
//	或者：
//	SeasonEnum(String name,String des){
//		this.name = name;
//		this.des = des;
//	}
	public String getName(){
		return this.name;
	}
	public String getDes(){
		return this.des;
	}
	public static void main(String[] args){
		System.out.println(SeasonEnum.SUMMER.getName()+"=="+SeasonEnum.SUMMER.getDes());//夏天==夏天很热
	}
}
