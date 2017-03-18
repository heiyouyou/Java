package com.hei.demo;

import java.util.Comparator;

/**
 * 
 * 自定义一个整型排序器
 * IntegerComparator类
 * 创建人:黑有有
 * 时间：2016年6月2日-下午6:11:15 
 * @version 1.0.0
 *
 */
//实现了Comparator接口的方法
public class IntegerComparator implements Comparator<Integer> {
	private boolean flag;
	public IntegerComparator(boolean flag) {
		this.flag = flag;
	}
	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1>o2){
			return flag ? -1:1;
		}else if(o1<o2){
			return flag ? 1:-1;
		}else{
			return 0;			
		}
	}
}
