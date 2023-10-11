//Majority elements
import java.util.*;
class ArrayM
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
       int arr[]=new int[5];
       System.out.println("Enter array elements:");
       for(int i=0;i<arr.length;i++)
       {
           arr[i]=sc.nextInt();
       }
       for(int i=0;i<arr.length;i++)
       {
          count=1;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            {
                count++;
            }
        }
        System.out.println("count:"+count+"array:"+arr[i]);
       }
    }
}