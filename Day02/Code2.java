

package Day02;

public class Code2 {

	public static void main(String[] args) {
		int[] arr= {1,2,2,4,3};
		System.out.println("Duplicate Element : "+duplicateEle(arr));
	}
     
	public static int duplicateEle(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					return arr[j];
				}
				
			}
		
		}
		return -1;
	}
}
