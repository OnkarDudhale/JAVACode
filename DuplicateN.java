//Remove duplicates of a particular number from array
class DuplicateN
{
    public static void main(String[] args) {
        int arr[]={10,20,30,20,10,10,60},key=10;
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=key)//skip same elements
            {
               arr[index]=arr[i];
               index++;       
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);            
        }
    }
}