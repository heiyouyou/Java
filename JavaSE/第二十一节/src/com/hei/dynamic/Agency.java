package com.hei.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//代理类实现
public class Agency implements InvocationHandler{
	public Object invoke(Object proxy,Method method,Object[] object){
		System.out.println("代理人员卖房子...");
		return null;
	}
}
