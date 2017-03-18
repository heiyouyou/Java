package com.sort;
/**
 * 
 * 
 * Bubble
 * ������:������
 * ʱ�䣺2016��5��11��-����4:55:35 
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
	 * ð��������С����
	 * com.sort 
	 * ��������bubbleSort1
	 * �����ˣ������� 
	 * ʱ�䣺2016��5��11��-����4:54:03 
	 * @param arr
	 * @return int[]
	 * @exception 
	 * @since  1.0.0
	 */
	public static int[] bubbleSort1(int[] arr){
		//�Ƚϵ��������<arr.length(���鳤��)��ÿ�ֱȽϵõ�һ�����ֵ
		for(int i = 1;i<arr.length;i++){
			//ÿ�ֱȽϵ�������<arr.length(���鳤��)-i(����)�����±�0��ʼ�������бȽ�
			for(int j = 0;j<arr.length-i;j++){
				//��ǰ�±��Ӧֵ����һ���±��Ӧֵ���д�С�Ƚ�,��������ţ�С����ǰ��
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
	 * ð�������ɴ�С��
	 * com.sort 
	 * ��������bubbleSort2
	 * �����ˣ������� 
	 * ʱ�䣺2016��5��11��-����5:14:48 
	 * @param arr
	 * @return int[]
	 * @exception 
	 * @since  1.0.0
	 */
	public static int[] bubbleSort2(int[] arr){
		//�Ƚϵ�����<arr.length(���鳤��)��ÿ�ֱȽϵõ�һ����Сֵ
		for(int i = 1;i<arr.length;i++){
			//ÿ�ֱȽϵĴ���<arr.length(���鳤��)-i(����)�����±�0��ʼ�������бȽ�
			for(int j = 0;j<arr.length-i;j++){
				//��ǰ�±��Ӧֵ����һ���±��Ӧֵ���д�С�Ƚ�,С�������ţ������ǰ��
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
