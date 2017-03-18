package com.hei.regexp;

public class QQTest {
	/**
	 * 
	 * 
	 * com.hei.regexp 
	 * 方法名：testQQ
	 * 创建人：黑有有 
	 * 时间：2016年6月28日-下午5:55:26 
	 * @param Q void
	 * @exception 
	 * @since  1.0.0
	 */
	public static void testQQ(String Q){
		String QQ = Q;
		int len = QQ.length();
		//判断字符串的长度为5-15
		if(len>=5 && len<=15){
			//判断首位如果不是0
			if(!QQ.startsWith("0")){
//				boolean flag = true;
//				char[] array = QQ.toCharArray();
//				for(int i=0;i<array.length;i++){
//					if(!(array[i]>='0' && array[i]<='9')){
//						flag = false;
//						break;
//					}
//				}
//				//如果标示一直为true,说明QQ正确，否则QQ非法
//				if(flag){
//					System.out.println("你输入的QQ号正常"+QQ);
//				}else{
//					System.out.println("你输入的QQ号有误"+QQ);
//				}
				try {					
					long num = Long.parseLong(QQ);
					System.out.println("QQ合法"+QQ);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("QQ不合法。。。。。。。。");
				}
			}else{
				System.out.println("首字母不能为0");
			}
		}else{
			System.out.println("长度不合适");
		}
	}
	/**
	 * 
	 * 正则验证QQ号
	 * com.hei.regexp 
	 * 方法名：testQQ_1
	 * 创建人：黑有有 
	 * 时间：2016年6月28日-下午5:59:09 
	 * @param str void
	 * @exception 
	 * @since  1.0.0
	 */
	public static void testQQ_1(String str){
		//验证QQ 不能以0开头  长度5-15位   只能是数字
		String QQ = str;
		String reg = "[1-9][0-9]{4,14}";
//		matches()找到一个或多个正则表达式的匹配，返回boolean类型的值
		boolean flag = QQ.matches(reg);
		if(flag){
			System.out.println("QQ号码正确哦，为："+QQ);
		}else{
			System.out.println("QQ不合法哦！！！");
		}
	}
	public static void main(String[] args) {
		testQQ("42a2342430");
		testQQ_1("1423a432");
	}
}
