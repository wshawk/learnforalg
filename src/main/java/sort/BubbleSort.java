package sort;

import java.util.Arrays;

/**
 * @author Wen
 * 
 * 2018年10月21日  下午3:28:28
 */
public class BubbleSort {
	public static void main(String[] args) {
		Integer[] a = {5,2,3,8,13,1,56,35,21,69,66};
		System.out.println(Arrays.toString(bubbleAlg(a)));
	}
	private static Integer[] bubbleAlg(Integer[] a) {
		for (int i =0; i<a.length; i++) {
			for(int j=0;j<i;j++){
				if (a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
			}
		}
		return a;
	}
}
