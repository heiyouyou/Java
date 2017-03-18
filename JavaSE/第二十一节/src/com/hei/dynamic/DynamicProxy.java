package com.hei.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{
	private Object target;
	public DynamicProxy(Object t){
		this.target = t;
	}
//	重写接口 InvocationHandler在代理实例上处理的方法invoke()
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("系统日志：调用"+method.getName()+"方法开始！！");
		Object object = method.invoke(target,args);
		System.out.println("系统日志：调用"+method.getName()+"方法结束！！");
		return null;
	}
	
}
