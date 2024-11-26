package Day01;

public class Code01 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		
		System.out.println("Maximum Element in Array : "+maxElement(arr));
		System.out.println("Minimum Element in Array : "+minElement(arr));
       
	}
    public static int maxElement(int[] arr)
    { int max=arr[0];
    	for(int x=0;x<arr.length;x++)
    	{
    		if(max<arr[x])
    		{
    			max=arr[x];
    		}
    	}
    	return max;
    }
    public static int minElement(int[] arr)
    {
    	int min=arr[0];
    	for(int x=0;x<arr.length;x++)
    	{
    		if(min>arr[x])
    		{
    			min=arr[x];
    		}
    	}
    	return min;
    }
}
