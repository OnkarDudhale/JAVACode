//find the missing element from given array which is sequential in order
class MissingElement
{
    /*approach 1:public static void find(int arr[])
    {
        int sum=0;
       //sum also calculate using formula n*(n+1)/2 : n is array length  
       for(int i=0;i<arr.length;i++)
       {
           sum=sum+arr[i];
       }
       int num=1,s=0;
       while(num<=arr.length+1)
       {
           s=s+num;
           num++;
       }
       int result=s-sum;
       System.out.println("missing element is:"+result);
    }*/
    //approach 2:
    public static void find(int arr[])
    {
        int s=1,c=2;
       for(int i=0;i<arr.length;i++)
       {
           s=s-arr[i]+c;
           c++;
       }
       int result=s;
       System.out.println("missing element is:"+result);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6};
        find(arr);
    }
}