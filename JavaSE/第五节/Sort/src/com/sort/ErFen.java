package com.sort;
/**
 * 
 * 
 * ErFen
 * 创建人:黑有有
 * 时间：2016年5月11日-下午8:46:49 
 * @version 1.0.0
 *
 */
public class ErFen {
	public static void main(String[] args){
		int[] arr = {2,334,31,5,8981,355};
		System.out.println("排序之前:");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("排序之后:");
		sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}	
	}
	/**
	 * 
	 * 二分法插入排序
	 * com.sort 
	 * 方法名：sort
	 * 创建人：黑有有 
	 * 时间：2016年5月11日-下午8:45:38 
	 * @param halfArr void
	 * @exception 
	 * @since  1.0.0
	 */
	public static void sort(int[] halfArr){
		for(int i = 0;i<halfArr.length;i++){
			//获取待排序的元素
			int temp = halfArr[i];
			int left = 0;
			int right = i-1;
			int mid = 0;
			while(left<=right){
				mid =(left+right)/2;
				if(temp<halfArr[mid]){
					right = mid -1;
				}else{
					left = mid+1;
				}
			}
			//先往后移动
			for(int j=i-1;j>=left;j--){
				halfArr[j+1]=halfArr[j];
			}
			//做插入
			if(left != i){
				halfArr[left]=temp;
			}
		}
	}
}
