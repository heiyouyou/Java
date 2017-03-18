package com.hei.dynamic;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
//		利用多态的特点：调用子类重写的方法
		Seller seller = new HouseSeller();
		System.out.println("不使用代理的情况...");
		seller.sell();//销售人员在卖房子...
		System.out.println("使用代理的情况...");
//		System.out.println(new HouseSeller().getClass());
//		
//		seller = (Seller)Proxy.newProxyInstance(new HouseSeller().getClass().getClassLoader(),new Class[]{Seller.class},new Agency());
		seller = (Seller)Proxy.newProxyInstance(seller.getClass().getClassLoader(),new Class[]{Seller.class},new Agency());
		seller.sell();//代理人员卖房子...
	}
}
