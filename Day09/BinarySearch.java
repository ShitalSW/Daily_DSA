package Day09;

public class BinarySearch {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		int target=6;
		System.out.println(binarySearch(arr,target));
	}
    public static int binarySearch(int[] arr, int target)
    {
    	int start=0,end=arr.length-1;
    	while(start<=end)
    	{
    		int mid=start+(end-start)/2;
    		
    		if(arr[mid]==target)
    		{
    			return mid;
    		}
    		else if(arr[mid]<target)
    		{
    			start=mid+1;
    		}
    		else
    		{
    			end=mid-1;
    		}
    		
    	}
    	System.out.println("Target is not present");
    	return -1;
    }
}
