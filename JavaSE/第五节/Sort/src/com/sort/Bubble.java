package com.sort;
/**
 * 
 * 
 * Bubble
 * 创建人:黑有有
 * 时间：2016年5月11日-下午4:55:35 
 * @version 1.0.0
 *
 */
public class Bubble {
	public static void main(String[] args){
		int[] arr = {2,12,1,44,665,65};
		bubbleSort2(arr);
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);			
		}
	}
	/**
	 * 
	 * 冒泡排序（由小到大）
	 * com.sort 
	 * 方法名：bubbleSort1
	 * 创建人：黑有有 
	 * 时间：2016年5月11日-下午4:54:03 
	 * @param arr
	 * @return int[]
	 * @exception 
	 * @since  1.0.0
	 */
	public static int[] bubbleSort1(int[] arr){
		//比较的最大轮数<arr.length(数组长度)，每轮比较得到一个最大值
		for(int i = 1;i<arr.length;i++){
			//每轮比较的最大次数<arr.length(数组长度)-i(轮数)，从下标0开始两两进行比较
			for(int j = 0;j<arr.length-i;j++){
				//当前下标对应值与下一个下标对应值进行大小比较,大的往后排，小的往前排
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp; 
				}
			}
		}
		return arr;
	}
	/**
	 * 
	 * 冒泡排序（由大到小）
	 * com.sort 
	 * 方法名：bubbleSort2
	 * 创建人：黑有有 
	 * 时间：2016年5月11日-下午5:14:48 
	 * @param arr
	 * @return int[]
	 * @exception 
	 * @since  1.0.0
	 */
	public static int[] bubbleSort2(int[] arr){
		//比较的轮数<arr.length(数组长度)，每轮比较得到一个最小值
		for(int i = 1;i<arr.length;i++){
			//每轮比较的次数<arr.length(数组长度)-i(轮数)，从下标0开始两两进行比较
			for(int j = 0;j<arr.length-i;j++){
				//当前下标对应值与下一个下标对应值进行大小比较,小的往后排，大的往前排
				if(arr[j]<arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;  
				}
			}
		}
		return arr;
	}
}
