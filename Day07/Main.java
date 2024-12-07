package Day07;
//import java.util.Scanner;
//
//public class Main
//{
//   public static void processArray(int[] arr)
//   {
//       for(int i=0;i<arr.length;i++)
//      { 
//          int n=arr[i];
//          if(n%10 == 2 && n>42)  //check for both conditions
//          {
//               arr[i]=-6;
//          }
//         else if(n % 10 ==2)
//        {
//         arr[i]=-5;
//        }
//        else if(n>42)
//       {
//          arr[i]=-2;
//        }
//     } //for loop closed
//       
//       for(int j=0;j<arr.length;j++)
//       { 
//    	   if(arr[j]==0)
//    	   {
//    		   continue;
//    	   }
//          System.out.println(arr[j]);
//       }//to print output
// }
//
//  public static void main(String[] args)
//  {
//     int [] num=new int[5];
//     Scanner sc=new Scanner(System.in);
//     int count=0;
//     //System.out.println("Enter elements");
//    while(true) //Loop will run until negative number is found
//   {   
//      int input=sc.nextInt();
//      if(input <0) break;
//      num[count ++] = input;
//    }
//
//   processArray(num);
//    
//  
//       sc.close();
//  }
//}














import java.util.Scanner;

public class Main {

    public static void processArray(int[] arr, int count) {
        for (int i = 0; i < count; i++) {
            int num = arr[i];
            // Replace numbers based on the conditions
            if (num % 10 == 2 && num > 42) {
                arr[i] = -6; // Both black and white
            } else if (num > 42) {
                arr[i] = -2; // White number
            } else if (num % 10 == 2) {
                arr[i] = -5; // Black number
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[100]; // Assume a maximum of 100 numbers for simplicity
        int count = 0;

        // Read integers until a negative number is encountered
        while (true) {
            int input = scanner.nextInt();
            if (input < 0) break; // Stop reading on negative input
            numbers[count++] = input; // Store the valid number
        }

        processArray(numbers, count); // Process the array

        // Print the modified array
        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }

        scanner.close(); // Close the scanner
    }
}
