package com.hei.demo;

import com.hei.demo.Outer.Inner;

public class InnerTest {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.username = "黑有有";
		outer.age = 22;
		outer.sex = "男";
		outer.showMessage();//黑有有==男==22
		
//		通过外部类的实例创建成员内部类的对象
//		Inner inner = outer.new Inner();
//		inner.sex = "女";
//		inner.showUserMessage();//女===22
		
//		静态内部类的创建结合外部类来创建
//		Inner inner = new Inner();//可以这样创建静态内部类的对象
		Outer.Inner inner = new Outer.Inner();
//		注意静态内部类的静态成员变量属于静态内部类本身的，不建议用内部类的对象来调用
//		inner.sex = "女";
		inner.age = 21;
		Outer.Inner.sex = "男";
		inner.showUserMessage();//男===21
		
//		接口采用匿名内部类进行实例化，不需要进行子类实现该接口来创建实例
		HelloWorld helloWorld = new HelloWorld(){
//			注意：匿名内部类中也没有构造函数，因为属于匿名内部类，没有名字可以声明构造函数
//			重写接口中的抽象方法
			public void sayHello(){
				System.out.println("大家好啊！！！");
			}
//			静态内部类中可以有普通代码块
			{
				System.out.println(1);
			};
			
//			注意：匿名内部类中不能有静态代码块
//			static{
//				System.out.println(1);
//			};
		};
		helloWorld.sayHello();//大家好啊！！！
	}
}
