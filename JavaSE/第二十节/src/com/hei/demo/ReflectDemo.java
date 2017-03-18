package com.hei.demo;

import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Properties;



public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		StringBuffer sBuffer = new StringBuffer();
//		在Object类中定义了以下的方法，此方法将被所有子类继承：public final Class getClass()
//		方法返回值的类型是一个Class类，此类是Java反射的源头，实际上所谓反射从程序的运行结果来看也很好理解，即：可以通过对象反射求出类的名称。
//		Class class1 = sBuffer.getClass();
//		System.out.println(class1);//class java.lang.StringBuffer
		
////		JVM在加载StringBuffer.class文件的时候，生成了相对于StringBuffer这个类的Class实例
//		Class class2 = StringBuffer.class;
//		System.out.println(class2);//class java.lang.StringBuffer
	
//		Class class3 = "abc".getClass();
//		Class class4 = StringBuilder.class;
//		System.out.println(class3+"==="+class4);//class java.lang.String===class java.lang.StringBuilder
		
//		try {
////			static Class<?> forName(String className)返回与带有给定字符串名的类或接口相关联的 Class对象。 
//			Class class5 = class1.forName("java.util.Calendar");//注意：要具体到该类的所有包结构
//			System.out.println(class5);//class java.util.Calendar
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		Class class1 = sBuffer.getClass();
//		try {
////			T newInstance()创建此 Class对象所表示的类的一个新实例。 
//			StringBuffer sBuffer2 = (StringBuffer)class1.newInstance();
//			System.out.println(sBuffer2.getClass());//class java.lang.StringBuffer
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("===================");
//		Class class2 = Person.class;
//		System.out.println(class2);//class com.hei.demo.Person
//		try {
////			Object person = class2.newInstance();
////			newInstance()默认调用缺省的空构造函数，返回该Class对象的一个实例，如果某个类的空构造函数没有，则会报错
//			Person person = (Person)class2.newInstance();
//			System.out.println(person.toString());//com.hei.demo.Person@2a139a55
//			System.out.println(person.getClass());//class com.hei.demo.Person
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			Class class1 = Class.forName("com.hei.demo.Person");
//			System.out.println(class1+"===="+class1.getName());//class com.hei.demo.Person====com.hei.demo.Person
//
////			Class getSuperClass()返回当前Class对象的父类的Class对象
////			String getName()返回此Class对象所表示的实体（类、接口、数组类、基本类型或void）名称
//			System.out.println(class1.getSuperclass().getName());//java.lang.Object
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		System.out.println("查询一下ArrayList这个类实现的所有的接口：");
//		Class class1 = ArrayList.class;
////		 Class<?>[] getInterfaces()确定此对象所表示的类或接口实现的所有接口。 
//		Class[] cls = class1.getInterfaces();
//		for(Class i : cls){
//			System.out.println(i+"==="+i.getName());
//		}
		
		
		//JVM的类加载器：
		//通过类加载器去加载javac编译阶段产生的字节码文件（.class）到JVM中
		//然后再通过字节码校验器校验你所加载的字节码文件是不是合法的二进制文件
		//1.启动类加载器    BootStrap ClassLoader  用于加载java运行中的核心类库   rt.jar(API中所有的类) resoures.jar charsets.jar
		//2.扩展类加载器    Extension ClassLoader  负责加载jre/lib/ext中的jar包   （sun公司提供的一些没有装载jdk中的）
		//3.系统类加载器    Application ClassLoader  负责加载classpath下面的jar或者类
//		注意：可以理解为：系统类加载器的父类是扩展类加载器，而扩展类加载器的父类是启动类加载器，而启动类加载器的父类则是空null
		
//		ClassLoader getClassLoader()返回该类的类加载器。有些实现可能使用 null来表示启动类加载器 。如果该类由启动类加载器 加载，则此方法在这类实现中将返回 null。
//		System.out.println(Person.class.getClassLoader());//sun.misc.Launcher$AppClassLoader@4e0e2f2a
////		ClassLoader getParent()返回委托的父类加载器。 
//		System.out.println(Person.class.getClassLoader().getParent());//sun.misc.Launcher$ExtClassLoader@2a139a55
//		System.out.println(Person.class.getClassLoader().getParent().getParent());//null
//		System.out.println(ArrayList.class.getClassLoader());//null
//		System.out.println(String.class.getClassLoader());//null
////		Constructor<?>[] getConstructors()返回一个包含某些 Constructor对象的数组，这些对象反映此 Class对象所表示的类的所有公共构造方法。 
//		Constructor[] constructors = Person.class.getConstructors();
//		for(Constructor con : constructors){
////			String getName()以字符串形式返回此构造方法的名称。 
//			System.out.println(con+"=="+con.getName());
//			//public com.hei.demo.Person()==com.hei.demo.Person
//			//public com.hei.demo.Person(java.lang.String)==com.hei.demo.Person
//
//		}
		
//		获取一个系统类加载器
		ClassLoader classloader = ClassLoader.getSystemClassLoader();
		System.out.println(classloader);//sun.misc.Launcher$AppClassLoader@4e0e2f2a
		
//		Person person = new Person();
//		Class class1 = person.getClass();
////		Field[] getFields()返回一个包含某些 Field对象的数组，这些对象反映此 Class对象所表示的类或接口的所有可访问公共字段。 		Field[] fields = class1.getFields();
////		Field[] fields = class1.getFields();
//		
////		Field[] getDeclaredFields()返回 Field对象的一个数组，这些对象反映此 Class对象所表示的类或接口所声明的所有字段。 
//		Field[] fields = class1.getDeclaredFields();
//		for(Field field:fields){
//			System.out.println(field);
//		}
//		try {
////			Field getDeclaredField(String name)返回一个 Field 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明字段。 
//			System.out.println(class1.getDeclaredField("score"));//public java.lang.String com.hei.demo.Person.username
//
////			Field[] getFields()返回一个包含某些 Field对象的数组，这些对象反映此 Class对象所表示的类或接口的所有可访问公共字段。 
//			System.out.println(class1.getField("username"));//public java.lang.String com.hei.demo.Person.username
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		try {
//			Class class2 = Class.forName("com.hei.demo.Person");
//			Object p = class2.newInstance();
//			Field field = class2.getDeclaredField("username");
//
////			void set(Object obj,Object value)将指定对象变量上此 Field对象表示的字段设置为指定的新值。 
//			field.set(p,"黑有有");
//			
////			Object get(Object obj)返回指定对象上此 Field表示的字段的值。 
//			System.out.println(field.get(p));//黑有有
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		获取Person类的类加载器
//		ClassLoader classLoader = Person.class.getClassLoader();
//		System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@4e0e2f2a
//		
//		try {
////			Class<?> loadClass(String name)使用指定的二进制名称来加载类 
//			Class class1 = classLoader.loadClass("java.lang.StringBuffer");
//			System.out.println(class1);//class java.lang.String
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		创建一个配置文件
		Properties p1 = new Properties();
		try {
//			以字符读取流的形式进行加载配置文件
//			InputStream getResourceAsStream(String name)查找具有给定名称的资源。 
//			p1.load(new InputStreamReader(ReflectDemo.class.getResourceAsStream("/hei.properties")));//如果文件是在bin目录下，则要加斜杠/
			p1.load(new InputStreamReader(ReflectDemo.class.getResourceAsStream("hei.properties")));//如果是与字节码文件在同一个文件夹下，则不需要加斜杠/
//			通过键值获取配置文件中的值
			System.out.println(p1.getProperty("age"));//21
			System.out.println(p1.getProperty("username"));//黑有有
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)返回一个 Constructor对象，该对象反映此 Class对象所表示的类或接口的指定构造方法。 
//		Constructor constructor = Person.class.getDeclaredConstructor(new Class[]{String.class,int.class});//参数列表可以表示动态的Class对象的数组
		Constructor constructor = Person.class.getDeclaredConstructor(String.class,int.class);
		
//		void setAccessible(boolean flag)将此对象的accessible标志设置为指示的布尔值 ，既可以访问到类中的私有化成员变量和方法
		constructor.setAccessible(true);
		//调用newInstance方法需要调用类本身的无参构造方法，如果没有无参，难道通过反射就没办法获取对象了吗?
//		T newInstance(Object... initargs)使用此 Constructor对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。 
//		Person person = (Person)constructor.newInstance(new Object[]{"黑有有",21});
		Person person = (Person)constructor.newInstance("黑有有",21);
		System.out.println(person.username+"==="+person.age);//黑有有===21
		
//		Method getDeclaredMethod(String name, Class<?>... parameterTypes)返回一个 Method对象，该对象反映此 Class对象所表示的类或接口的指定已声明方法。 
		Method method = Person.class.getDeclaredMethod("show2",new Class[]{String.class});//method代表Person类中的无参show方法
		method.setAccessible(true);
		
//		int getModifiers()以整数形式返回此Method对象所表示方法的 Java语言修饰符 
		System.out.println("无参show方法的访问修饰符："+method.getModifiers());//26
//		Object invoke(Object obj, Object... args)对带有指定参数的指定对象调用由此 Method对象表示的底层方法。 
//		System.out.println(method.invoke(new Person(),new Object[]{}));//大家好!  Jery老师太帅了！
//		也可以这样：
		System.out.println(method.invoke(null,new Object[]{"wells"}));//wells
	}
}
class Person{
	public String username;//null
	public int age;//0
	private int score;
	public Person(){}
	public Person(String name){
		
	}
	private Person(String name,int age){
		this.username = name;
		this.age = age;
	}
	
	public static final String show(){
		System.out.println("大家好");
		return "Jery老师太帅了！";
	}
	private static final String show1(){
		return "hehiehiehei";
	}
	private static final String show2(String name){
		return name;
	}
}
