package sort;

import java.util.Arrays;

/**
 * @author Wen
 * 
 * 2018年10月21日  下午3:38:16
 */
public class SelectSort {
	public static void main(String[] args) {
		Integer[] a = {5,2,3,8,13,1,56,35,21,69,66};
		System.out.println(Arrays.toString(selectAlg(a)));
	}

	private static Integer[] selectAlg(Integer[] a) {
		for(int i=0; i<a.length-1; i++){
            int minIndex = i;
            for(int j=minIndex+1;j<a.length;j++){
                if(a[j]<a[minIndex]){
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp; 
        }
		return a;
	}

}
