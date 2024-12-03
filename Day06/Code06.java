package Day06;

import java.util.Arrays;

public class Code06 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr= {1,4,3,2};
		insertionSort(arr);

	}
	//INSERTION Sort
   public static void insertionSort(int[] arr)
   {
	 for(int i=1;i<arr.length;i++)
	 { int curr=arr[i];
	   int prev=i-1;
		 while( prev>=0 && arr[prev]>curr)
		 {
			 arr[prev+1]=arr[prev];
			 prev--;
		 }
		 arr[prev+1]=curr;
	 }
	 System.out.println(Arrays.toString(arr));
   }
}
