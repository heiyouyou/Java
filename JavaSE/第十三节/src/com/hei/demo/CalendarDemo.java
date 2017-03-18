package com.hei.demo;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * 	Calendar类也是用来操作日期和时间的类，但它可以以整数形式检索类似于年、月、日之类的信息；
	Calendar类是抽象类，无法实例化，要得到该类对象只能通过调用getInstance方法来获得；
	Calendar对象提供为特定语言或日历样式实现日期格式化所需的所有时间字段。
 * CalendarDemo类
 * 创建人:黑有有
 * 时间：2016年5月31日-下午3:23:16 
 * @version 1.0.0
 *
 */
public class CalendarDemo {
	public static void main(String[] args){
//		Calendar类是一个抽象类，无法实例化，可通过getInstance方法来获取该类的实例
//		Calendar calendar = new Calendar();
		
//		Calendar getInstance()返回当前默认地区和时区的Calendar对象
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);//java.util.GregorianCalendar[time=1464679783716,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2016,MONTH=4,WEEK_OF_YEAR=23,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=152,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=29,SECOND=43,MILLISECOND=716,ZONE_OFFSET=28800000,DST_OFFSET=0]

//		int get(int fields)返回调用对象中fields指定部分的值
//		以下大写的变量都是属于Calendar类的常量字段而且被static和final修饰
//		获取当前时间对象的年份
//		System.out.println(calendar.get(Calendar.YEAR));//2016
		
////		注意：MONTH是从0开始计算月份的，0表示一月，11表示十二月，转成相应的中文或者英文月份表达时要加1
//		System.out.println(calendar.get(Calendar.MONTH));//4
////		所以通过加1可以得到当前时间对象的当前月份
//		System.out.println(calendar.get(Calendar.MONTH)+1);//5
		
////		获取当前时间对象的几号日
//		System.out.println(calendar.get(Calendar.DATE));
////		获取当前时间对象的小时，但是属于12小时制
//		System.out.println(calendar.get(Calendar.HOUR));
////		获取当前时间对象的24小时制的小时
//		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		
////		获取当前时间对象的分钟
//		System.out.println(calendar.get(Calendar.MINUTE));
		
////		获取当前时间对象的秒数
//		System.out.println(calendar.get(Calendar.SECOND));
		
////		获取当前时间对象中的一周第几天，注意：SUNDAY为一周的第一天（1），SATURDAY为一周的最后一天（7） 
//		System.out.println("星期 "+calendar.get(Calendar.DAY_OF_WEEK));//星期 3
//		System.out.println("星期 "+(calendar.get(Calendar.DAY_OF_WEEK)-1));//星期 2
		
////		获取当前时间对象中一个月中的第几周
//		System.out.println("这是一个月中第"+calendar.get(Calendar.WEEK_OF_MONTH)+"周");//这是一个月中第5周
		
////		获取当前时间对象中一年中的第几周
//		System.out.println("这是一年中第"+calendar.get(Calendar.WEEK_OF_YEAR)+"周");//这是一年中第23周

////		可以获取Calendar类中的常量字段的代号
//		System.out.println(Calendar.SUNDAY);//1
//		System.out.println(Calendar.SATURDAY);//7
		
//		void set(int fields,int value)将value中指定的值设置到fields指定的部分
		calendar.set(Calendar.MONTH,4);
		System.out.println(calendar.get(Calendar.MONTH));//4

//		注意了：如果改变了一个时间对象中某个部分的字段，其他字段也会发生变化
		calendar.set(Calendar.DAY_OF_YEAR,100);
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));//100
		System.out.println(calendar.get(Calendar.MONTH));//3
		calendar.set(Calendar.DATE,20);
		System.out.println(calendar.get(Calendar.DATE));//20
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));//4
		
//		void clear()清除当前对象中所有的时间组成部分，从1970年初始值开始
		calendar.clear();
		
//		Date getTime()返回与调用对象具有相同时间的Date对象
		System.out.println(calendar.getTime());//Thu Jan 01 00:00:00 CST 1970
		
//		void add(int fields,int amount)将amount值与fields指定的时间或日期部分进行相加
		calendar.add(Calendar.YEAR,1);
		calendar.add(Calendar.MONTH,1);
		
//		getTime()返回一个Date的实例对象
		Date date = calendar.getTime();
		System.out.println(date);//Mon Feb 01 00:00:00 CST 1971
		
//		Object clone()返回调用对象的副本
		Object calendar2 = calendar.clone();
		System.out.println(calendar);
		System.out.println(calendar2);
		
//		boolean equals(Object obj)判断调用对象与obj是否相等,如果不等采用第二种比较方法：比较值相不相等
		System.out.println(calendar.equals(calendar2));//true
	}
}
