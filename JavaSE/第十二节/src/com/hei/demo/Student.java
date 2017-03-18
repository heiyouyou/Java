package com.hei.demo;

public class Student {
	private int age;
	private String username;
	public int number;
	public Student(){
		
	}
	public Student(String username,int age){
		this.username = username;
		this.age = age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((username == null) ? 0 : username.hashCode());
//		return result;
//	}
//	系统自己重写Object的equals()方法
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (age != other.age)
//			return false;
//		if (username == null) {
//			if (other.username != null)
//				return false;
//		} else if (!username.equals(other.username))
//			return false;
//		return true;
//	}

//	自定义重写equals()方法
	public boolean equals(Object obj){
//		判断传入的对象是否为null
		if(obj == null){
			return false;
		}
//		判断传入的对象是否与当前调用该方法的对象相同
		if(this == obj){
			return true;
		}
//		判断传入的对象obj是否为Student的实例
		if(obj instanceof Student){
//			将传入的Object强转成Student的对象
			Student stu = (Student)obj;
//			只有username和age相同就是同一个对象，注意了：age用原始数据类型，因为包装类Integer有数据缓存区
			return this.username.equals(stu.username) && this.age == stu.age;
		}else{
			return false;			
		}
	}
//	重写Object的toString()方法
	@Override
	public String toString() {
//		用super指明调用父类Object的方法
//		System.out.println(super.toString());
//		return "Student [age=" + age + ", username=" + username + "]";
		return this.username +"年龄："+this.age;
	}

}
