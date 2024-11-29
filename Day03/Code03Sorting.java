package Day3;

import java.util.Arrays;

public class Code03Sorting {

	public static void main(String[] args) {
		int[] arr= {3,5,2,4,1};
		selectionSort(arr);
		BubbleSort(arr);
		Insertionsort(arr);

	}
	
	//Sorting algorithms 
	//Selection Sort with Time Complexity :O(n)^2
	//Using JAVA
	public static void selectionSort(int[] arr)
	{
	   for(int i=0;i<arr.length;i++)
	   {
		   for(int j=i+1;j<arr.length;j++)
		   {
			   if(arr[j]<arr[i])
			   {
				   int temp= arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
			   }
		   }
					   
	   }
	   System.out.println("Selection Sort :"+Arrays.toString(arr));
	}
   
	//Selection Sort
	//Using C++
//	#include<iostream>
//	using namespace std;
//	
//	void swap(int *a,int *b)
//	{
//		int temp=*a;
//		*a=*b;
//		*b=temp;
//	}
//	void selectionSort(int arr[], int n)
//	{
//		for(int i=0;i<n;i++)
//		{
//			for(int j=i+1;j<n;j++)
//			{
//				if(arr[j]<arr[i])
//				{
//					swap(&arr[i],&arr[j]);
//				}
//			}
//		}
//		
//		for(int i=0;i<n;i++)
//		{
//			cout<<arr[i]<<" ";
//		}
//		cout<<endl;
//		
//	}
//	int main()
//	{
//		int data[]= {2,4,1,3,5};
//		int n=5;
//		selectionSort(data,n);
//		
//	}
	
	
	//Bubble Sort with time Complexity=O(n)^2

	
	//Using Java
	
	public static void BubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Bubble Sort :"+Arrays.toString(arr));
	}
	//Bubble Sort using C++
	
//	#include<iostream>
//	using namespace std;
//	
//	void swap(int *a,int *b)
//	{
//		int temp=*a;
//		*a=*b;
//		*b=temp;
//	}
//	
//	void BubbleSort(int arr[], int n)
//	{
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<n-i-1;j++)
//			{
//				if(arr[j]>arr[j+1])
//				{
//					swap(&arr[j],&arr[j+1]);
//				}
//			}
//		}
//		
//		for(int i=0;i<n;i++)
//		{
//			cout<<arr[i]<<" ";
//		}
//		cout<<endl;
//	}
	
	
	//Insertion Sort using Java with time Complexity=O(n)^2
public static void Insertionsort(int []arr)
{ 
	for(int i=0;i<arr.length;i++)
    {
	  int curr=arr[i];
	  int prev=i-1;
	  while(prev>=0 && arr[prev]>curr)
	  {
		  arr[prev+1]=arr[prev];
		  prev--;
	  }
	  arr[prev+1]=curr;
    }
	System.out.println("Insertion Sort "+Arrays.toString(arr));
}
  //Insertion Sort using C++
//#include<iostream>
//using namespace std;
//
// void InsertionSort(int arr[], int n)
// {
//	 for(int i=0;i<n;i++)
//	 { int curr=arr[i];
//	   int prev=i-1;
//		 while(prev >=0 && arr[prev]>curr)
//		 {
//			 arr[prev+1]=arr[prev];
//		 }
//		 arr[prev+1]=curr;
//	 }
// }
}
