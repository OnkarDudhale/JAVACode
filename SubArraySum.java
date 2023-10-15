//find the sum of particular number from array and return position : start position and end position
//arr[]=[10,30,40,60,40] n=130 OUTPUT:[1,3] 
import java.util.*;
class SubArraySum
{
    public static void sum(int arr[],int num)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if(sum==n)
                {
                    System.out.println(i+"\t"+j);
                }
            }
        }
    }
    public static void main(String arg[])
    {
        int arr[]={10,20,30,50,25};
        int n=100;
        Sum(arr,n);
    }
}