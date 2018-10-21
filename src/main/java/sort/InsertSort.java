package sort;

import java.util.Arrays;

/**
 * @author Wen
 * 
 * 2018年10月21日  下午3:32:49
 */
public class InsertSort {
	public static void main(String[] args) {
		Integer[] a = {5,2,3,8,13,1,56,35,21,69,66};
		System.out.println(Arrays.toString(insertAlg(a)));
	}

	private static Integer[] insertAlg(Integer[] a) {
		 for(int index = 1; index<a.length; index++){//外层向右的index，即作为比较对象的数据的index
	            int temp = a[index];//用作比较的数据
	            int leftindex = index-1;
	            while(leftindex>=0 && a[leftindex]>temp){//当比到最左边或者遇到比temp小的数据时，结束循环
	                a[leftindex+1] = a[leftindex];
	                leftindex--;
	            }
	            a[leftindex+1] = temp;//把temp放到空位上
	        }
		return a;
	}
}
