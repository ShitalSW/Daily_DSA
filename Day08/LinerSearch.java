package Day08;

public class LinerSearch {

	public static void main(String[] args) {
		int[] arr= {2,4,3,6,8};
		int k=6;
		linearSearch(arr,k);

	}
	public static void linearSearch(int[] arr,int k)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==k)
			{
				System.out.println("Targeted Element is present at : "+i);
			}
			
		}
			System.out.println("Targeted Element is not found ");
		
	}

}
