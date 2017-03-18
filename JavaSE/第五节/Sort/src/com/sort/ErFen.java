package com.sort;
/**
 * 
 * 
 * ErFen
 * ������:������
 * ʱ�䣺2016��5��11��-����8:46:49 
 * @version 1.0.0
 *
 */
public class ErFen {
	public static void main(String[] args){
		int[] arr = {2,334,31,5,8981,355};
		System.out.println("����֮ǰ:");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("����֮��:");
		sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}	
	}
	/**
	 * 
	 * ���ַ���������
	 * com.sort 
	 * ��������sort
	 * �����ˣ������� 
	 * ʱ�䣺2016��5��11��-����8:45:38 
	 * @param halfArr void
	 * @exception 
	 * @since  1.0.0
	 */
	public static void sort(int[] halfArr){
		for(int i = 0;i<halfArr.length;i++){
			//��ȡ�������Ԫ��
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
			//�������ƶ�
			for(int j=i-1;j>=left;j--){
				halfArr[j+1]=halfArr[j];
			}
			//������
			if(left != i){
				halfArr[left]=temp;
			}
		}
	}
}
