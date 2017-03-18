package com.hei.seven;

public class OverloadingMethod {
	public void md(int a){
		System.out.println(a);
	}
//	注意了：方法的重载与返回值类型无关，只与方法名相同和参数的不同有关
	/*public int md(int a){
		System.out.println(a);
		return a;
	}*/
	public float md(float a){
		System.out.println(a);
		return a;
	}
	public static void main(String[] args){
		
	}
}
