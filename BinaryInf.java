//binary search on infinite array
//Time complexity log(n)
import java.util.*;
class BinaryInf
{
    static void binarySearch(int arr[],int key,int low,int high)
    {
        int mid=0;
        int f=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(key==arr[mid]){
                f=1;
                break;
            }
            if(key>arr[mid])
            low=mid+1;
            else
            high=mid-1;
        }
        if(f==1)
        System.out.println("value found at position:"+mid);
        else
        System.out.println("value not found...");
    }
    static void infinite(int arr[],int key)
    {
        int low=0;
        int high=1;
        while(arr[high]<key)
        {
            low=high;      //previous high position is now low
            high=high*2;   //iterate fast into the array
        }
        binarySearch(arr,key,low,high);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=args.length;
        int arr[]=new int[n];

        for(int j=0;j<n;j++)
        arr[j]=Integer.parseInt(args[j]);

        System.out.println("Enter Number to find:");
        int key=sc.nextInt();
        infinite(arr,key);
        
    }
}