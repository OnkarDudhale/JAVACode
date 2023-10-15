import java.util.*;
class AddThree
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5],s=0,c=1,x=50;
        System.out.println("Enter numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            c=1;
            s=arr[i];
            for (int j = i+1; j < arr.length; j++) {
              s=s+arr[j];
              c++;
              if(s>x)
              {
                  s=s-arr[j];
              }
              if(c==3)
              {
                  c=c-1;
                  if(s==x)
                  {
                      System.out.println("value found..");
                      return;
                  }
              }                
            }
        }
    }
}