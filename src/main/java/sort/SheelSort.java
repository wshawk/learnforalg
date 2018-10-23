package sort;

import java.util.Arrays;

/**
 * @author Wen
 * 
 * 2018年10月23日  下午10:33:44
 */
public class SheelSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] a = {5,2,3,8,13,1,56,35,21,69,66};
		System.out.println(Arrays.toString(sheelSort(a)));
	}
	private  static Integer[] sheelSort(Integer[] a){
	 int len=a.length;//单独把数组长度拿出来，提高效率
	          while(len!=0){
	             len=len/2;
	              for(int i=0;i<len;i++){//分组
	                  for(int j=i+len;j<a.length;j+=len){//元素从第二个开始
	                      int k=j-len;//k为有序序列最后一位的位数
	                      int temp=a[j];//要插入的元素
	                     while(k>=0&&temp<a[k]){//从后往前遍历
	                         a[k+len]=a[k];
	                         k-=len;//向后移动len位
	                     }
	                     a[k+len]=temp;
	                 }
	             }
	         }
	          return a;
			}
		}
