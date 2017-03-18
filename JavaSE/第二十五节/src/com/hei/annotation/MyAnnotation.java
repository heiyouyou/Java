package com.hei.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
//使用元注解进行修饰注解的生命周期
//@Retention(value = RetentionPolicy.RUNTIME)//编译器将把注释记录在class文件中.当运行Java程序时,JVM会保留注解.程序可以通过反射获取该注解
@Retention(RetentionPolicy.RUNTIME)//RetentionPolicy是一个枚举类，而且可以省略不写变量名value
//自定义注解类
public @interface MyAnnotation {
//	成员变量的初始值可使用 default关键字
	String show() default "你好啊！！！";
}

@Retention(value = RetentionPolicy.CLASS)//编译器将把注解记录在 class文件中.当运行 Java程序时,JVM不会保留注解。 这是默认值
@interface MyAnnotation1{
	
}
@Retention(value = RetentionPolicy.SOURCE)//编译器直接丢弃这种策略的注解
@interface MyAnnotation2{
	
}