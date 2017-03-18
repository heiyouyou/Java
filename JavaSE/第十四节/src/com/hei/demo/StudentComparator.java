package com.hei.demo;

import java.util.Comparator;

/**
 * 
 * 自定义一个学生类按年龄排序的排序器
 * IntegerComparator类
 * 创建人:黑有有
 * 时间：2016年6月2日-下午6:11:15 
 * @version 1.0.0
 *
 */
//实现了Comparator接口的方法
public class StudentComparator implements Comparator<Student> {
	private boolean flag;
	public StudentComparator(boolean flag) {
		this.flag = flag;
	}
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getAge()>o2.getAge()){
			return flag ? -1:1;
		}else if(o1.getAge()<o2.getAge()){
			return flag ? 1:-1;
		}else{
			return 0;			
		}
	}
}
