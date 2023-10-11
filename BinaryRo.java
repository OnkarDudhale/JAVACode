import java.util.Scanner;

//Binary search on Rotated Array
class BinaryRo
{
    static int bRotate(int arr[],int key)
    {
        int top=0,bottom=arr.length-1;
        while(top<=bottom)
        {
            int mid=(top+bottom)/2;
            if(arr[mid]==key)
            {
            return mid;//position where value found..
            }
            if(arr[mid]>arr[top]) //check left side is sorted or not
            {
                if(key>=arr[top] && key<arr[mid])//check key in a range or not
                bottom=mid-1;
                else
                top=mid+1;
            }
            else  //right side is sorted
            {
                if(key>arr[mid] && key<=bottom)//check key in a range or not
                top=mid+1;
                else
                bottom=mid-1;
            }
        }
        return -1;//return if not find...
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[args.length];
        for(int i=0;i<args.length;i++)
        arr[i]=Integer.parseInt(args[i]);
        System.out.println("Enter value to Search:");
        int key=sc.nextInt();
        int val=bRotate(arr,key);
        if(val>0)
        System.out.println("value Found at position:"+val);
        else
        System.out.println("Value not Found......");
    }
}