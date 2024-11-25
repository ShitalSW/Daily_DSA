package Day4;

import java.util.Arrays;

public class Code04
{

	public static void main(String[] args) 
	{
		int[] arr= {2,4,3,1,7};
		selectionSort(arr);
	}
    //SELECTION SORT
	public static void selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
