package com.hei.homework;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 
 * 使用Calendar类的相关属性以及方法！打印出某年某个月的日历信息！（要求年月日由命令行输入）
 * CalendarHomework类
 * 创建人:黑有有
 * 时间：2016年6月1日-下午10:24:55 
 * @version 1.0.0
 *
 */
public class getCalendarInfor1 {
	private Calendar calendar = Calendar.getInstance();
	private Scanner in = new Scanner(System.in);
	private int year;
	private int month;
	private int date;
//	输入时间内容
	public int getInput(String str){
		System.out.println("请输入"+str+":");
		return in.nextInt();
	}
	/**
	 * 
	 * 打印某年某月的日历视图
	 * com.hei.homework 
	 * 方法名：printCalView
	 * 创建人：黑有有 
	 * 时间：2016年6月2日-上午11:26:28 
	 * @param year
	 * @param month
	 * @param date void
	 * @exception 
	 * @since  1.0.0
	 */
	public void printCalView(){
//		人为设置时间对象（注意：人工输入的月份在程序中要减一才能得到想要的月份）
		calendar.set(year, month-1, date);
//		初始化一个日历数组
		int[][] dateArr = new int[6][7];
//		获取一个月中的最大天数
		int maxday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		for (int i = 1; i <= maxday; i++) {
//			给时间对象设置天数
			calendar.set(Calendar.DAY_OF_MONTH,i);
//			获取每月的第几周作为行数，即是二维数组date的第一个下标
			int weekrows = calendar.get(Calendar.WEEK_OF_MONTH)-1;
//			获取一周中的第几天作为列数，即是二维数组date的第二个下标
			int daycols = calendar.get(Calendar.DAY_OF_WEEK)-1;
//			将天数设置进日历数组中
			dateArr[weekrows][daycols] = i;
		}
		System.out.println("日"+"\t"+"一"+"\t"+"二"+"\t"+"三"+"\t"+"四"+"\t"+"五"+"\t"+"六");
//		按照行数列数输出日历的格式(6行7列的格式)
		for(int i = 0;i < dateArr.length;i++){
			for(int j = 0;j < 7;j++){
//				过滤掉值为0的元素
				if(dateArr[i][j]!=0){
//					锁定人为输入的日期
					if(dateArr[i][j] == this.date){
						System.out.print("【"+dateArr[i][j]+"】");
					}else{
						System.out.print(dateArr[i][j]);											
					}
				}
//				当二维数组中出现0的元素或从上面的if语句出来后，进行同行空格
				System.out.print("\t");
			}
//			当每行的列数（即是每周的天数）输出完后，换行输出下一周的天数
			System.out.println();
		}
	}
	public static void main(String[] args) {
//		创建一个日历视图对象
		getCalendarInfor1 calendarInfor1 = new getCalendarInfor1();
//		人工输入指定日期时间
		calendarInfor1.year = calendarInfor1.getInput("年份");
		calendarInfor1.month = calendarInfor1.getInput("月份");
		calendarInfor1.date = calendarInfor1.getInput("日期");
//		调用打印日历视图方法
		calendarInfor1.printCalView();
	}
}
