package Day05;

import java.util.Arrays;

public class Code05 {

	public static void main(String[] args) {
		int[] arr= {2,3,5,4,1};
		bubbleSort(arr);

	}
 public static void bubbleSort(int[] arr)
 {
	 for(int i=0;i<arr.length;i++)
	 {
		 for(int j=0;j<arr.length-i-1;j++)
		 {
			 if(arr[j]>arr[j+1])
			 {
				arr[j]=arr[j]+arr[j+1];
				arr[j+1]=arr[j]-arr[j+1];
				arr[j]=arr[j]-arr[j+1];
			 }
		 }
	 }
	 System.out.println(Arrays.toString(arr));
 }
}
