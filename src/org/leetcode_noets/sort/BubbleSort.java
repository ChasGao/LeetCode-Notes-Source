package org.leetcode_noets.sort;

import java.util.Arrays;

public class BubbleSort {
	/**
	 * 简单选择排序
	 * 最小的数与第一个位置的数交换位置.
	 * 选择排序是通过对整体的选择，确定最小数，放到第一个位置，对比冒泡排序大大减少了交换的次数
	 */
	public void selectSort(){
		long begin=System.currentTimeMillis();
		int count=0;
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35}; 
		for(int i=0;i<a.length;i++){
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]){
					int temp ;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					count++;
				};
			}
		}
		System.out.println("selectSort cost time"+(System.currentTimeMillis()-begin));
		System.out.println("selectSort交换次数"+count);
		System.out.println(Arrays.toString(a));

	}

	/**
	 * 冒泡排序。
	 * 相邻的两个数依次进行比较，较大往下沉，较小的往上冒。
	 */
	public void bubbleSort(){
	long begin=System.currentTimeMillis();
	int count=0;
	int[] a={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35}; 
	int temp =0;
	for(int i=a.length-1;i>0;i--){ //外循环(从后往前遍历)，外循环是给内层循环设置数据比较的最后一项，因为下标大于i的数据都已经排好序了，最大的放后面，不需要在比较了
		for(int j=0;j<i;j++){	//内循环(从前往后遍历)。内循环就是一个冒泡，从头到尾，比较两个，如果逆序就交换位置，最大的那一项一直被交换，直到排最后。
			if(a[j]>a[j+1]){
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				count ++;
			}
			
		}
		
	}
	System.out.println("bubbleSort cost time"+(System.currentTimeMillis()-begin));
	System.out.println(Arrays.toString(a));
	System.out.println("交换位置次数："+count);
}
	
	/*public void bubbleSort(){
		long begin=System.currentTimeMillis();
		int count=0;
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35}; 
		int temp =0;
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					count ++;
				}
				
			}
			
		}
		System.out.println("bubbleSort cost time"+(System.currentTimeMillis()-begin));
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
		System.out.println("交换位置次数："+count);
	}*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BubbleSort().bubbleSort();
		new BubbleSort().selectSort();
	}

}
