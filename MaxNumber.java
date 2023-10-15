//Find a peak element which is not smaller than its neighbours
class MaxNumber
{
    public static int peakMax(int arr[])
    {
        int size=arr.length;

        if(arr[0]>arr[1])
            return arr[0];

        if(arr[size-1]>arr[size-2])
            return arr[size-1];

        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                return arr[i];
            }
        }
        return -1;
    }
    public static int binaryPeakMax(int arr[],int lower,int upper)
    {
        int mid;
        while(lower<=upper)
        {
            mid=lower+(upper-lower)/2;
            if((mid==0 || arr[mid]>=arr[mid-1])&&(mid==upper || arr[mid]>=arr[mid+1]))
            return mid;

            else if(arr[mid-1]>arr[mid])
            {
               return binaryPeakMax(arr, lower, mid-1);
            }
            else if(arr[mid]<arr[mid+1])
            {
               return binaryPeakMax(arr, mid+1, upper);
            }
        }
        return -1;
    }
   public static void main(String[] args) {
       int arr[]={10,40,45,55,65,30,20};
       //System.out.println("max elements is:"+peakMax(arr));
       int position=binaryPeakMax(arr,0,arr.length-1);
       System.out.println("max element is:"+arr[position]);
   }
}