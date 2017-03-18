package com.hei.homework;

import java.util.Scanner;

public class getCalendarInfor{
	public static void main(String[] args){
		getCalendar();
	}
	/**
	 * 
	 * 获取某年某月的日历信息
	 * com.hei.homework 
	 * 方法名：getCalendar
	 * 创建人：黑有有 
	 * 时间：2016年6月2日-上午12:21:25  void
	 * @exception 
	 * @since  1.0.0
	 */
	public static void getCalendar(){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = in.nextInt();
		System.out.println("请输入月份：");
		int month = in.nextInt();
		System.out.println("请输入日期：");
		int date = in.nextInt();
		int sum = 0;
//		计算出从1990年到指定年份的前一年的总天数
		for(int i = 1900 ;i < year;i++){
//			进行平闰年的判断
			if(i%4 == 0 && i%100 !=0 || i%400 == 0){
				sum +=366;
			}else{
				sum +=365;
			}	
		}
//		进行输入月份前几个月的天数计算
		for(int j = 1;j < month;j++){
//			2月的时候
			if(j==2){
//				进行平闰年2月的判断
				if(year%4==0&&year%100!=0||year%400==0){
					sum+=29;
				}else{
					sum+=28;
				}
			}else{
				if(j==4||j==6||j==9||j==11){
					sum+=30;
				}else{
					sum+=31;
				}
			}
		}
//		拿到当前输入月份的第一天和之前总天数的和
		sum+=1;
//		计算当前月份的第一天出现在星期几
		int weekday=sum%7;
		System.out.println("日\t一\t二\t三\t四\t五\t六");	
		for(int i=1;i<=weekday;i++){
			System.out.print("\t");
		}
	    int days = 0;
//	    判断当前月份为几月份
		if(month==2){
			if(year%4==0&&year%100!=0||year%400==0){
				days=29;
			}else{
				days=28;
			}	
		}else if(month==4||month==6||month==9||month==11){
			days=30;
		}else{
			days=31;
		}
//		计算当达到当前月份每周最后一天时换行，否则空格不换行
		for(int i=1;i<=days;i++){
			if(sum%7==6){
				System.out.print(i+"\n");
			}else{
//				锁定人为输入的日期
				if(i == date){
					System.out.print("【"+i+"】"+"\t");
				}else{
					System.out.print(i+"\t");					
				}
			}		
			sum++;
		}
	}
}